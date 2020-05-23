package typings.terminalKit.anon

import typings.terminalKit.screenBufferHDMod.IsBlending
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Blending extends js.Object {
  var blending: IsBlending
}

object Blending {
  @scala.inline
  def apply(blending: IsBlending): Blending = {
    val __obj = js.Dynamic.literal(blending = blending.asInstanceOf[js.Any])
    __obj.asInstanceOf[Blending]
  }
}

