package typings.vegaTypings.dataMod

import typings.vegaTypings.onTriggerMod.OnTrigger
import typings.vegaTypings.transformMod.Transforms
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BaseData extends Data {
  var name: String
  var on: js.UndefOr[js.Array[OnTrigger]] = js.undefined
  var transform: js.UndefOr[js.Array[Transforms]] = js.undefined
}

object BaseData {
  @scala.inline
  def apply(name: String, on: js.Array[OnTrigger] = null, transform: js.Array[Transforms] = null): BaseData = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    if (on != null) __obj.updateDynamic("on")(on.asInstanceOf[js.Any])
    if (transform != null) __obj.updateDynamic("transform")(transform.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseData]
  }
}

