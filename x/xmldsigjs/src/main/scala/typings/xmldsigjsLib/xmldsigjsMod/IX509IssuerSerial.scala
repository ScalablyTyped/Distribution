package typings
package xmldsigjsLib.xmldsigjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IX509IssuerSerial extends js.Object {
  var issuerName: java.lang.String
  var serialNumber: java.lang.String
}

object IX509IssuerSerial {
  @scala.inline
  def apply(issuerName: java.lang.String, serialNumber: java.lang.String): IX509IssuerSerial = {
    val __obj = js.Dynamic.literal(issuerName = issuerName, serialNumber = serialNumber)
  
    __obj.asInstanceOf[IX509IssuerSerial]
  }
}

