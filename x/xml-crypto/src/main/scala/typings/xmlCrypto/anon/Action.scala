package typings.xmlCrypto.anon

import typings.xmlCrypto.xmlCryptoStrings.after
import typings.xmlCrypto.xmlCryptoStrings.append
import typings.xmlCrypto.xmlCryptoStrings.before
import typings.xmlCrypto.xmlCryptoStrings.prepend
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Action extends js.Object {
  var action: append | prepend | before | after
  var reference: String
}

object Action {
  @scala.inline
  def apply(action: append | prepend | before | after, reference: String): Action = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], reference = reference.asInstanceOf[js.Any])
    __obj.asInstanceOf[Action]
  }
}

