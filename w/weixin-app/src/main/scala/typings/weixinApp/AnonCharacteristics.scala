package typings.weixinApp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCharacteristics extends js.Object {
  var characteristics: js.Array[AnonProperties]
}

object AnonCharacteristics {
  @scala.inline
  def apply(characteristics: js.Array[AnonProperties]): AnonCharacteristics = {
    val __obj = js.Dynamic.literal(characteristics = characteristics.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonCharacteristics]
  }
}

