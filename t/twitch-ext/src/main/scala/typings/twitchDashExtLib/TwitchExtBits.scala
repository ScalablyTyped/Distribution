package typings
package twitchDashExtLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @see TwitchExt.bits
  */
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
  def getProducts(): js.Promise[js.Array[TwitchExtBitsProduct]]
  /**
  	 * This function takes a callback that is fired whenever a transaction is cancelled.
  	 * @param callback The callback that is fired whenever a transaction is cancelled.
  	 *
  	 * @see https://dev.twitch.tv/docs/extensions/bits/#ontransactioncancelledcallback
  	 */
  def onTransactionCancelled(callback: js.Function0[scala.Unit]): scala.Unit
  /**
  	 * This function registers a callback that is fired whenever a Bits in Extensions transaction
  	 * is completed.
  	 * @param callback The callback that is fired.
  	 *
  	 * @see https://dev.twitch.tv/docs/extensions/bits/#ontransactioncompletecallbacktransactionobject
  	 */
  def onTransactionComplete(callback: js.Function1[/* transaction */ TwitchExtBitsTransaction, scala.Unit]): scala.Unit
  /**
  	 * This function sets the state of the extension helper, so it does not call live services for
  	 * usage of Bits. Instead, it does a local loopback to the completion handler, after a fixed
  	 * delay to simulate user approval and process latency.
  	 * @param useLoopback Whether to use local looback.
  	 *
  	 * @see https://dev.twitch.tv/docs/extensions/bits/#setuseloopbackboolean
  	 */
  def setUseLoopback(useLoopback: scala.Boolean): scala.Unit
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
  def showBitsBalance(): scala.Unit
  /**
  	 * This function redeems a product with the specified SKU for the number of Bits specified in
  	 * the catalog entry of that product.
  	 * @param sku
  	 *
  	 * @see https://dev.twitch.tv/docs/extensions/bits/#usebitssku
  	 * @see https://dev.twitch.tv/docs/extensions/bits/#exchanging-bits-for-a-product
  	 */
  def useBits(sku: java.lang.String): scala.Unit
}

