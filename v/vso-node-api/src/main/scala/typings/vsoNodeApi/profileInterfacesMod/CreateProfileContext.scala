package typings.vsoNodeApi.profileInterfacesMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateProfileContext extends js.Object {
  
  var cIData: StringDictionary[js.Any] = js.native
  
  var contactWithOffers: Boolean = js.native
  
  var countryName: String = js.native
  
  var displayName: String = js.native
  
  var emailAddress: String = js.native
  
  var hasAccount: Boolean = js.native
  
  var language: String = js.native
  
  var phoneNumber: String = js.native
}
object CreateProfileContext {
  
  @scala.inline
  def apply(
    cIData: StringDictionary[js.Any],
    contactWithOffers: Boolean,
    countryName: String,
    displayName: String,
    emailAddress: String,
    hasAccount: Boolean,
    language: String,
    phoneNumber: String
  ): CreateProfileContext = {
    val __obj = js.Dynamic.literal(cIData = cIData.asInstanceOf[js.Any], contactWithOffers = contactWithOffers.asInstanceOf[js.Any], countryName = countryName.asInstanceOf[js.Any], displayName = displayName.asInstanceOf[js.Any], emailAddress = emailAddress.asInstanceOf[js.Any], hasAccount = hasAccount.asInstanceOf[js.Any], language = language.asInstanceOf[js.Any], phoneNumber = phoneNumber.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateProfileContext]
  }
  
  @scala.inline
  implicit class CreateProfileContextOps[Self <: CreateProfileContext] (val x: Self) extends AnyVal {
    
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
    def setCIData(value: StringDictionary[js.Any]): Self = this.set("cIData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContactWithOffers(value: Boolean): Self = this.set("contactWithOffers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCountryName(value: String): Self = this.set("countryName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayName(value: String): Self = this.set("displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmailAddress(value: String): Self = this.set("emailAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHasAccount(value: Boolean): Self = this.set("hasAccount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLanguage(value: String): Self = this.set("language", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPhoneNumber(value: String): Self = this.set("phoneNumber", value.asInstanceOf[js.Any])
  }
}
