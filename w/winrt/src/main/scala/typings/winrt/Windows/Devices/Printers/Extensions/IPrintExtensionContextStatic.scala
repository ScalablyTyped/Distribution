package typings.winrt.Windows.Devices.Printers.Extensions

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IPrintExtensionContextStatic extends js.Object {
  
  def fromDeviceId(deviceId: String): js.Any = js.native
}
object IPrintExtensionContextStatic {
  
  @scala.inline
  def apply(fromDeviceId: String => js.Any): IPrintExtensionContextStatic = {
    val __obj = js.Dynamic.literal(fromDeviceId = js.Any.fromFunction1(fromDeviceId))
    __obj.asInstanceOf[IPrintExtensionContextStatic]
  }
  
  @scala.inline
  implicit class IPrintExtensionContextStaticOps[Self <: IPrintExtensionContextStatic] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setFromDeviceId(value: String => js.Any): Self = this.set("fromDeviceId", js.Any.fromFunction1(value))
  }
}
