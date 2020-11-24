package typings.stripe.mod.resources

import typings.stripe.mod.HeaderOptions
import typings.stripe.mod.IListPromise
import typings.stripe.mod.IResponseFn
import typings.stripe.mod.StripeResource
import typings.stripe.mod.balance.IBalance
import typings.stripe.mod.balance.IBalanceListOptions
import typings.stripe.mod.balance.IBalanceTransaction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("stripe", "resources.Balance")
@js.native
class Balance () extends StripeResource {
  
  def listTransactions(): IListPromise[IBalanceTransaction] = js.native
  def listTransactions(data: IBalanceListOptions): IListPromise[IBalanceTransaction] = js.native
  /*
    * @deprecated
    */
  def listTransactions(data: IBalanceListOptions, options: HeaderOptions): IListPromise[IBalanceTransaction] = js.native
  def listTransactions(data: IBalanceListOptions, options: HeaderOptions, response: IResponseFn[IBalanceTransaction]): IListPromise[IBalanceTransaction] = js.native
  def listTransactions(data: IBalanceListOptions, response: IResponseFn[IBalanceTransaction]): IListPromise[IBalanceTransaction] = js.native
  def listTransactions(options: HeaderOptions): IListPromise[IBalanceTransaction] = js.native
  def listTransactions(options: HeaderOptions, response: IResponseFn[IBalanceTransaction]): IListPromise[IBalanceTransaction] = js.native
  def listTransactions(response: IResponseFn[IBalanceTransaction]): IListPromise[IBalanceTransaction] = js.native
  
  def retrieve(): js.Promise[IBalance] = js.native
  def retrieve(options: HeaderOptions): js.Promise[IBalance] = js.native
  def retrieve(options: HeaderOptions, response: IResponseFn[IBalance]): js.Promise[IBalance] = js.native
  def retrieve(response: IResponseFn[IBalance]): js.Promise[IBalance] = js.native
  
  def retrieveTransaction(id: String): js.Promise[IBalanceTransaction] = js.native
  /*
    * @deprecated
    */
  def retrieveTransaction(id: String, options: HeaderOptions): js.Promise[IBalanceTransaction] = js.native
  def retrieveTransaction(id: String, options: HeaderOptions, response: IResponseFn[IBalanceTransaction]): js.Promise[IBalanceTransaction] = js.native
  def retrieveTransaction(id: String, response: IResponseFn[IBalanceTransaction]): js.Promise[IBalanceTransaction] = js.native
}
