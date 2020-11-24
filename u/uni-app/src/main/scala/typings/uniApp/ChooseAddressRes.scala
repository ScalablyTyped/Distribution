package typings.uniApp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChooseAddressRes extends js.Object {
  
  /**
    * 国标收货地址第二级地址
    */
  var cityName: js.UndefOr[String] = js.native
  
  /**
    * 国标收货地址第三级地址
    */
  var countyName: js.UndefOr[String] = js.native
  
  /**
    * 详细收货地址信息
    */
  var detailInfo: js.UndefOr[String] = js.native
  
  /**
    * 调用结果
    */
  var errMsg: js.UndefOr[String] = js.native
  
  /**
    * 收货地址国家码
    */
  var nationalCode: js.UndefOr[String] = js.native
  
  /**
    * 邮编
    */
  var postalCode: js.UndefOr[String] = js.native
  
  /**
    * 国标收货地址第一级地址
    */
  var provinceName: js.UndefOr[String] = js.native
  
  /**
    * 收货人手机号码
    */
  var telNumber: js.UndefOr[String] = js.native
  
  /**
    * 收货人姓名
    */
  var userName: js.UndefOr[String] = js.native
}
object ChooseAddressRes {
  
  @scala.inline
  def apply(): ChooseAddressRes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChooseAddressRes]
  }
  
  @scala.inline
  implicit class ChooseAddressResOps[Self <: ChooseAddressRes] (val x: Self) extends AnyVal {
    
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
    def setCityName(value: String): Self = this.set("cityName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCityName: Self = this.set("cityName", js.undefined)
    
    @scala.inline
    def setCountyName(value: String): Self = this.set("countyName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCountyName: Self = this.set("countyName", js.undefined)
    
    @scala.inline
    def setDetailInfo(value: String): Self = this.set("detailInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDetailInfo: Self = this.set("detailInfo", js.undefined)
    
    @scala.inline
    def setErrMsg(value: String): Self = this.set("errMsg", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteErrMsg: Self = this.set("errMsg", js.undefined)
    
    @scala.inline
    def setNationalCode(value: String): Self = this.set("nationalCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNationalCode: Self = this.set("nationalCode", js.undefined)
    
    @scala.inline
    def setPostalCode(value: String): Self = this.set("postalCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePostalCode: Self = this.set("postalCode", js.undefined)
    
    @scala.inline
    def setProvinceName(value: String): Self = this.set("provinceName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProvinceName: Self = this.set("provinceName", js.undefined)
    
    @scala.inline
    def setTelNumber(value: String): Self = this.set("telNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTelNumber: Self = this.set("telNumber", js.undefined)
    
    @scala.inline
    def setUserName(value: String): Self = this.set("userName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUserName: Self = this.set("userName", js.undefined)
  }
}
