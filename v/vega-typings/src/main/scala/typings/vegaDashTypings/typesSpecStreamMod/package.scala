package typings.vegaDashTypings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object typesSpecStreamMod {
  import typings.vegaDashTypings.Anon_Scope
  import typings.vegaDashTypings.Anon_SourceType

  type EventSource = (/* import warning: ImportType.apply Failed type conversion: vega-typings.vega-typings/types/spec/stream.EventStream['source'] */ js.Any) with js.Object
  type EventStream = StreamParameters with (Anon_Scope | Anon_SourceType)
  /* Rewritten from type alias, can be one of: 
    - typings.vegaDashTypings.typesSpecStreamMod.EventStream
    - typings.vegaDashTypings.typesSpecStreamMod.DerivedStream
    - typings.vegaDashTypings.typesSpecStreamMod.MergedStream
  */
  type Stream = _Stream | EventStream
  type WindowEventType = EventType | String
}
