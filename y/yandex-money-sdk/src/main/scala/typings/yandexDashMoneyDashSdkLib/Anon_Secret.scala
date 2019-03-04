package typings
package yandexDashMoneyDashSdkLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Secret extends js.Object {
  var secret: java.lang.String
  var serial: java.lang.String
}

object Anon_Secret {
  @scala.inline
  def apply(secret: java.lang.String, serial: java.lang.String): Anon_Secret = {
    val __obj = js.Dynamic.literal(secret = secret, serial = serial)
  
    __obj.asInstanceOf[Anon_Secret]
  }
}

