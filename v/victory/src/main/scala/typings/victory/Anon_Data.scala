package typings.victory

import typings.victory.victoryMod.VictoryStyleInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Data extends js.Object {
  var data: js.UndefOr[VictoryStyleInterface] = js.undefined
  var labels: js.UndefOr[VictoryStyleInterface] = js.undefined
}

object Anon_Data {
  @scala.inline
  def apply(data: VictoryStyleInterface = null, labels: VictoryStyleInterface = null): Anon_Data = {
    val __obj = js.Dynamic.literal()
    if (data != null) __obj.updateDynamic("data")(data)
    if (labels != null) __obj.updateDynamic("labels")(labels)
    __obj.asInstanceOf[Anon_Data]
  }
}

