package typings
package vegaDashTypingsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object typesSpecStreamMod {
  type EventSource = (/* import warning: ImportType.apply Failed type conversion: vega-typings.vega-typings/types/spec/stream.EventStream['source'] */ js.Any) with js.Object
  type EventStream = StreamParameters with (vegaDashTypingsLib.Anon_Scope | vegaDashTypingsLib.Anon_Orientationchange)
  /* Rewritten from type alias, can be one of: 
    - EventStream
    - DerivedStream
    - MergedStream
  */
  type Stream = _Stream | EventStream
}
