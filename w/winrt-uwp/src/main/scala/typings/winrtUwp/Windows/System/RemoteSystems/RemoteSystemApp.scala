package typings.winrtUwp.Windows.System.RemoteSystems

import typings.winrtUwp.Windows.Foundation.Collections.IMapView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents an application on a remote system. */
trait RemoteSystemApp extends js.Object {
  /** The app-specific attributes of this application. */
  var Attributes: IMapView[String, String]
  /** The display-friendly name for this application. This is the name used by the device for Bluetooth identification. If this hasn't been set or the device doesn't support Bluetooth, this field will be empty. */
  var displayName: String
  /** The unique identifier for this application. */
  var id: String
  /** Indicates whether this application is currently available for proximal connection. */
  var isAvailableByProximity: Boolean
  /** Indicates whether this application is currently available for spatial sharing connection. */
  var isAvailableBySpatialProximity: Boolean
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
}

