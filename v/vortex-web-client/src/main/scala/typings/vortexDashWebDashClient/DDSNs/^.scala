package typings.vortexDashWebDashClient.DDSNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("DDS")
@js.native
object ^ extends js.Object {
  var DataReaderQos: EntityQos = js.native
  var DataWriterQos: EntityQos = js.native
  var TopicQos: EntityQos = js.native
  var VERSION: String = js.native
  def ContentFilter(expr: String): Policy = js.native
  def Partition(policies: String*): Policy = js.native
  def TimeFilter(period: Double): Policy = js.native
}

