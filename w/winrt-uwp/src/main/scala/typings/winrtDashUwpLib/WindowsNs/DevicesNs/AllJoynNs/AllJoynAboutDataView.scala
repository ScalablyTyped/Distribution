package typings
package winrtDashUwpLib.WindowsNs.DevicesNs.AllJoynNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Used to view data about another app and the device it is running on. */
@JSGlobal("Windows.Devices.AllJoyn.AllJoynAboutDataView")
@js.native
abstract class AllJoynAboutDataView () extends js.Object {
  /** The version number for the implemented AllJoyn platform software. */
  var ajSoftwareVersion: java.lang.String = js.native
  /** A globally unique identifier associated with the app. */
  var appId: java.lang.String = js.native
  /** The name of the app. */
  var appName: java.lang.String = js.native
  /** The date of manufacture. */
  var dateOfManufacture: stdLib.Date = js.native
  /** The default language of the app. */
  var defaultLanguage: winrtDashUwpLib.WindowsNs.GlobalizationNs.Language = js.native
  /** An app description provided by the manufacturer. */
  var description: java.lang.String = js.native
  /** The device ID used during advertising. */
  var deviceId: java.lang.String = js.native
  /** Name of the device. */
  var deviceName: java.lang.String = js.native
  /** The current version of the hardware that the app is running on. This field is optional, presenting as an empty string if not set. */
  var hardwareVersion: java.lang.String = js.native
  /** The name of the manufacturer. */
  var manufacturer: java.lang.String = js.native
  /** The model number of the device running the app. */
  var modelNumber: java.lang.String = js.native
  /** This is a set of fields, where each other named AllJoynAboutDataView property is also accessible. For example, ModelNumber is Properties ["ModelNumber"]. Additionally, this property can be used to get custom properties. */
  var properties: winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IMapView[java.lang.String, _] = js.native
  /** The version number of the app. */
  var softwareVersion: java.lang.String = js.native
  /** The status returned by the GetDataBySessionPortAsync operation that created the AllJoynAboutDataView object. */
  var status: scala.Double = js.native
  /** A URL to the manufacturer or developer support portal. */
  var supportUrl: winrtDashUwpLib.WindowsNs.FoundationNs.Uri = js.native
  /** A list of languages supported by the app and will always include the DefaultLanguage . */
  var supportedLanguages: winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IVectorView[winrtDashUwpLib.WindowsNs.GlobalizationNs.Language] = js.native
}

/* static members */
@JSGlobal("Windows.Devices.AllJoyn.AllJoynAboutDataView")
@js.native
object AllJoynAboutDataView extends js.Object {
  /**
    * Gets the About data for a session.
    * @param uniqueName The unique name.
    * @param busAttachment The bus attachment supporting the session.
    * @param sessionPort The port used to connect to the session.
    * @return An object containing About data for the session.
    */
  def getDataBySessionPortAsync(
    uniqueName: java.lang.String,
    busAttachment: winrtDashUwpLib.WindowsNs.DevicesNs.AllJoynNs.AllJoynBusAttachment,
    sessionPort: scala.Double
  ): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation[winrtDashUwpLib.WindowsNs.DevicesNs.AllJoynNs.AllJoynAboutDataView] = js.native
  /**
    * Gets the About data for a session in a particular language.
    * @param uniqueName The unique name.
    * @param busAttachment The bus attachment supporting the session.
    * @param sessionPort The port used to connect to the session.
    * @param language The language to return the descriptive data in.
    * @return An object containing About data for the session in the set language.
    */
  def getDataBySessionPortAsync(
    uniqueName: java.lang.String,
    busAttachment: winrtDashUwpLib.WindowsNs.DevicesNs.AllJoynNs.AllJoynBusAttachment,
    sessionPort: scala.Double,
    language: winrtDashUwpLib.WindowsNs.GlobalizationNs.Language
  ): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation[winrtDashUwpLib.WindowsNs.DevicesNs.AllJoynNs.AllJoynAboutDataView] = js.native
}

