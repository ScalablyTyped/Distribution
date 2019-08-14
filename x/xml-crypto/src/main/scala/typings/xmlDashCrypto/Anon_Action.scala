package typings.xmlDashCrypto

import typings.xmlDashCrypto.xmlDashCryptoStrings.after
import typings.xmlDashCrypto.xmlDashCryptoStrings.append
import typings.xmlDashCrypto.xmlDashCryptoStrings.before
import typings.xmlDashCrypto.xmlDashCryptoStrings.prepend
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Action extends js.Object {
  var action: append | prepend | before | after
  var reference: String
}

object Anon_Action {
  @scala.inline
  def apply(action: append | prepend | before | after, reference: String): Anon_Action = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], reference = reference)
  
    __obj.asInstanceOf[Anon_Action]
  }
}

