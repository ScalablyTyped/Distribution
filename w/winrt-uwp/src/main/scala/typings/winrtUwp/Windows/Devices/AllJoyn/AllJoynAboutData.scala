package typings.winrtUwp.Windows.Devices.AllJoyn

import typings.std.Date
import typings.winrtUwp.Windows.Foundation.Collections.IMap
import typings.winrtUwp.Windows.Foundation.Uri
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Used to set descriptive information about the app and the device it is running on. */
@JSGlobal("Windows.Devices.AllJoyn.AllJoynAboutData")
@js.native
abstract class AllJoynAboutData () extends js.Object {
  /** A globally unique identifier associated with the app. */
  var appId: String = js.native
  /** A collection of language-specific app names. */
  var appNames: IMap[String, String] = js.native
  /** The date of manufacture. */
  var dateOfManufacture: Date = js.native
  /** The default app name assigned by the manufacturer- either the developer or the OEM. This property is a shortcut to the entry in the AppNames property for the DefaultLanguage . */
  var defaultAppName: String = js.native
  /** The default description of the app. This property is a shortcut to the entry in the Descriptions property for the DefaultLanguage . */
  var defaultDescription: String = js.native
  /** The name of the manufacturer of the app. This property is a shortcut to the entry in the Manufacturers property for the DefaultLanguage . */
  var defaultManufacturer: String = js.native
  /** A collection of language-specific app description strings. */
  var descriptions: IMap[String, String] = js.native
  /** Indicates if the service should advertise the provided AllJoynAboutData values. */
  var isEnabled: Boolean = js.native
  /** A collection of language-specific manufacturer name strings. */
  var manufacturers: IMap[String, String] = js.native
  /** The model number of the device running the app. */
  var modelNumber: String = js.native
  /** The version number of the app. Use of this property applies to Producer apps. */
  var softwareVersion: String = js.native
  /** A URL to the manufacturer or developer support portal. */
  var supportUrl: Uri = js.native
}

