package typings.titanium.Titanium.App.iOS

import typings.titanium.Titanium.Proxy
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A service that runs when the application is placed in the background.
  */
@js.native
trait BackgroundService extends Proxy {
  /**
    * A local URL to a JavaScript file containing the code to run in the background.
    */
  var url: String = js.native
  /**
    * Gets the value of the <Titanium.App.iOS.BackgroundService.url> property.
    * @deprecated Access <Titanium.App.iOS.BackgroundService.url> instead.
    */
  def getUrl(): String = js.native
  /**
    * Sets the value of the <Titanium.App.iOS.BackgroundService.url> property.
    * @deprecated Set the value using <Titanium.App.iOS.BackgroundService.url> instead.
    */
  def setUrl(url: String): Unit = js.native
  /**
    * Stops the service from running during the current background session to conserve resources.
    */
  def stop(): Unit = js.native
  /**
    * Unregisters the background service.
    */
  def unregister(): Unit = js.native
}

