package typings
package systeminformationLib.systeminformationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("systeminformation", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def battery(): js.Promise[systeminformationLib.systeminformationMod.SysteminformationNs.BatteryData] = js.native
  def battery(
    cb: js.Function1[
      /* data */ systeminformationLib.systeminformationMod.SysteminformationNs.BatteryData, 
      _
    ]
  ): js.Promise[systeminformationLib.systeminformationMod.SysteminformationNs.BatteryData] = js.native
  def blockDevices(): js.Promise[
    js.Array[systeminformationLib.systeminformationMod.SysteminformationNs.BlockDevicesData]
  ] = js.native
  def blockDevices(
    cb: js.Function1[
      /* data */ js.Array[systeminformationLib.systeminformationMod.SysteminformationNs.BlockDevicesData], 
      _
    ]
  ): js.Promise[
    js.Array[systeminformationLib.systeminformationMod.SysteminformationNs.BlockDevicesData]
  ] = js.native
  def cpu(): js.Promise[systeminformationLib.systeminformationMod.SysteminformationNs.CpuData] = js.native
  def cpu(
    cb: js.Function1[
      /* data */ systeminformationLib.systeminformationMod.SysteminformationNs.CpuData, 
      _
    ]
  ): js.Promise[systeminformationLib.systeminformationMod.SysteminformationNs.CpuData] = js.native
  def cpuCache(): js.Promise[systeminformationLib.systeminformationMod.SysteminformationNs.CpuCacheData] = js.native
  def cpuCache(
    cb: js.Function1[
      /* data */ systeminformationLib.systeminformationMod.SysteminformationNs.CpuCacheData, 
      _
    ]
  ): js.Promise[systeminformationLib.systeminformationMod.SysteminformationNs.CpuCacheData] = js.native
  def cpuCurrentspeed(): js.Promise[
    systeminformationLib.systeminformationMod.SysteminformationNs.CpuCurrentSpeedData
  ] = js.native
  def cpuCurrentspeed(
    cb: js.Function1[
      /* data */ systeminformationLib.systeminformationMod.SysteminformationNs.CpuCurrentSpeedData, 
      _
    ]
  ): js.Promise[
    systeminformationLib.systeminformationMod.SysteminformationNs.CpuCurrentSpeedData
  ] = js.native
  def cpuFlags(): js.Promise[java.lang.String] = js.native
  def cpuFlags(cb: js.Function1[/* data */ java.lang.String, _]): js.Promise[java.lang.String] = js.native
  def cpuTemperature(): js.Promise[systeminformationLib.systeminformationMod.SysteminformationNs.CpuTemperatureData] = js.native
  def cpuTemperature(
    cb: js.Function1[
      /* data */ systeminformationLib.systeminformationMod.SysteminformationNs.CpuTemperatureData, 
      _
    ]
  ): js.Promise[systeminformationLib.systeminformationMod.SysteminformationNs.CpuTemperatureData] = js.native
  def currentLoad(): js.Promise[systeminformationLib.systeminformationMod.SysteminformationNs.CurrentLoadData] = js.native
  def currentLoad(
    cb: js.Function1[
      /* data */ systeminformationLib.systeminformationMod.SysteminformationNs.CurrentLoadData, 
      _
    ]
  ): js.Promise[systeminformationLib.systeminformationMod.SysteminformationNs.CurrentLoadData] = js.native
  def diskLayout(): js.Promise[systeminformationLib.systeminformationMod.SysteminformationNs.DiskLayoutData] = js.native
  def diskLayout(
    cb: js.Function1[
      /* data */ systeminformationLib.systeminformationMod.SysteminformationNs.DiskLayoutData, 
      _
    ]
  ): js.Promise[systeminformationLib.systeminformationMod.SysteminformationNs.DiskLayoutData] = js.native
  def disksIO(): js.Promise[systeminformationLib.systeminformationMod.SysteminformationNs.DisksIoData] = js.native
  def disksIO(
    cb: js.Function1[
      /* data */ systeminformationLib.systeminformationMod.SysteminformationNs.DisksIoData, 
      _
    ]
  ): js.Promise[systeminformationLib.systeminformationMod.SysteminformationNs.DisksIoData] = js.native
  def dockerAll(): js.Promise[_] = js.native
  def dockerAll(cb: js.Function1[/* data */ js.Any, _]): js.Promise[_] = js.native
  def dockerContainerProcesses(): js.Promise[_] = js.native
  def dockerContainerProcesses(id: java.lang.String): js.Promise[_] = js.native
  def dockerContainerProcesses(id: java.lang.String, cb: js.Function1[/* data */ js.Any, _]): js.Promise[_] = js.native
  def dockerContainerStats(): js.Promise[_] = js.native
  def dockerContainerStats(id: java.lang.String): js.Promise[_] = js.native
  def dockerContainerStats(id: java.lang.String, cb: js.Function1[/* data */ js.Any, _]): js.Promise[_] = js.native
  def dockerContainers(): js.Promise[
    js.Array[
      systeminformationLib.systeminformationMod.SysteminformationNs.DockerContainerData
    ]
  ] = js.native
  def dockerContainers(all: scala.Boolean): js.Promise[
    js.Array[
      systeminformationLib.systeminformationMod.SysteminformationNs.DockerContainerData
    ]
  ] = js.native
  def dockerContainers(
    all: scala.Boolean,
    cb: js.Function1[
      /* data */ js.Array[
        systeminformationLib.systeminformationMod.SysteminformationNs.DockerContainerData
      ], 
      _
    ]
  ): js.Promise[
    js.Array[
      systeminformationLib.systeminformationMod.SysteminformationNs.DockerContainerData
    ]
  ] = js.native
  def fsSize(): js.Promise[
    js.Array[systeminformationLib.systeminformationMod.SysteminformationNs.FsSizeData]
  ] = js.native
  def fsSize(
    cb: js.Function1[
      /* data */ js.Array[systeminformationLib.systeminformationMod.SysteminformationNs.FsSizeData], 
      _
    ]
  ): js.Promise[
    js.Array[systeminformationLib.systeminformationMod.SysteminformationNs.FsSizeData]
  ] = js.native
  def fsStats(): js.Promise[systeminformationLib.systeminformationMod.SysteminformationNs.FsStatsData] = js.native
  def fsStats(
    cb: js.Function1[
      /* data */ systeminformationLib.systeminformationMod.SysteminformationNs.FsStatsData, 
      _
    ]
  ): js.Promise[systeminformationLib.systeminformationMod.SysteminformationNs.FsStatsData] = js.native
  def fullLoad(): js.Promise[scala.Double] = js.native
  def fullLoad(cb: js.Function1[/* data */ scala.Double, _]): js.Promise[scala.Double] = js.native
  def getAllData(): js.Promise[_] = js.native
  def getAllData(srv: java.lang.String): js.Promise[_] = js.native
  def getAllData(srv: java.lang.String, iface: java.lang.String): js.Promise[_] = js.native
  def getAllData(srv: java.lang.String, iface: java.lang.String, cb: js.Function1[/* data */ js.Any, _]): js.Promise[_] = js.native
  def getDynamicData(): js.Promise[_] = js.native
  def getDynamicData(srv: java.lang.String): js.Promise[_] = js.native
  def getDynamicData(srv: java.lang.String, iface: java.lang.String): js.Promise[_] = js.native
  def getDynamicData(srv: java.lang.String, iface: java.lang.String, cb: js.Function1[/* data */ js.Any, _]): js.Promise[_] = js.native
  def getStaticData(): js.Promise[systeminformationLib.systeminformationMod.SysteminformationNs.StaticData] = js.native
  def getStaticData(
    cb: js.Function1[
      /* data */ systeminformationLib.systeminformationMod.SysteminformationNs.StaticData, 
      _
    ]
  ): js.Promise[systeminformationLib.systeminformationMod.SysteminformationNs.StaticData] = js.native
  def graphics(): js.Promise[systeminformationLib.systeminformationMod.SysteminformationNs.GraphicsData] = js.native
  def graphics(
    cb: js.Function1[
      /* data */ systeminformationLib.systeminformationMod.SysteminformationNs.GraphicsData, 
      _
    ]
  ): js.Promise[systeminformationLib.systeminformationMod.SysteminformationNs.GraphicsData] = js.native
  def inetChecksite(url: java.lang.String): js.Promise[systeminformationLib.systeminformationMod.SysteminformationNs.NetChecksiteData] = js.native
  def inetChecksite(
    url: java.lang.String,
    cb: js.Function1[
      /* data */ systeminformationLib.systeminformationMod.SysteminformationNs.NetChecksiteData, 
      _
    ]
  ): js.Promise[systeminformationLib.systeminformationMod.SysteminformationNs.NetChecksiteData] = js.native
  def inetLatency(): js.Promise[scala.Double] = js.native
  def inetLatency(host: java.lang.String): js.Promise[scala.Double] = js.native
  def inetLatency(host: java.lang.String, cb: js.Function1[/* data */ scala.Double, _]): js.Promise[scala.Double] = js.native
  def mem(): js.Promise[systeminformationLib.systeminformationMod.SysteminformationNs.MemData] = js.native
  def mem(
    cb: js.Function1[
      /* data */ systeminformationLib.systeminformationMod.SysteminformationNs.MemData, 
      _
    ]
  ): js.Promise[systeminformationLib.systeminformationMod.SysteminformationNs.MemData] = js.native
  def memLayout(): js.Promise[systeminformationLib.systeminformationMod.SysteminformationNs.MemLayoutData] = js.native
  def memLayout(
    cb: js.Function1[
      /* data */ systeminformationLib.systeminformationMod.SysteminformationNs.MemLayoutData, 
      _
    ]
  ): js.Promise[systeminformationLib.systeminformationMod.SysteminformationNs.MemLayoutData] = js.native
  def networkConnections(): js.Promise[
    js.Array[systeminformationLib.systeminformationMod.SysteminformationNs.NetConnectionsData]
  ] = js.native
  def networkConnections(
    cb: js.Function1[
      /* data */ js.Array[systeminformationLib.systeminformationMod.SysteminformationNs.NetConnectionsData], 
      _
    ]
  ): js.Promise[
    js.Array[systeminformationLib.systeminformationMod.SysteminformationNs.NetConnectionsData]
  ] = js.native
  def networkInterfaceDefault(): js.Promise[java.lang.String] = js.native
  def networkInterfaceDefault(cb: js.Function1[/* data */ java.lang.String, _]): js.Promise[java.lang.String] = js.native
  def networkInterfaces(): js.Promise[
    js.Array[systeminformationLib.systeminformationMod.SysteminformationNs.NetInterfacesData]
  ] = js.native
  def networkInterfaces(
    cb: js.Function1[
      /* data */ js.Array[systeminformationLib.systeminformationMod.SysteminformationNs.NetInterfacesData], 
      _
    ]
  ): js.Promise[
    js.Array[systeminformationLib.systeminformationMod.SysteminformationNs.NetInterfacesData]
  ] = js.native
  def networkStats(): js.Promise[systeminformationLib.systeminformationMod.SysteminformationNs.NetStatsData] = js.native
  def networkStats(iface: java.lang.String): js.Promise[systeminformationLib.systeminformationMod.SysteminformationNs.NetStatsData] = js.native
  def networkStats(
    iface: java.lang.String,
    cb: js.Function1[
      /* data */ systeminformationLib.systeminformationMod.SysteminformationNs.NetStatsData, 
      _
    ]
  ): js.Promise[systeminformationLib.systeminformationMod.SysteminformationNs.NetStatsData] = js.native
  def osInfo(): js.Promise[systeminformationLib.systeminformationMod.SysteminformationNs.OsData] = js.native
  def osInfo(
    cb: js.Function1[/* data */ systeminformationLib.systeminformationMod.SysteminformationNs.OsData, _]
  ): js.Promise[systeminformationLib.systeminformationMod.SysteminformationNs.OsData] = js.native
  def processLoad(processName: java.lang.String): js.Promise[
    systeminformationLib.systeminformationMod.SysteminformationNs.ProcessesProcessLoadData
  ] = js.native
  def processLoad(
    processName: java.lang.String,
    cb: js.Function1[
      /* data */ systeminformationLib.systeminformationMod.SysteminformationNs.ProcessesProcessLoadData, 
      _
    ]
  ): js.Promise[
    systeminformationLib.systeminformationMod.SysteminformationNs.ProcessesProcessLoadData
  ] = js.native
  def processes(): js.Promise[systeminformationLib.systeminformationMod.SysteminformationNs.ProcessesData] = js.native
  def processes(
    cb: js.Function1[
      /* data */ systeminformationLib.systeminformationMod.SysteminformationNs.ProcessesData, 
      _
    ]
  ): js.Promise[systeminformationLib.systeminformationMod.SysteminformationNs.ProcessesData] = js.native
  def services(serviceName: java.lang.String): js.Promise[
    js.Array[systeminformationLib.systeminformationMod.SysteminformationNs.ServicesData]
  ] = js.native
  def services(
    serviceName: java.lang.String,
    cb: js.Function1[
      /* data */ js.Array[systeminformationLib.systeminformationMod.SysteminformationNs.ServicesData], 
      _
    ]
  ): js.Promise[
    js.Array[systeminformationLib.systeminformationMod.SysteminformationNs.ServicesData]
  ] = js.native
  def shell(): js.Promise[java.lang.String] = js.native
  def shell(cb: js.Function1[/* data */ java.lang.String, _]): js.Promise[java.lang.String] = js.native
  def system(): js.Promise[systeminformationLib.systeminformationMod.SysteminformationNs.SystemData] = js.native
  def system(
    cb: js.Function1[
      /* data */ systeminformationLib.systeminformationMod.SysteminformationNs.SystemData, 
      _
    ]
  ): js.Promise[systeminformationLib.systeminformationMod.SysteminformationNs.SystemData] = js.native
  def time(): systeminformationLib.systeminformationMod.SysteminformationNs.TimeData = js.native
  def users(): js.Promise[js.Array[systeminformationLib.systeminformationMod.SysteminformationNs.UserData]] = js.native
  def users(
    cb: js.Function1[
      /* data */ js.Array[systeminformationLib.systeminformationMod.SysteminformationNs.UserData], 
      _
    ]
  ): js.Promise[js.Array[systeminformationLib.systeminformationMod.SysteminformationNs.UserData]] = js.native
  def version(): java.lang.String = js.native
  def versions(): js.Promise[systeminformationLib.systeminformationMod.SysteminformationNs.VersionData] = js.native
  def versions(
    cb: js.Function1[
      /* data */ systeminformationLib.systeminformationMod.SysteminformationNs.VersionData, 
      _
    ]
  ): js.Promise[systeminformationLib.systeminformationMod.SysteminformationNs.VersionData] = js.native
}

