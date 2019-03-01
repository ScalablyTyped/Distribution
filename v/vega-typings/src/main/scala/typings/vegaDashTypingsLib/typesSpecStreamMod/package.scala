package typings
package vegaDashTypingsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object typesSpecStreamMod {
  type EventSource = (js.UndefOr[
    vegaDashTypingsLib.vegaDashTypingsLibStrings.view | vegaDashTypingsLib.vegaDashTypingsLibStrings.scope | vegaDashTypingsLib.vegaDashTypingsLibStrings.window
  ]) with js.Object
  type EventStream = StreamParameters with (vegaDashTypingsLib.Anon_Scope | vegaDashTypingsLib.Anon_Orientationchange)
  type Stream = _Stream | EventStream
}
