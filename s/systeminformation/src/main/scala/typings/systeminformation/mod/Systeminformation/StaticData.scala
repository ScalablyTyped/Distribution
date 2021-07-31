package typings.systeminformation.mod.Systeminformation

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// 10. "Get All at once" - functions
trait StaticData extends StObject {
  
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
    val __obj = js.Dynamic.literal(baseboard = baseboard.asInstanceOf[js.Any], bios = bios.asInstanceOf[js.Any], chassis = chassis.asInstanceOf[js.Any], cpu = cpu.asInstanceOf[js.Any], diskLayout = diskLayout.asInstanceOf[js.Any], graphics = graphics.asInstanceOf[js.Any], memLayout = memLayout.asInstanceOf[js.Any], net = net.asInstanceOf[js.Any], os = os.asInstanceOf[js.Any], system = system.asInstanceOf[js.Any], uuid = uuid.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any], versions = versions.asInstanceOf[js.Any])
    __obj.asInstanceOf[StaticData]
  }
  
  @scala.inline
  implicit class StaticDataMutableBuilder[Self <: StaticData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBaseboard(value: BaseboardData): Self = StObject.set(x, "baseboard", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBios(value: BiosData): Self = StObject.set(x, "bios", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChassis(value: ChassisData): Self = StObject.set(x, "chassis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCpu(value: CpuWithFlagsData): Self = StObject.set(x, "cpu", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDiskLayout(value: js.Array[DiskLayoutData]): Self = StObject.set(x, "diskLayout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDiskLayoutVarargs(value: DiskLayoutData*): Self = StObject.set(x, "diskLayout", js.Array(value :_*))
    
    @scala.inline
    def setGraphics(value: GraphicsData): Self = StObject.set(x, "graphics", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMemLayout(value: js.Array[MemLayoutData]): Self = StObject.set(x, "memLayout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMemLayoutVarargs(value: MemLayoutData*): Self = StObject.set(x, "memLayout", js.Array(value :_*))
    
    @scala.inline
    def setNet(value: js.Array[NetworkInterfacesData]): Self = StObject.set(x, "net", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNetVarargs(value: NetworkInterfacesData*): Self = StObject.set(x, "net", js.Array(value :_*))
    
    @scala.inline
    def setOs(value: OsData): Self = StObject.set(x, "os", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSystem(value: SystemData): Self = StObject.set(x, "system", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUuid(value: UuidData): Self = StObject.set(x, "uuid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersions(value: VersionData): Self = StObject.set(x, "versions", value.asInstanceOf[js.Any])
  }
}
