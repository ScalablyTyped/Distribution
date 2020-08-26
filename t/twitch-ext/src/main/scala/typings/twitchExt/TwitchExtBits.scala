package typings.twitchExt

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @see TwitchExt.bits
  */
@js.native
trait TwitchExtBits extends js.Object {
  /**
    * This function returns a promise which resolves to an array of products available for Bits,
    * for the extension, if the context supports Bits in Extensions actions. Otherwise, the
    * promise rejects with an error; this can occur, for instance, if the extension is running in
    * an older version of the developer rig or the mobile app, which does not support Bits in
    * Extensions actions.
    *
    * @see https://dev.twitch.tv/docs/extensions/bits/#getproducts
    */
  def getProducts(): js.Promise[js.Array[TwitchExtBitsProduct]] = js.native
  /**
    * This function takes a callback that is fired whenever a transaction is cancelled.
    * @param callback The callback that is fired whenever a transaction is cancelled.
    *
    * @see https://dev.twitch.tv/docs/extensions/bits/#ontransactioncancelledcallback
    */
  def onTransactionCancelled(callback: js.Function0[Unit]): Unit = js.native
  /**
    * This function registers a callback that is fired whenever a Bits in Extensions transaction
    * is completed.
    * @param callback The callback that is fired.
    *
    * @see https://dev.twitch.tv/docs/extensions/bits/#ontransactioncompletecallbacktransactionobject
    */
  def onTransactionComplete(callback: js.Function1[/* transaction */ TwitchExtBitsTransaction, Unit]): Unit = js.native
  /**
    * This function sets the state of the extension helper, so it does not call live services for
    * usage of Bits. Instead, it does a local loopback to the completion handler, after a fixed
    * delay to simulate user approval and process latency.
    * @param useLoopback Whether to use local looback.
    *
    * @see https://dev.twitch.tv/docs/extensions/bits/#setuseloopbackboolean
    */
  def setUseLoopback(useLoopback: Boolean): Unit = js.native
  /**
    * Call this function when the viewer hovers over a product in your extension UI, to cause the
    * Twitch UI to display a dialog showing the viewer’s Bits balance.
    * The dialog displays for 1.5 seconds, unless your extension calls showBitsBalance again, in
    * which case the 1.5-second timer resets.
    *
    * This is a “fire-and-forget” function: the extension developer does not need to tell Twitch
    * when the viewer stops hovering over the product.
    *
    * On mobile, this function is ignored.
    *
    * @see https://dev.twitch.tv/docs/extensions/bits/#showbitsbalance
    */
  def showBitsBalance(): Unit = js.native
  /**
    * This function redeems a product with the specified SKU for the number of Bits specified in
    * the catalog entry of that product.
    * @param sku
    *
    * @see https://dev.twitch.tv/docs/extensions/bits/#usebitssku
    * @see https://dev.twitch.tv/docs/extensions/bits/#exchanging-bits-for-a-product
    */
  def useBits(sku: String): Unit = js.native
}

object TwitchExtBits {
  @scala.inline
  def apply(
    getProducts: () => js.Promise[js.Array[TwitchExtBitsProduct]],
    onTransactionCancelled: js.Function0[Unit] => Unit,
    onTransactionComplete: js.Function1[/* transaction */ TwitchExtBitsTransaction, Unit] => Unit,
    setUseLoopback: Boolean => Unit,
    showBitsBalance: () => Unit,
    useBits: String => Unit
  ): TwitchExtBits = {
    val __obj = js.Dynamic.literal(getProducts = js.Any.fromFunction0(getProducts), onTransactionCancelled = js.Any.fromFunction1(onTransactionCancelled), onTransactionComplete = js.Any.fromFunction1(onTransactionComplete), setUseLoopback = js.Any.fromFunction1(setUseLoopback), showBitsBalance = js.Any.fromFunction0(showBitsBalance), useBits = js.Any.fromFunction1(useBits))
    __obj.asInstanceOf[TwitchExtBits]
  }
  @scala.inline
  implicit class TwitchExtBitsOps[Self <: TwitchExtBits] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setGetProducts(value: () => js.Promise[js.Array[TwitchExtBitsProduct]]): Self = this.set("getProducts", js.Any.fromFunction0(value))
    @scala.inline
    def setOnTransactionCancelled(value: js.Function0[Unit] => Unit): Self = this.set("onTransactionCancelled", js.Any.fromFunction1(value))
    @scala.inline
    def setOnTransactionComplete(value: js.Function1[/* transaction */ TwitchExtBitsTransaction, Unit] => Unit): Self = this.set("onTransactionComplete", js.Any.fromFunction1(value))
    @scala.inline
    def setSetUseLoopback(value: Boolean => Unit): Self = this.set("setUseLoopback", js.Any.fromFunction1(value))
    @scala.inline
    def setShowBitsBalance(value: () => Unit): Self = this.set("showBitsBalance", js.Any.fromFunction0(value))
    @scala.inline
    def setUseBits(value: String => Unit): Self = this.set("useBits", js.Any.fromFunction1(value))
  }
  
}

