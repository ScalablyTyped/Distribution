package typings.tuyaPanelKit.mod

import typings.tuyaPanelKit.anon.OmitGlobalToastPropsshow
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object GlobalToast {
  
  @JSImport("tuya-panel-kit", "GlobalToast")
  @js.native
  val ^ : js.Any = js.native
  
  inline def hide(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("hide")().asInstanceOf[Unit]
  
  inline def show(option: OmitGlobalToastPropsshow): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("show")(option.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
