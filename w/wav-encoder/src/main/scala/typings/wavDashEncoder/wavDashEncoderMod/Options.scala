package typings.wavDashEncoder.wavDashEncoderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var bitDepth: Double
  var float: Boolean
  var symmetric: Boolean
}

object Options {
  @scala.inline
  def apply(bitDepth: Double, float: Boolean, symmetric: Boolean): Options = {
    val __obj = js.Dynamic.literal(bitDepth = bitDepth, float = float, symmetric = symmetric)
  
    __obj.asInstanceOf[Options]
  }
}

