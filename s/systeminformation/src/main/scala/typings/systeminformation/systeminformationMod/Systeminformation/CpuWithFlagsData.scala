package typings.systeminformation.systeminformationMod.Systeminformation

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CpuWithFlagsData extends CpuData {
  var flags: String
}

object CpuWithFlagsData {
  @scala.inline
  def apply(
    brand: String,
    cache: CpuCacheData,
    cores: Double,
    family: String,
    flags: String,
    governor: String,
    manufacturer: String,
    model: String,
    physicalCores: Double,
    processors: Double,
    revision: String,
    socket: String,
    speed: String,
    speedmax: String,
    speedmin: String,
    stepping: String,
    vendor: String,
    voltage: String
  ): CpuWithFlagsData = {
    val __obj = js.Dynamic.literal(brand = brand, cache = cache, cores = cores, family = family, flags = flags, governor = governor, manufacturer = manufacturer, model = model, physicalCores = physicalCores, processors = processors, revision = revision, socket = socket, speed = speed, speedmax = speedmax, speedmin = speedmin, stepping = stepping, vendor = vendor, voltage = voltage)
  
    __obj.asInstanceOf[CpuWithFlagsData]
  }
}

