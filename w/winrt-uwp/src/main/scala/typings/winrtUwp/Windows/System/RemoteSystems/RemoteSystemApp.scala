package typings.winrtUwp.Windows.System.RemoteSystems

import typings.winrtUwp.Windows.Foundation.Collections.IMapView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents an application on a remote system. */
@js.native
trait RemoteSystemApp extends js.Object {
  /** The app-specific attributes of this application. */
  var Attributes: IMapView[String, String] = js.native
  /** The display-friendly name for this application. This is the name used by the device for Bluetooth identification. If this hasn't been set or the device doesn't support Bluetooth, this field will be empty. */
  var displayName: String = js.native
  /** The unique identifier for this application. */
  var id: String = js.native
  /** Indicates whether this application is currently available for proximal connection. */
  var isAvailableByProximity: Boolean = js.native
  /** Indicates whether this application is currently available for spatial sharing connection. */
  var isAvailableBySpatialProximity: Boolean = js.native
}

object RemoteSystemApp {
  @scala.inline
  def apply(
    Attributes: IMapView[String, String],
    displayName: String,
    id: String,
    isAvailableByProximity: Boolean,
    isAvailableBySpatialProximity: Boolean
  ): RemoteSystemApp = {
    val __obj = js.Dynamic.literal(Attributes = Attributes.asInstanceOf[js.Any], displayName = displayName.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], isAvailableByProximity = isAvailableByProximity.asInstanceOf[js.Any], isAvailableBySpatialProximity = isAvailableBySpatialProximity.asInstanceOf[js.Any])
    __obj.asInstanceOf[RemoteSystemApp]
  }
  @scala.inline
  implicit class RemoteSystemAppOps[Self <: RemoteSystemApp] (val x: Self) extends AnyVal {
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
    def setAttributes(value: IMapView[String, String]): Self = this.set("Attributes", value.asInstanceOf[js.Any])
    @scala.inline
    def setDisplayName(value: String): Self = this.set("displayName", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsAvailableByProximity(value: Boolean): Self = this.set("isAvailableByProximity", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsAvailableBySpatialProximity(value: Boolean): Self = this.set("isAvailableBySpatialProximity", value.asInstanceOf[js.Any])
  }
  
}

