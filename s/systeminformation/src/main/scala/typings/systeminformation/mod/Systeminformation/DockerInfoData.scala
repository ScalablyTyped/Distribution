package typings.systeminformation.mod.Systeminformation

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// 8. Docker
trait DockerInfoData extends js.Object {
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
  var mfd: Double
  var nEventsListener: Double
  var name: String
  var ncpu: Double
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
}

