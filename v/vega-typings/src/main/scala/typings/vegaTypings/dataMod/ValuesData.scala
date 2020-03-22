package typings.vegaTypings.dataMod

import typings.vegaTypings.onTriggerMod.OnTrigger
import typings.vegaTypings.signalMod.SignalRef
import typings.vegaTypings.transformMod.Transforms
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined {  values  :std.Array<vega-typings.vega-typings/types/spec/data.Datum> | object,   format ? :vega-typings.vega-typings/types/spec/data.Format | vega-typings.vega-typings/types/spec.SignalRef,   async ? :boolean | vega-typings.vega-typings/types/spec.SignalRef} & vega-typings.vega-typings/types/spec/data.BaseData */
trait ValuesData extends Data {
  var async: js.UndefOr[Boolean | SignalRef] = js.undefined
  var format: js.UndefOr[Format | SignalRef] = js.undefined
  var name: String
  var on: js.UndefOr[js.Array[OnTrigger]] = js.undefined
  var transform: js.UndefOr[js.Array[Transforms]] = js.undefined
  var values: js.Array[Datum] | js.Object
}

object ValuesData {
  @scala.inline
  def apply(
    name: String,
    values: js.Array[Datum] | js.Object,
    async: Boolean | SignalRef = null,
    format: Format | SignalRef = null,
    on: js.Array[OnTrigger] = null,
    transform: js.Array[Transforms] = null
  ): ValuesData = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
    if (async != null) __obj.updateDynamic("async")(async.asInstanceOf[js.Any])
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    if (on != null) __obj.updateDynamic("on")(on.asInstanceOf[js.Any])
    if (transform != null) __obj.updateDynamic("transform")(transform.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValuesData]
  }
}

