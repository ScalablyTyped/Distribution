package typings.wiringDashPi.wiringDashPiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PiBoardId extends js.Object {
  var maker: Double
  var mem: Double
  var model: Double
  var overvolted: Double
  var rev: Double
}

object PiBoardId {
  @scala.inline
  def apply(maker: Double, mem: Double, model: Double, overvolted: Double, rev: Double): PiBoardId = {
    val __obj = js.Dynamic.literal(maker = maker, mem = mem, model = model, overvolted = overvolted, rev = rev)
  
    __obj.asInstanceOf[PiBoardId]
  }
}

