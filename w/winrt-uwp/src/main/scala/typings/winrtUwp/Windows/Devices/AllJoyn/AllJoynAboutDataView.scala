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
@js.native
trait AllJoynAboutDataView extends js.Object {
  /** The version number for the implemented AllJoyn platform software. */
  var ajSoftwareVersion: String = js.native
  /** A globally unique identifier associated with the app. */
  var appId: String = js.native
  /** The name of the app. */
  var appName: String = js.native
  /** The date of manufacture. */
  var dateOfManufacture: Date = js.native
  /** The default language of the app. */
  var defaultLanguage: Language = js.native
  /** An app description provided by the manufacturer. */
  var description: String = js.native
  /** The device ID used during advertising. */
  var deviceId: String = js.native
  /** Name of the device. */
  var deviceName: String = js.native
  /** The current version of the hardware that the app is running on. This field is optional, presenting as an empty string if not set. */
  var hardwareVersion: String = js.native
  /** The name of the manufacturer. */
  var manufacturer: String = js.native
  /** The model number of the device running the app. */
  var modelNumber: String = js.native
  /** This is a set of fields, where each other named AllJoynAboutDataView property is also accessible. For example, ModelNumber is Properties ["ModelNumber"]. Additionally, this property can be used to get custom properties. */
  var properties: IMapView[String, _] = js.native
  /** The version number of the app. */
  var softwareVersion: String = js.native
  /** The status returned by the GetDataBySessionPortAsync operation that created the AllJoynAboutDataView object. */
  var status: Double = js.native
  /** A URL to the manufacturer or developer support portal. */
  var supportUrl: Uri = js.native
  /** A list of languages supported by the app and will always include the DefaultLanguage . */
  var supportedLanguages: IVectorView[Language] = js.native
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
  @scala.inline
  implicit class AllJoynAboutDataViewOps[Self <: AllJoynAboutDataView] (val x: Self) extends AnyVal {
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
    def setAjSoftwareVersion(value: String): Self = this.set("ajSoftwareVersion", value.asInstanceOf[js.Any])
    @scala.inline
    def setAppId(value: String): Self = this.set("appId", value.asInstanceOf[js.Any])
    @scala.inline
    def setAppName(value: String): Self = this.set("appName", value.asInstanceOf[js.Any])
    @scala.inline
    def setDateOfManufacture(value: Date): Self = this.set("dateOfManufacture", value.asInstanceOf[js.Any])
    @scala.inline
    def setDefaultLanguage(value: Language): Self = this.set("defaultLanguage", value.asInstanceOf[js.Any])
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def setDeviceId(value: String): Self = this.set("deviceId", value.asInstanceOf[js.Any])
    @scala.inline
    def setDeviceName(value: String): Self = this.set("deviceName", value.asInstanceOf[js.Any])
    @scala.inline
    def setHardwareVersion(value: String): Self = this.set("hardwareVersion", value.asInstanceOf[js.Any])
    @scala.inline
    def setManufacturer(value: String): Self = this.set("manufacturer", value.asInstanceOf[js.Any])
    @scala.inline
    def setModelNumber(value: String): Self = this.set("modelNumber", value.asInstanceOf[js.Any])
    @scala.inline
    def setProperties(value: IMapView[String, _]): Self = this.set("properties", value.asInstanceOf[js.Any])
    @scala.inline
    def setSoftwareVersion(value: String): Self = this.set("softwareVersion", value.asInstanceOf[js.Any])
    @scala.inline
    def setStatus(value: Double): Self = this.set("status", value.asInstanceOf[js.Any])
    @scala.inline
    def setSupportUrl(value: Uri): Self = this.set("supportUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def setSupportedLanguages(value: IVectorView[Language]): Self = this.set("supportedLanguages", value.asInstanceOf[js.Any])
  }
  
}

