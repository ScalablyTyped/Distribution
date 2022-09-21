package typings.uidSafe

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("uid-safe", JSImport.Namespace)
  @js.native
  val ^ : Generate = js.native
  
  @js.native
  trait Generate extends StObject {
    
    def apply(byteLength: Double): js.Promise[String] = js.native
    def apply(byteLength: Double, callback: js.Function2[/* err */ Any, /* str */ String, Any]): Unit = js.native
    
    def sync(byteLength: Double): String = js.native
  }
  
  type _To = Generate
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: Generate = ^
}
