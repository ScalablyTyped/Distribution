package typings.winrtUwp.Windows.ApplicationModel.Wallet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a wallet verb, which is potentially used for app activation. This is a string suitable for UI that is descriptive of the action. */
@JSGlobal("Windows.ApplicationModel.Wallet.WalletVerb")
@js.native
class WalletVerb protected () extends js.Object {
  /**
    * Initializes a new instance of the WalletVerb class.
    * @param name The name of the custom verb. Sets the value of the Name property.
    */
  def this(name: String) = this()
  /** Gets or sets the custom verb name. */
  var name: String = js.native
}

