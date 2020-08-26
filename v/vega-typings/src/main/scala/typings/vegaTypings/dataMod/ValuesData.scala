package typings.vegaTypings.dataMod

import typings.vegaTypings.onTriggerMod.OnTrigger
import typings.vegaTypings.signalMod.SignalRef
import typings.vegaTypings.transformMod.Transforms
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined {  values :std.Array<vega-typings.vega-typings/types/spec/data.Datum> | object,   format :vega-typings.vega-typings/types/spec/data.Format | vega-typings.vega-typings/types/spec.SignalRef | undefined,   async :boolean | vega-typings.vega-typings/types/spec.SignalRef | undefined} & vega-typings.vega-typings/types/spec/data.BaseData */
@js.native
trait ValuesData extends Data {
  var async: js.UndefOr[Boolean | SignalRef] = js.native
  var format: js.UndefOr[Format | SignalRef] = js.native
  var name: String = js.native
  var on: js.UndefOr[js.Array[OnTrigger]] = js.native
  var transform: js.UndefOr[js.Array[Transforms]] = js.native
  var values: js.Array[Datum] | js.Object = js.native
}

object ValuesData {
  @scala.inline
  def apply(name: String, values: js.Array[Datum] | js.Object): ValuesData = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValuesData]
  }
  @scala.inline
  implicit class ValuesDataOps[Self <: ValuesData] (val x: Self) extends AnyVal {
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
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setValuesVarargs(value: Datum*): Self = this.set("values", js.Array(value :_*))
    @scala.inline
    def setValues(value: js.Array[Datum] | js.Object): Self = this.set("values", value.asInstanceOf[js.Any])
    @scala.inline
    def setAsync(value: Boolean | SignalRef): Self = this.set("async", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAsync: Self = this.set("async", js.undefined)
    @scala.inline
    def setFormat(value: Format | SignalRef): Self = this.set("format", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFormat: Self = this.set("format", js.undefined)
    @scala.inline
    def setOnVarargs(value: OnTrigger*): Self = this.set("on", js.Array(value :_*))
    @scala.inline
    def setOn(value: js.Array[OnTrigger]): Self = this.set("on", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOn: Self = this.set("on", js.undefined)
    @scala.inline
    def setTransformVarargs(value: Transforms*): Self = this.set("transform", js.Array(value :_*))
    @scala.inline
    def setTransform(value: js.Array[Transforms]): Self = this.set("transform", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTransform: Self = this.set("transform", js.undefined)
  }
  
}

