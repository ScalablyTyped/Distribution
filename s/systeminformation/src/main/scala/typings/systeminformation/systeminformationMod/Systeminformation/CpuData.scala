package typings.systeminformation.systeminformationMod.Systeminformation

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// 3. CPU, Memory, Disks, Battery, Graphics
trait CpuData extends js.Object {
  var brand: String
  var cache: CpuCacheData
  var cores: Double
  var family: String
  var governor: String
  var manufacturer: String
  var model: String
  var physicalCores: Double
  var processors: Double
  var revision: String
  var socket: String
  var speed: String
  var speedmax: String
  var speedmin: String
  var stepping: String
  var vendor: String
  var voltage: String
}

object CpuData {
  @scala.inline
  def apply(
    brand: String,
    cache: CpuCacheData,
    cores: Double,
    family: String,
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
  ): CpuData = {
    val __obj = js.Dynamic.literal(brand = brand, cache = cache, cores = cores, family = family, governor = governor, manufacturer = manufacturer, model = model, physicalCores = physicalCores, processors = processors, revision = revision, socket = socket, speed = speed, speedmax = speedmax, speedmin = speedmin, stepping = stepping, vendor = vendor, voltage = voltage)
  
    __obj.asInstanceOf[CpuData]
  }
}

