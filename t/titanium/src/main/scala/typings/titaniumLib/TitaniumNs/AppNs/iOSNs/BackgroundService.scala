package typings
package titaniumLib.TitaniumNs.AppNs.iOSNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
			 * A service that runs when the application is placed in the background.
			 */

trait BackgroundService
  extends titaniumLib.TitaniumNs.Proxy {
  /**
  				 * A local URL to a JavaScript file containing the code to run in the background.
  				 */
  var url: java.lang.String
  /**
  				 * Gets the value of the <Titanium.App.iOS.BackgroundService.url> property.
  				 */
  def getUrl(): java.lang.String
  /**
  				 * Sets the value of the <Titanium.App.iOS.BackgroundService.url> property.
  				 */
  def setUrl(url: java.lang.String): scala.Unit
  /**
  				 * Stops the service from running during the current background session to conserve resources.
  				 */
  def stop(): scala.Unit
  /**
  				 * Unregisters the background service.
  				 */
  def unregister(): scala.Unit
}

