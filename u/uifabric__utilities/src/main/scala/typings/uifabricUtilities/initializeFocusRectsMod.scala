package typings.uifabricUtilities

import typings.std.Window
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object initializeFocusRectsMod {
  
  @JSImport("@uifabric/utilities/lib/initializeFocusRects", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def initializeFocusRects(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("initializeFocusRects")().asInstanceOf[Unit]
  @scala.inline
  def initializeFocusRects(window: Window): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("initializeFocusRects")(window.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
