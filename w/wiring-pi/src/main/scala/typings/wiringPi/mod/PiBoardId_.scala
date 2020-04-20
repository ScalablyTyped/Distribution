package typings.wiringPi.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PiBoardId_ extends js.Object {
  var maker: Double
  var mem: Double
  var model: Double
  var overvolted: Double
  var rev: Double
}

object PiBoardId_ {
  @scala.inline
  def apply(maker: Double, mem: Double, model: Double, overvolted: Double, rev: Double): PiBoardId_ = {
    val __obj = js.Dynamic.literal(maker = maker.asInstanceOf[js.Any], mem = mem.asInstanceOf[js.Any], model = model.asInstanceOf[js.Any], overvolted = overvolted.asInstanceOf[js.Any], rev = rev.asInstanceOf[js.Any])
    __obj.asInstanceOf[PiBoardId_]
  }
}

