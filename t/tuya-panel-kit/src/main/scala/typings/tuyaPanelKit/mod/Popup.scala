package typings.tuyaPanelKit.mod

import typings.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("tuya-panel-kit", "Popup")
@js.native
class Popup protected ()
  extends Component[PopupProps, js.Object, js.Any] {
  def this(props: PopupProps) = this()
  /**
    * @deprecated
    * @see https://reactjs.org/docs/legacy-context.html
    */
  def this(props: PopupProps, context: js.Any) = this()
}
/* static members */
object Popup {
  
  @JSImport("tuya-panel-kit", "Popup")
  @js.native
  val ^ : js.Any = js.native
  
  inline def close(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("close")().asInstanceOf[Unit]
  
  inline def countdown(option: PopUpCountdownProps): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("countdown")(option.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def countdown(option: PopUpCountdownProps, option2: DialogElse): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("countdown")(option.asInstanceOf[js.Any], option2.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def custom(option: PopupCustomProps): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("custom")(option.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def custom(option: PopupCustomProps, option2: DialogElse): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("custom")(option.asInstanceOf[js.Any], option2.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def datePicker(option: PopupDatePickerProps): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("datePicker")(option.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def datePicker(option: PopupDatePickerProps, option2: DialogElse): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("datePicker")(option.asInstanceOf[js.Any], option2.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def dropdown(option: PopupDropdownProps): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("dropdown")(option.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def list(option: PopUpListProps): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("list")(option.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def list(option: PopUpListProps, option2: DialogElse): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("list")(option.asInstanceOf[js.Any], option2.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def numberSelector(option: PopupNumberSelectorProps): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("numberSelector")(option.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def numberSelector(option: PopupNumberSelectorProps, option2: DialogElse): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("numberSelector")(option.asInstanceOf[js.Any], option2.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def picker(option: PopupPickerProps): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("picker")(option.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def picker(option: PopupPickerProps, option2: DialogElse): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("picker")(option.asInstanceOf[js.Any], option2.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def timerPicker(option: PopupTimerPickerProps): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("timerPicker")(option.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def timerPicker(option: PopupTimerPickerProps, option2: DialogElse): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("timerPicker")(option.asInstanceOf[js.Any], option2.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def tips(option: PopupTipsProps): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("tips")(option.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def toast(option: PopupToastProps): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("toast")(option.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
