package typings.webdriverio

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object constantMod {
  
  @JSImport("webdriverio/build/commands/constant", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def formatArgs(scope: js.Any, actions: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("formatArgs")(scope.asInstanceOf[js.Any], actions.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  @scala.inline
  def touchAction(actions: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("touchAction")(actions.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  
  @scala.inline
  def validateParameters(params: js.Object): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("validateParameters")(params.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
