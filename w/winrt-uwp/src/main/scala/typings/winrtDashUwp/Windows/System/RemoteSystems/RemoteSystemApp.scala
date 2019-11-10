package typings.winrtDashUwp.Windows.System.RemoteSystems

import typings.winrtDashUwp.Windows.Foundation.Collections.IMapView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents an application on a remote system. */
@JSGlobal("Windows.System.RemoteSystems.RemoteSystemApp")
@js.native
abstract class RemoteSystemApp () extends js.Object {
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

