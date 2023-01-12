package typings.systeminformation.mod.Systeminformation

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// 8. Docker
trait DockerInfoData extends StObject {
  
  var architecture: String
  
  var bridgeNfIp6tables: Boolean
  
  var bridgeNfIptables: Boolean
  
  var cgroupDriver: String
  
  var clusterAdvertise: String
  
  var clusterStore: String
  
  var containers: Double
  
  var containersPaused: Double
  
  var containersRunning: Double
  
  var containersStopped: Double
  
  var cpuCfsPeriod: Boolean
  
  var cpuCfsQuota: Boolean
  
  var cpuSet: Boolean
  
  var cpuShares: Boolean
  
  var debug: Boolean
  
  var defaultRuntime: String
  
  var dockerRootDir: String
  
  var driver: String
  
  var experimentalBuild: Boolean
  
  var httpProxy: String
  
  var httpsProxy: String
  
  var id: String
  
  var images: Double
  
  var initBinary: String
  
  var ipv4Forwarding: Boolean
  
  var isolation: String
  
  var kernelMemory: Boolean
  
  var kernelVersion: String
  
  var labels: js.Array[String]
  
  var liveRestoreEnabled: Boolean
  
  var loggingDriver: String
  
  var memTotal: Double
  
  var memoryLimit: Boolean
  
  var nEventsListener: Double
  
  var name: String
  
  var ncpu: Double
  
  var nfd: Double
  
  var ngoroutines: Double
  
  var noProxy: String
  
  var oomKillDisable: Boolean
  
  var operatingSystem: String
  
  var osType: String
  
  var productLicense: String
  
  var serverVersion: String
  
  var swapLimit: Boolean
  
  var systemTime: String
}
object DockerInfoData {
  
  inline def apply(
    architecture: String,
    bridgeNfIp6tables: Boolean,
    bridgeNfIptables: Boolean,
    cgroupDriver: String,
    clusterAdvertise: String,
    clusterStore: String,
    containers: Double,
    containersPaused: Double,
    containersRunning: Double,
    containersStopped: Double,
    cpuCfsPeriod: Boolean,
    cpuCfsQuota: Boolean,
    cpuSet: Boolean,
    cpuShares: Boolean,
    debug: Boolean,
    defaultRuntime: String,
    dockerRootDir: String,
    driver: String,
    experimentalBuild: Boolean,
    httpProxy: String,
    httpsProxy: String,
    id: String,
    images: Double,
    initBinary: String,
    ipv4Forwarding: Boolean,
    isolation: String,
    kernelMemory: Boolean,
    kernelVersion: String,
    labels: js.Array[String],
    liveRestoreEnabled: Boolean,
    loggingDriver: String,
    memTotal: Double,
    memoryLimit: Boolean,
    nEventsListener: Double,
    name: String,
    ncpu: Double,
    nfd: Double,
    ngoroutines: Double,
    noProxy: String,
    oomKillDisable: Boolean,
    operatingSystem: String,
    osType: String,
    productLicense: String,
    serverVersion: String,
    swapLimit: Boolean,
    systemTime: String
  ): DockerInfoData = {
    val __obj = js.Dynamic.literal(architecture = architecture.asInstanceOf[js.Any], bridgeNfIp6tables = bridgeNfIp6tables.asInstanceOf[js.Any], bridgeNfIptables = bridgeNfIptables.asInstanceOf[js.Any], cgroupDriver = cgroupDriver.asInstanceOf[js.Any], clusterAdvertise = clusterAdvertise.asInstanceOf[js.Any], clusterStore = clusterStore.asInstanceOf[js.Any], containers = containers.asInstanceOf[js.Any], containersPaused = containersPaused.asInstanceOf[js.Any], containersRunning = containersRunning.asInstanceOf[js.Any], containersStopped = containersStopped.asInstanceOf[js.Any], cpuCfsPeriod = cpuCfsPeriod.asInstanceOf[js.Any], cpuCfsQuota = cpuCfsQuota.asInstanceOf[js.Any], cpuSet = cpuSet.asInstanceOf[js.Any], cpuShares = cpuShares.asInstanceOf[js.Any], debug = debug.asInstanceOf[js.Any], defaultRuntime = defaultRuntime.asInstanceOf[js.Any], dockerRootDir = dockerRootDir.asInstanceOf[js.Any], driver = driver.asInstanceOf[js.Any], experimentalBuild = experimentalBuild.asInstanceOf[js.Any], httpProxy = httpProxy.asInstanceOf[js.Any], httpsProxy = httpsProxy.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], images = images.asInstanceOf[js.Any], initBinary = initBinary.asInstanceOf[js.Any], ipv4Forwarding = ipv4Forwarding.asInstanceOf[js.Any], isolation = isolation.asInstanceOf[js.Any], kernelMemory = kernelMemory.asInstanceOf[js.Any], kernelVersion = kernelVersion.asInstanceOf[js.Any], labels = labels.asInstanceOf[js.Any], liveRestoreEnabled = liveRestoreEnabled.asInstanceOf[js.Any], loggingDriver = loggingDriver.asInstanceOf[js.Any], memTotal = memTotal.asInstanceOf[js.Any], memoryLimit = memoryLimit.asInstanceOf[js.Any], nEventsListener = nEventsListener.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], ncpu = ncpu.asInstanceOf[js.Any], nfd = nfd.asInstanceOf[js.Any], ngoroutines = ngoroutines.asInstanceOf[js.Any], noProxy = noProxy.asInstanceOf[js.Any], oomKillDisable = oomKillDisable.asInstanceOf[js.Any], operatingSystem = operatingSystem.asInstanceOf[js.Any], osType = osType.asInstanceOf[js.Any], productLicense = productLicense.asInstanceOf[js.Any], serverVersion = serverVersion.asInstanceOf[js.Any], swapLimit = swapLimit.asInstanceOf[js.Any], systemTime = systemTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[DockerInfoData]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DockerInfoData] (val x: Self) extends AnyVal {
    
    inline def setArchitecture(value: String): Self = StObject.set(x, "architecture", value.asInstanceOf[js.Any])
    
    inline def setBridgeNfIp6tables(value: Boolean): Self = StObject.set(x, "bridgeNfIp6tables", value.asInstanceOf[js.Any])
    
    inline def setBridgeNfIptables(value: Boolean): Self = StObject.set(x, "bridgeNfIptables", value.asInstanceOf[js.Any])
    
    inline def setCgroupDriver(value: String): Self = StObject.set(x, "cgroupDriver", value.asInstanceOf[js.Any])
    
    inline def setClusterAdvertise(value: String): Self = StObject.set(x, "clusterAdvertise", value.asInstanceOf[js.Any])
    
    inline def setClusterStore(value: String): Self = StObject.set(x, "clusterStore", value.asInstanceOf[js.Any])
    
    inline def setContainers(value: Double): Self = StObject.set(x, "containers", value.asInstanceOf[js.Any])
    
    inline def setContainersPaused(value: Double): Self = StObject.set(x, "containersPaused", value.asInstanceOf[js.Any])
    
    inline def setContainersRunning(value: Double): Self = StObject.set(x, "containersRunning", value.asInstanceOf[js.Any])
    
    inline def setContainersStopped(value: Double): Self = StObject.set(x, "containersStopped", value.asInstanceOf[js.Any])
    
    inline def setCpuCfsPeriod(value: Boolean): Self = StObject.set(x, "cpuCfsPeriod", value.asInstanceOf[js.Any])
    
    inline def setCpuCfsQuota(value: Boolean): Self = StObject.set(x, "cpuCfsQuota", value.asInstanceOf[js.Any])
    
    inline def setCpuSet(value: Boolean): Self = StObject.set(x, "cpuSet", value.asInstanceOf[js.Any])
    
    inline def setCpuShares(value: Boolean): Self = StObject.set(x, "cpuShares", value.asInstanceOf[js.Any])
    
    inline def setDebug(value: Boolean): Self = StObject.set(x, "debug", value.asInstanceOf[js.Any])
    
    inline def setDefaultRuntime(value: String): Self = StObject.set(x, "defaultRuntime", value.asInstanceOf[js.Any])
    
    inline def setDockerRootDir(value: String): Self = StObject.set(x, "dockerRootDir", value.asInstanceOf[js.Any])
    
    inline def setDriver(value: String): Self = StObject.set(x, "driver", value.asInstanceOf[js.Any])
    
    inline def setExperimentalBuild(value: Boolean): Self = StObject.set(x, "experimentalBuild", value.asInstanceOf[js.Any])
    
    inline def setHttpProxy(value: String): Self = StObject.set(x, "httpProxy", value.asInstanceOf[js.Any])
    
    inline def setHttpsProxy(value: String): Self = StObject.set(x, "httpsProxy", value.asInstanceOf[js.Any])
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setImages(value: Double): Self = StObject.set(x, "images", value.asInstanceOf[js.Any])
    
    inline def setInitBinary(value: String): Self = StObject.set(x, "initBinary", value.asInstanceOf[js.Any])
    
    inline def setIpv4Forwarding(value: Boolean): Self = StObject.set(x, "ipv4Forwarding", value.asInstanceOf[js.Any])
    
    inline def setIsolation(value: String): Self = StObject.set(x, "isolation", value.asInstanceOf[js.Any])
    
    inline def setKernelMemory(value: Boolean): Self = StObject.set(x, "kernelMemory", value.asInstanceOf[js.Any])
    
    inline def setKernelVersion(value: String): Self = StObject.set(x, "kernelVersion", value.asInstanceOf[js.Any])
    
    inline def setLabels(value: js.Array[String]): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
    
    inline def setLabelsVarargs(value: String*): Self = StObject.set(x, "labels", js.Array(value*))
    
    inline def setLiveRestoreEnabled(value: Boolean): Self = StObject.set(x, "liveRestoreEnabled", value.asInstanceOf[js.Any])
    
    inline def setLoggingDriver(value: String): Self = StObject.set(x, "loggingDriver", value.asInstanceOf[js.Any])
    
    inline def setMemTotal(value: Double): Self = StObject.set(x, "memTotal", value.asInstanceOf[js.Any])
    
    inline def setMemoryLimit(value: Boolean): Self = StObject.set(x, "memoryLimit", value.asInstanceOf[js.Any])
    
    inline def setNEventsListener(value: Double): Self = StObject.set(x, "nEventsListener", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNcpu(value: Double): Self = StObject.set(x, "ncpu", value.asInstanceOf[js.Any])
    
    inline def setNfd(value: Double): Self = StObject.set(x, "nfd", value.asInstanceOf[js.Any])
    
    inline def setNgoroutines(value: Double): Self = StObject.set(x, "ngoroutines", value.asInstanceOf[js.Any])
    
    inline def setNoProxy(value: String): Self = StObject.set(x, "noProxy", value.asInstanceOf[js.Any])
    
    inline def setOomKillDisable(value: Boolean): Self = StObject.set(x, "oomKillDisable", value.asInstanceOf[js.Any])
    
    inline def setOperatingSystem(value: String): Self = StObject.set(x, "operatingSystem", value.asInstanceOf[js.Any])
    
    inline def setOsType(value: String): Self = StObject.set(x, "osType", value.asInstanceOf[js.Any])
    
    inline def setProductLicense(value: String): Self = StObject.set(x, "productLicense", value.asInstanceOf[js.Any])
    
    inline def setServerVersion(value: String): Self = StObject.set(x, "serverVersion", value.asInstanceOf[js.Any])
    
    inline def setSwapLimit(value: Boolean): Self = StObject.set(x, "swapLimit", value.asInstanceOf[js.Any])
    
    inline def setSystemTime(value: String): Self = StObject.set(x, "systemTime", value.asInstanceOf[js.Any])
  }
}
