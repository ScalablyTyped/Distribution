package typings.tuyaPanelKit.mod

import typings.react.mod.Component
import typings.react.mod.ElementType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("tuya-panel-kit", "Toast")
@js.native
class Toast ()
  extends Component[ToastProps, js.Object, js.Any]
/* static members */
@JSImport("tuya-panel-kit", "Toast")
@js.native
object Toast extends js.Object {
  
  var Error: ElementType[ToastErrorProps] = js.native
  
  var Loading: ElementType[ToastLoadingProps] = js.native
  
  var Success: ElementType[ToastSuccessProps] = js.native
  
  var Warning: ElementType[ToastWarningProps] = js.native
}
