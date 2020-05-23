package typings.winrtUwp.Windows.ApplicationModel.Wallet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a wallet verb, which is potentially used for app activation. This is a string suitable for UI that is descriptive of the action. */
trait WalletVerb extends js.Object {
  /** Gets or sets the custom verb name. */
  var name: String
}

object WalletVerb {
  @scala.inline
  def apply(name: String): WalletVerb = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[WalletVerb]
  }
}

