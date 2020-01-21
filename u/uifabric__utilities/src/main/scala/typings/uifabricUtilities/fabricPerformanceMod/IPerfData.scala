package typings.uifabricUtilities.fabricPerformanceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPerfData extends js.Object {
  var duration: Double
  var timeStamp: Double
}

object IPerfData {
  @scala.inline
  def apply(duration: Double, timeStamp: Double): IPerfData = {
    val __obj = js.Dynamic.literal(duration = duration.asInstanceOf[js.Any], timeStamp = timeStamp.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IPerfData]
  }
}

