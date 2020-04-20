package typings.x509Js

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCommonName extends js.Object {
  var commonName: String
}

object AnonCommonName {
  @scala.inline
  def apply(commonName: String): AnonCommonName = {
    val __obj = js.Dynamic.literal(commonName = commonName.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCommonName]
  }
}

