package typings.xrm.Xrm

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Returns information about the current organization settings.
  */
trait OrganizationSettings extends StObject {
  
  /**
    * Returns a lookup object containing the ID, name, and entity type of the base currency for the current organization.
    */
  var baseCurrency: LookupValue
  
  /**
    * Returns the ID of the base currency for the current organization.
    * @deprecated Deprecated in v9.1; use {@link Xrm.OrganizationSettings.baseCurrency globalContext.organizationSettings.baseCurrency} instead to display name along with the ID.
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
  
  inline def apply(
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
  
  extension [Self <: OrganizationSettings](x: Self) {
    
    inline def setBaseCurrency(value: LookupValue): Self = StObject.set(x, "baseCurrency", value.asInstanceOf[js.Any])
    
    inline def setBaseCurrencyId(value: String): Self = StObject.set(x, "baseCurrencyId", value.asInstanceOf[js.Any])
    
    inline def setDefaultCountryCode(value: String): Self = StObject.set(x, "defaultCountryCode", value.asInstanceOf[js.Any])
    
    inline def setIsAutoSaveEnabled(value: Boolean): Self = StObject.set(x, "isAutoSaveEnabled", value.asInstanceOf[js.Any])
    
    inline def setLanguageId(value: Double): Self = StObject.set(x, "languageId", value.asInstanceOf[js.Any])
    
    inline def setOrganizationId(value: String): Self = StObject.set(x, "organizationId", value.asInstanceOf[js.Any])
    
    inline def setUniqueName(value: String): Self = StObject.set(x, "uniqueName", value.asInstanceOf[js.Any])
    
    inline def setUseSkypeProtocol(value: Boolean): Self = StObject.set(x, "useSkypeProtocol", value.asInstanceOf[js.Any])
  }
}
