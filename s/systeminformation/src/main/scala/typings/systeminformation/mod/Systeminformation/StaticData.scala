package typings.systeminformation.mod.Systeminformation

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// 10. "Get All at once" - functions
@js.native
trait StaticData extends js.Object {
  
  var baseboard: BaseboardData = js.native
  
  var bios: BiosData = js.native
  
  var chassis: ChassisData = js.native
  
  var cpu: CpuWithFlagsData = js.native
  
  var diskLayout: js.Array[DiskLayoutData] = js.native
  
  var graphics: GraphicsData = js.native
  
  var memLayout: js.Array[MemLayoutData] = js.native
  
  var net: js.Array[NetworkInterfacesData] = js.native
  
  var os: OsData = js.native
  
  var system: SystemData = js.native
  
  var uuid: UuidData = js.native
  
  var version: String = js.native
  
  var versions: VersionData = js.native
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
    val __obj = js.Dynamic.literal(baseboard = baseboard.asInstanceOf[js.Any], bios = bios.asInstanceOf[js.Any], chassis = chassis.asInstanceOf[js.Any], cpu = cpu.asInstanceOf[js.Any], diskLayout = diskLayout.asInstanceOf[js.Any], graphics = graphics.asInstanceOf[js.Any], memLayout = memLayout.asInstanceOf[js.Any], net = net.asInstanceOf[js.Any], os = os.asInstanceOf[js.Any], system = system.asInstanceOf[js.Any], uuid = uuid.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any], versions = versions.asInstanceOf[js.Any])
    __obj.asInstanceOf[StaticData]
  }
  
  @scala.inline
  implicit class StaticDataOps[Self <: StaticData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setBaseboard(value: BaseboardData): Self = this.set("baseboard", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBios(value: BiosData): Self = this.set("bios", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChassis(value: ChassisData): Self = this.set("chassis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCpu(value: CpuWithFlagsData): Self = this.set("cpu", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDiskLayoutVarargs(value: DiskLayoutData*): Self = this.set("diskLayout", js.Array(value :_*))
    
    @scala.inline
    def setDiskLayout(value: js.Array[DiskLayoutData]): Self = this.set("diskLayout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGraphics(value: GraphicsData): Self = this.set("graphics", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMemLayoutVarargs(value: MemLayoutData*): Self = this.set("memLayout", js.Array(value :_*))
    
    @scala.inline
    def setMemLayout(value: js.Array[MemLayoutData]): Self = this.set("memLayout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNetVarargs(value: NetworkInterfacesData*): Self = this.set("net", js.Array(value :_*))
    
    @scala.inline
    def setNet(value: js.Array[NetworkInterfacesData]): Self = this.set("net", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOs(value: OsData): Self = this.set("os", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSystem(value: SystemData): Self = this.set("system", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUuid(value: UuidData): Self = this.set("uuid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersion(value: String): Self = this.set("version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersions(value: VersionData): Self = this.set("versions", value.asInstanceOf[js.Any])
  }
}
