package typings.systeminformation.systeminformationMod.Systeminformation

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// 10. "Get All at once" - functions
trait StaticData extends js.Object {
  var baseboard: BaseboardData
  var bios: BiosData
  var chassis: ChassisData
  var cpu: CpuWithFlagsData
  var diskLayout: js.Array[DiskLayoutData]
  var graphics: GraphicsData
  var memLayout: js.Array[MemLayoutData]
  var net: js.Array[NetworkInterfacesData]
  var os: OsData
  var system: SystemData
  var uuid: UuidData
  var version: String
  var versions: VersionData
}

object StaticData {
  @scala.inline
  def apply(
    baseboard: BaseboardData,
    bios: BiosData,
    chassis: ChassisData,
    cpu: CpuWithFlagsData,
    diskLayout: js.Array[DiskLayoutData],
    graphics: GraphicsData,
    memLayout: js.Array[MemLayoutData],
    net: js.Array[NetworkInterfacesData],
    os: OsData,
    system: SystemData,
    uuid: UuidData,
    version: String,
    versions: VersionData
  ): StaticData = {
    val __obj = js.Dynamic.literal(baseboard = baseboard, bios = bios, chassis = chassis, cpu = cpu, diskLayout = diskLayout, graphics = graphics, memLayout = memLayout, net = net, os = os, system = system, uuid = uuid, version = version, versions = versions)
  
    __obj.asInstanceOf[StaticData]
  }
}

