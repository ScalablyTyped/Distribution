package typings.tuyaPanelKit.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("tuya-panel-kit", "Dialog")
@js.native
class Dialog () extends js.Object
/* static members */
@JSImport("tuya-panel-kit", "Dialog")
@js.native
object Dialog extends js.Object {
  
  def alert(option: DialogAlertProps): Unit = js.native
  def alert(option: DialogAlertProps, option2: DialogElse): Unit = js.native
  
  def checkbox(option: DialogCheckboxProps): Unit = js.native
  def checkbox(option: DialogCheckboxProps, option2: DialogElse): Unit = js.native
  
  def close(): Unit = js.native
  
  def confirm(option: DialogConfirmProps): Unit = js.native
  def confirm(option: DialogConfirmProps, option2: DialogElse): Unit = js.native
  
  def custom(option: DialogCustomProps): Unit = js.native
  def custom(option: DialogCustomProps, option2: DialogElse): Unit = js.native
  
  def list(option: DialogListProps): Unit = js.native
  def list(option: DialogListProps, option2: DialogElse): Unit = js.native
  
  def prompt(option: DialogPromptProps): Unit = js.native
  def prompt(option: DialogPromptProps, option2: DialogElse): Unit = js.native
}
