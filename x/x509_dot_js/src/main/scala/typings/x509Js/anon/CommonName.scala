package typings.x509Js.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CommonName extends js.Object {
  var commonName: String
}

object CommonName {
  @scala.inline
  def apply(commonName: String): CommonName = {
    val __obj = js.Dynamic.literal(commonName = commonName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CommonName]
  }
}

