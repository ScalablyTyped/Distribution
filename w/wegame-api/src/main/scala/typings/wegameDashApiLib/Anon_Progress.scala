package typings
package wegameDashApiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Progress extends js.Object {
  var progress: scala.Double
  var totalBytesExpectedToWrite: scala.Double
  var totalBytesWritten: scala.Double
}

object Anon_Progress {
  @scala.inline
  def apply(progress: scala.Double, totalBytesExpectedToWrite: scala.Double, totalBytesWritten: scala.Double): Anon_Progress = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("progress")(progress)
    __obj.updateDynamic("totalBytesExpectedToWrite")(totalBytesExpectedToWrite)
    __obj.updateDynamic("totalBytesWritten")(totalBytesWritten)
    __obj.asInstanceOf[Anon_Progress]
  }
}

