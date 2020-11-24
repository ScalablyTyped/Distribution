package typings.wepy.wxEnhancedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WechatProfileDetails extends js.Object {
  
  var email: js.UndefOr[String] = js.native
  
  var firstName: js.UndefOr[String] = js.native
  
  var homeAddressCity: js.UndefOr[String] = js.native
  
  var homeAddressCountry: js.UndefOr[String] = js.native
  
  var homeAddressPostalCode: js.UndefOr[String] = js.native
  
  var homeAddressState: js.UndefOr[String] = js.native
  
  var homeAddressStreet: js.UndefOr[String] = js.native
  
  var homeFaxNumber: js.UndefOr[String] = js.native
  
  var homePhoneNumber: js.UndefOr[String] = js.native
  
  var lastName: js.UndefOr[String] = js.native
  
  var middleName: js.UndefOr[String] = js.native
  
  var mobilePhoneNumber: js.UndefOr[String] = js.native
  
  var nickName: js.UndefOr[String] = js.native
  
  var photoFilePath: js.UndefOr[String] = js.native
  
  var remark: js.UndefOr[String] = js.native
  
  var url: js.UndefOr[String] = js.native
  
  var workAddressCity: js.UndefOr[String] = js.native
  
  var workAddressCountry: js.UndefOr[String] = js.native
  
  var workAddressPostalCode: js.UndefOr[String] = js.native
  
  var workAddressState: js.UndefOr[String] = js.native
  
  var workAddressStreet: js.UndefOr[String] = js.native
}
object WechatProfileDetails {
  
  @scala.inline
  def apply(): WechatProfileDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WechatProfileDetails]
  }
  
  @scala.inline
  implicit class WechatProfileDetailsOps[Self <: WechatProfileDetails] (val x: Self) extends AnyVal {
    
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
    def setEmail(value: String): Self = this.set("email", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEmail: Self = this.set("email", js.undefined)
    
    @scala.inline
    def setFirstName(value: String): Self = this.set("firstName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFirstName: Self = this.set("firstName", js.undefined)
    
    @scala.inline
    def setHomeAddressCity(value: String): Self = this.set("homeAddressCity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHomeAddressCity: Self = this.set("homeAddressCity", js.undefined)
    
    @scala.inline
    def setHomeAddressCountry(value: String): Self = this.set("homeAddressCountry", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHomeAddressCountry: Self = this.set("homeAddressCountry", js.undefined)
    
    @scala.inline
    def setHomeAddressPostalCode(value: String): Self = this.set("homeAddressPostalCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHomeAddressPostalCode: Self = this.set("homeAddressPostalCode", js.undefined)
    
    @scala.inline
    def setHomeAddressState(value: String): Self = this.set("homeAddressState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHomeAddressState: Self = this.set("homeAddressState", js.undefined)
    
    @scala.inline
    def setHomeAddressStreet(value: String): Self = this.set("homeAddressStreet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHomeAddressStreet: Self = this.set("homeAddressStreet", js.undefined)
    
    @scala.inline
    def setHomeFaxNumber(value: String): Self = this.set("homeFaxNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHomeFaxNumber: Self = this.set("homeFaxNumber", js.undefined)
    
    @scala.inline
    def setHomePhoneNumber(value: String): Self = this.set("homePhoneNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHomePhoneNumber: Self = this.set("homePhoneNumber", js.undefined)
    
    @scala.inline
    def setLastName(value: String): Self = this.set("lastName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLastName: Self = this.set("lastName", js.undefined)
    
    @scala.inline
    def setMiddleName(value: String): Self = this.set("middleName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMiddleName: Self = this.set("middleName", js.undefined)
    
    @scala.inline
    def setMobilePhoneNumber(value: String): Self = this.set("mobilePhoneNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMobilePhoneNumber: Self = this.set("mobilePhoneNumber", js.undefined)
    
    @scala.inline
    def setNickName(value: String): Self = this.set("nickName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNickName: Self = this.set("nickName", js.undefined)
    
    @scala.inline
    def setPhotoFilePath(value: String): Self = this.set("photoFilePath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePhotoFilePath: Self = this.set("photoFilePath", js.undefined)
    
    @scala.inline
    def setRemark(value: String): Self = this.set("remark", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRemark: Self = this.set("remark", js.undefined)
    
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUrl: Self = this.set("url", js.undefined)
    
    @scala.inline
    def setWorkAddressCity(value: String): Self = this.set("workAddressCity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWorkAddressCity: Self = this.set("workAddressCity", js.undefined)
    
    @scala.inline
    def setWorkAddressCountry(value: String): Self = this.set("workAddressCountry", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWorkAddressCountry: Self = this.set("workAddressCountry", js.undefined)
    
    @scala.inline
    def setWorkAddressPostalCode(value: String): Self = this.set("workAddressPostalCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWorkAddressPostalCode: Self = this.set("workAddressPostalCode", js.undefined)
    
    @scala.inline
    def setWorkAddressState(value: String): Self = this.set("workAddressState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWorkAddressState: Self = this.set("workAddressState", js.undefined)
    
    @scala.inline
    def setWorkAddressStreet(value: String): Self = this.set("workAddressStreet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWorkAddressStreet: Self = this.set("workAddressStreet", js.undefined)
  }
}
