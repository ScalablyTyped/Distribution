package typings.systeminformation.systeminformationMod.Systeminformation

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ServicesData extends js.Object {
  var name: String
  var pcpu: Double
  var pmem: Double
  var running: Boolean
}

object ServicesData {
  @scala.inline
  def apply(name: String, pcpu: Double, pmem: Double, running: Boolean): ServicesData = {
    val __obj = js.Dynamic.literal(name = name, pcpu = pcpu, pmem = pmem, running = running)
  
    __obj.asInstanceOf[ServicesData]
  }
}

