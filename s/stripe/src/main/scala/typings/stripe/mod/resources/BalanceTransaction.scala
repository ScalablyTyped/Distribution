package typings.stripe.mod.resources

import typings.stripe.mod.HeaderOptions
import typings.stripe.mod.IListPromise
import typings.stripe.mod.IResponseFn
import typings.stripe.mod.StripeResource
import typings.stripe.mod.balance.IBalanceListOptions
import typings.stripe.mod.balance.IBalanceTransaction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("stripe", "resources.BalanceTransaction")
@js.native
class BalanceTransaction () extends StripeResource {
  def list(): IListPromise[IBalanceTransaction] = js.native
  def list(data: IBalanceListOptions): IListPromise[IBalanceTransaction] = js.native
  def list(data: IBalanceListOptions, options: HeaderOptions): IListPromise[IBalanceTransaction] = js.native
  def list(data: IBalanceListOptions, options: HeaderOptions, response: IResponseFn[IBalanceTransaction]): IListPromise[IBalanceTransaction] = js.native
  def list(data: IBalanceListOptions, response: IResponseFn[IBalanceTransaction]): IListPromise[IBalanceTransaction] = js.native
  def list(options: HeaderOptions): IListPromise[IBalanceTransaction] = js.native
  def list(options: HeaderOptions, response: IResponseFn[IBalanceTransaction]): IListPromise[IBalanceTransaction] = js.native
  def list(response: IResponseFn[IBalanceTransaction]): IListPromise[IBalanceTransaction] = js.native
  def retrieve(id: String): js.Promise[IBalanceTransaction] = js.native
  def retrieve(id: String, options: HeaderOptions): js.Promise[IBalanceTransaction] = js.native
  def retrieve(id: String, options: HeaderOptions, response: IResponseFn[IBalanceTransaction]): js.Promise[IBalanceTransaction] = js.native
  def retrieve(id: String, response: IResponseFn[IBalanceTransaction]): js.Promise[IBalanceTransaction] = js.native
}

