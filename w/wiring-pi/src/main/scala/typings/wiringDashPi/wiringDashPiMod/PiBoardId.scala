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
    val __obj = js.Dynamic.literal(maker = maker.asInstanceOf[js.Any], mem = mem.asInstanceOf[js.Any], model = model.asInstanceOf[js.Any], overvolted = overvolted.asInstanceOf[js.Any], rev = rev.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PiBoardId]
  }
}

@JSImport("wiring-pi", "piBoardId")
@js.native
object piBoardId extends js.Object {
  def apply(): PiBoardId = js.native
}

