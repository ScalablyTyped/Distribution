package typings.tlsKeygen.mod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EphemeralResult extends js.Object {
  var cert: Buffer
  var key: Buffer
}

object EphemeralResult {
  @scala.inline
  def apply(cert: Buffer, key: Buffer): EphemeralResult = {
    val __obj = js.Dynamic.literal(cert = cert.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any])
    __obj.asInstanceOf[EphemeralResult]
  }
}

