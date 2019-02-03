package typings
package winrtDashUwpLib.WindowsNs.ApplicationModelNs.WalletNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides a static method to get an instance of the default wallet store for this app. */
@JSGlobal("Windows.ApplicationModel.Wallet.WalletManager")
@js.native
abstract class WalletManager () extends js.Object

/* static members */
@JSGlobal("Windows.ApplicationModel.Wallet.WalletManager")
@js.native
object WalletManager extends js.Object {
  /**
    * Requests an instance of the default wallet store for the app.
    * @return An asynchronous operation that, on successful completion, returns an instance of the default wallet store. If you use Asynchronous programming, the result type is a single WalletItemStore object.
    */
  def requestStoreAsync(): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation[winrtDashUwpLib.WindowsNs.ApplicationModelNs.WalletNs.WalletItemStore] = js.native
}

