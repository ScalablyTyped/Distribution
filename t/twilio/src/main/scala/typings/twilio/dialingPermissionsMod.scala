package typings.twilio

import typings.twilio.bulkCountryUpdateMod.BulkCountryUpdateListInstance
import typings.twilio.dialingPermissionsCountryMod.CountryListInstance
import typings.twilio.pageMod.TwilioResponsePayload
import typings.twilio.settingsMod.SettingsListInstance
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dialingPermissionsMod {
  
  @JSImport("twilio/lib/rest/voice/v1/dialingPermissions", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Initialize the DialingPermissionsList
    *
    * PLEASE NOTE that this class contains preview products that are subject to
    * change. Use them with caution. If you currently do not have developer preview
    * access, please contact help@twilio.com.
    *
    * @param version - Version of the resource
    */
  inline def DialingPermissionsList(version: typings.twilio.voiceV1Mod.^): DialingPermissionsListInstance = ^.asInstanceOf[js.Dynamic].applyDynamic("DialingPermissionsList")(version.asInstanceOf[js.Any]).asInstanceOf[DialingPermissionsListInstance]
  
  trait DialingPermissionsListInstance extends StObject {
    
    var bulkCountryUpdates: js.UndefOr[BulkCountryUpdateListInstance] = js.undefined
    
    var countries: js.UndefOr[CountryListInstance] = js.undefined
    
    var settings: js.UndefOr[SettingsListInstance] = js.undefined
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any
  }
  object DialingPermissionsListInstance {
    
    inline def apply(toJSON: () => Any): DialingPermissionsListInstance = {
      val __obj = js.Dynamic.literal(toJSON = js.Any.fromFunction0(toJSON))
      __obj.asInstanceOf[DialingPermissionsListInstance]
    }
    
    extension [Self <: DialingPermissionsListInstance](x: Self) {
      
      inline def setBulkCountryUpdates(value: BulkCountryUpdateListInstance): Self = StObject.set(x, "bulkCountryUpdates", value.asInstanceOf[js.Any])
      
      inline def setBulkCountryUpdatesUndefined: Self = StObject.set(x, "bulkCountryUpdates", js.undefined)
      
      inline def setCountries(value: CountryListInstance): Self = StObject.set(x, "countries", value.asInstanceOf[js.Any])
      
      inline def setCountriesUndefined: Self = StObject.set(x, "countries", js.undefined)
      
      inline def setSettings(value: SettingsListInstance): Self = StObject.set(x, "settings", value.asInstanceOf[js.Any])
      
      inline def setSettingsUndefined: Self = StObject.set(x, "settings", js.undefined)
      
      inline def setToJSON(value: () => Any): Self = StObject.set(x, "toJSON", js.Any.fromFunction0(value))
    }
  }
  
  trait DialingPermissionsPayload
    extends StObject
       with DialingPermissionsResource
       with TwilioResponsePayload
  object DialingPermissionsPayload {
    
    inline def apply(
      first_page_uri: String,
      next_page_uri: String,
      page: Double,
      page_size: Double,
      previous_page_uri: String,
      uri: String
    ): DialingPermissionsPayload = {
      val __obj = js.Dynamic.literal(first_page_uri = first_page_uri.asInstanceOf[js.Any], next_page_uri = next_page_uri.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], page_size = page_size.asInstanceOf[js.Any], previous_page_uri = previous_page_uri.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any])
      __obj.asInstanceOf[DialingPermissionsPayload]
    }
  }
  
  trait DialingPermissionsResource extends StObject
  
  trait DialingPermissionsSolution extends StObject
}
