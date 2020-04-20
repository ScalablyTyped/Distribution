package typings.superagent

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonPassphrase extends js.Object {
  var passphrase: String
  var pfx: String | Buffer
}

object AnonPassphrase {
  @scala.inline
  def apply(passphrase: String, pfx: String | Buffer): AnonPassphrase = {
    val __obj = js.Dynamic.literal(passphrase = passphrase.asInstanceOf[js.Any], pfx = pfx.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonPassphrase]
  }
}

