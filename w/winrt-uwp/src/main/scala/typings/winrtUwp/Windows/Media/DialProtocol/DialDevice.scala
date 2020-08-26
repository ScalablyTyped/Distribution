package typings.winrtUwp.Windows.Media.DialProtocol

import typings.winrtUwp.Windows.Storage.Streams.IRandomAccessStreamReference
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents the remote device capable of running DIAL apps. */
@js.native
trait DialDevice extends js.Object {
  /** Gets the friendly name for the DIAL device. */
  var friendlyName: String = js.native
  /** Gets the remote device's ID. You can use this ID with the Windows.Devices.Enumeration APIs as well. */
  var id: String = js.native
  /** Gets a stream containing the thumbnail image for the DIAL device. */
  var thumbnail: IRandomAccessStreamReference = js.native
  /**
    * Creates a new DialApp object. This method does not establish a connection to the device or validate that the app exists. That is done when any function is called on the resulting DialApp object.
    * @param appName The name of the app. This becomes the AppName property of the new object.
    * @return The DialApp object for the app.
    */
  def getDialApp(appName: String): DialApp = js.native
}

object DialDevice {
  @scala.inline
  def apply(
    friendlyName: String,
    getDialApp: String => DialApp,
    id: String,
    thumbnail: IRandomAccessStreamReference
  ): DialDevice = {
    val __obj = js.Dynamic.literal(friendlyName = friendlyName.asInstanceOf[js.Any], getDialApp = js.Any.fromFunction1(getDialApp), id = id.asInstanceOf[js.Any], thumbnail = thumbnail.asInstanceOf[js.Any])
    __obj.asInstanceOf[DialDevice]
  }
  @scala.inline
  implicit class DialDeviceOps[Self <: DialDevice] (val x: Self) extends AnyVal {
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
    def setFriendlyName(value: String): Self = this.set("friendlyName", value.asInstanceOf[js.Any])
    @scala.inline
    def setGetDialApp(value: String => DialApp): Self = this.set("getDialApp", js.Any.fromFunction1(value))
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setThumbnail(value: IRandomAccessStreamReference): Self = this.set("thumbnail", value.asInstanceOf[js.Any])
  }
  
}

