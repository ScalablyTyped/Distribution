package typings.wordpressIsShallowEqual

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@wordpress/is-shallow-equal/build-types/objects", JSImport.Namespace)
@js.native
object objectsMod extends js.Object {
  
  /**
    * Returns true if the two objects are shallow equal, or false otherwise.
    *
    * @param {import('.').ComparableObject} a First object to compare.
    * @param {import('.').ComparableObject} b Second object to compare.
    *
    * @return {boolean} Whether the two objects are shallow equal.
    */
  def apply(a: Record[String, _], b: Record[String, _]): Boolean = js.native
}
