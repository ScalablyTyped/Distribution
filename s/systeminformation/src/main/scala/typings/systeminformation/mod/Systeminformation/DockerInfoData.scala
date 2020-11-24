package typings.systeminformation.mod.Systeminformation

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// 8. Docker
@js.native
trait DockerInfoData extends js.Object {
  
  var architecture: String = js.native
  
  var bridgeNfIp6tables: Boolean = js.native
  
  var bridgeNfIptables: Boolean = js.native
  
  var cgroupDriver: String = js.native
  
  var clusterAdvertise: String = js.native
  
  var clusterStore: String = js.native
  
  var containers: Double = js.native
  
  var containersPaused: Double = js.native
  
  var containersRunning: Double = js.native
  
  var containersStopped: Double = js.native
  
  var cpuCfsPeriod: Boolean = js.native
  
  var cpuCfsQuota: Boolean = js.native
  
  var cpuSet: Boolean = js.native
  
  var cpuShares: Boolean = js.native
  
  var debug: Boolean = js.native
  
  var defaultRuntime: String = js.native
  
  var dockerRootDir: String = js.native
  
  var driver: String = js.native
  
  var experimentalBuild: Boolean = js.native
  
  var httpProxy: String = js.native
  
  var httpsProxy: String = js.native
  
  var id: String = js.native
  
  var images: Double = js.native
  
  var initBinary: String = js.native
  
  var ipv4Forwarding: Boolean = js.native
  
  var isolation: String = js.native
  
  var kernelMemory: Boolean = js.native
  
  var kernelVersion: String = js.native
  
  var labels: js.Array[String] = js.native
  
  var liveRestoreEnabled: Boolean = js.native
  
  var loggingDriver: String = js.native
  
  var memTotal: Double = js.native
  
  var memoryLimit: Boolean = js.native
  
  var mfd: Double = js.native
  
  var nEventsListener: Double = js.native
  
  var name: String = js.native
  
  var ncpu: Double = js.native
  
  var ngoroutines: Double = js.native
  
  var noProxy: String = js.native
  
  var oomKillDisable: Boolean = js.native
  
  var operatingSystem: String = js.native
  
  var osType: String = js.native
  
  var productLicense: String = js.native
  
  var serverVersion: String = js.native
  
  var swapLimit: Boolean = js.native
  
  var systemTime: String = js.native
}
object DockerInfoData {
  
  @scala.inline
  def apply(
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
    mfd: Double,
    nEventsListener: Double,
    name: String,
    ncpu: Double,
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
    val __obj = js.Dynamic.literal(architecture = architecture.asInstanceOf[js.Any], bridgeNfIp6tables = bridgeNfIp6tables.asInstanceOf[js.Any], bridgeNfIptables = bridgeNfIptables.asInstanceOf[js.Any], cgroupDriver = cgroupDriver.asInstanceOf[js.Any], clusterAdvertise = clusterAdvertise.asInstanceOf[js.Any], clusterStore = clusterStore.asInstanceOf[js.Any], containers = containers.asInstanceOf[js.Any], containersPaused = containersPaused.asInstanceOf[js.Any], containersRunning = containersRunning.asInstanceOf[js.Any], containersStopped = containersStopped.asInstanceOf[js.Any], cpuCfsPeriod = cpuCfsPeriod.asInstanceOf[js.Any], cpuCfsQuota = cpuCfsQuota.asInstanceOf[js.Any], cpuSet = cpuSet.asInstanceOf[js.Any], cpuShares = cpuShares.asInstanceOf[js.Any], debug = debug.asInstanceOf[js.Any], defaultRuntime = defaultRuntime.asInstanceOf[js.Any], dockerRootDir = dockerRootDir.asInstanceOf[js.Any], driver = driver.asInstanceOf[js.Any], experimentalBuild = experimentalBuild.asInstanceOf[js.Any], httpProxy = httpProxy.asInstanceOf[js.Any], httpsProxy = httpsProxy.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], images = images.asInstanceOf[js.Any], initBinary = initBinary.asInstanceOf[js.Any], ipv4Forwarding = ipv4Forwarding.asInstanceOf[js.Any], isolation = isolation.asInstanceOf[js.Any], kernelMemory = kernelMemory.asInstanceOf[js.Any], kernelVersion = kernelVersion.asInstanceOf[js.Any], labels = labels.asInstanceOf[js.Any], liveRestoreEnabled = liveRestoreEnabled.asInstanceOf[js.Any], loggingDriver = loggingDriver.asInstanceOf[js.Any], memTotal = memTotal.asInstanceOf[js.Any], memoryLimit = memoryLimit.asInstanceOf[js.Any], mfd = mfd.asInstanceOf[js.Any], nEventsListener = nEventsListener.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], ncpu = ncpu.asInstanceOf[js.Any], ngoroutines = ngoroutines.asInstanceOf[js.Any], noProxy = noProxy.asInstanceOf[js.Any], oomKillDisable = oomKillDisable.asInstanceOf[js.Any], operatingSystem = operatingSystem.asInstanceOf[js.Any], osType = osType.asInstanceOf[js.Any], productLicense = productLicense.asInstanceOf[js.Any], serverVersion = serverVersion.asInstanceOf[js.Any], swapLimit = swapLimit.asInstanceOf[js.Any], systemTime = systemTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[DockerInfoData]
  }
  
  @scala.inline
  implicit class DockerInfoDataOps[Self <: DockerInfoData] (val x: Self) extends AnyVal {
    
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
    def setArchitecture(value: String): Self = this.set("architecture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBridgeNfIp6tables(value: Boolean): Self = this.set("bridgeNfIp6tables", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBridgeNfIptables(value: Boolean): Self = this.set("bridgeNfIptables", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCgroupDriver(value: String): Self = this.set("cgroupDriver", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClusterAdvertise(value: String): Self = this.set("clusterAdvertise", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClusterStore(value: String): Self = this.set("clusterStore", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContainers(value: Double): Self = this.set("containers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContainersPaused(value: Double): Self = this.set("containersPaused", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContainersRunning(value: Double): Self = this.set("containersRunning", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContainersStopped(value: Double): Self = this.set("containersStopped", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCpuCfsPeriod(value: Boolean): Self = this.set("cpuCfsPeriod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCpuCfsQuota(value: Boolean): Self = this.set("cpuCfsQuota", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCpuSet(value: Boolean): Self = this.set("cpuSet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCpuShares(value: Boolean): Self = this.set("cpuShares", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDebug(value: Boolean): Self = this.set("debug", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultRuntime(value: String): Self = this.set("defaultRuntime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDockerRootDir(value: String): Self = this.set("dockerRootDir", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDriver(value: String): Self = this.set("driver", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExperimentalBuild(value: Boolean): Self = this.set("experimentalBuild", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHttpProxy(value: String): Self = this.set("httpProxy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHttpsProxy(value: String): Self = this.set("httpsProxy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImages(value: Double): Self = this.set("images", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInitBinary(value: String): Self = this.set("initBinary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIpv4Forwarding(value: Boolean): Self = this.set("ipv4Forwarding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsolation(value: String): Self = this.set("isolation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKernelMemory(value: Boolean): Self = this.set("kernelMemory", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKernelVersion(value: String): Self = this.set("kernelVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelsVarargs(value: String*): Self = this.set("labels", js.Array(value :_*))
    
    @scala.inline
    def setLabels(value: js.Array[String]): Self = this.set("labels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLiveRestoreEnabled(value: Boolean): Self = this.set("liveRestoreEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoggingDriver(value: String): Self = this.set("loggingDriver", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMemTotal(value: Double): Self = this.set("memTotal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMemoryLimit(value: Boolean): Self = this.set("memoryLimit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMfd(value: Double): Self = this.set("mfd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNEventsListener(value: Double): Self = this.set("nEventsListener", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNcpu(value: Double): Self = this.set("ncpu", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNgoroutines(value: Double): Self = this.set("ngoroutines", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNoProxy(value: String): Self = this.set("noProxy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOomKillDisable(value: Boolean): Self = this.set("oomKillDisable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOperatingSystem(value: String): Self = this.set("operatingSystem", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOsType(value: String): Self = this.set("osType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProductLicense(value: String): Self = this.set("productLicense", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServerVersion(value: String): Self = this.set("serverVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSwapLimit(value: Boolean): Self = this.set("swapLimit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSystemTime(value: String): Self = this.set("systemTime", value.asInstanceOf[js.Any])
  }
}
