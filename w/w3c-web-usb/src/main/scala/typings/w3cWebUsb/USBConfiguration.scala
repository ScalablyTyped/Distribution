package typings.w3cWebUsb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait USBConfiguration extends js.Object {
  
  val configurationName: js.UndefOr[String] = js.native
  
  val configurationValue: Double = js.native
  
  val interfaces: js.Array[USBInterface] = js.native
}
object USBConfiguration {
  
  @scala.inline
  def apply(configurationValue: Double, interfaces: js.Array[USBInterface]): USBConfiguration = {
    val __obj = js.Dynamic.literal(configurationValue = configurationValue.asInstanceOf[js.Any], interfaces = interfaces.asInstanceOf[js.Any])
    __obj.asInstanceOf[USBConfiguration]
  }
  
  @scala.inline
  implicit class USBConfigurationOps[Self <: USBConfiguration] (val x: Self) extends AnyVal {
    
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
    def setConfigurationValue(value: Double): Self = this.set("configurationValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInterfacesVarargs(value: USBInterface*): Self = this.set("interfaces", js.Array(value :_*))
    
    @scala.inline
    def setInterfaces(value: js.Array[USBInterface]): Self = this.set("interfaces", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConfigurationName(value: String): Self = this.set("configurationName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConfigurationName: Self = this.set("configurationName", js.undefined)
  }
}
