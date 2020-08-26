package typings.xrm.Xrm

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Returns information about the current organization settings.
  */
@js.native
trait OrganizationSettings extends js.Object {
  /**
    * Returns a lookup object containing the ID, name, and entity type of the base currency for the current organization.
    */
  var baseCurrency: LookupValue = js.native
  /**
    * Returns the ID of the base currency for the current organization.
    * @deprecated Deprecated in v9.1; use {@link Xrm.OrganizationSettings.baseCurrency globalContext.organizationSettings.baseCurrency} instead to display name along with the ID.
    */
  var baseCurrencyId: String = js.native
  /**
    * Returns the default country/region code for phone numbers for the current organization.
    */
  var defaultCountryCode: String = js.native
  /**
    * Indicates whether the auto-save option is enabled for the current organization.
    */
  var isAutoSaveEnabled: Boolean = js.native
  /**
    * Returns the preferred language ID for the current organization.
    */
  var languageId: Double = js.native
  /**
    * Returns the ID of the current organization.
    */
  var organizationId: String = js.native
  /**
    * Returns the unique name of the current organization.
    */
  var uniqueName: String = js.native
  /**
    * Indicates whether the Skype protocol is used for the current organization.
    */
  var useSkypeProtocol: Boolean = js.native
}

object OrganizationSettings {
  @scala.inline
  def apply(
    baseCurrency: LookupValue,
    baseCurrencyId: String,
    defaultCountryCode: String,
    isAutoSaveEnabled: Boolean,
    languageId: Double,
    organizationId: String,
    uniqueName: String,
    useSkypeProtocol: Boolean
  ): OrganizationSettings = {
    val __obj = js.Dynamic.literal(baseCurrency = baseCurrency.asInstanceOf[js.Any], baseCurrencyId = baseCurrencyId.asInstanceOf[js.Any], defaultCountryCode = defaultCountryCode.asInstanceOf[js.Any], isAutoSaveEnabled = isAutoSaveEnabled.asInstanceOf[js.Any], languageId = languageId.asInstanceOf[js.Any], organizationId = organizationId.asInstanceOf[js.Any], uniqueName = uniqueName.asInstanceOf[js.Any], useSkypeProtocol = useSkypeProtocol.asInstanceOf[js.Any])
    __obj.asInstanceOf[OrganizationSettings]
  }
  @scala.inline
  implicit class OrganizationSettingsOps[Self <: OrganizationSettings] (val x: Self) extends AnyVal {
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
    def setBaseCurrency(value: LookupValue): Self = this.set("baseCurrency", value.asInstanceOf[js.Any])
    @scala.inline
    def setBaseCurrencyId(value: String): Self = this.set("baseCurrencyId", value.asInstanceOf[js.Any])
    @scala.inline
    def setDefaultCountryCode(value: String): Self = this.set("defaultCountryCode", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsAutoSaveEnabled(value: Boolean): Self = this.set("isAutoSaveEnabled", value.asInstanceOf[js.Any])
    @scala.inline
    def setLanguageId(value: Double): Self = this.set("languageId", value.asInstanceOf[js.Any])
    @scala.inline
    def setOrganizationId(value: String): Self = this.set("organizationId", value.asInstanceOf[js.Any])
    @scala.inline
    def setUniqueName(value: String): Self = this.set("uniqueName", value.asInstanceOf[js.Any])
    @scala.inline
    def setUseSkypeProtocol(value: Boolean): Self = this.set("useSkypeProtocol", value.asInstanceOf[js.Any])
  }
  
}

