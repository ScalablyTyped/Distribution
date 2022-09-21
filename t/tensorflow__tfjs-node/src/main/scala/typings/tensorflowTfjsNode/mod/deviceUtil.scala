package typings.tensorflowTfjsNode.mod

import typings.std.Navigator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object deviceUtil {
  
  @JSImport("@tensorflow/tfjs-node", "device_util")
  @js.native
  val ^ : js.Any = js.native
  
  inline def isBrowser(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isBrowser")().asInstanceOf[Boolean]
  
  inline def isMobile(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isMobile")().asInstanceOf[Boolean]
  inline def isMobile(nav: Navigator): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isMobile")(nav.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def mockIsMobile(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("mockIsMobile")().asInstanceOf[Unit]
  inline def mockIsMobile(value: Boolean): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("mockIsMobile")(value.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
