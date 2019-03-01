package typings
package xrmLib.XrmNs

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
  var baseCurrencyId: java.lang.String
  /**
    * Returns the default country/region code for phone numbers for the current organization.
    */
  var defaultCountryCode: java.lang.String
  /**
    * Indicates whether the auto-save option is enabled for the current organization.
    */
  var isAutoSaveEnabled: scala.Boolean
  /**
    * Returns the preferred language ID for the current organization.
    */
  var languageId: scala.Double
  /**
    * Returns the ID of the current organization.
    */
  var organizationId: java.lang.String
  /**
    * Returns the unique name of the current organization.
    */
  var uniqueName: java.lang.String
  /**
    * Indicates whether the Skype protocol is used for the current organization.
    */
  var useSkypeProtocol: scala.Boolean
}

object OrganizationSettings {
  @scala.inline
  def apply(
    baseCurrencyId: java.lang.String,
    defaultCountryCode: java.lang.String,
    isAutoSaveEnabled: scala.Boolean,
    languageId: scala.Double,
    organizationId: java.lang.String,
    uniqueName: java.lang.String,
    useSkypeProtocol: scala.Boolean
  ): OrganizationSettings = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("baseCurrencyId")(baseCurrencyId)
    __obj.updateDynamic("defaultCountryCode")(defaultCountryCode)
    __obj.updateDynamic("isAutoSaveEnabled")(isAutoSaveEnabled)
    __obj.updateDynamic("languageId")(languageId)
    __obj.updateDynamic("organizationId")(organizationId)
    __obj.updateDynamic("uniqueName")(uniqueName)
    __obj.updateDynamic("useSkypeProtocol")(useSkypeProtocol)
    __obj.asInstanceOf[OrganizationSettings]
  }
}

