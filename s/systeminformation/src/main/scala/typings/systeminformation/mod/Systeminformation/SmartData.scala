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

trait SmartData extends js.Object {
  var ata_smart_attributes: Revision
  var ata_smart_error_log: Summary
  var ata_smart_self_test_log: Standard
  var device: Infoname
  var json_format_version: js.Array[Double]
  var power_cycle_count: Double
  var power_on_time: Hours
  var smart_status: Passed
  var smartctl: Argv
  var temperature: Current
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
}

