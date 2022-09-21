package typings.stropheJs.mod

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object presAugmentingMod {
  
  /** Function: $pres
    *  Create a Strophe.Builder with a <presence/> element as the root.
    *
    *  Parameters:
    *    @param attrs - The <presence/> element attributes in object notation.
    *
    *  Returns:
    *    @returns A new Strophe.Builder object.
    */
  inline def apply(): Any = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[Any]
  inline def apply(attrs: Record[String, String]): Any = ^.asInstanceOf[js.Dynamic].apply(attrs.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  @JSImport("$pres", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
