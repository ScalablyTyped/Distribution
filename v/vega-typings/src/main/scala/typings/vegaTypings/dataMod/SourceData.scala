package typings.vegaTypings.dataMod

import typings.vegaTypings.onTriggerMod.OnTrigger
import typings.vegaTypings.transformMod.Transforms
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined {  source  :string | std.Array<string>} & vega-typings.vega-typings/types/spec/data.BaseData */
trait SourceData extends Data {
  var name: String
  var on: js.UndefOr[js.Array[OnTrigger]] = js.undefined
  var source: String | js.Array[String]
  var transform: js.UndefOr[js.Array[Transforms]] = js.undefined
}

object SourceData {
  @scala.inline
  def apply(
    name: String,
    source: String | js.Array[String],
    on: js.Array[OnTrigger] = null,
    transform: js.Array[Transforms] = null
  ): SourceData = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    if (on != null) __obj.updateDynamic("on")(on.asInstanceOf[js.Any])
    if (transform != null) __obj.updateDynamic("transform")(transform.asInstanceOf[js.Any])
    __obj.asInstanceOf[SourceData]
  }
}

