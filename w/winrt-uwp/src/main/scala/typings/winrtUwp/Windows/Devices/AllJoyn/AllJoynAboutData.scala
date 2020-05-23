package typings.winrtUwp.Windows.Devices.AllJoyn

import typings.std.Date
import typings.winrtUwp.Windows.Foundation.Collections.IMap
import typings.winrtUwp.Windows.Foundation.Uri
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Used to set descriptive information about the app and the device it is running on. */
trait AllJoynAboutData extends js.Object {
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
  @scala.inline
  def apply(
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
}

