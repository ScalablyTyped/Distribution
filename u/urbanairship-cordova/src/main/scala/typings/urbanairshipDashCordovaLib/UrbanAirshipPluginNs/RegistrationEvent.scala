package typings
package urbanairshipDashCordovaLib.UrbanAirshipPluginNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RegistrationEvent
  extends stdLib.Event {
  /**
           * The channel ID for the device.
           */
  var channelID: java.lang.String = js.native
  /**
           * (iOS Only)
           *
           * The push token for the device.
           */
  var deviceToken: java.lang.String = js.native
  var error: java.lang.String = js.native
}

