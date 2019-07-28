package typings.vsoDashNodeDashApi.interfacesProfileInterfacesMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateProfileContext extends js.Object {
  var cIData: StringDictionary[js.Any]
  var contactWithOffers: Boolean
  var countryName: String
  var displayName: String
  var emailAddress: String
  var hasAccount: Boolean
  var language: String
  var phoneNumber: String
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
    val __obj = js.Dynamic.literal(cIData = cIData, contactWithOffers = contactWithOffers, countryName = countryName, displayName = displayName, emailAddress = emailAddress, hasAccount = hasAccount, language = language, phoneNumber = phoneNumber)
  
    __obj.asInstanceOf[CreateProfileContext]
  }
}

