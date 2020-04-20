package typings.titanium.Titanium.Media

import typings.titanium.Titanium.Proxy
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
		 * An object for playing system sounds.
		 * @deprecated This iOS-only API has been deprecated and moved to the [Ti.SystemAlert](https://github.com/appcelerator-modules/ti.systemalert) module in 8.0.0.
		 */
@JSGlobal("Titanium.Media.SystemAlert")
@js.native
class SystemAlert () extends Proxy {
  /**
  			 * URL identifying the audio resource.
  			 */
  var url: String = js.native
  /**
  			 * Gets the value of the <Titanium.Media.SystemAlert.url> property.
  			 * @deprecated Access <Titanium.Media.SystemAlert.url> instead.
  			 */
  def getUrl(): String = js.native
  /**
  			 * Start playing the system alert.
  			 */
  def play(): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.Media.SystemAlert.url> property.
  			 * @deprecated Set the value using <Titanium.Media.SystemAlert.url> instead.
  			 */
  def setUrl(url: String): Unit = js.native
}

