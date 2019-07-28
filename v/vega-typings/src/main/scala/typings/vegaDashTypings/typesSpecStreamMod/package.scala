package typings.vegaDashTypings

import typings.vegaDashTypings.Anon_Orientationchange
import typings.vegaDashTypings.Anon_Scope
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object typesSpecStreamMod {
  type EventSource = (/* import warning: ImportType.apply Failed type conversion: vega-typings.vega-typings/types/spec/stream.EventStream['source'] */ js.Any) with js.Object
  type EventStream = StreamParameters with (Anon_Scope | Anon_Orientationchange)
  /* Rewritten from type alias, can be one of: 
    - typings.vegaDashTypings.typesSpecStreamMod.EventStream
    - typings.vegaDashTypings.typesSpecStreamMod.DerivedStream
    - typings.vegaDashTypings.typesSpecStreamMod.MergedStream
  */
  type Stream = _Stream | EventStream
}
