package typings.wordpressKeycodes

import typings.std.Window
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildTypesPlatformMod {
  
  @JSImport("@wordpress/keycodes/build-types/platform", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def isAppleOS(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isAppleOS")().asInstanceOf[Boolean]
  inline def isAppleOS(_window: Window): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isAppleOS")(_window.asInstanceOf[js.Any]).asInstanceOf[Boolean]
}
