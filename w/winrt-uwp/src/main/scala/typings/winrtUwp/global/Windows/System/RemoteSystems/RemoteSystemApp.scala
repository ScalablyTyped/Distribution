package typings.winrtUwp.global.Windows.System.RemoteSystems

import typings.winrtUwp.Windows.Foundation.Collections.IMapView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents an application on a remote system. */
@JSGlobal("Windows.System.RemoteSystems.RemoteSystemApp")
@js.native
abstract class RemoteSystemApp ()
  extends typings.winrtUwp.Windows.System.RemoteSystems.RemoteSystemApp {
  /** The app-specific attributes of this application. */
  /* CompleteClass */
  override var Attributes: IMapView[String, String] = js.native
  /** The display-friendly name for this application. This is the name used by the device for Bluetooth identification. If this hasn't been set or the device doesn't support Bluetooth, this field will be empty. */
  /* CompleteClass */
  override var displayName: String = js.native
  /** The unique identifier for this application. */
  /* CompleteClass */
  override var id: String = js.native
  /** Indicates whether this application is currently available for proximal connection. */
  /* CompleteClass */
  override var isAvailableByProximity: Boolean = js.native
  /** Indicates whether this application is currently available for spatial sharing connection. */
  /* CompleteClass */
  override var isAvailableBySpatialProximity: Boolean = js.native
}

