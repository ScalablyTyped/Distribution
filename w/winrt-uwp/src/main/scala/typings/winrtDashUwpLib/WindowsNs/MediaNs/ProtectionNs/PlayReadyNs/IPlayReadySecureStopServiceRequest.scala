package typings
package winrtDashUwpLib.WindowsNs.MediaNs.ProtectionNs.PlayReadyNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Manages secure stop messages. */
trait IPlayReadySecureStopServiceRequest extends IPlayReadyServiceRequest {
  /** Gets the current publisher certificate property. */
  var publisherCertificate: scala.Double
  /** Gets the secure stop session identifier property. */
  var sessionID: java.lang.String
  /** Gets the secure stop session's start time property. */
  var startTime: stdLib.Date
  /** Gets the secure stop session's stopped flag property which indicates whether the secure stop session for this request was cleanly shut down. */
  var stopped: scala.Boolean
  /** Gets the secure stop session's update/stop time property. */
  var updateTime: stdLib.Date
}

