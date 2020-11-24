package typings.tuyaPanelKit.mod

import typings.react.mod.Component
import typings.react.mod.ElementType
import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("tuya-panel-kit", "Modal")
@js.native
class Modal ()
  extends Component[ModalProps, js.Object, js.Any]
/* static members */
@JSImport("tuya-panel-kit", "Modal")
@js.native
object Modal extends js.Object {
  
  var Countdown: ElementType[PopUpCountdownProps] = js.native
  
  var DatePicker: ElementType[PopupDatePickerProps] = js.native
  
  var List: ElementType[PopUpListProps] = js.native
  
  var Picker: ElementType[PopupPickerProps] = js.native
  
  def close(): Unit = js.native
  
  def render(option: ReactNode, props: ModalProps): Unit = js.native
}
