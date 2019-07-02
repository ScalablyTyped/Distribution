package typings
package atWordpressIsDashShallowDashEqualLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@wordpress/is-shallow-equal", JSImport.Namespace)
@js.native
object atWordpressIsDashShallowDashEqualMod extends js.Object {
  def apply(a: js.Object, b: js.Object): scala.Boolean = js.native
  def apply(a: js.Object, b: stdLib.ArrayLike[_]): scala.Boolean = js.native
  def apply(a: stdLib.ArrayLike[_], b: js.Object): scala.Boolean = js.native
  /**
    * Returns `true` if the two arrays or objects are shallow equal, or `false` otherwise.
    *
    * @param a - First object or array to compare.
    * @param b - Second object or array to compare.
    *
    * @returns Whether the two values are shallow equal.
    */
  def apply(a: stdLib.ArrayLike[_], b: stdLib.ArrayLike[_]): scala.Boolean = js.native
  /**
    * Returns true if the two arrays are shallow equal, or false otherwise.
    *
    * @param a - First array to compare.
    * @param b - Second array to compare.
    *
    * @returns Whether the two arrays are shallow equal.
    */
  def isShallowEqualArrays(a: stdLib.ArrayLike[_], b: stdLib.ArrayLike[_]): scala.Boolean = js.native
  /**
    * Returns `true` if the two objects are shallow equal, or `false` otherwise.
    *
    * @param a - First object to compare.
    * @param b - Second object to compare.
    *
    * @returns Whether the two objects are shallow equal.
    */
  def isShallowEqualObjects(a: js.Object, b: js.Object): scala.Boolean = js.native
}

