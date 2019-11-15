package typings.stripe.stripeMod.resources

import typings.stripe.stripeMod.HeaderOptions
import typings.stripe.stripeMod.IList
import typings.stripe.stripeMod.IListPromise
import typings.stripe.stripeMod.IResponseFn
import typings.stripe.stripeMod.StripeResource
import typings.stripe.stripeMod.taxRates.ITaxRate
import typings.stripe.stripeMod.taxRates.ITaxRateCreationOptions
import typings.stripe.stripeMod.taxRates.ITaxRateUpdateOptions
import typings.stripe.stripeMod.taxRates.ItaxRateSearchOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("stripe", "resources.TaxRates")
@js.native
class TaxRates () extends StripeResource {
  /**
    * Creates a new tax rate.
    */
  def create(data: ITaxRateCreationOptions): js.Promise[ITaxRate] = js.native
  def create(data: ITaxRateCreationOptions, options: HeaderOptions): js.Promise[ITaxRate] = js.native
  def create(data: ITaxRateCreationOptions, options: HeaderOptions, response: IResponseFn[ITaxRate]): js.Promise[ITaxRate] = js.native
  def create(data: ITaxRateCreationOptions, response: IResponseFn[ITaxRate]): js.Promise[ITaxRate] = js.native
  /**
    * Returns a list of your tax rates.
    * Tax rates are returned sorted by creation date, with the most recently created tax rates appearing first.
    */
  def list(data: ItaxRateSearchOptions): IListPromise[ITaxRate] = js.native
  def list(data: ItaxRateSearchOptions, options: HeaderOptions): IListPromise[ITaxRate] = js.native
  def list(data: ItaxRateSearchOptions, options: HeaderOptions, response: IResponseFn[IList[ITaxRate]]): IListPromise[ITaxRate] = js.native
  def list(data: ItaxRateSearchOptions, response: IResponseFn[IList[ITaxRate]]): IListPromise[ITaxRate] = js.native
  /**
    * Retrieves a tax rate with the given ID
    */
  def retrieve(id: String): js.Promise[ITaxRate] = js.native
  def retrieve(id: String, options: HeaderOptions): js.Promise[ITaxRate] = js.native
  def retrieve(id: String, options: HeaderOptions, response: IResponseFn[ITaxRate]): js.Promise[ITaxRate] = js.native
  def retrieve(id: String, response: IResponseFn[ITaxRate]): js.Promise[ITaxRate] = js.native
  /**
    * Updates an existing tax rate.
    */
  def update(id: String, data: ITaxRateUpdateOptions): js.Promise[ITaxRate] = js.native
  def update(id: String, data: ITaxRateUpdateOptions, options: HeaderOptions): js.Promise[ITaxRate] = js.native
  def update(id: String, data: ITaxRateUpdateOptions, options: HeaderOptions, response: IResponseFn[ITaxRate]): js.Promise[ITaxRate] = js.native
  def update(id: String, data: ITaxRateUpdateOptions, response: IResponseFn[ITaxRate]): js.Promise[ITaxRate] = js.native
}

