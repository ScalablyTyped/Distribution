package typings.wordpressIsShallowEqual

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object objectsMod {
  
  /**
    * Returns true if the two objects are shallow equal, or false otherwise.
    *
    * @param {import('.').ComparableObject} a First object to compare.
    * @param {import('.').ComparableObject} b Second object to compare.
    *
    * @return {boolean} Whether the two objects are shallow equal.
    */
  @scala.inline
  def apply(a: Record[String, js.Any], b: Record[String, js.Any]): Boolean = (^.asInstanceOf[js.Dynamic].apply(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  @JSImport("@wordpress/is-shallow-equal/build-types/objects", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
