package typings.stropheJs.stropheMod

import typings.strophe.mod.Builder
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildAugmentingMod {
  
  /**
    * Function: $build
    * Create a Strophe.Builder.
    * This is an alias for 'new Strophe.Builder(name, attrs)'.
    *
    * Parameters:
    *  (String) name - The root element name.
    *  (Object) attrs - The attributes for the root element in object notation.
    *
    * Returns:
    *  A new Strophe.Builder object.
    */
  inline def apply(name: String): Builder = ^.asInstanceOf[js.Dynamic].apply(name.asInstanceOf[js.Any]).asInstanceOf[Builder]
  inline def apply(name: String, attrs: Any): Builder = (^.asInstanceOf[js.Dynamic].apply(name.asInstanceOf[js.Any], attrs.asInstanceOf[js.Any])).asInstanceOf[Builder]
  
  @JSImport("$build", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
