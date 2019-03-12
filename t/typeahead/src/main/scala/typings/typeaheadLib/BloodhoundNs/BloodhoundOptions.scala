package typings
package typeaheadLib.BloodhoundNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BloodhoundOptions[T] extends js.Object {
  /**
    * Given a datum, returns a unique id for it.
    * Defaults to JSON.stringify. Note that it is highly recommended
    * to override this option.
    *
    * @param datum Suggestion.
    * @returns Unique id for the suggestion.
    */
  var identify: js.UndefOr[js.Function1[/* datum */ T, scala.Double]] = js.undefined
  /**
    * If set to false, the Bloodhound instance will not be implicitly
    * initialized by the constructor function. Defaults to true.
    */
  var initialize: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * An array of data or a function that returns an array of data.
    * The data will be added to the internal search index when #initialize is called.
    */
  var local: js.UndefOr[js.Array[T] | js.Function0[js.Array[T]]] = js.undefined
  /**
    * Can be a URL to a JSON file containing an array of data or,
    * if more configurability is needed, a prefetch options hash.
    */
  var prefetch: js.UndefOr[java.lang.String | PrefetchOptions[T]] = js.undefined
  /**
    * Can be a URL to fetch data from when the data provided by the internal
    * search index is insufficient or, if more configurability is needed,
    * a remote options hash.
    */
  var remote: js.UndefOr[java.lang.String | RemoteOptions[T]] = js.undefined
  /**
    * A compare function used to sort data returned from the internal search index.
    *
    * @param a First suggestion.
    * @param b Second suggestion.
    * @returns Comparison result.
    */
  var sorter: js.UndefOr[js.Function2[/* a */ T, /* b */ T, scala.Double]] = js.undefined
  /**
    * If the number of datums provided from the internal search index is
    * less than sufficient, remote will be used to backfill search
    * requests triggered by calling #search. Defaults to 5.
    */
  var sufficient: js.UndefOr[scala.Double] = js.undefined
  /**
    * Transforms a datum into an array of string tokens.
    *
    * @param datum Suggestion.
    * @returns An array of string tokens.
    */
  def datumTokenizer(datum: T): js.Array[java.lang.String]
  /**
    * Transforms a query into an array of string tokens.
    *
    * @param quiery Query.
    * @returns An array of string tokens.
    */
  def queryTokenizer(query: java.lang.String): js.Array[java.lang.String]
}

object BloodhoundOptions {
  @scala.inline
  def apply[T](
    datumTokenizer: T => js.Array[java.lang.String],
    queryTokenizer: java.lang.String => js.Array[java.lang.String],
    identify: /* datum */ T => scala.Double = null,
    initialize: js.UndefOr[scala.Boolean] = js.undefined,
    local: js.Array[T] | js.Function0[js.Array[T]] = null,
    prefetch: java.lang.String | PrefetchOptions[T] = null,
    remote: java.lang.String | RemoteOptions[T] = null,
    sorter: (/* a */ T, /* b */ T) => scala.Double = null,
    sufficient: scala.Int | scala.Double = null
  ): BloodhoundOptions[T] = {
    val __obj = js.Dynamic.literal(datumTokenizer = js.Any.fromFunction1(datumTokenizer), queryTokenizer = js.Any.fromFunction1(queryTokenizer))
    if (identify != null) __obj.updateDynamic("identify")(js.Any.fromFunction1(identify))
    if (!js.isUndefined(initialize)) __obj.updateDynamic("initialize")(initialize)
    if (local != null) __obj.updateDynamic("local")(local.asInstanceOf[js.Any])
    if (prefetch != null) __obj.updateDynamic("prefetch")(prefetch.asInstanceOf[js.Any])
    if (remote != null) __obj.updateDynamic("remote")(remote.asInstanceOf[js.Any])
    if (sorter != null) __obj.updateDynamic("sorter")(js.Any.fromFunction2(sorter))
    if (sufficient != null) __obj.updateDynamic("sufficient")(sufficient.asInstanceOf[js.Any])
    __obj.asInstanceOf[BloodhoundOptions[T]]
  }
}

