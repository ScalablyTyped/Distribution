package typings.vsoNodeApi.profileInterfacesMod

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
    val __obj = js.Dynamic.literal(cIData = cIData.asInstanceOf[js.Any], contactWithOffers = contactWithOffers.asInstanceOf[js.Any], countryName = countryName.asInstanceOf[js.Any], displayName = displayName.asInstanceOf[js.Any], emailAddress = emailAddress.asInstanceOf[js.Any], hasAccount = hasAccount.asInstanceOf[js.Any], language = language.asInstanceOf[js.Any], phoneNumber = phoneNumber.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateProfileContext]
  }
}

