package typings
package systeminformationLib.systeminformationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("systeminformation", JSImport.Namespace)
@js.native
object systeminformationModMembers extends js.Object {
  def battery(): stdLib.Promise[systeminformationLib.systeminformationMod.SysteminformationNs.BatteryData] = js.native
  def battery(
    cb: js.Function1[
      /* data */ systeminformationLib.systeminformationMod.SysteminformationNs.BatteryData, 
      _
    ]
  ): stdLib.Promise[systeminformationLib.systeminformationMod.SysteminformationNs.BatteryData] = js.native
  def blockDevices(): stdLib.Promise[
    js.Array[systeminformationLib.systeminformationMod.SysteminformationNs.BlockDevicesData]
  ] = js.native
  def blockDevices(
    cb: js.Function1[
      /* data */ js.Array[systeminformationLib.systeminformationMod.SysteminformationNs.BlockDevicesData], 
      _
    ]
  ): stdLib.Promise[
    js.Array[systeminformationLib.systeminformationMod.SysteminformationNs.BlockDevicesData]
  ] = js.native
  def cpu(): stdLib.Promise[systeminformationLib.systeminformationMod.SysteminformationNs.CpuData] = js.native
  def cpu(
    cb: js.Function1[
      /* data */ systeminformationLib.systeminformationMod.SysteminformationNs.CpuData, 
      _
    ]
  ): stdLib.Promise[systeminformationLib.systeminformationMod.SysteminformationNs.CpuData] = js.native
  def cpuCache(): stdLib.Promise[systeminformationLib.systeminformationMod.SysteminformationNs.CpuCacheData] = js.native
  def cpuCache(
    cb: js.Function1[
      /* data */ systeminformationLib.systeminformationMod.SysteminformationNs.CpuCacheData, 
      _
    ]
  ): stdLib.Promise[systeminformationLib.systeminformationMod.SysteminformationNs.CpuCacheData] = js.native
  def cpuCurrentspeed(): stdLib.Promise[
    systeminformationLib.systeminformationMod.SysteminformationNs.CpuCurrentSpeedData
  ] = js.native
  def cpuCurrentspeed(
    cb: js.Function1[
      /* data */ systeminformationLib.systeminformationMod.SysteminformationNs.CpuCurrentSpeedData, 
      _
    ]
  ): stdLib.Promise[
    systeminformationLib.systeminformationMod.SysteminformationNs.CpuCurrentSpeedData
  ] = js.native
  def cpuFlags(): stdLib.Promise[java.lang.String] = js.native
  def cpuFlags(cb: js.Function1[/* data */ java.lang.String, _]): stdLib.Promise[java.lang.String] = js.native
  def cpuTemperature(): stdLib.Promise[systeminformationLib.systeminformationMod.SysteminformationNs.CpuTemperatureData] = js.native
  def cpuTemperature(
    cb: js.Function1[
      /* data */ systeminformationLib.systeminformationMod.SysteminformationNs.CpuTemperatureData, 
      _
    ]
  ): stdLib.Promise[systeminformationLib.systeminformationMod.SysteminformationNs.CpuTemperatureData] = js.native
  def currentLoad(): stdLib.Promise[systeminformationLib.systeminformationMod.SysteminformationNs.CurrentLoadData] = js.native
  def currentLoad(
    cb: js.Function1[
      /* data */ systeminformationLib.systeminformationMod.SysteminformationNs.CurrentLoadData, 
      _
    ]
  ): stdLib.Promise[systeminformationLib.systeminformationMod.SysteminformationNs.CurrentLoadData] = js.native
  def diskLayout(): stdLib.Promise[systeminformationLib.systeminformationMod.SysteminformationNs.DiskLayoutData] = js.native
  def diskLayout(
    cb: js.Function1[
      /* data */ systeminformationLib.systeminformationMod.SysteminformationNs.DiskLayoutData, 
      _
    ]
  ): stdLib.Promise[systeminformationLib.systeminformationMod.SysteminformationNs.DiskLayoutData] = js.native
  def disksIO(): stdLib.Promise[systeminformationLib.systeminformationMod.SysteminformationNs.DisksIoData] = js.native
  def disksIO(
    cb: js.Function1[
      /* data */ systeminformationLib.systeminformationMod.SysteminformationNs.DisksIoData, 
      _
    ]
  ): stdLib.Promise[systeminformationLib.systeminformationMod.SysteminformationNs.DisksIoData] = js.native
  def dockerAll(): stdLib.Promise[_] = js.native
  def dockerAll(cb: js.Function1[/* data */ js.Any, _]): stdLib.Promise[_] = js.native
  def dockerContainerProcesses(): stdLib.Promise[_] = js.native
  def dockerContainerProcesses(id: java.lang.String): stdLib.Promise[_] = js.native
  def dockerContainerProcesses(id: java.lang.String, cb: js.Function1[/* data */ js.Any, _]): stdLib.Promise[_] = js.native
  def dockerContainerStats(): stdLib.Promise[_] = js.native
  def dockerContainerStats(id: java.lang.String): stdLib.Promise[_] = js.native
  def dockerContainerStats(id: java.lang.String, cb: js.Function1[/* data */ js.Any, _]): stdLib.Promise[_] = js.native
  def dockerContainers(): stdLib.Promise[
    js.Array[
      systeminformationLib.systeminformationMod.SysteminformationNs.DockerContainerData
    ]
  ] = js.native
  def dockerContainers(all: scala.Boolean): stdLib.Promise[
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
  ): stdLib.Promise[
    js.Array[
      systeminformationLib.systeminformationMod.SysteminformationNs.DockerContainerData
    ]
  ] = js.native
  def fsSize(): stdLib.Promise[
    js.Array[systeminformationLib.systeminformationMod.SysteminformationNs.FsSizeData]
  ] = js.native
  def fsSize(
    cb: js.Function1[
      /* data */ js.Array[systeminformationLib.systeminformationMod.SysteminformationNs.FsSizeData], 
      _
    ]
  ): stdLib.Promise[
    js.Array[systeminformationLib.systeminformationMod.SysteminformationNs.FsSizeData]
  ] = js.native
  def fsStats(): stdLib.Promise[systeminformationLib.systeminformationMod.SysteminformationNs.FsStatsData] = js.native
  def fsStats(
    cb: js.Function1[
      /* data */ systeminformationLib.systeminformationMod.SysteminformationNs.FsStatsData, 
      _
    ]
  ): stdLib.Promise[systeminformationLib.systeminformationMod.SysteminformationNs.FsStatsData] = js.native
  def fullLoad(): stdLib.Promise[scala.Double] = js.native
  def fullLoad(cb: js.Function1[/* data */ scala.Double, _]): stdLib.Promise[scala.Double] = js.native
  def getAllData(): stdLib.Promise[_] = js.native
  def getAllData(srv: java.lang.String): stdLib.Promise[_] = js.native
  def getAllData(srv: java.lang.String, iface: java.lang.String): stdLib.Promise[_] = js.native
  def getAllData(srv: java.lang.String, iface: java.lang.String, cb: js.Function1[/* data */ js.Any, _]): stdLib.Promise[_] = js.native
  def getDynamicData(): stdLib.Promise[_] = js.native
  def getDynamicData(srv: java.lang.String): stdLib.Promise[_] = js.native
  def getDynamicData(srv: java.lang.String, iface: java.lang.String): stdLib.Promise[_] = js.native
  def getDynamicData(srv: java.lang.String, iface: java.lang.String, cb: js.Function1[/* data */ js.Any, _]): stdLib.Promise[_] = js.native
  def getStaticData(): stdLib.Promise[systeminformationLib.systeminformationMod.SysteminformationNs.StaticData] = js.native
  def getStaticData(
    cb: js.Function1[
      /* data */ systeminformationLib.systeminformationMod.SysteminformationNs.StaticData, 
      _
    ]
  ): stdLib.Promise[systeminformationLib.systeminformationMod.SysteminformationNs.StaticData] = js.native
  def graphics(): stdLib.Promise[systeminformationLib.systeminformationMod.SysteminformationNs.GraphicsData] = js.native
  def graphics(
    cb: js.Function1[
      /* data */ systeminformationLib.systeminformationMod.SysteminformationNs.GraphicsData, 
      _
    ]
  ): stdLib.Promise[systeminformationLib.systeminformationMod.SysteminformationNs.GraphicsData] = js.native
  def inetChecksite(url: java.lang.String): stdLib.Promise[systeminformationLib.systeminformationMod.SysteminformationNs.NetChecksiteData] = js.native
  def inetChecksite(
    url: java.lang.String,
    cb: js.Function1[
      /* data */ systeminformationLib.systeminformationMod.SysteminformationNs.NetChecksiteData, 
      _
    ]
  ): stdLib.Promise[systeminformationLib.systeminformationMod.SysteminformationNs.NetChecksiteData] = js.native
  def inetLatency(): stdLib.Promise[scala.Double] = js.native
  def inetLatency(host: java.lang.String): stdLib.Promise[scala.Double] = js.native
  def inetLatency(host: java.lang.String, cb: js.Function1[/* data */ scala.Double, _]): stdLib.Promise[scala.Double] = js.native
  def mem(): stdLib.Promise[systeminformationLib.systeminformationMod.SysteminformationNs.MemData] = js.native
  def mem(
    cb: js.Function1[
      /* data */ systeminformationLib.systeminformationMod.SysteminformationNs.MemData, 
      _
    ]
  ): stdLib.Promise[systeminformationLib.systeminformationMod.SysteminformationNs.MemData] = js.native
  def memLayout(): stdLib.Promise[systeminformationLib.systeminformationMod.SysteminformationNs.MemLayoutData] = js.native
  def memLayout(
    cb: js.Function1[
      /* data */ systeminformationLib.systeminformationMod.SysteminformationNs.MemLayoutData, 
      _
    ]
  ): stdLib.Promise[systeminformationLib.systeminformationMod.SysteminformationNs.MemLayoutData] = js.native
  def networkConnections(): stdLib.Promise[
    js.Array[systeminformationLib.systeminformationMod.SysteminformationNs.NetConnectionsData]
  ] = js.native
  def networkConnections(
    cb: js.Function1[
      /* data */ js.Array[systeminformationLib.systeminformationMod.SysteminformationNs.NetConnectionsData], 
      _
    ]
  ): stdLib.Promise[
    js.Array[systeminformationLib.systeminformationMod.SysteminformationNs.NetConnectionsData]
  ] = js.native
  def networkInterfaceDefault(): stdLib.Promise[java.lang.String] = js.native
  def networkInterfaceDefault(cb: js.Function1[/* data */ java.lang.String, _]): stdLib.Promise[java.lang.String] = js.native
  def networkInterfaces(): stdLib.Promise[
    js.Array[systeminformationLib.systeminformationMod.SysteminformationNs.NetInterfacesData]
  ] = js.native
  def networkInterfaces(
    cb: js.Function1[
      /* data */ js.Array[systeminformationLib.systeminformationMod.SysteminformationNs.NetInterfacesData], 
      _
    ]
  ): stdLib.Promise[
    js.Array[systeminformationLib.systeminformationMod.SysteminformationNs.NetInterfacesData]
  ] = js.native
  def networkStats(): stdLib.Promise[systeminformationLib.systeminformationMod.SysteminformationNs.NetStatsData] = js.native
  def networkStats(iface: java.lang.String): stdLib.Promise[systeminformationLib.systeminformationMod.SysteminformationNs.NetStatsData] = js.native
  def networkStats(
    iface: java.lang.String,
    cb: js.Function1[
      /* data */ systeminformationLib.systeminformationMod.SysteminformationNs.NetStatsData, 
      _
    ]
  ): stdLib.Promise[systeminformationLib.systeminformationMod.SysteminformationNs.NetStatsData] = js.native
  def osInfo(): stdLib.Promise[systeminformationLib.systeminformationMod.SysteminformationNs.OsData] = js.native
  def osInfo(
    cb: js.Function1[/* data */ systeminformationLib.systeminformationMod.SysteminformationNs.OsData, _]
  ): stdLib.Promise[systeminformationLib.systeminformationMod.SysteminformationNs.OsData] = js.native
  def processLoad(processName: java.lang.String): stdLib.Promise[
    systeminformationLib.systeminformationMod.SysteminformationNs.ProcessesProcessLoadData
  ] = js.native
  def processLoad(
    processName: java.lang.String,
    cb: js.Function1[
      /* data */ systeminformationLib.systeminformationMod.SysteminformationNs.ProcessesProcessLoadData, 
      _
    ]
  ): stdLib.Promise[
    systeminformationLib.systeminformationMod.SysteminformationNs.ProcessesProcessLoadData
  ] = js.native
  def processes(): stdLib.Promise[systeminformationLib.systeminformationMod.SysteminformationNs.ProcessesData] = js.native
  def processes(
    cb: js.Function1[
      /* data */ systeminformationLib.systeminformationMod.SysteminformationNs.ProcessesData, 
      _
    ]
  ): stdLib.Promise[systeminformationLib.systeminformationMod.SysteminformationNs.ProcessesData] = js.native
  def services(serviceName: java.lang.String): stdLib.Promise[
    js.Array[systeminformationLib.systeminformationMod.SysteminformationNs.ServicesData]
  ] = js.native
  def services(
    serviceName: java.lang.String,
    cb: js.Function1[
      /* data */ js.Array[systeminformationLib.systeminformationMod.SysteminformationNs.ServicesData], 
      _
    ]
  ): stdLib.Promise[
    js.Array[systeminformationLib.systeminformationMod.SysteminformationNs.ServicesData]
  ] = js.native
  def shell(): stdLib.Promise[java.lang.String] = js.native
  def shell(cb: js.Function1[/* data */ java.lang.String, _]): stdLib.Promise[java.lang.String] = js.native
  def system(): stdLib.Promise[systeminformationLib.systeminformationMod.SysteminformationNs.SystemData] = js.native
  def system(
    cb: js.Function1[
      /* data */ systeminformationLib.systeminformationMod.SysteminformationNs.SystemData, 
      _
    ]
  ): stdLib.Promise[systeminformationLib.systeminformationMod.SysteminformationNs.SystemData] = js.native
  def time(): systeminformationLib.systeminformationMod.SysteminformationNs.TimeData = js.native
  def users(): stdLib.Promise[js.Array[systeminformationLib.systeminformationMod.SysteminformationNs.UserData]] = js.native
  def users(
    cb: js.Function1[
      /* data */ js.Array[systeminformationLib.systeminformationMod.SysteminformationNs.UserData], 
      _
    ]
  ): stdLib.Promise[js.Array[systeminformationLib.systeminformationMod.SysteminformationNs.UserData]] = js.native
  def version(): java.lang.String = js.native
  def versions(): stdLib.Promise[systeminformationLib.systeminformationMod.SysteminformationNs.VersionData] = js.native
  def versions(
    cb: js.Function1[
      /* data */ systeminformationLib.systeminformationMod.SysteminformationNs.VersionData, 
      _
    ]
  ): stdLib.Promise[systeminformationLib.systeminformationMod.SysteminformationNs.VersionData] = js.native
}

