package typings.windowOrGlobal

import org.scalablytyped.runtime.Shortcut
import typings.std.Window
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("window-or-global", JSImport.Namespace)
  @js.native
  val ^ : (Window & (/* globalThis */ Any)) | (/* import warning: ResolveTypeQueries.newMembers rewritten Couldn't resolve typeof globalThis */ Any) = js.native
  
  type _To = (Window & (/* globalThis */ Any)) | (/* import warning: ResolveTypeQueries.newMembers rewritten Couldn't resolve typeof globalThis */ Any)
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: (Window & (/* globalThis */ Any)) | (/* import warning: ResolveTypeQueries.newMembers rewritten Couldn't resolve typeof globalThis */ Any) = ^
}
