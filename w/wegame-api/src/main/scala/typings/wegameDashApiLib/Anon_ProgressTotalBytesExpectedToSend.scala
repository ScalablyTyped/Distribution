package typings
package wegameDashApiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ProgressTotalBytesExpectedToSend extends js.Object {
  var progress: scala.Double
  var totalBytesExpectedToSend: scala.Double
  var totalBytesSent: scala.Double
}

object Anon_ProgressTotalBytesExpectedToSend {
  @scala.inline
  def apply(progress: scala.Double, totalBytesExpectedToSend: scala.Double, totalBytesSent: scala.Double): Anon_ProgressTotalBytesExpectedToSend = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("progress")(progress)
    __obj.updateDynamic("totalBytesExpectedToSend")(totalBytesExpectedToSend)
    __obj.updateDynamic("totalBytesSent")(totalBytesSent)
    __obj.asInstanceOf[Anon_ProgressTotalBytesExpectedToSend]
  }
}

