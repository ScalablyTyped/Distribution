package typings.systeminformation.systeminformationMod.SysteminformationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MemLayoutData extends js.Object {
  var bank: String
  var clockSpeed: Double
  var formFactor: String
  var partNum: String
  var serialNum: String
  var size: Double
  var `type`: String
  var voltageConfigured: Double
  var voltageMax: Double
  var voltageMin: Double
}

object MemLayoutData {
  @scala.inline
  def apply(
    bank: String,
    clockSpeed: Double,
    formFactor: String,
    partNum: String,
    serialNum: String,
    size: Double,
    `type`: String,
    voltageConfigured: Double,
    voltageMax: Double,
    voltageMin: Double
  ): MemLayoutData = {
    val __obj = js.Dynamic.literal(bank = bank, clockSpeed = clockSpeed, formFactor = formFactor, partNum = partNum, serialNum = serialNum, size = size, voltageConfigured = voltageConfigured, voltageMax = voltageMax, voltageMin = voltageMin)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[MemLayoutData]
  }
}

