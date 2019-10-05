package typings.titanium.Titanium.Android

import typings.titanium.Titanium.Blob
import typings.titanium.Titanium.Filesystem.File
import typings.titanium.Titanium.Proxy
import typings.titanium.showParams
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
		 * Android service for creating custom quick settings tiles and handling user's interaction with them.
		 */
@js.native
trait QuickSettingsService extends Proxy {
  /**
  			 * The intent used to start or bind to the Service.
  			 */
  val intent: Intent = js.native
  /**
  			 * A service can be started more than once -- this number (based on an incrementing integer)
  			 * indicates which "start number" in the sequence the current service instance is.
  			 */
  val serviceInstanceId: Double = js.native
  /**
  			 * Puts the service into the "background" state and removes its foreground notification.
  			 */
  def foregroundCancel(): Unit = js.native
  /**
  			 * Puts the service into the "foreground" state and displays a notification.
  			 */
  def foregroundNotify(id: Double, notification: Notification): Unit = js.native
  /**
  			 * Returns the Tile's current icon.
  			 */
  def getIcon(): String | Blob | File = js.native
  /**
  			 * Gets the value of the <Titanium.Android.QuickSettingsService.intent> property.
  			 */
  def getIntent(): Intent = js.native
  /**
  			 * Returns the Tile's current label.
  			 */
  def getLabel(): String = js.native
  /**
  			 * Gets the value of the <Titanium.Android.QuickSettingsService.serviceInstanceId> property.
  			 */
  def getServiceInstanceId(): Double = js.native
  /**
  			 * Returns the Tile's current state.
  			 */
  def getState(): Double = js.native
  /**
  			 * Returns 'true' if the device is currently locked, 'false' otherwise.
  			 */
  def isLocked(): Boolean = js.native
  /**
  			 * Returns 'true' if the device is in secure state, 'false' otherwise.
  			 */
  def isSecure(): Boolean = js.native
  /**
  			 * Changes the Tile's icon.
  			 */
  def setIcon(icon: String): Unit = js.native
  /**
  			 * Changes the Tile's icon.
  			 */
  def setIcon(icon: Blob): Unit = js.native
  /**
  			 * Changes the Tile's icon.
  			 */
  def setIcon(icon: File): Unit = js.native
  /**
  			 * Changes the Tile's label.
  			 */
  def setLabel(label: String): Unit = js.native
  /**
  			 * Sets the state of the Tile.
  			 */
  def setState(state: Double): Unit = js.native
  /**
  			 * Opens an Alert dialog.
  			 */
  def showDialog(options: showParams): Unit = js.native
  /**
  			 * Starts the Service.
  			 */
  def start(): Unit = js.native
  /**
  			 * Colapses the quick settings menu and starts an activity for the passed Intent.
  			 */
  def startActivityAndCollapse(intent: Intent): Unit = js.native
  /**
  			 * Stops this running instance of the Service.
  			 */
  def stop(): Unit = js.native
  /**
  			 * Prompts the user to unlock the device and runs the JS code.
  			 */
  def unlockAndRun(jsCode: String): Unit = js.native
  /**
  			 * Applies current tile's properties.
  			 */
  def updateTile(): Unit = js.native
}

