package typings.titanium

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A full query descriptor for a filtering predicate.
  */
trait MediaQueryInfoType extends js.Object {
  /**
  	 * Whether or not the predicate is for an exact match.  The default is `true`.
  	 */
  var exact: js.UndefOr[Boolean] = js.undefined
  /**
  	 * The value for the given predicate. See the descriptions in <MediaQueryType> for information about which properties require which values.
  	 */
  var value: js.UndefOr[Double | String | Boolean] = js.undefined
}

object MediaQueryInfoType {
  @scala.inline
  def apply(exact: js.UndefOr[Boolean] = js.undefined, value: Double | String | Boolean = null): MediaQueryInfoType = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(exact)) __obj.updateDynamic("exact")(exact)
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[MediaQueryInfoType]
  }
}

