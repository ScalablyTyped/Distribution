package typings.systeminformation.systeminformationMod.Systeminformation

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProcessesData extends js.Object {
  var all: Double
  var blocked: Double
  var list: js.Array[ProcessesProcessData]
  var running: Double
  var sleeping: Double
}

object ProcessesData {
  @scala.inline
  def apply(
    all: Double,
    blocked: Double,
    list: js.Array[ProcessesProcessData],
    running: Double,
    sleeping: Double
  ): ProcessesData = {
    val __obj = js.Dynamic.literal(all = all, blocked = blocked, list = list, running = running, sleeping = sleeping)
  
    __obj.asInstanceOf[ProcessesData]
  }
}

