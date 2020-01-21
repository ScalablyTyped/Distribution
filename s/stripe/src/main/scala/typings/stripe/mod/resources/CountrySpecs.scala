package typings.stripe.mod.resources

import typings.stripe.mod.HeaderOptions
import typings.stripe.mod.IDataOptions
import typings.stripe.mod.IList
import typings.stripe.mod.IListOptions
import typings.stripe.mod.IListPromise
import typings.stripe.mod.IResponseFn
import typings.stripe.mod.StripeResource
import typings.stripe.mod.countrySpecs.ICountrySpec
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("stripe", "resources.CountrySpecs")
@js.native
class CountrySpecs () extends StripeResource {
  def list(): IListPromise[ICountrySpec] = js.native
  def list(data: IListOptions): IListPromise[ICountrySpec] = js.native
  /**
    * Lists all Country Spec objects available in the API.
    */
  def list(data: IListOptions, options: HeaderOptions): IListPromise[ICountrySpec] = js.native
  def list(data: IListOptions, options: HeaderOptions, response: IResponseFn[IList[ICountrySpec]]): IListPromise[ICountrySpec] = js.native
  def list(data: IListOptions, response: IResponseFn[IList[ICountrySpec]]): IListPromise[ICountrySpec] = js.native
  def list(options: HeaderOptions): IListPromise[ICountrySpec] = js.native
  def list(options: HeaderOptions, response: IResponseFn[IList[ICountrySpec]]): IListPromise[ICountrySpec] = js.native
  def list(response: IResponseFn[IList[ICountrySpec]]): IListPromise[ICountrySpec] = js.native
  def retrieve(id: String): js.Promise[ICountrySpec] = js.native
  def retrieve(id: String, data: IDataOptions): js.Promise[ICountrySpec] = js.native
  /**
    * Returns a Country Spec for a given Country code.
    *
    * @param retrieve  An ISO country code. Available country codes can be listed with the List Country Specs endpoint.
    */
  def retrieve(id: String, data: IDataOptions, options: HeaderOptions): js.Promise[ICountrySpec] = js.native
  def retrieve(id: String, data: IDataOptions, options: HeaderOptions, response: IResponseFn[ICountrySpec]): js.Promise[ICountrySpec] = js.native
  def retrieve(id: String, data: IDataOptions, response: IResponseFn[ICountrySpec]): js.Promise[ICountrySpec] = js.native
  def retrieve(id: String, options: HeaderOptions): js.Promise[ICountrySpec] = js.native
  def retrieve(id: String, options: HeaderOptions, response: IResponseFn[ICountrySpec]): js.Promise[ICountrySpec] = js.native
  def retrieve(id: String, response: IResponseFn[ICountrySpec]): js.Promise[ICountrySpec] = js.native
}

