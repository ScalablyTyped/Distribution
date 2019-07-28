package typings.yandexDashMoneyDashSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Secret extends js.Object {
  var secret: String
  var serial: String
}

object Anon_Secret {
  @scala.inline
  def apply(secret: String, serial: String): Anon_Secret = {
    val __obj = js.Dynamic.literal(secret = secret, serial = serial)
  
    __obj.asInstanceOf[Anon_Secret]
  }
}

