package typings.systeminformation.mod.Systeminformation

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// 3. CPU, Memory, Disks, Battery, Graphics
@js.native
trait CpuData extends js.Object {
  var brand: String = js.native
  var cache: CpuCacheData = js.native
  var cores: Double = js.native
  var family: String = js.native
  var governor: String = js.native
  var manufacturer: String = js.native
  var model: String = js.native
  var physicalCores: Double = js.native
  var processors: Double = js.native
  var revision: String = js.native
  var socket: String = js.native
  var speed: String = js.native
  var speedmax: String = js.native
  var speedmin: String = js.native
  var stepping: String = js.native
  var vendor: String = js.native
  var voltage: String = js.native
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
    val __obj = js.Dynamic.literal(brand = brand.asInstanceOf[js.Any], cache = cache.asInstanceOf[js.Any], cores = cores.asInstanceOf[js.Any], family = family.asInstanceOf[js.Any], governor = governor.asInstanceOf[js.Any], manufacturer = manufacturer.asInstanceOf[js.Any], model = model.asInstanceOf[js.Any], physicalCores = physicalCores.asInstanceOf[js.Any], processors = processors.asInstanceOf[js.Any], revision = revision.asInstanceOf[js.Any], socket = socket.asInstanceOf[js.Any], speed = speed.asInstanceOf[js.Any], speedmax = speedmax.asInstanceOf[js.Any], speedmin = speedmin.asInstanceOf[js.Any], stepping = stepping.asInstanceOf[js.Any], vendor = vendor.asInstanceOf[js.Any], voltage = voltage.asInstanceOf[js.Any])
    __obj.asInstanceOf[CpuData]
  }
  @scala.inline
  implicit class CpuDataOps[Self <: CpuData] (val x: Self) extends AnyVal {
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
    def setBrand(value: String): Self = this.set("brand", value.asInstanceOf[js.Any])
    @scala.inline
    def setCache(value: CpuCacheData): Self = this.set("cache", value.asInstanceOf[js.Any])
    @scala.inline
    def setCores(value: Double): Self = this.set("cores", value.asInstanceOf[js.Any])
    @scala.inline
    def setFamily(value: String): Self = this.set("family", value.asInstanceOf[js.Any])
    @scala.inline
    def setGovernor(value: String): Self = this.set("governor", value.asInstanceOf[js.Any])
    @scala.inline
    def setManufacturer(value: String): Self = this.set("manufacturer", value.asInstanceOf[js.Any])
    @scala.inline
    def setModel(value: String): Self = this.set("model", value.asInstanceOf[js.Any])
    @scala.inline
    def setPhysicalCores(value: Double): Self = this.set("physicalCores", value.asInstanceOf[js.Any])
    @scala.inline
    def setProcessors(value: Double): Self = this.set("processors", value.asInstanceOf[js.Any])
    @scala.inline
    def setRevision(value: String): Self = this.set("revision", value.asInstanceOf[js.Any])
    @scala.inline
    def setSocket(value: String): Self = this.set("socket", value.asInstanceOf[js.Any])
    @scala.inline
    def setSpeed(value: String): Self = this.set("speed", value.asInstanceOf[js.Any])
    @scala.inline
    def setSpeedmax(value: String): Self = this.set("speedmax", value.asInstanceOf[js.Any])
    @scala.inline
    def setSpeedmin(value: String): Self = this.set("speedmin", value.asInstanceOf[js.Any])
    @scala.inline
    def setStepping(value: String): Self = this.set("stepping", value.asInstanceOf[js.Any])
    @scala.inline
    def setVendor(value: String): Self = this.set("vendor", value.asInstanceOf[js.Any])
    @scala.inline
    def setVoltage(value: String): Self = this.set("voltage", value.asInstanceOf[js.Any])
  }
  
}

