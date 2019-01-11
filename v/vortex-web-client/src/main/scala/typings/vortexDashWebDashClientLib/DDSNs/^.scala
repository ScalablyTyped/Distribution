package typings
package vortexDashWebDashClientLib.DDSNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("DDS")
@js.native
object ^ extends js.Object {
  var DataReaderQos: vortexDashWebDashClientLib.DDSNs.EntityQos = js.native
  var DataWriterQos: vortexDashWebDashClientLib.DDSNs.EntityQos = js.native
  var TopicQos: vortexDashWebDashClientLib.DDSNs.EntityQos = js.native
  var VERSION: java.lang.String = js.native
  var runtime: vortexDashWebDashClientLib.Anon_Runtime = js.native
  def ContentFilter(expr: java.lang.String): vortexDashWebDashClientLib.DDSNs.Policy = js.native
  def Partition(policies: java.lang.String*): vortexDashWebDashClientLib.DDSNs.Policy = js.native
  def TimeFilter(period: scala.Double): vortexDashWebDashClientLib.DDSNs.Policy = js.native
}

