package typings.sweetalert

import typings.sweetalert.typingsModulesStateMod.SwalState
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typingsModulesActionsMod {
  
  @JSImport("sweetalert/typings/modules/actions", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getState(): SwalState = ^.asInstanceOf[js.Dynamic].applyDynamic("getState")().asInstanceOf[SwalState]
  
  inline def onAction(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onAction")().asInstanceOf[Unit]
  inline def onAction(namespace: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onAction")(namespace.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def openModal(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("openModal")().asInstanceOf[Unit]
  
  inline def stopLoading(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("stopLoading")().asInstanceOf[Unit]
}
