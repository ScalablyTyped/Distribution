package typings.wegameApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonTotalBytesExpectedToSend extends js.Object {
  var progress: Double
  var totalBytesExpectedToSend: Double
  var totalBytesSent: Double
}

object AnonTotalBytesExpectedToSend {
  @scala.inline
  def apply(progress: Double, totalBytesExpectedToSend: Double, totalBytesSent: Double): AnonTotalBytesExpectedToSend = {
    val __obj = js.Dynamic.literal(progress = progress.asInstanceOf[js.Any], totalBytesExpectedToSend = totalBytesExpectedToSend.asInstanceOf[js.Any], totalBytesSent = totalBytesSent.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonTotalBytesExpectedToSend]
  }
}

