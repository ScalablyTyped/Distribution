package typings.weixinApp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCharacteristic extends js.Object {
  var characteristic: AnonCharacteristicId
}

object AnonCharacteristic {
  @scala.inline
  def apply(characteristic: AnonCharacteristicId): AnonCharacteristic = {
    val __obj = js.Dynamic.literal(characteristic = characteristic.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonCharacteristic]
  }
}

