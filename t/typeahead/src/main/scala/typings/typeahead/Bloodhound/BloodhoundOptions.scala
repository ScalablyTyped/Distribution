package typings.typeahead.Bloodhound

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BloodhoundOptions[T] extends js.Object {
  
  /**
    * Transforms a datum into an array of string tokens.
    *
    * @param datum Suggestion.
    * @returns An array of string tokens.
    */
  def datumTokenizer(datum: T): js.Array[String] = js.native
  
  /**
    * Given a datum, returns a unique id for it.
    * Defaults to JSON.stringify. Note that it is highly recommended
    * to override this option.
    *
    * @param datum Suggestion.
    * @returns Unique id for the suggestion.
    */
  var identify: js.UndefOr[js.Function1[/* datum */ T, Double]] = js.native
  
  /**
    * If set to false, the Bloodhound instance will not be implicitly
    * initialized by the constructor function. Defaults to true.
    */
  var initialize: js.UndefOr[Boolean] = js.native
  
  /**
    * An array of data or a function that returns an array of data.
    * The data will be added to the internal search index when #initialize is called.
    */
  var local: js.UndefOr[js.Array[T] | js.Function0[js.Array[T]]] = js.native
  
  /**
    * Can be a URL to a JSON file containing an array of data or,
    * if more configurability is needed, a prefetch options hash.
    */
  var prefetch: js.UndefOr[String | PrefetchOptions[T]] = js.native
  
  /**
    * Transforms a query into an array of string tokens.
    *
    * @param quiery Query.
    * @returns An array of string tokens.
    */
  def queryTokenizer(query: String): js.Array[String] = js.native
  
  /**
    * Can be a URL to fetch data from when the data provided by the internal
    * search index is insufficient or, if more configurability is needed,
    * a remote options hash.
    */
  var remote: js.UndefOr[String | RemoteOptions[T]] = js.native
  
  /**
    * A compare function used to sort data returned from the internal search index.
    *
    * @param a First suggestion.
    * @param b Second suggestion.
    * @returns Comparison result.
    */
  var sorter: js.UndefOr[js.Function2[/* a */ T, /* b */ T, Double]] = js.native
  
  /**
    * If the number of datums provided from the internal search index is
    * less than sufficient, remote will be used to backfill search
    * requests triggered by calling #search. Defaults to 5.
    */
  var sufficient: js.UndefOr[Double] = js.native
}
object BloodhoundOptions {
  
  @scala.inline
  def apply[T](datumTokenizer: T => js.Array[String], queryTokenizer: String => js.Array[String]): BloodhoundOptions[T] = {
    val __obj = js.Dynamic.literal(datumTokenizer = js.Any.fromFunction1(datumTokenizer), queryTokenizer = js.Any.fromFunction1(queryTokenizer))
    __obj.asInstanceOf[BloodhoundOptions[T]]
  }
  
  @scala.inline
  implicit class BloodhoundOptionsOps[Self <: BloodhoundOptions[_], T] (val x: Self with BloodhoundOptions[T]) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDatumTokenizer(value: T => js.Array[String]): Self = this.set("datumTokenizer", js.Any.fromFunction1(value))
    
    @scala.inline
    def setQueryTokenizer(value: String => js.Array[String]): Self = this.set("queryTokenizer", js.Any.fromFunction1(value))
    
    @scala.inline
    def setIdentify(value: /* datum */ T => Double): Self = this.set("identify", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteIdentify: Self = this.set("identify", js.undefined)
    
    @scala.inline
    def setInitialize(value: Boolean): Self = this.set("initialize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInitialize: Self = this.set("initialize", js.undefined)
    
    @scala.inline
    def setLocalVarargs(value: T*): Self = this.set("local", js.Array(value :_*))
    
    @scala.inline
    def setLocalFunction0(value: () => js.Array[T]): Self = this.set("local", js.Any.fromFunction0(value))
    
    @scala.inline
    def setLocal(value: js.Array[T] | js.Function0[js.Array[T]]): Self = this.set("local", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocal: Self = this.set("local", js.undefined)
    
    @scala.inline
    def setPrefetch(value: String | PrefetchOptions[T]): Self = this.set("prefetch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrefetch: Self = this.set("prefetch", js.undefined)
    
    @scala.inline
    def setRemote(value: String | RemoteOptions[T]): Self = this.set("remote", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRemote: Self = this.set("remote", js.undefined)
    
    @scala.inline
    def setSorter(value: (/* a */ T, /* b */ T) => Double): Self = this.set("sorter", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteSorter: Self = this.set("sorter", js.undefined)
    
    @scala.inline
    def setSufficient(value: Double): Self = this.set("sufficient", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSufficient: Self = this.set("sufficient", js.undefined)
  }
}
