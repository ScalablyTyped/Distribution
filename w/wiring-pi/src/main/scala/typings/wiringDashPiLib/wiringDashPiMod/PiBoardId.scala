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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("maker")(maker)
    __obj.updateDynamic("mem")(mem)
    __obj.updateDynamic("model")(model)
    __obj.updateDynamic("overvolted")(overvolted)
    __obj.updateDynamic("rev")(rev)
    __obj.asInstanceOf[PiBoardId]
  }
}

