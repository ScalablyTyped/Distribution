package typings.wordpressIsShallowEqual

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@wordpress/is-shallow-equal/build-types/arrays", JSImport.Namespace)
@js.native
object arraysMod extends js.Object {
  /**
    * Returns true if the two arrays are shallow equal, or false otherwise.
    *
    * @param {any[]} a First array to compare.
    * @param {any[]} b Second array to compare.
    *
    * @return {boolean} Whether the two arrays are shallow equal.
    */
  def apply(a: js.Array[_], b: js.Array[_]): Boolean = js.native
}

