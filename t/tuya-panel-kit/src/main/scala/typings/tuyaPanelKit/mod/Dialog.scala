package typings.tuyaPanelKit.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("tuya-panel-kit", "Dialog")
@js.native
class Dialog () extends StObject
/* static members */
object Dialog {
  
  @JSImport("tuya-panel-kit", "Dialog")
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def alert(option: DialogAlertProps): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("alert")(option.asInstanceOf[js.Any]).asInstanceOf[Unit]
  @scala.inline
  def alert(option: DialogAlertProps, option2: DialogElse): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("alert")(option.asInstanceOf[js.Any], option2.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def checkbox(option: DialogCheckboxProps): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("checkbox")(option.asInstanceOf[js.Any]).asInstanceOf[Unit]
  @scala.inline
  def checkbox(option: DialogCheckboxProps, option2: DialogElse): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("checkbox")(option.asInstanceOf[js.Any], option2.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def close(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("close")().asInstanceOf[Unit]
  
  @scala.inline
  def confirm(option: DialogConfirmProps): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("confirm")(option.asInstanceOf[js.Any]).asInstanceOf[Unit]
  @scala.inline
  def confirm(option: DialogConfirmProps, option2: DialogElse): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("confirm")(option.asInstanceOf[js.Any], option2.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def custom(option: DialogCustomProps): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("custom")(option.asInstanceOf[js.Any]).asInstanceOf[Unit]
  @scala.inline
  def custom(option: DialogCustomProps, option2: DialogElse): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("custom")(option.asInstanceOf[js.Any], option2.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def list(option: DialogListProps): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("list")(option.asInstanceOf[js.Any]).asInstanceOf[Unit]
  @scala.inline
  def list(option: DialogListProps, option2: DialogElse): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("list")(option.asInstanceOf[js.Any], option2.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def prompt(option: DialogPromptProps): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("prompt")(option.asInstanceOf[js.Any]).asInstanceOf[Unit]
  @scala.inline
  def prompt(option: DialogPromptProps, option2: DialogElse): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("prompt")(option.asInstanceOf[js.Any], option2.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
