package typings.terminalKit

import typings.terminalKit.screenBufferHDMod.IsBlending
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBlending extends js.Object {
  var blending: IsBlending
}

object AnonBlending {
  @scala.inline
  def apply(blending: IsBlending): AnonBlending = {
    val __obj = js.Dynamic.literal(blending = blending.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonBlending]
  }
}

