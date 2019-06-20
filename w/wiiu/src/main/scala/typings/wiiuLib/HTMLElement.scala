package typings
package wiiuLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HTMLElement extends js.Object {
  @JSName("addEventListener")
  def addEventListener_wiiuvideoplayerend(
    `type`: wiiuLib.wiiuLibStrings.wiiu_videoplayer_end,
    listener: js.Function1[/* ev */ stdLib.CustomEvent[_], _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_wiiuvideoplayerend(
    `type`: wiiuLib.wiiuLibStrings.wiiu_videoplayer_end,
    listener: js.Function1[/* ev */ stdLib.CustomEvent[_], _],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
}

