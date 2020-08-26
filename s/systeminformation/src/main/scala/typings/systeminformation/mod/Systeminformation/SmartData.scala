package typings.systeminformation.mod.Systeminformation

import typings.systeminformation.anon.Argv
import typings.systeminformation.anon.Current
import typings.systeminformation.anon.Hours
import typings.systeminformation.anon.Infoname
import typings.systeminformation.anon.Passed
import typings.systeminformation.anon.Revision
import typings.systeminformation.anon.Standard
import typings.systeminformation.anon.Summary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SmartData extends js.Object {
  var ata_smart_attributes: Revision = js.native
  var ata_smart_error_log: Summary = js.native
  var ata_smart_self_test_log: Standard = js.native
  var device: Infoname = js.native
  var json_format_version: js.Array[Double] = js.native
  var power_cycle_count: Double = js.native
  var power_on_time: Hours = js.native
  var smart_status: Passed = js.native
  var smartctl: Argv = js.native
  var temperature: Current = js.native
}

object SmartData {
  @scala.inline
  def apply(
    ata_smart_attributes: Revision,
    ata_smart_error_log: Summary,
    ata_smart_self_test_log: Standard,
    device: Infoname,
    json_format_version: js.Array[Double],
    power_cycle_count: Double,
    power_on_time: Hours,
    smart_status: Passed,
    smartctl: Argv,
    temperature: Current
  ): SmartData = {
    val __obj = js.Dynamic.literal(ata_smart_attributes = ata_smart_attributes.asInstanceOf[js.Any], ata_smart_error_log = ata_smart_error_log.asInstanceOf[js.Any], ata_smart_self_test_log = ata_smart_self_test_log.asInstanceOf[js.Any], device = device.asInstanceOf[js.Any], json_format_version = json_format_version.asInstanceOf[js.Any], power_cycle_count = power_cycle_count.asInstanceOf[js.Any], power_on_time = power_on_time.asInstanceOf[js.Any], smart_status = smart_status.asInstanceOf[js.Any], smartctl = smartctl.asInstanceOf[js.Any], temperature = temperature.asInstanceOf[js.Any])
    __obj.asInstanceOf[SmartData]
  }
  @scala.inline
  implicit class SmartDataOps[Self <: SmartData] (val x: Self) extends AnyVal {
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
    def setAta_smart_attributes(value: Revision): Self = this.set("ata_smart_attributes", value.asInstanceOf[js.Any])
    @scala.inline
    def setAta_smart_error_log(value: Summary): Self = this.set("ata_smart_error_log", value.asInstanceOf[js.Any])
    @scala.inline
    def setAta_smart_self_test_log(value: Standard): Self = this.set("ata_smart_self_test_log", value.asInstanceOf[js.Any])
    @scala.inline
    def setDevice(value: Infoname): Self = this.set("device", value.asInstanceOf[js.Any])
    @scala.inline
    def setJson_format_versionVarargs(value: Double*): Self = this.set("json_format_version", js.Array(value :_*))
    @scala.inline
    def setJson_format_version(value: js.Array[Double]): Self = this.set("json_format_version", value.asInstanceOf[js.Any])
    @scala.inline
    def setPower_cycle_count(value: Double): Self = this.set("power_cycle_count", value.asInstanceOf[js.Any])
    @scala.inline
    def setPower_on_time(value: Hours): Self = this.set("power_on_time", value.asInstanceOf[js.Any])
    @scala.inline
    def setSmart_status(value: Passed): Self = this.set("smart_status", value.asInstanceOf[js.Any])
    @scala.inline
    def setSmartctl(value: Argv): Self = this.set("smartctl", value.asInstanceOf[js.Any])
    @scala.inline
    def setTemperature(value: Current): Self = this.set("temperature", value.asInstanceOf[js.Any])
  }
  
}

