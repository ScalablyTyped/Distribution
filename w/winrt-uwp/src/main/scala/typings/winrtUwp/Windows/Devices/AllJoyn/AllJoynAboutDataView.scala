package typings.winrtUwp.Windows.Devices.AllJoyn

import typings.std.Date
import typings.winrtUwp.Windows.Foundation.Collections.IMapView
import typings.winrtUwp.Windows.Foundation.Collections.IVectorView
import typings.winrtUwp.Windows.Foundation.Uri
import typings.winrtUwp.Windows.Globalization.Language
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Used to view data about another app and the device it is running on. */
trait AllJoynAboutDataView extends js.Object {
  /** The version number for the implemented AllJoyn platform software. */
  var ajSoftwareVersion: String
  /** A globally unique identifier associated with the app. */
  var appId: String
  /** The name of the app. */
  var appName: String
  /** The date of manufacture. */
  var dateOfManufacture: Date
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
  var properties: IMapView[String, _]
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
  @scala.inline
  def apply(
    ajSoftwareVersion: String,
    appId: String,
    appName: String,
    dateOfManufacture: Date,
    defaultLanguage: Language,
    description: String,
    deviceId: String,
    deviceName: String,
    hardwareVersion: String,
    manufacturer: String,
    modelNumber: String,
    properties: IMapView[String, _],
    softwareVersion: String,
    status: Double,
    supportUrl: Uri,
    supportedLanguages: IVectorView[Language]
  ): AllJoynAboutDataView = {
    val __obj = js.Dynamic.literal(ajSoftwareVersion = ajSoftwareVersion.asInstanceOf[js.Any], appId = appId.asInstanceOf[js.Any], appName = appName.asInstanceOf[js.Any], dateOfManufacture = dateOfManufacture.asInstanceOf[js.Any], defaultLanguage = defaultLanguage.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], deviceId = deviceId.asInstanceOf[js.Any], deviceName = deviceName.asInstanceOf[js.Any], hardwareVersion = hardwareVersion.asInstanceOf[js.Any], manufacturer = manufacturer.asInstanceOf[js.Any], modelNumber = modelNumber.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any], softwareVersion = softwareVersion.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], supportUrl = supportUrl.asInstanceOf[js.Any], supportedLanguages = supportedLanguages.asInstanceOf[js.Any])
    __obj.asInstanceOf[AllJoynAboutDataView]
  }
}

