package typings.vegaTypings.anon

import typings.vegaTypings.configMod.DefaultsConfig
import typings.vegaTypings.streamMod.EventType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Record<'prevent', boolean | std.Array<vega-typings.vega-typings/types/spec.EventType>> */
trait RecordpreventbooleanArray extends DefaultsConfig {
  var prevent: Boolean | js.Array[EventType]
}

object RecordpreventbooleanArray {
  @scala.inline
  def apply(prevent: Boolean | js.Array[EventType]): RecordpreventbooleanArray = {
    val __obj = js.Dynamic.literal(prevent = prevent.asInstanceOf[js.Any])
    __obj.asInstanceOf[RecordpreventbooleanArray]
  }
}

