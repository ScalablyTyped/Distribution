package typings.wordpressIsShallowEqual

import org.scalablytyped.runtime.StringDictionary
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@wordpress/is-shallow-equal", JSImport.Namespace)
@js.native
object mod extends js.Object {
  var isShallowEqualArrays: js.Function2[/* a */ js.Array[js.Any], /* b */ js.Array[js.Any], Boolean] = js.native
  /**
    * Internal dependencies;
    */
  var isShallowEqualObjects: js.Function2[/* a */ Record[String, js.Any], /* b */ Record[String, js.Any], Boolean] = js.native
  /**
    * @typedef {Record<string, any>} ComparableObject
    */
  /**
    * Returns true if the two arrays or objects are shallow equal, or false
    * otherwise.
    *
    * @param {any[]|ComparableObject} a First object or array to compare.
    * @param {any[]|ComparableObject} b Second object or array to compare.
    *
    * @return {boolean} Whether the two values are shallow equal.
    */
  def apply(a: js.Array[_], b: js.Array[_]): Boolean = js.native
  def apply(a: js.Array[_], b: Record[String, _]): Boolean = js.native
  def apply(a: Record[String, _], b: js.Array[_]): Boolean = js.native
  def apply(a: Record[String, _], b: Record[String, _]): Boolean = js.native
  type ComparableObject = StringDictionary[js.Any]
}

