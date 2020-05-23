package typings.superagent.anon

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Passphrase extends js.Object {
  var passphrase: String
  var pfx: String | Buffer
}

object Passphrase {
  @scala.inline
  def apply(passphrase: String, pfx: String | Buffer): Passphrase = {
    val __obj = js.Dynamic.literal(passphrase = passphrase.asInstanceOf[js.Any], pfx = pfx.asInstanceOf[js.Any])
    __obj.asInstanceOf[Passphrase]
  }
}

