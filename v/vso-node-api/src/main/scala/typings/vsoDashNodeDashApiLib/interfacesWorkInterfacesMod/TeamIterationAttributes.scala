package typings
package vsoDashNodeDashApiLib.interfacesWorkInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TeamIterationAttributes extends js.Object {
  var finishDate: stdLib.Date
  var startDate: stdLib.Date
  var timeFrame: TimeFrame
}

object TeamIterationAttributes {
  @scala.inline
  def apply(finishDate: stdLib.Date, startDate: stdLib.Date, timeFrame: TimeFrame): TeamIterationAttributes = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("finishDate")(finishDate)
    __obj.updateDynamic("startDate")(startDate)
    __obj.updateDynamic("timeFrame")(timeFrame)
    __obj.asInstanceOf[TeamIterationAttributes]
  }
}

