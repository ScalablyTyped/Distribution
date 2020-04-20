package typings.vsoNodeApi.workInterfacesMod

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
    val __obj = js.Dynamic.literal(finishDate = finishDate.asInstanceOf[js.Any], startDate = startDate.asInstanceOf[js.Any], timeFrame = timeFrame.asInstanceOf[js.Any])
    __obj.asInstanceOf[TeamIterationAttributes]
  }
}

