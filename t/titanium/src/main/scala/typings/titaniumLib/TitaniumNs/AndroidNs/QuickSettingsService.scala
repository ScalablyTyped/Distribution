package typings
package titaniumLib.TitaniumNs.AndroidNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
		 * Android service for creating custom quick settings tiles and handling user's interaction with them.
		 */
@js.native
trait QuickSettingsService
  extends titaniumLib.TitaniumNs.Proxy {
  /**
  			 * The intent used to start or bind to the Service.
  			 */
  val intent: Intent = js.native
  /**
  			 * A service can be started more than once -- this number (based on an incrementing integer)
  			 * indicates which "start number" in the sequence the current service instance is.
  			 */
  val serviceInstanceId: scala.Double = js.native
  /**
  			 * Puts the service into the "background" state and removes its foreground notification.
  			 */
  def foregroundCancel(): scala.Unit = js.native
  /**
  			 * Puts the service into the "foreground" state and displays a notification.
  			 */
  def foregroundNotify(id: scala.Double, notification: Notification): scala.Unit = js.native
  /**
  			 * Returns the Tile's current icon.
  			 */
  def getIcon(): java.lang.String | titaniumLib.TitaniumNs.Blob | titaniumLib.TitaniumNs.FilesystemNs.File = js.native
  /**
  			 * Gets the value of the <Titanium.Android.QuickSettingsService.intent> property.
  			 */
  def getIntent(): Intent = js.native
  /**
  			 * Returns the Tile's current label.
  			 */
  def getLabel(): java.lang.String = js.native
  /**
  			 * Gets the value of the <Titanium.Android.QuickSettingsService.serviceInstanceId> property.
  			 */
  def getServiceInstanceId(): scala.Double = js.native
  /**
  			 * Returns the Tile's current state.
  			 */
  def getState(): scala.Double = js.native
  /**
  			 * Returns 'true' if the device is currently locked, 'false' otherwise.
  			 */
  def isLocked(): scala.Boolean = js.native
  /**
  			 * Returns 'true' if the device is in secure state, 'false' otherwise.
  			 */
  def isSecure(): scala.Boolean = js.native
  /**
  			 * Changes the Tile's icon.
  			 */
  def setIcon(icon: java.lang.String): scala.Unit = js.native
  /**
  			 * Changes the Tile's icon.
  			 */
  def setIcon(icon: titaniumLib.TitaniumNs.Blob): scala.Unit = js.native
  /**
  			 * Changes the Tile's icon.
  			 */
  def setIcon(icon: titaniumLib.TitaniumNs.FilesystemNs.File): scala.Unit = js.native
  /**
  			 * Changes the Tile's label.
  			 */
  def setLabel(label: java.lang.String): scala.Unit = js.native
  /**
  			 * Sets the state of the Tile.
  			 */
  def setState(state: scala.Double): scala.Unit = js.native
  /**
  			 * Opens an Alert dialog.
  			 */
  def showDialog(options: titaniumLib.showParams): scala.Unit = js.native
  /**
  			 * Starts the Service.
  			 */
  def start(): scala.Unit = js.native
  /**
  			 * Colapses the quick settings menu and starts an activity for the passed Intent.
  			 */
  def startActivityAndCollapse(intent: Intent): scala.Unit = js.native
  /**
  			 * Stops this running instance of the Service.
  			 */
  def stop(): scala.Unit = js.native
  /**
  			 * Prompts the user to unlock the device and runs the JS code.
  			 */
  def unlockAndRun(jsCode: java.lang.String): scala.Unit = js.native
  /**
  			 * Applies current tile's properties.
  			 */
  def updateTile(): scala.Unit = js.native
}

