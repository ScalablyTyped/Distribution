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
  type EventType = vegaDashTypingsLib.vegaDashTypingsLibStrings.click | vegaDashTypingsLib.vegaDashTypingsLibStrings.dblclick | vegaDashTypingsLib.vegaDashTypingsLibStrings.dragenter | vegaDashTypingsLib.vegaDashTypingsLibStrings.dragleave | vegaDashTypingsLib.vegaDashTypingsLibStrings.dragover | vegaDashTypingsLib.vegaDashTypingsLibStrings.keydown | vegaDashTypingsLib.vegaDashTypingsLibStrings.keypress | vegaDashTypingsLib.vegaDashTypingsLibStrings.keyup | vegaDashTypingsLib.vegaDashTypingsLibStrings.mousedown | vegaDashTypingsLib.vegaDashTypingsLibStrings.mousemove | vegaDashTypingsLib.vegaDashTypingsLibStrings.mouseout | vegaDashTypingsLib.vegaDashTypingsLibStrings.mouseover | vegaDashTypingsLib.vegaDashTypingsLibStrings.mouseup | vegaDashTypingsLib.vegaDashTypingsLibStrings.mousewheel | vegaDashTypingsLib.vegaDashTypingsLibStrings.touchend | vegaDashTypingsLib.vegaDashTypingsLibStrings.touchmove | vegaDashTypingsLib.vegaDashTypingsLibStrings.touchstart | vegaDashTypingsLib.vegaDashTypingsLibStrings.wheel
  type Stream = EventStream | DerivedStream | MergedStream
}
