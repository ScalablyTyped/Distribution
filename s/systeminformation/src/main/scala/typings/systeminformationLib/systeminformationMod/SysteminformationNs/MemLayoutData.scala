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
    val __obj = js.Dynamic.literal(bank = bank, clockSpeed = clockSpeed, formFactor = formFactor, partNum = partNum, serialNum = serialNum, size = size, voltageConfigured = voltageConfigured, voltageMax = voltageMax, voltageMin = voltageMin)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[MemLayoutData]
  }
}

