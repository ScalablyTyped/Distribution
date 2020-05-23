package typings.vegaTypings.anon

import typings.vegaTypings.configMod.DefaultsConfig
import typings.vegaTypings.streamMod.EventType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Record<'allow', boolean | std.Array<vega-typings.vega-typings/types/spec.EventType>> */
trait RecordallowbooleanArrayEv extends DefaultsConfig {
  var allow: Boolean | js.Array[EventType]
}

object RecordallowbooleanArrayEv {
  @scala.inline
  def apply(allow: Boolean | js.Array[EventType]): RecordallowbooleanArrayEv = {
    val __obj = js.Dynamic.literal(allow = allow.asInstanceOf[js.Any])
    __obj.asInstanceOf[RecordallowbooleanArrayEv]
  }
}

