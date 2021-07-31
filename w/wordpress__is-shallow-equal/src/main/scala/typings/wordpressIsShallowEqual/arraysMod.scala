package typings.wordpressIsShallowEqual

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object arraysMod {
  
  /**
    * Returns true if the two arrays are shallow equal, or false otherwise.
    *
    * @param {any[]} a First array to compare.
    * @param {any[]} b Second array to compare.
    *
    * @return {boolean} Whether the two arrays are shallow equal.
    */
  @scala.inline
  def apply(a: js.Array[js.Any], b: js.Array[js.Any]): Boolean = (^.asInstanceOf[js.Dynamic].apply(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  @JSImport("@wordpress/is-shallow-equal/build-types/arrays", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
