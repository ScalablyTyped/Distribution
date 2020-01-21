package typings.terminalKit

import typings.terminalKit.screenBufferMod.ScreenBuffer
import typings.terminalKit.terminalMod.Terminal
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDst extends js.Object {
  var dst: Terminal | ScreenBuffer
}

object AnonDst {
  @scala.inline
  def apply(dst: Terminal | ScreenBuffer): AnonDst = {
    val __obj = js.Dynamic.literal(dst = dst.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonDst]
  }
}

