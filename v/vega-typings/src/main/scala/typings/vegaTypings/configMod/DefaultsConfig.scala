package typings.vegaTypings.configMod

import typings.vegaTypings.streamMod.EventType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Record<'prevent' | 'allow', boolean | std.Array<vega-typings.vega-typings/types/spec.EventType>> */
trait DefaultsConfig extends js.Object {
  var allow: Boolean | js.Array[EventType]
  var prevent: Boolean | js.Array[EventType]
}

object DefaultsConfig {
  @scala.inline
  def apply(allow: Boolean | js.Array[EventType], prevent: Boolean | js.Array[EventType]): DefaultsConfig = {
    val __obj = js.Dynamic.literal(allow = allow.asInstanceOf[js.Any], prevent = prevent.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefaultsConfig]
  }
}

