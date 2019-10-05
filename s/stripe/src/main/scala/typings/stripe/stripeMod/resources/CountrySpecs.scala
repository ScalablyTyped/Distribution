package typings.stripe.stripeMod.resources

import typings.stripe.stripeMod.HeaderOptions
import typings.stripe.stripeMod.IDataOptions
import typings.stripe.stripeMod.IList
import typings.stripe.stripeMod.IListOptions
import typings.stripe.stripeMod.IListPromise
import typings.stripe.stripeMod.IResponseFn
import typings.stripe.stripeMod.StripeResource
import typings.stripe.stripeMod.countrySpecs.ICountrySpec
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

