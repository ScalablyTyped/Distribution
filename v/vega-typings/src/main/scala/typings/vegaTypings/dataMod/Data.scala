package typings.vegaTypings.dataMod

import typings.vegaTypings.onTriggerMod.OnTrigger
import typings.vegaTypings.signalMod.SignalRef
import typings.vegaTypings.transformMod.Transforms
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.vegaTypings.dataMod.SourceData
  - typings.vegaTypings.dataMod.ValuesData
  - typings.vegaTypings.dataMod.UrlData
  - typings.vegaTypings.dataMod.BaseData
*/
trait Data extends js.Object

object Data {
  @scala.inline
  def SourceData(
    name: String,
    source: String | js.Array[String],
    on: js.Array[OnTrigger] = null,
    transform: js.Array[Transforms] = null
  ): Data = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    if (on != null) __obj.updateDynamic("on")(on.asInstanceOf[js.Any])
    if (transform != null) __obj.updateDynamic("transform")(transform.asInstanceOf[js.Any])
    __obj.asInstanceOf[Data]
  }
  @scala.inline
  def ValuesData(
    name: String,
    values: js.Array[Datum] | js.Object,
    async: Boolean | SignalRef = null,
    format: Format | SignalRef = null,
    on: js.Array[OnTrigger] = null,
    transform: js.Array[Transforms] = null
  ): Data = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
    if (async != null) __obj.updateDynamic("async")(async.asInstanceOf[js.Any])
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    if (on != null) __obj.updateDynamic("on")(on.asInstanceOf[js.Any])
    if (transform != null) __obj.updateDynamic("transform")(transform.asInstanceOf[js.Any])
    __obj.asInstanceOf[Data]
  }
  @scala.inline
  def UrlData(
    name: String,
    url: String | SignalRef,
    async: Boolean | SignalRef = null,
    format: Format | SignalRef = null,
    on: js.Array[OnTrigger] = null,
    transform: js.Array[Transforms] = null
  ): Data = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    if (async != null) __obj.updateDynamic("async")(async.asInstanceOf[js.Any])
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    if (on != null) __obj.updateDynamic("on")(on.asInstanceOf[js.Any])
    if (transform != null) __obj.updateDynamic("transform")(transform.asInstanceOf[js.Any])
    __obj.asInstanceOf[Data]
  }
  @scala.inline
  def BaseData(name: String, on: js.Array[OnTrigger] = null, transform: js.Array[Transforms] = null): Data = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    if (on != null) __obj.updateDynamic("on")(on.asInstanceOf[js.Any])
    if (transform != null) __obj.updateDynamic("transform")(transform.asInstanceOf[js.Any])
    __obj.asInstanceOf[Data]
  }
}

