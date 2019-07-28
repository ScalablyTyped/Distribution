package typings.vsoDashNodeDashApi.interfacesWorkInterfacesMod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TeamIterationAttributes extends js.Object {
  var finishDate: Date
  var startDate: Date
  var timeFrame: TimeFrame
}

object TeamIterationAttributes {
  @scala.inline
  def apply(finishDate: Date, startDate: Date, timeFrame: TimeFrame): TeamIterationAttributes = {
    val __obj = js.Dynamic.literal(finishDate = finishDate, startDate = startDate, timeFrame = timeFrame)
  
    __obj.asInstanceOf[TeamIterationAttributes]
  }
}

