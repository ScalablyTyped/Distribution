package typings.tuyaPanelKit.mod

import typings.react.mod.Component
import typings.react.mod.ElementType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("tuya-panel-kit", "Toast")
@js.native
class Toast protected ()
  extends Component[ToastProps, js.Object, js.Any] {
  def this(props: ToastProps) = this()
  /**
    * @deprecated
    * @see https://reactjs.org/docs/legacy-context.html
    */
  def this(props: ToastProps, context: js.Any) = this()
}
/* static members */
object Toast {
  
  @JSImport("tuya-panel-kit", "Toast")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("tuya-panel-kit", "Toast.Error")
  @js.native
  def Error: ElementType[ToastErrorProps] = js.native
  @scala.inline
  def Error_=(x: ElementType[ToastErrorProps]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Error")(x.asInstanceOf[js.Any])
  
  @JSImport("tuya-panel-kit", "Toast.Loading")
  @js.native
  def Loading: ElementType[ToastLoadingProps] = js.native
  @scala.inline
  def Loading_=(x: ElementType[ToastLoadingProps]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Loading")(x.asInstanceOf[js.Any])
  
  @JSImport("tuya-panel-kit", "Toast.Success")
  @js.native
  def Success: ElementType[ToastSuccessProps] = js.native
  @scala.inline
  def Success_=(x: ElementType[ToastSuccessProps]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Success")(x.asInstanceOf[js.Any])
  
  @JSImport("tuya-panel-kit", "Toast.Warning")
  @js.native
  def Warning: ElementType[ToastWarningProps] = js.native
  @scala.inline
  def Warning_=(x: ElementType[ToastWarningProps]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Warning")(x.asInstanceOf[js.Any])
}
