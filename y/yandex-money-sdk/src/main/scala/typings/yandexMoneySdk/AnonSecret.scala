package typings.yandexMoneySdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonSecret extends js.Object {
  var secret: String
  var serial: String
}

object AnonSecret {
  @scala.inline
  def apply(secret: String, serial: String): AnonSecret = {
    val __obj = js.Dynamic.literal(secret = secret.asInstanceOf[js.Any], serial = serial.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonSecret]
  }
}

