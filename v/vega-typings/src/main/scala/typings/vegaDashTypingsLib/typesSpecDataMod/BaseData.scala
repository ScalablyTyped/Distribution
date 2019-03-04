package typings
package vegaDashTypingsLib.typesSpecDataMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BaseData extends js.Object {
  var format: js.UndefOr[Format | vegaDashTypingsLib.typesSpecSignalMod.SignalRef] = js.undefined
  var name: java.lang.String
  var on: js.UndefOr[js.Array[vegaDashTypingsLib.typesSpecOnDashTriggerMod.OnTrigger]] = js.undefined
  var transform: js.UndefOr[js.Array[vegaDashTypingsLib.typesSpecTransformMod.Transforms]] = js.undefined
}

object BaseData {
  @scala.inline
  def apply(
    name: java.lang.String,
    format: Format | vegaDashTypingsLib.typesSpecSignalMod.SignalRef = null,
    on: js.Array[vegaDashTypingsLib.typesSpecOnDashTriggerMod.OnTrigger] = null,
    transform: js.Array[vegaDashTypingsLib.typesSpecTransformMod.Transforms] = null
  ): BaseData = {
    val __obj = js.Dynamic.literal(name = name)
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    if (on != null) __obj.updateDynamic("on")(on)
    if (transform != null) __obj.updateDynamic("transform")(transform)
    __obj.asInstanceOf[BaseData]
  }
}

