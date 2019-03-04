package typings
package wiringDashPiLib.wiringDashPiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PiBoardId extends js.Object {
  var maker: scala.Double
  var mem: scala.Double
  var model: scala.Double
  var overvolted: scala.Double
  var rev: scala.Double
}

object PiBoardId {
  @scala.inline
  def apply(
    maker: scala.Double,
    mem: scala.Double,
    model: scala.Double,
    overvolted: scala.Double,
    rev: scala.Double
  ): PiBoardId = {
    val __obj = js.Dynamic.literal(maker = maker, mem = mem, model = model, overvolted = overvolted, rev = rev)
  
    __obj.asInstanceOf[PiBoardId]
  }
}

