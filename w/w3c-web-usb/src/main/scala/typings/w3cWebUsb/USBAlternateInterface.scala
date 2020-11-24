package typings.w3cWebUsb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait USBAlternateInterface extends js.Object {
  
  val alternateSetting: Double = js.native
  
  val endpoints: js.Array[USBEndpoint] = js.native
  
  val interfaceClass: Double = js.native
  
  val interfaceName: js.UndefOr[String] = js.native
  
  val interfaceProtocol: Double = js.native
  
  val interfaceSubclass: Double = js.native
}
object USBAlternateInterface {
  
  @scala.inline
  def apply(
    alternateSetting: Double,
    endpoints: js.Array[USBEndpoint],
    interfaceClass: Double,
    interfaceProtocol: Double,
    interfaceSubclass: Double
  ): USBAlternateInterface = {
    val __obj = js.Dynamic.literal(alternateSetting = alternateSetting.asInstanceOf[js.Any], endpoints = endpoints.asInstanceOf[js.Any], interfaceClass = interfaceClass.asInstanceOf[js.Any], interfaceProtocol = interfaceProtocol.asInstanceOf[js.Any], interfaceSubclass = interfaceSubclass.asInstanceOf[js.Any])
    __obj.asInstanceOf[USBAlternateInterface]
  }
  
  @scala.inline
  implicit class USBAlternateInterfaceOps[Self <: USBAlternateInterface] (val x: Self) extends AnyVal {
    
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
    def setAlternateSetting(value: Double): Self = this.set("alternateSetting", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndpointsVarargs(value: USBEndpoint*): Self = this.set("endpoints", js.Array(value :_*))
    
    @scala.inline
    def setEndpoints(value: js.Array[USBEndpoint]): Self = this.set("endpoints", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInterfaceClass(value: Double): Self = this.set("interfaceClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInterfaceProtocol(value: Double): Self = this.set("interfaceProtocol", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInterfaceSubclass(value: Double): Self = this.set("interfaceSubclass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInterfaceName(value: String): Self = this.set("interfaceName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInterfaceName: Self = this.set("interfaceName", js.undefined)
  }
}
