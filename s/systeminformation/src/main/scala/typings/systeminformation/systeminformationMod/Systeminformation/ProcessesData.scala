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
  var unknown: Double
}

object ProcessesData {
  @scala.inline
  def apply(
    all: Double,
    blocked: Double,
    list: js.Array[ProcessesProcessData],
    running: Double,
    sleeping: Double,
    unknown: Double
  ): ProcessesData = {
    val __obj = js.Dynamic.literal(all = all.asInstanceOf[js.Any], blocked = blocked.asInstanceOf[js.Any], list = list.asInstanceOf[js.Any], running = running.asInstanceOf[js.Any], sleeping = sleeping.asInstanceOf[js.Any], unknown = unknown.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ProcessesData]
  }
}

