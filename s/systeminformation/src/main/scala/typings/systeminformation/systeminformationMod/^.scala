package typings.systeminformation.systeminformationMod

import typings.systeminformation.systeminformationMod.SysteminformationNs.BatteryData
import typings.systeminformation.systeminformationMod.SysteminformationNs.BlockDevicesData
import typings.systeminformation.systeminformationMod.SysteminformationNs.CpuCacheData
import typings.systeminformation.systeminformationMod.SysteminformationNs.CpuCurrentSpeedData
import typings.systeminformation.systeminformationMod.SysteminformationNs.CpuData
import typings.systeminformation.systeminformationMod.SysteminformationNs.CpuTemperatureData
import typings.systeminformation.systeminformationMod.SysteminformationNs.CurrentLoadData
import typings.systeminformation.systeminformationMod.SysteminformationNs.DiskLayoutData
import typings.systeminformation.systeminformationMod.SysteminformationNs.DisksIoData
import typings.systeminformation.systeminformationMod.SysteminformationNs.DockerContainerData
import typings.systeminformation.systeminformationMod.SysteminformationNs.FsSizeData
import typings.systeminformation.systeminformationMod.SysteminformationNs.FsStatsData
import typings.systeminformation.systeminformationMod.SysteminformationNs.GraphicsData
import typings.systeminformation.systeminformationMod.SysteminformationNs.MemData
import typings.systeminformation.systeminformationMod.SysteminformationNs.MemLayoutData
import typings.systeminformation.systeminformationMod.SysteminformationNs.NetChecksiteData
import typings.systeminformation.systeminformationMod.SysteminformationNs.NetConnectionsData
import typings.systeminformation.systeminformationMod.SysteminformationNs.NetInterfacesData
import typings.systeminformation.systeminformationMod.SysteminformationNs.NetStatsData
import typings.systeminformation.systeminformationMod.SysteminformationNs.OsData
import typings.systeminformation.systeminformationMod.SysteminformationNs.ProcessesData
import typings.systeminformation.systeminformationMod.SysteminformationNs.ProcessesProcessLoadData
import typings.systeminformation.systeminformationMod.SysteminformationNs.ServicesData
import typings.systeminformation.systeminformationMod.SysteminformationNs.StaticData
import typings.systeminformation.systeminformationMod.SysteminformationNs.SystemData
import typings.systeminformation.systeminformationMod.SysteminformationNs.TimeData
import typings.systeminformation.systeminformationMod.SysteminformationNs.UserData
import typings.systeminformation.systeminformationMod.SysteminformationNs.VersionData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("systeminformation", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def battery(): js.Promise[BatteryData] = js.native
  def battery(cb: js.Function1[/* data */ BatteryData, _]): js.Promise[BatteryData] = js.native
  def blockDevices(): js.Promise[js.Array[BlockDevicesData]] = js.native
  def blockDevices(cb: js.Function1[/* data */ js.Array[BlockDevicesData], _]): js.Promise[js.Array[BlockDevicesData]] = js.native
  def cpu(): js.Promise[CpuData] = js.native
  def cpu(cb: js.Function1[/* data */ CpuData, _]): js.Promise[CpuData] = js.native
  def cpuCache(): js.Promise[CpuCacheData] = js.native
  def cpuCache(cb: js.Function1[/* data */ CpuCacheData, _]): js.Promise[CpuCacheData] = js.native
  def cpuCurrentspeed(): js.Promise[CpuCurrentSpeedData] = js.native
  def cpuCurrentspeed(cb: js.Function1[/* data */ CpuCurrentSpeedData, _]): js.Promise[CpuCurrentSpeedData] = js.native
  def cpuFlags(): js.Promise[String] = js.native
  def cpuFlags(cb: js.Function1[/* data */ String, _]): js.Promise[String] = js.native
  def cpuTemperature(): js.Promise[CpuTemperatureData] = js.native
  def cpuTemperature(cb: js.Function1[/* data */ CpuTemperatureData, _]): js.Promise[CpuTemperatureData] = js.native
  def currentLoad(): js.Promise[CurrentLoadData] = js.native
  def currentLoad(cb: js.Function1[/* data */ CurrentLoadData, _]): js.Promise[CurrentLoadData] = js.native
  def diskLayout(): js.Promise[DiskLayoutData] = js.native
  def diskLayout(cb: js.Function1[/* data */ DiskLayoutData, _]): js.Promise[DiskLayoutData] = js.native
  def disksIO(): js.Promise[DisksIoData] = js.native
  def disksIO(cb: js.Function1[/* data */ DisksIoData, _]): js.Promise[DisksIoData] = js.native
  def dockerAll(): js.Promise[_] = js.native
  def dockerAll(cb: js.Function1[/* data */ js.Any, _]): js.Promise[_] = js.native
  def dockerContainerProcesses(): js.Promise[_] = js.native
  def dockerContainerProcesses(id: String): js.Promise[_] = js.native
  def dockerContainerProcesses(id: String, cb: js.Function1[/* data */ js.Any, _]): js.Promise[_] = js.native
  def dockerContainerStats(): js.Promise[_] = js.native
  def dockerContainerStats(id: String): js.Promise[_] = js.native
  def dockerContainerStats(id: String, cb: js.Function1[/* data */ js.Any, _]): js.Promise[_] = js.native
  def dockerContainers(): js.Promise[js.Array[DockerContainerData]] = js.native
  def dockerContainers(all: Boolean): js.Promise[js.Array[DockerContainerData]] = js.native
  def dockerContainers(all: Boolean, cb: js.Function1[/* data */ js.Array[DockerContainerData], _]): js.Promise[js.Array[DockerContainerData]] = js.native
  def fsSize(): js.Promise[js.Array[FsSizeData]] = js.native
  def fsSize(cb: js.Function1[/* data */ js.Array[FsSizeData], _]): js.Promise[js.Array[FsSizeData]] = js.native
  def fsStats(): js.Promise[FsStatsData] = js.native
  def fsStats(cb: js.Function1[/* data */ FsStatsData, _]): js.Promise[FsStatsData] = js.native
  def fullLoad(): js.Promise[Double] = js.native
  def fullLoad(cb: js.Function1[/* data */ Double, _]): js.Promise[Double] = js.native
  def getAllData(): js.Promise[_] = js.native
  def getAllData(srv: String): js.Promise[_] = js.native
  def getAllData(srv: String, iface: String): js.Promise[_] = js.native
  def getAllData(srv: String, iface: String, cb: js.Function1[/* data */ js.Any, _]): js.Promise[_] = js.native
  def getDynamicData(): js.Promise[_] = js.native
  def getDynamicData(srv: String): js.Promise[_] = js.native
  def getDynamicData(srv: String, iface: String): js.Promise[_] = js.native
  def getDynamicData(srv: String, iface: String, cb: js.Function1[/* data */ js.Any, _]): js.Promise[_] = js.native
  def getStaticData(): js.Promise[StaticData] = js.native
  def getStaticData(cb: js.Function1[/* data */ StaticData, _]): js.Promise[StaticData] = js.native
  def graphics(): js.Promise[GraphicsData] = js.native
  def graphics(cb: js.Function1[/* data */ GraphicsData, _]): js.Promise[GraphicsData] = js.native
  def inetChecksite(url: String): js.Promise[NetChecksiteData] = js.native
  def inetChecksite(url: String, cb: js.Function1[/* data */ NetChecksiteData, _]): js.Promise[NetChecksiteData] = js.native
  def inetLatency(): js.Promise[Double] = js.native
  def inetLatency(host: String): js.Promise[Double] = js.native
  def inetLatency(host: String, cb: js.Function1[/* data */ Double, _]): js.Promise[Double] = js.native
  def mem(): js.Promise[MemData] = js.native
  def mem(cb: js.Function1[/* data */ MemData, _]): js.Promise[MemData] = js.native
  def memLayout(): js.Promise[MemLayoutData] = js.native
  def memLayout(cb: js.Function1[/* data */ MemLayoutData, _]): js.Promise[MemLayoutData] = js.native
  def networkConnections(): js.Promise[js.Array[NetConnectionsData]] = js.native
  def networkConnections(cb: js.Function1[/* data */ js.Array[NetConnectionsData], _]): js.Promise[js.Array[NetConnectionsData]] = js.native
  def networkInterfaceDefault(): js.Promise[String] = js.native
  def networkInterfaceDefault(cb: js.Function1[/* data */ String, _]): js.Promise[String] = js.native
  def networkInterfaces(): js.Promise[js.Array[NetInterfacesData]] = js.native
  def networkInterfaces(cb: js.Function1[/* data */ js.Array[NetInterfacesData], _]): js.Promise[js.Array[NetInterfacesData]] = js.native
  def networkStats(): js.Promise[NetStatsData] = js.native
  def networkStats(iface: String): js.Promise[NetStatsData] = js.native
  def networkStats(iface: String, cb: js.Function1[/* data */ NetStatsData, _]): js.Promise[NetStatsData] = js.native
  def osInfo(): js.Promise[OsData] = js.native
  def osInfo(cb: js.Function1[/* data */ OsData, _]): js.Promise[OsData] = js.native
  def processLoad(processName: String): js.Promise[ProcessesProcessLoadData] = js.native
  def processLoad(processName: String, cb: js.Function1[/* data */ ProcessesProcessLoadData, _]): js.Promise[ProcessesProcessLoadData] = js.native
  def processes(): js.Promise[ProcessesData] = js.native
  def processes(cb: js.Function1[/* data */ ProcessesData, _]): js.Promise[ProcessesData] = js.native
  def services(serviceName: String): js.Promise[js.Array[ServicesData]] = js.native
  def services(serviceName: String, cb: js.Function1[/* data */ js.Array[ServicesData], _]): js.Promise[js.Array[ServicesData]] = js.native
  def shell(): js.Promise[String] = js.native
  def shell(cb: js.Function1[/* data */ String, _]): js.Promise[String] = js.native
  def system(): js.Promise[SystemData] = js.native
  def system(cb: js.Function1[/* data */ SystemData, _]): js.Promise[SystemData] = js.native
  def time(): TimeData = js.native
  def users(): js.Promise[js.Array[UserData]] = js.native
  def users(cb: js.Function1[/* data */ js.Array[UserData], _]): js.Promise[js.Array[UserData]] = js.native
  def version(): String = js.native
  def versions(): js.Promise[VersionData] = js.native
  def versions(cb: js.Function1[/* data */ VersionData, _]): js.Promise[VersionData] = js.native
}

