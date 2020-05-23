package typings.yandexMoneySdk.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Secret extends js.Object {
  var secret: String
  var serial: String
}

object Secret {
  @scala.inline
  def apply(secret: String, serial: String): Secret = {
    val __obj = js.Dynamic.literal(secret = secret.asInstanceOf[js.Any], serial = serial.asInstanceOf[js.Any])
    __obj.asInstanceOf[Secret]
  }
}

