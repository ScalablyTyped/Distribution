package typings
package titaniumLib.TitaniumNs.AndroidNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
		 * Android application component that executes in the background.
		 */
trait Service
  extends titaniumLib.TitaniumNs.Proxy {
  /**
  			 * The intent used to start or bind to the Service.
  			 */
  val intent: Intent
  /**
  			 * A service can be started more than once -- this number (based on an incrementing integer)
  			 * indicates which "start number" in the sequence the current service instance is.
  			 */
  val serviceInstanceId: scala.Double
  /**
  			 * Puts the service into the "background" state and removes its foreground notification.
  			 */
  def foregroundCancel(): scala.Unit
  /**
  			 * Puts the service into the "foreground" state and displays a notification.
  			 */
  def foregroundNotify(id: scala.Double, notification: Notification): scala.Unit
  /**
  			 * Gets the value of the <Titanium.Android.Service.intent> property.
  			 */
  def getIntent(): Intent
  /**
  			 * Gets the value of the <Titanium.Android.Service.serviceInstanceId> property.
  			 */
  def getServiceInstanceId(): scala.Double
  /**
  			 * Starts the Service.
  			 */
  def start(): scala.Unit
  /**
  			 * Stops this running instance of the Service.
  			 */
  def stop(): scala.Unit
}

