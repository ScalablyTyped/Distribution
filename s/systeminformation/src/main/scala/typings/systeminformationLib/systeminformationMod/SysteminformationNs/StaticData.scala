package typings
package systeminformationLib.systeminformationMod.SysteminformationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StaticData extends js.Object {
  var cpu: CpuData
  var diskLayout: js.Array[DiskLayoutData]
  var graphics: GraphicsData
  var memLayout: js.Array[MemLayoutData]
  var net: js.Array[NetInterfacesData]
  var os: OsData
  var system: SystemData
  var version: java.lang.String
  var versions: VersionData
}

object StaticData {
  @scala.inline
  def apply(
    cpu: CpuData,
    diskLayout: js.Array[DiskLayoutData],
    graphics: GraphicsData,
    memLayout: js.Array[MemLayoutData],
    net: js.Array[NetInterfacesData],
    os: OsData,
    system: SystemData,
    version: java.lang.String,
    versions: VersionData
  ): StaticData = {
    val __obj = js.Dynamic.literal(cpu = cpu, diskLayout = diskLayout, graphics = graphics, memLayout = memLayout, net = net, os = os, system = system, version = version, versions = versions)
  
    __obj.asInstanceOf[StaticData]
  }
}

