package typings
package winrtDashUwpLib.WindowsNs.ApplicationModelNs.WalletNs.SystemNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides a static method to get an instance of the system wallet store for this app. */
@JSGlobal("Windows.ApplicationModel.Wallet.System.WalletManagerSystem")
@js.native
abstract class WalletManagerSystem () extends js.Object

/** Provides a static method to get an instance of the system wallet store for this app. */
@JSGlobal("Windows.ApplicationModel.Wallet.System.WalletManagerSystem")
@js.native
object WalletManagerSystem extends js.Object {
  /**
    * Requests an instance of the system wallet store for the app.
    * @return An asynchronous operation that, on successful completion, returns an instance of the default wallet store. If you use Asynchronous programming, the result type is a single WalletItemSystemStore object.
    */
  def requestStoreAsync(): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation[
    winrtDashUwpLib.WindowsNs.ApplicationModelNs.WalletNs.SystemNs.WalletItemSystemStore
  ] = js.native
}

