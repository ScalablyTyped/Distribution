package typings
package stripeLib.stripeMod.StripeNs.resourcesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BitcoinReceivers
  extends stripeLib.stripeMod.StripeNs.StripeResource {
  def create(data: stripeLib.stripeMod.StripeNs.bitcoinReceiversNs.IBitcoinReceiverCreationOptions): js.Promise[stripeLib.stripeMod.StripeNs.bitcoinReceiversNs.IBitcoinReceiver] = js.native
  /**
    * Creates a Bitcoin receiver object that can be used to accept bitcoin payments from your customer. The receiver exposes a Bitcoin address
    * and is created with a bitcoin to USD exchange rate that is valid for 10 minutes.
    */
  def create(
    data: stripeLib.stripeMod.StripeNs.bitcoinReceiversNs.IBitcoinReceiverCreationOptions,
    options: stripeLib.stripeMod.StripeNs.HeaderOptions
  ): js.Promise[stripeLib.stripeMod.StripeNs.bitcoinReceiversNs.IBitcoinReceiver] = js.native
  def create(
    data: stripeLib.stripeMod.StripeNs.bitcoinReceiversNs.IBitcoinReceiverCreationOptions,
    options: stripeLib.stripeMod.StripeNs.HeaderOptions,
    response: stripeLib.stripeMod.StripeNs.IResponseFn[stripeLib.stripeMod.StripeNs.bitcoinReceiversNs.IBitcoinReceiver]
  ): js.Promise[stripeLib.stripeMod.StripeNs.bitcoinReceiversNs.IBitcoinReceiver] = js.native
  def create(
    data: stripeLib.stripeMod.StripeNs.bitcoinReceiversNs.IBitcoinReceiverCreationOptions,
    response: stripeLib.stripeMod.StripeNs.IResponseFn[stripeLib.stripeMod.StripeNs.bitcoinReceiversNs.IBitcoinReceiver]
  ): js.Promise[stripeLib.stripeMod.StripeNs.bitcoinReceiversNs.IBitcoinReceiver] = js.native
   // TODO: Implement placeholder method
  def getMetadata(): scala.Unit = js.native
  def list(data: stripeLib.stripeMod.StripeNs.bitcoinReceiversNs.IBitcoinReceiverListOptions): js.Promise[
    stripeLib.stripeMod.StripeNs.IList[stripeLib.stripeMod.StripeNs.bitcoinReceiversNs.IBitcoinReceiver]
  ] = js.native
  /**
    * Returns a list of your receivers. Receivers are returned sorted by creation date, with the most recently created receivers appearing first.
    */
  def list(
    data: stripeLib.stripeMod.StripeNs.bitcoinReceiversNs.IBitcoinReceiverListOptions,
    options: stripeLib.stripeMod.StripeNs.HeaderOptions
  ): js.Promise[
    stripeLib.stripeMod.StripeNs.IList[stripeLib.stripeMod.StripeNs.bitcoinReceiversNs.IBitcoinReceiver]
  ] = js.native
  def list(
    data: stripeLib.stripeMod.StripeNs.bitcoinReceiversNs.IBitcoinReceiverListOptions,
    options: stripeLib.stripeMod.StripeNs.HeaderOptions,
    response: stripeLib.stripeMod.StripeNs.IResponseFn[
      stripeLib.stripeMod.StripeNs.IList[stripeLib.stripeMod.StripeNs.bitcoinReceiversNs.IBitcoinReceiver]
    ]
  ): js.Promise[
    stripeLib.stripeMod.StripeNs.IList[stripeLib.stripeMod.StripeNs.bitcoinReceiversNs.IBitcoinReceiver]
  ] = js.native
  def list(
    data: stripeLib.stripeMod.StripeNs.bitcoinReceiversNs.IBitcoinReceiverListOptions,
    response: stripeLib.stripeMod.StripeNs.IResponseFn[
      stripeLib.stripeMod.StripeNs.IList[stripeLib.stripeMod.StripeNs.bitcoinReceiversNs.IBitcoinReceiver]
    ]
  ): js.Promise[
    stripeLib.stripeMod.StripeNs.IList[stripeLib.stripeMod.StripeNs.bitcoinReceiversNs.IBitcoinReceiver]
  ] = js.native
  def retrieve(id: java.lang.String): js.Promise[stripeLib.stripeMod.StripeNs.bitcoinReceiversNs.IBitcoinReceiver] = js.native
  def retrieve(id: java.lang.String, data: stripeLib.stripeMod.StripeNs.IDataOptions): js.Promise[stripeLib.stripeMod.StripeNs.bitcoinReceiversNs.IBitcoinReceiver] = js.native
  /**
    * Retrieves the Bitcoin receiver with the given ID.
    */
  def retrieve(
    id: java.lang.String,
    data: stripeLib.stripeMod.StripeNs.IDataOptions,
    options: stripeLib.stripeMod.StripeNs.HeaderOptions
  ): js.Promise[stripeLib.stripeMod.StripeNs.bitcoinReceiversNs.IBitcoinReceiver] = js.native
  def retrieve(
    id: java.lang.String,
    data: stripeLib.stripeMod.StripeNs.IDataOptions,
    options: stripeLib.stripeMod.StripeNs.HeaderOptions,
    response: stripeLib.stripeMod.StripeNs.IResponseFn[stripeLib.stripeMod.StripeNs.bitcoinReceiversNs.IBitcoinReceiver]
  ): js.Promise[stripeLib.stripeMod.StripeNs.bitcoinReceiversNs.IBitcoinReceiver] = js.native
  def retrieve(
    id: java.lang.String,
    data: stripeLib.stripeMod.StripeNs.IDataOptions,
    response: stripeLib.stripeMod.StripeNs.IResponseFn[stripeLib.stripeMod.StripeNs.bitcoinReceiversNs.IBitcoinReceiver]
  ): js.Promise[stripeLib.stripeMod.StripeNs.bitcoinReceiversNs.IBitcoinReceiver] = js.native
  def retrieve(id: java.lang.String, options: stripeLib.stripeMod.StripeNs.HeaderOptions): js.Promise[stripeLib.stripeMod.StripeNs.bitcoinReceiversNs.IBitcoinReceiver] = js.native
  def retrieve(
    id: java.lang.String,
    options: stripeLib.stripeMod.StripeNs.HeaderOptions,
    response: stripeLib.stripeMod.StripeNs.IResponseFn[stripeLib.stripeMod.StripeNs.bitcoinReceiversNs.IBitcoinReceiver]
  ): js.Promise[stripeLib.stripeMod.StripeNs.bitcoinReceiversNs.IBitcoinReceiver] = js.native
  def retrieve(
    id: java.lang.String,
    response: stripeLib.stripeMod.StripeNs.IResponseFn[stripeLib.stripeMod.StripeNs.bitcoinReceiversNs.IBitcoinReceiver]
  ): js.Promise[stripeLib.stripeMod.StripeNs.bitcoinReceiversNs.IBitcoinReceiver] = js.native
  // update(id: string): void; // This does seem to be a method in the library (https://github.com/stripe/stripe-node/blob/master/lib/resources/BitcoinReceivers.js#L12), but isn't in the API documentation.
  def setMetadata(): scala.Unit = js.native
}

