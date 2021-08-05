package typings.winrtUwp.Windows.Devices.AllJoyn

import typings.std.Date
import typings.winrtUwp.Windows.Foundation.Collections.IMap
import typings.winrtUwp.Windows.Foundation.Uri
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Used to set descriptive information about the app and the device it is running on. */
trait AllJoynAboutData extends StObject {
  
  /** A globally unique identifier associated with the app. */
  var appId: String
  
  /** A collection of language-specific app names. */
  var appNames: IMap[String, String]
  
  /** The date of manufacture. */
  var dateOfManufacture: Date
  
  /** The default app name assigned by the manufacturer- either the developer or the OEM. This property is a shortcut to the entry in the AppNames property for the DefaultLanguage . */
  var defaultAppName: String
  
  /** The default description of the app. This property is a shortcut to the entry in the Descriptions property for the DefaultLanguage . */
  var defaultDescription: String
  
  /** The name of the manufacturer of the app. This property is a shortcut to the entry in the Manufacturers property for the DefaultLanguage . */
  var defaultManufacturer: String
  
  /** A collection of language-specific app description strings. */
  var descriptions: IMap[String, String]
  
  /** Indicates if the service should advertise the provided AllJoynAboutData values. */
  var isEnabled: Boolean
  
  /** A collection of language-specific manufacturer name strings. */
  var manufacturers: IMap[String, String]
  
  /** The model number of the device running the app. */
  var modelNumber: String
  
  /** The version number of the app. Use of this property applies to Producer apps. */
  var softwareVersion: String
  
  /** A URL to the manufacturer or developer support portal. */
  var supportUrl: Uri
}
object AllJoynAboutData {
  
  inline def apply(
    appId: String,
    appNames: IMap[String, String],
    dateOfManufacture: Date,
    defaultAppName: String,
    defaultDescription: String,
    defaultManufacturer: String,
    descriptions: IMap[String, String],
    isEnabled: Boolean,
    manufacturers: IMap[String, String],
    modelNumber: String,
    softwareVersion: String,
    supportUrl: Uri
  ): AllJoynAboutData = {
    val __obj = js.Dynamic.literal(appId = appId.asInstanceOf[js.Any], appNames = appNames.asInstanceOf[js.Any], dateOfManufacture = dateOfManufacture.asInstanceOf[js.Any], defaultAppName = defaultAppName.asInstanceOf[js.Any], defaultDescription = defaultDescription.asInstanceOf[js.Any], defaultManufacturer = defaultManufacturer.asInstanceOf[js.Any], descriptions = descriptions.asInstanceOf[js.Any], isEnabled = isEnabled.asInstanceOf[js.Any], manufacturers = manufacturers.asInstanceOf[js.Any], modelNumber = modelNumber.asInstanceOf[js.Any], softwareVersion = softwareVersion.asInstanceOf[js.Any], supportUrl = supportUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[AllJoynAboutData]
  }
  
  extension [Self <: AllJoynAboutData](x: Self) {
    
    inline def setAppId(value: String): Self = StObject.set(x, "appId", value.asInstanceOf[js.Any])
    
    inline def setAppNames(value: IMap[String, String]): Self = StObject.set(x, "appNames", value.asInstanceOf[js.Any])
    
    inline def setDateOfManufacture(value: Date): Self = StObject.set(x, "dateOfManufacture", value.asInstanceOf[js.Any])
    
    inline def setDefaultAppName(value: String): Self = StObject.set(x, "defaultAppName", value.asInstanceOf[js.Any])
    
    inline def setDefaultDescription(value: String): Self = StObject.set(x, "defaultDescription", value.asInstanceOf[js.Any])
    
    inline def setDefaultManufacturer(value: String): Self = StObject.set(x, "defaultManufacturer", value.asInstanceOf[js.Any])
    
    inline def setDescriptions(value: IMap[String, String]): Self = StObject.set(x, "descriptions", value.asInstanceOf[js.Any])
    
    inline def setIsEnabled(value: Boolean): Self = StObject.set(x, "isEnabled", value.asInstanceOf[js.Any])
    
    inline def setManufacturers(value: IMap[String, String]): Self = StObject.set(x, "manufacturers", value.asInstanceOf[js.Any])
    
    inline def setModelNumber(value: String): Self = StObject.set(x, "modelNumber", value.asInstanceOf[js.Any])
    
    inline def setSoftwareVersion(value: String): Self = StObject.set(x, "softwareVersion", value.asInstanceOf[js.Any])
    
    inline def setSupportUrl(value: Uri): Self = StObject.set(x, "supportUrl", value.asInstanceOf[js.Any])
  }
}
