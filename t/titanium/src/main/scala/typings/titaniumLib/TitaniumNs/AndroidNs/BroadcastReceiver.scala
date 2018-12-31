package typings
package titaniumLib.TitaniumNs.AndroidNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
		 * Monitor and handle Android system broadcasts.
		 */
trait BroadcastReceiver
  extends titaniumLib.TitaniumNs.Proxy {
  /**
  			 * URL of the JavaScript file to handle the broadcast.
  			 */
  var url: java.lang.String
  /**
  			 * Gets the value of the <Titanium.Android.BroadcastReceiver.onReceived> property.
  			 */
  def getOnReceived(): js.Function1[/* param0 */ js.Any, _]
  /**
  			 * Gets the value of the <Titanium.Android.BroadcastReceiver.url> property.
  			 */
  def getUrl(): java.lang.String
  /**
  			 * The function called when a broadcast is received.
  			 */
  def onReceived(param0: js.Any): js.Any
  /**
  			 * Sets the value of the <Titanium.Android.BroadcastReceiver.onReceived> property.
  			 */
  def setOnReceived(onReceived: js.Function1[/* param0 */ js.Any, _]): scala.Unit
  /**
  			 * Sets the value of the <Titanium.Android.BroadcastReceiver.url> property.
  			 */
  def setUrl(url: java.lang.String): scala.Unit
}

