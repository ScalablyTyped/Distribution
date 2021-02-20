package typings.windowOrGlobal

import org.scalablytyped.runtime.Shortcut
import typings.std.Window
import typings.windowOrGlobal.anon.Typeofglobal
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("window-or-global", JSImport.Namespace)
  @js.native
  val ^ : (/* globalThis */ js.Any) with ((Window with (/* globalThis */ js.Any)) | Typeofglobal) = js.native
  
  type _To = (/* globalThis */ js.Any) with ((Window with (/* globalThis */ js.Any)) | Typeofglobal)
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: (/* globalThis */ js.Any) with ((Window with (/* globalThis */ js.Any)) | Typeofglobal) = ^
}
