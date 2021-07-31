package typings.tuyaPanelKit.mod

import typings.react.mod.Component
import typings.react.mod.ElementType
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("tuya-panel-kit", "Modal")
@js.native
class Modal protected ()
  extends Component[ModalProps, js.Object, js.Any] {
  def this(props: ModalProps) = this()
  /**
    * @deprecated
    * @see https://reactjs.org/docs/legacy-context.html
    */
  def this(props: ModalProps, context: js.Any) = this()
}
/* static members */
object Modal {
  
  @JSImport("tuya-panel-kit", "Modal")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("tuya-panel-kit", "Modal.Countdown")
  @js.native
  def Countdown: ElementType[PopUpCountdownProps] = js.native
  @scala.inline
  def Countdown_=(x: ElementType[PopUpCountdownProps]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Countdown")(x.asInstanceOf[js.Any])
  
  @JSImport("tuya-panel-kit", "Modal.DatePicker")
  @js.native
  def DatePicker: ElementType[PopupDatePickerProps] = js.native
  @scala.inline
  def DatePicker_=(x: ElementType[PopupDatePickerProps]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DatePicker")(x.asInstanceOf[js.Any])
  
  @JSImport("tuya-panel-kit", "Modal.List")
  @js.native
  def List: ElementType[PopUpListProps] = js.native
  @scala.inline
  def List_=(x: ElementType[PopUpListProps]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("List")(x.asInstanceOf[js.Any])
  
  @JSImport("tuya-panel-kit", "Modal.Picker")
  @js.native
  def Picker: ElementType[PopupPickerProps] = js.native
  @scala.inline
  def Picker_=(x: ElementType[PopupPickerProps]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Picker")(x.asInstanceOf[js.Any])
  
  @scala.inline
  def close(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("close")().asInstanceOf[Unit]
  
  @scala.inline
  def render(option: ReactNode, props: ModalProps): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("render")(option.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
