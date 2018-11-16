package typings
package winrtDashUwpLib.WindowsNs.WebNs.HttpNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Contains status information on the progress of an HttpClient operation. */

trait HttpProgress extends js.Object {
  /** The total number of bytes received. */
  var bytesReceived: scala.Double
  /** The total number of bytes sent. */
  var bytesSent: scala.Double
  /** The number of retries. */
  var retries: scala.Double
  /** The step in the progress of an HTTP connection. */
  var stage: HttpProgressStage
  /** The total number of data bytes to receive. */
  var totalBytesToReceive: scala.Double
  /** The total number of data bytes to send. */
  var totalBytesToSend: scala.Double
}

