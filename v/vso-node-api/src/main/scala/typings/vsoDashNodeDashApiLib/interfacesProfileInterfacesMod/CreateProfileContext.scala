package typings
package vsoDashNodeDashApiLib.interfacesProfileInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateProfileContext extends js.Object {
  var cIData: org.scalablytyped.runtime.StringDictionary[js.Any]
  var contactWithOffers: scala.Boolean
  var countryName: java.lang.String
  var displayName: java.lang.String
  var emailAddress: java.lang.String
  var hasAccount: scala.Boolean
  var language: java.lang.String
  var phoneNumber: java.lang.String
}

object CreateProfileContext {
  @scala.inline
  def apply(
    cIData: org.scalablytyped.runtime.StringDictionary[js.Any],
    contactWithOffers: scala.Boolean,
    countryName: java.lang.String,
    displayName: java.lang.String,
    emailAddress: java.lang.String,
    hasAccount: scala.Boolean,
    language: java.lang.String,
    phoneNumber: java.lang.String
  ): CreateProfileContext = {
    val __obj = js.Dynamic.literal(cIData = cIData, contactWithOffers = contactWithOffers, countryName = countryName, displayName = displayName, emailAddress = emailAddress, hasAccount = hasAccount, language = language, phoneNumber = phoneNumber)
  
    __obj.asInstanceOf[CreateProfileContext]
  }
}

