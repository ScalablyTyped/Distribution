package typings.wegameDashApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ProgressTotalBytesExpectedToSend extends js.Object {
  var progress: Double
  var totalBytesExpectedToSend: Double
  var totalBytesSent: Double
}

object Anon_ProgressTotalBytesExpectedToSend {
  @scala.inline
  def apply(progress: Double, totalBytesExpectedToSend: Double, totalBytesSent: Double): Anon_ProgressTotalBytesExpectedToSend = {
    val __obj = js.Dynamic.literal(progress = progress, totalBytesExpectedToSend = totalBytesExpectedToSend, totalBytesSent = totalBytesSent)
  
    __obj.asInstanceOf[Anon_ProgressTotalBytesExpectedToSend]
  }
}

