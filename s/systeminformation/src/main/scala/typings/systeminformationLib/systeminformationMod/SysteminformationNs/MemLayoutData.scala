package typings
package systeminformationLib.systeminformationMod.SysteminformationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MemLayoutData extends js.Object {
  var bank: java.lang.String
  var clockSpeed: scala.Double
  var formFactor: java.lang.String
  var partNum: java.lang.String
  var serialNum: java.lang.String
  var size: scala.Double
  var `type`: java.lang.String
  var voltageConfigured: scala.Double
  var voltageMax: scala.Double
  var voltageMin: scala.Double
}

object MemLayoutData {
  @scala.inline
  def apply(
    bank: java.lang.String,
    clockSpeed: scala.Double,
    formFactor: java.lang.String,
    partNum: java.lang.String,
    serialNum: java.lang.String,
    size: scala.Double,
    `type`: java.lang.String,
    voltageConfigured: scala.Double,
    voltageMax: scala.Double,
    voltageMin: scala.Double
  ): MemLayoutData = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("bank")(bank)
    __obj.updateDynamic("clockSpeed")(clockSpeed)
    __obj.updateDynamic("formFactor")(formFactor)
    __obj.updateDynamic("partNum")(partNum)
    __obj.updateDynamic("serialNum")(serialNum)
    __obj.updateDynamic("size")(size)
    __obj.updateDynamic("voltageConfigured")(voltageConfigured)
    __obj.updateDynamic("voltageMax")(voltageMax)
    __obj.updateDynamic("voltageMin")(voltageMin)
    __obj.asInstanceOf[MemLayoutData]
  }
}

