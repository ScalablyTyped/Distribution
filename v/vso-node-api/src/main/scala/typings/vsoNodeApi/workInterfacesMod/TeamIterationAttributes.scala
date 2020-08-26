package typings.vsoNodeApi.workInterfacesMod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TeamIterationAttributes extends js.Object {
  var finishDate: Date = js.native
  var startDate: Date = js.native
  var timeFrame: TimeFrame = js.native
}

object TeamIterationAttributes {
  @scala.inline
  def apply(finishDate: Date, startDate: Date, timeFrame: TimeFrame): TeamIterationAttributes = {
    val __obj = js.Dynamic.literal(finishDate = finishDate.asInstanceOf[js.Any], startDate = startDate.asInstanceOf[js.Any], timeFrame = timeFrame.asInstanceOf[js.Any])
    __obj.asInstanceOf[TeamIterationAttributes]
  }
  @scala.inline
  implicit class TeamIterationAttributesOps[Self <: TeamIterationAttributes] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setFinishDate(value: Date): Self = this.set("finishDate", value.asInstanceOf[js.Any])
    @scala.inline
    def setStartDate(value: Date): Self = this.set("startDate", value.asInstanceOf[js.Any])
    @scala.inline
    def setTimeFrame(value: TimeFrame): Self = this.set("timeFrame", value.asInstanceOf[js.Any])
  }
  
}

