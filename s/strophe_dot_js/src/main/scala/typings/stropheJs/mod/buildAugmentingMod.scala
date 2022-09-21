package typings.stropheJs.mod

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildAugmentingMod {
  
  /** Function: $build
    *  Create a Strophe.Builder.
    *  This is an alias for 'new Strophe.Builder(name, attrs)'.
    *
    *  Parameters:
    *    @param name - The root element name.
    *    @param attrs - The attributes for the root element in object notation.
    *
    *  Returns:
    *    @returns A new Strophe.Builder object.
    */
  inline def apply(name: String): Any = ^.asInstanceOf[js.Dynamic].apply(name.asInstanceOf[js.Any]).asInstanceOf[Any]
  inline def apply(name: String, attrs: Record[String, String]): Any = (^.asInstanceOf[js.Dynamic].apply(name.asInstanceOf[js.Any], attrs.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  @JSImport("$build", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
