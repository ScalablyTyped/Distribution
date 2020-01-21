package typings.xmldsigjs.x509DataMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IX509IssuerSerial extends js.Object {
  var issuerName: String
  var serialNumber: String
}

object IX509IssuerSerial {
  @scala.inline
  def apply(issuerName: String, serialNumber: String): IX509IssuerSerial = {
    val __obj = js.Dynamic.literal(issuerName = issuerName.asInstanceOf[js.Any], serialNumber = serialNumber.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IX509IssuerSerial]
  }
}

