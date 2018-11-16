package typings
package titaniumLib

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
  var exact: js.UndefOr[scala.Boolean] = js.undefined
  /**
  	 * The value for the given predicate. See the descriptions in <MediaQueryType> for information about which properties require which values.
  	 */
  var value: js.UndefOr[scala.Double | java.lang.String | scala.Boolean] = js.undefined
}

