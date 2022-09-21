package typings.winrtUwp.Windows.Devices.AllJoyn

import typings.winrtUwp.Windows.Foundation.Collections.IMapView
import typings.winrtUwp.Windows.Foundation.Collections.IVectorView
import typings.winrtUwp.Windows.Foundation.Uri
import typings.winrtUwp.Windows.Globalization.Language
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Used to view data about another app and the device it is running on. */
trait AllJoynAboutDataView extends StObject {
  
  /** The version number for the implemented AllJoyn platform software. */
  var ajSoftwareVersion: String
  
  /** A globally unique identifier associated with the app. */
  var appId: String
  
  /** The name of the app. */
  var appName: String
  
  /** The date of manufacture. */
  var dateOfManufacture: js.Date
  
  /** The default language of the app. */
  var defaultLanguage: Language
  
  /** An app description provided by the manufacturer. */
  var description: String
  
  /** The device ID used during advertising. */
  var deviceId: String
  
  /** Name of the device. */
  var deviceName: String
  
  /** The current version of the hardware that the app is running on. This field is optional, presenting as an empty string if not set. */
  var hardwareVersion: String
  
  /** The name of the manufacturer. */
  var manufacturer: String
  
  /** The model number of the device running the app. */
  var modelNumber: String
  
  /** This is a set of fields, where each other named AllJoynAboutDataView property is also accessible. For example, ModelNumber is Properties ["ModelNumber"]. Additionally, this property can be used to get custom properties. */
  var properties: IMapView[String, Any]
  
  /** The version number of the app. */
  var softwareVersion: String
  
  /** The status returned by the GetDataBySessionPortAsync operation that created the AllJoynAboutDataView object. */
  var status: Double
  
  /** A URL to the manufacturer or developer support portal. */
  var supportUrl: Uri
  
  /** A list of languages supported by the app and will always include the DefaultLanguage . */
  var supportedLanguages: IVectorView[Language]
}
object AllJoynAboutDataView {
  
  inline def apply(
    ajSoftwareVersion: String,
    appId: String,
    appName: String,
    dateOfManufacture: js.Date,
    defaultLanguage: Language,
    description: String,
    deviceId: String,
    deviceName: String,
    hardwareVersion: String,
    manufacturer: String,
    modelNumber: String,
    properties: IMapView[String, Any],
    softwareVersion: String,
    status: Double,
    supportUrl: Uri,
    supportedLanguages: IVectorView[Language]
  ): AllJoynAboutDataView = {
    val __obj = js.Dynamic.literal(ajSoftwareVersion = ajSoftwareVersion.asInstanceOf[js.Any], appId = appId.asInstanceOf[js.Any], appName = appName.asInstanceOf[js.Any], dateOfManufacture = dateOfManufacture.asInstanceOf[js.Any], defaultLanguage = defaultLanguage.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], deviceId = deviceId.asInstanceOf[js.Any], deviceName = deviceName.asInstanceOf[js.Any], hardwareVersion = hardwareVersion.asInstanceOf[js.Any], manufacturer = manufacturer.asInstanceOf[js.Any], modelNumber = modelNumber.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any], softwareVersion = softwareVersion.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], supportUrl = supportUrl.asInstanceOf[js.Any], supportedLanguages = supportedLanguages.asInstanceOf[js.Any])
    __obj.asInstanceOf[AllJoynAboutDataView]
  }
  
  extension [Self <: AllJoynAboutDataView](x: Self) {
    
    inline def setAjSoftwareVersion(value: String): Self = StObject.set(x, "ajSoftwareVersion", value.asInstanceOf[js.Any])
    
    inline def setAppId(value: String): Self = StObject.set(x, "appId", value.asInstanceOf[js.Any])
    
    inline def setAppName(value: String): Self = StObject.set(x, "appName", value.asInstanceOf[js.Any])
    
    inline def setDateOfManufacture(value: js.Date): Self = StObject.set(x, "dateOfManufacture", value.asInstanceOf[js.Any])
    
    inline def setDefaultLanguage(value: Language): Self = StObject.set(x, "defaultLanguage", value.asInstanceOf[js.Any])
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDeviceId(value: String): Self = StObject.set(x, "deviceId", value.asInstanceOf[js.Any])
    
    inline def setDeviceName(value: String): Self = StObject.set(x, "deviceName", value.asInstanceOf[js.Any])
    
    inline def setHardwareVersion(value: String): Self = StObject.set(x, "hardwareVersion", value.asInstanceOf[js.Any])
    
    inline def setManufacturer(value: String): Self = StObject.set(x, "manufacturer", value.asInstanceOf[js.Any])
    
    inline def setModelNumber(value: String): Self = StObject.set(x, "modelNumber", value.asInstanceOf[js.Any])
    
    inline def setProperties(value: IMapView[String, Any]): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
    
    inline def setSoftwareVersion(value: String): Self = StObject.set(x, "softwareVersion", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: Double): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setSupportUrl(value: Uri): Self = StObject.set(x, "supportUrl", value.asInstanceOf[js.Any])
    
    inline def setSupportedLanguages(value: IVectorView[Language]): Self = StObject.set(x, "supportedLanguages", value.asInstanceOf[js.Any])
  }
}
