package typings.victory.victoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VictoryStyleInterface extends js.Object {
  var data: js.UndefOr[VictoryStyleObject] = js.undefined
  var labels: js.UndefOr[VictoryStyleObject] = js.undefined
  var parent: js.UndefOr[VictoryStyleObject] = js.undefined
}

object VictoryStyleInterface {
  @scala.inline
  def apply(
    data: VictoryStyleObject = null,
    labels: VictoryStyleObject = null,
    parent: VictoryStyleObject = null
  ): VictoryStyleInterface = {
    val __obj = js.Dynamic.literal()
    if (data != null) __obj.updateDynamic("data")(data)
    if (labels != null) __obj.updateDynamic("labels")(labels)
    if (parent != null) __obj.updateDynamic("parent")(parent)
    __obj.asInstanceOf[VictoryStyleInterface]
  }
}

