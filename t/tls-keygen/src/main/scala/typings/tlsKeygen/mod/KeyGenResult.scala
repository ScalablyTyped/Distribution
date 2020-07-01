package typings.tlsKeygen.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KeyGenResult extends js.Object {
  var cert: String
  var key: String
}

object KeyGenResult {
  @scala.inline
  def apply(cert: String, key: String): KeyGenResult = {
    val __obj = js.Dynamic.literal(cert = cert.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any])
    __obj.asInstanceOf[KeyGenResult]
  }
}

