package typings
package systeminformationLib.systeminformationMod.SysteminformationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CpuData extends js.Object {
  var brand: java.lang.String
  var cache: CpuCacheData
  var cores: scala.Double
  var family: java.lang.String
  var flags: java.lang.String
  var manufacturer: java.lang.String
  var model: java.lang.String
  var revision: java.lang.String
  var speed: java.lang.String
  var speedmax: java.lang.String
  var speedmin: java.lang.String
  var stepping: java.lang.String
  var vendor: java.lang.String
}

object CpuData {
  @scala.inline
  def apply(
    brand: java.lang.String,
    cache: CpuCacheData,
    cores: scala.Double,
    family: java.lang.String,
    flags: java.lang.String,
    manufacturer: java.lang.String,
    model: java.lang.String,
    revision: java.lang.String,
    speed: java.lang.String,
    speedmax: java.lang.String,
    speedmin: java.lang.String,
    stepping: java.lang.String,
    vendor: java.lang.String
  ): CpuData = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("brand")(brand)
    __obj.updateDynamic("cache")(cache)
    __obj.updateDynamic("cores")(cores)
    __obj.updateDynamic("family")(family)
    __obj.updateDynamic("flags")(flags)
    __obj.updateDynamic("manufacturer")(manufacturer)
    __obj.updateDynamic("model")(model)
    __obj.updateDynamic("revision")(revision)
    __obj.updateDynamic("speed")(speed)
    __obj.updateDynamic("speedmax")(speedmax)
    __obj.updateDynamic("speedmin")(speedmin)
    __obj.updateDynamic("stepping")(stepping)
    __obj.updateDynamic("vendor")(vendor)
    __obj.asInstanceOf[CpuData]
  }
}

