package typings.sweetalert

import typings.sweetalert.stateMod.SwalState
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object actionsMod {
  
  @JSImport("sweetalert/typings/modules/actions", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def getState(): SwalState = ^.asInstanceOf[js.Dynamic].applyDynamic("getState")().asInstanceOf[SwalState]
  
  @scala.inline
  def onAction(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onAction")().asInstanceOf[Unit]
  @scala.inline
  def onAction(namespace: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onAction")(namespace.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @scala.inline
  def openModal(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("openModal")().asInstanceOf[Unit]
  
  @scala.inline
  def stopLoading(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("stopLoading")().asInstanceOf[Unit]
}
