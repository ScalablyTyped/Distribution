package typings.systeminformation.mod.Systeminformation

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
    val __obj = js.Dynamic.literal(brand = brand.asInstanceOf[js.Any], cache = cache.asInstanceOf[js.Any], cores = cores.asInstanceOf[js.Any], family = family.asInstanceOf[js.Any], flags = flags.asInstanceOf[js.Any], governor = governor.asInstanceOf[js.Any], manufacturer = manufacturer.asInstanceOf[js.Any], model = model.asInstanceOf[js.Any], physicalCores = physicalCores.asInstanceOf[js.Any], processors = processors.asInstanceOf[js.Any], revision = revision.asInstanceOf[js.Any], socket = socket.asInstanceOf[js.Any], speed = speed.asInstanceOf[js.Any], speedmax = speedmax.asInstanceOf[js.Any], speedmin = speedmin.asInstanceOf[js.Any], stepping = stepping.asInstanceOf[js.Any], vendor = vendor.asInstanceOf[js.Any], voltage = voltage.asInstanceOf[js.Any])
    __obj.asInstanceOf[CpuWithFlagsData]
  }
}

