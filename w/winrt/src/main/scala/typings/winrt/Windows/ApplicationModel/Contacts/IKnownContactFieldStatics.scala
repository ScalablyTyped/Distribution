package typings.winrt.Windows.ApplicationModel.Contacts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IKnownContactFieldStatics extends js.Object {
  
  def convertNameToType(name: String): ContactFieldType = js.native
  
  def convertTypeToName(`type`: ContactFieldType): String = js.native
  
  var email: String = js.native
  
  var instantMessage: String = js.native
  
  var location: String = js.native
  
  var phoneNumber: String = js.native
}
object IKnownContactFieldStatics {
  
  @scala.inline
  def apply(
    convertNameToType: String => ContactFieldType,
    convertTypeToName: ContactFieldType => String,
    email: String,
    instantMessage: String,
    location: String,
    phoneNumber: String
  ): IKnownContactFieldStatics = {
    val __obj = js.Dynamic.literal(convertNameToType = js.Any.fromFunction1(convertNameToType), convertTypeToName = js.Any.fromFunction1(convertTypeToName), email = email.asInstanceOf[js.Any], instantMessage = instantMessage.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], phoneNumber = phoneNumber.asInstanceOf[js.Any])
    __obj.asInstanceOf[IKnownContactFieldStatics]
  }
  
  @scala.inline
  implicit class IKnownContactFieldStaticsOps[Self <: IKnownContactFieldStatics] (val x: Self) extends AnyVal {
    
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
    def setConvertNameToType(value: String => ContactFieldType): Self = this.set("convertNameToType", js.Any.fromFunction1(value))
    
    @scala.inline
    def setConvertTypeToName(value: ContactFieldType => String): Self = this.set("convertTypeToName", js.Any.fromFunction1(value))
    
    @scala.inline
    def setEmail(value: String): Self = this.set("email", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstantMessage(value: String): Self = this.set("instantMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocation(value: String): Self = this.set("location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPhoneNumber(value: String): Self = this.set("phoneNumber", value.asInstanceOf[js.Any])
  }
}
