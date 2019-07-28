package typings.vegaDashTypings.typesSpecDataMod

import typings.vegaDashTypings.typesSpecOnDashTriggerMod.OnTrigger
import typings.vegaDashTypings.typesSpecSignalMod.SignalRef
import typings.vegaDashTypings.typesSpecTransformMod.Transforms
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BaseData extends js.Object {
  var format: js.UndefOr[Format | SignalRef] = js.undefined
  var name: String
  var on: js.UndefOr[js.Array[OnTrigger]] = js.undefined
  var transform: js.UndefOr[js.Array[Transforms]] = js.undefined
}

object BaseData {
  @scala.inline
  def apply(
    name: String,
    format: Format | SignalRef = null,
    on: js.Array[OnTrigger] = null,
    transform: js.Array[Transforms] = null
  ): BaseData = {
    val __obj = js.Dynamic.literal(name = name)
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    if (on != null) __obj.updateDynamic("on")(on)
    if (transform != null) __obj.updateDynamic("transform")(transform)
    __obj.asInstanceOf[BaseData]
  }
}

