package typings
package titaniumLib.TitaniumNs.MediaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
		 * An object for playing system sounds.
		 */

trait SystemAlert
  extends titaniumLib.TitaniumNs.Proxy {
  /**
  			 * URL identifying the audio resource.
  			 */
  var url: java.lang.String
  /**
  			 * Gets the value of the <Titanium.Media.SystemAlert.url> property.
  			 */
  def getUrl(): java.lang.String
  /**
  			 * Start playing the system alert.
  			 */
  def play(): scala.Unit
  /**
  			 * Sets the value of the <Titanium.Media.SystemAlert.url> property.
  			 */
  def setUrl(url: java.lang.String): scala.Unit
}

