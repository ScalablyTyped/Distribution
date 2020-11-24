package typings.uaParserJs.IUAParser

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IDevice extends js.Object {
  
  /**
    * Determined dynamically
    */
  var model: js.UndefOr[String] = js.native
  
  /**
    * Possible type:
    * console, mobile, tablet, smarttv, wearable, embedded
    */
  var `type`: js.UndefOr[String] = js.native
  
  /**
    * Possible vendor:
    * Acer, Alcatel, Amazon, Apple, Archos, Asus, BenQ, BlackBerry, Dell, GeeksPhone,
    * Google, HP, HTC, Huawei, Jolla, Lenovo, LG, Meizu, Microsoft, Motorola, Nexian,
    * Nintendo, Nokia, Nvidia, Ouya, Palm, Panasonic, Polytron, RIM, Samsung, Sharp,
    * Siemens, Sony-Ericsson, Sprint, Xbox, ZTE
    */
  var vendor: js.UndefOr[String] = js.native
}
object IDevice {
  
  @scala.inline
  def apply(): IDevice = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IDevice]
  }
  
  @scala.inline
  implicit class IDeviceOps[Self <: IDevice] (val x: Self) extends AnyVal {
    
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
    def setModel(value: String): Self = this.set("model", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteModel: Self = this.set("model", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    
    @scala.inline
    def setVendor(value: String): Self = this.set("vendor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVendor: Self = this.set("vendor", js.undefined)
  }
}
