package typings.systeminformation.systeminformationMod.Systeminformation

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ServicesData extends js.Object {
  var name: String
  var pcpu: Double
  var pids: js.Array[Double]
  var pmem: Double
  var running: Boolean
  var startmode: String
}

object ServicesData {
  @scala.inline
  def apply(
    name: String,
    pcpu: Double,
    pids: js.Array[Double],
    pmem: Double,
    running: Boolean,
    startmode: String
  ): ServicesData = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], pcpu = pcpu.asInstanceOf[js.Any], pids = pids.asInstanceOf[js.Any], pmem = pmem.asInstanceOf[js.Any], running = running.asInstanceOf[js.Any], startmode = startmode.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ServicesData]
  }
}

