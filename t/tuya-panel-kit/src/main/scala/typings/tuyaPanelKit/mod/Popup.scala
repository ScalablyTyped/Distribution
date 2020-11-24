package typings.tuyaPanelKit.mod

import typings.react.mod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("tuya-panel-kit", "Popup")
@js.native
class Popup ()
  extends Component[PopupProps, js.Object, js.Any]
/* static members */
@JSImport("tuya-panel-kit", "Popup")
@js.native
object Popup extends js.Object {
  
  def close(): Unit = js.native
  
  def countdown(option: PopUpCountdownProps): Unit = js.native
  def countdown(option: PopUpCountdownProps, option2: DialogElse): Unit = js.native
  
  def custom(option: PopupCustomProps): Unit = js.native
  def custom(option: PopupCustomProps, option2: DialogElse): Unit = js.native
  
  def datePicker(option: PopupDatePickerProps): Unit = js.native
  def datePicker(option: PopupDatePickerProps, option2: DialogElse): Unit = js.native
  
  def dropdown(option: PopupDropdownProps): Unit = js.native
  
  def list(option: PopUpListProps): Unit = js.native
  def list(option: PopUpListProps, option2: DialogElse): Unit = js.native
  
  def numberSelector(option: PopupNumberSelectorProps): Unit = js.native
  def numberSelector(option: PopupNumberSelectorProps, option2: DialogElse): Unit = js.native
  
  def picker(option: PopupPickerProps): Unit = js.native
  def picker(option: PopupPickerProps, option2: DialogElse): Unit = js.native
  
  def timerPicker(option: PopupTimerPickerProps): Unit = js.native
  def timerPicker(option: PopupTimerPickerProps, option2: DialogElse): Unit = js.native
  
  def tips(option: PopupTipsProps): Unit = js.native
  
  def toast(option: PopupToastProps): Unit = js.native
}
