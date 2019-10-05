package typings.systeminformation.systeminformationMod.Systeminformation

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CpuData extends js.Object {
  var brand: String
  var cache: CpuCacheData
  var cores: Double
  var family: String
  var flags: String
  var manufacturer: String
  var model: String
  var revision: String
  var speed: String
  var speedmax: String
  var speedmin: String
  var stepping: String
  var vendor: String
}

object CpuData {
  @scala.inline
  def apply(
    brand: String,
    cache: CpuCacheData,
    cores: Double,
    family: String,
    flags: String,
    manufacturer: String,
    model: String,
    revision: String,
    speed: String,
    speedmax: String,
    speedmin: String,
    stepping: String,
    vendor: String
  ): CpuData = {
    val __obj = js.Dynamic.literal(brand = brand, cache = cache, cores = cores, family = family, flags = flags, manufacturer = manufacturer, model = model, revision = revision, speed = speed, speedmax = speedmax, speedmin = speedmin, stepping = stepping, vendor = vendor)
  
    __obj.asInstanceOf[CpuData]
  }
}

