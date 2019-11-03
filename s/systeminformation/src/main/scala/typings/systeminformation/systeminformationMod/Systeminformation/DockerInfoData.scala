package typings.systeminformation.systeminformationMod.Systeminformation

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
    val __obj = js.Dynamic.literal(architecture = architecture, bridgeNfIp6tables = bridgeNfIp6tables, bridgeNfIptables = bridgeNfIptables, cgroupDriver = cgroupDriver, clusterAdvertise = clusterAdvertise, clusterStore = clusterStore, containers = containers, containersPaused = containersPaused, containersRunning = containersRunning, containersStopped = containersStopped, cpuCfsPeriod = cpuCfsPeriod, cpuCfsQuota = cpuCfsQuota, cpuSet = cpuSet, cpuShares = cpuShares, debug = debug, defaultRuntime = defaultRuntime, dockerRootDir = dockerRootDir, driver = driver, experimentalBuild = experimentalBuild, httpProxy = httpProxy, httpsProxy = httpsProxy, id = id, images = images, initBinary = initBinary, ipv4Forwarding = ipv4Forwarding, isolation = isolation, kernelMemory = kernelMemory, kernelVersion = kernelVersion, labels = labels, liveRestoreEnabled = liveRestoreEnabled, loggingDriver = loggingDriver, memTotal = memTotal, memoryLimit = memoryLimit, mfd = mfd, nEventsListener = nEventsListener, name = name, ncpu = ncpu, ngoroutines = ngoroutines, noProxy = noProxy, oomKillDisable = oomKillDisable, operatingSystem = operatingSystem, osType = osType, productLicense = productLicense, serverVersion = serverVersion, swapLimit = swapLimit, systemTime = systemTime)
  
    __obj.asInstanceOf[DockerInfoData]
  }
}

