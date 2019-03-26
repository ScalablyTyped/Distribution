package typings
package vegaDashTypingsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object typesSpecStreamMod {
  type EventSource = (js.UndefOr[
    vegaDashTypingsLib.vegaDashTypingsLibStrings.view | vegaDashTypingsLib.vegaDashTypingsLibStrings.scope
  ]) with js.UndefOr[vegaDashTypingsLib.vegaDashTypingsLibStrings.window] with js.Object
  type EventStream = StreamParameters with (vegaDashTypingsLib.Anon_Scope | vegaDashTypingsLib.Anon_Orientationchange)
  /* Rewritten from type alias, can be one of: 
    - EventStream
    - DerivedStream
    - MergedStream
  */
  type Stream = _Stream | EventStream
}
