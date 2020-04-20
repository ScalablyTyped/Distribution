package typings.xrm.Xrm

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Returns information about the current organization settings.
  */
trait OrganizationSettings extends js.Object {
  /**
    * Returns the ID of the base currency for the current organization.
    */
  var baseCurrencyId: String
  /**
    * Returns the default country/region code for phone numbers for the current organization.
    */
  var defaultCountryCode: String
  /**
    * Indicates whether the auto-save option is enabled for the current organization.
    */
  var isAutoSaveEnabled: Boolean
  /**
    * Returns the preferred language ID for the current organization.
    */
  var languageId: Double
  /**
    * Returns the ID of the current organization.
    */
  var organizationId: String
  /**
    * Returns the unique name of the current organization.
    */
  var uniqueName: String
  /**
    * Indicates whether the Skype protocol is used for the current organization.
    */
  var useSkypeProtocol: Boolean
}

object OrganizationSettings {
  @scala.inline
  def apply(
    baseCurrencyId: String,
    defaultCountryCode: String,
    isAutoSaveEnabled: Boolean,
    languageId: Double,
    organizationId: String,
    uniqueName: String,
    useSkypeProtocol: Boolean
  ): OrganizationSettings = {
    val __obj = js.Dynamic.literal(baseCurrencyId = baseCurrencyId.asInstanceOf[js.Any], defaultCountryCode = defaultCountryCode.asInstanceOf[js.Any], isAutoSaveEnabled = isAutoSaveEnabled.asInstanceOf[js.Any], languageId = languageId.asInstanceOf[js.Any], organizationId = organizationId.asInstanceOf[js.Any], uniqueName = uniqueName.asInstanceOf[js.Any], useSkypeProtocol = useSkypeProtocol.asInstanceOf[js.Any])
    __obj.asInstanceOf[OrganizationSettings]
  }
}

