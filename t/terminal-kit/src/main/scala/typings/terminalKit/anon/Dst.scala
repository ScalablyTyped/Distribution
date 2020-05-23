package typings.terminalKit.anon

import typings.terminalKit.screenBufferMod.ScreenBuffer
import typings.terminalKit.terminalMod.Terminal
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Dst extends js.Object {
  var dst: Terminal | ScreenBuffer
}

object Dst {
  @scala.inline
  def apply(dst: Terminal | ScreenBuffer): Dst = {
    val __obj = js.Dynamic.literal(dst = dst.asInstanceOf[js.Any])
    __obj.asInstanceOf[Dst]
  }
}

