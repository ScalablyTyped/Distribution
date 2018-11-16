package typings
package stripeLib.stripeMod.StripeNs.resourcesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Balance
  extends stripeLib.stripeMod.StripeNs.StripeResource {
  def listTransactions(): stdLib.Promise[
    stripeLib.stripeMod.StripeNs.IList[stripeLib.stripeMod.StripeNs.balanceNs.IBalanceTransaction]
  ] = js.native
  def listTransactions(data: stripeLib.stripeMod.StripeNs.balanceNs.IBalanceListOptions): stdLib.Promise[
    stripeLib.stripeMod.StripeNs.IList[stripeLib.stripeMod.StripeNs.balanceNs.IBalanceTransaction]
  ] = js.native
  def listTransactions(
    data: stripeLib.stripeMod.StripeNs.balanceNs.IBalanceListOptions,
    options: stripeLib.stripeMod.StripeNs.HeaderOptions
  ): stdLib.Promise[
    stripeLib.stripeMod.StripeNs.IList[stripeLib.stripeMod.StripeNs.balanceNs.IBalanceTransaction]
  ] = js.native
  def listTransactions(
    data: stripeLib.stripeMod.StripeNs.balanceNs.IBalanceListOptions,
    options: stripeLib.stripeMod.StripeNs.HeaderOptions,
    response: stripeLib.stripeMod.StripeNs.IResponseFn[stripeLib.stripeMod.StripeNs.balanceNs.IBalanceTransaction]
  ): stdLib.Promise[
    stripeLib.stripeMod.StripeNs.IList[stripeLib.stripeMod.StripeNs.balanceNs.IBalanceTransaction]
  ] = js.native
  def listTransactions(
    data: stripeLib.stripeMod.StripeNs.balanceNs.IBalanceListOptions,
    response: stripeLib.stripeMod.StripeNs.IResponseFn[stripeLib.stripeMod.StripeNs.balanceNs.IBalanceTransaction]
  ): stdLib.Promise[
    stripeLib.stripeMod.StripeNs.IList[stripeLib.stripeMod.StripeNs.balanceNs.IBalanceTransaction]
  ] = js.native
  def listTransactions(options: stripeLib.stripeMod.StripeNs.HeaderOptions): stdLib.Promise[
    stripeLib.stripeMod.StripeNs.IList[stripeLib.stripeMod.StripeNs.balanceNs.IBalanceTransaction]
  ] = js.native
  def listTransactions(
    options: stripeLib.stripeMod.StripeNs.HeaderOptions,
    response: stripeLib.stripeMod.StripeNs.IResponseFn[stripeLib.stripeMod.StripeNs.balanceNs.IBalanceTransaction]
  ): stdLib.Promise[
    stripeLib.stripeMod.StripeNs.IList[stripeLib.stripeMod.StripeNs.balanceNs.IBalanceTransaction]
  ] = js.native
  def listTransactions(
    response: stripeLib.stripeMod.StripeNs.IResponseFn[stripeLib.stripeMod.StripeNs.balanceNs.IBalanceTransaction]
  ): stdLib.Promise[
    stripeLib.stripeMod.StripeNs.IList[stripeLib.stripeMod.StripeNs.balanceNs.IBalanceTransaction]
  ] = js.native
  def retrieve(): stdLib.Promise[stripeLib.stripeMod.StripeNs.balanceNs.IBalance] = js.native
  def retrieve(options: stripeLib.stripeMod.StripeNs.HeaderOptions): stdLib.Promise[stripeLib.stripeMod.StripeNs.balanceNs.IBalance] = js.native
  def retrieve(
    options: stripeLib.stripeMod.StripeNs.HeaderOptions,
    response: stripeLib.stripeMod.StripeNs.IResponseFn[stripeLib.stripeMod.StripeNs.balanceNs.IBalance]
  ): stdLib.Promise[stripeLib.stripeMod.StripeNs.balanceNs.IBalance] = js.native
  def retrieve(
    response: stripeLib.stripeMod.StripeNs.IResponseFn[stripeLib.stripeMod.StripeNs.balanceNs.IBalance]
  ): stdLib.Promise[stripeLib.stripeMod.StripeNs.balanceNs.IBalance] = js.native
  def retrieveTransaction(id: java.lang.String): stdLib.Promise[stripeLib.stripeMod.StripeNs.balanceNs.IBalanceTransaction] = js.native
  def retrieveTransaction(id: java.lang.String, options: stripeLib.stripeMod.StripeNs.HeaderOptions): stdLib.Promise[stripeLib.stripeMod.StripeNs.balanceNs.IBalanceTransaction] = js.native
  def retrieveTransaction(
    id: java.lang.String,
    options: stripeLib.stripeMod.StripeNs.HeaderOptions,
    response: stripeLib.stripeMod.StripeNs.IResponseFn[stripeLib.stripeMod.StripeNs.balanceNs.IBalanceTransaction]
  ): stdLib.Promise[stripeLib.stripeMod.StripeNs.balanceNs.IBalanceTransaction] = js.native
  def retrieveTransaction(
    id: java.lang.String,
    response: stripeLib.stripeMod.StripeNs.IResponseFn[stripeLib.stripeMod.StripeNs.balanceNs.IBalanceTransaction]
  ): stdLib.Promise[stripeLib.stripeMod.StripeNs.balanceNs.IBalanceTransaction] = js.native
}

