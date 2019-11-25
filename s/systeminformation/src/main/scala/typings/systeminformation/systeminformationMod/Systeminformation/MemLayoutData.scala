package typings.systeminformation.systeminformationMod.Systeminformation

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
    val __obj = js.Dynamic.literal(bank = bank.asInstanceOf[js.Any], clockSpeed = clockSpeed.asInstanceOf[js.Any], formFactor = formFactor.asInstanceOf[js.Any], partNum = partNum.asInstanceOf[js.Any], serialNum = serialNum.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], voltageConfigured = voltageConfigured.asInstanceOf[js.Any], voltageMax = voltageMax.asInstanceOf[js.Any], voltageMin = voltageMin.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[MemLayoutData]
  }
}

