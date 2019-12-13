package typings.stripe.stripeMod.resources

import typings.stripe.stripeMod.HeaderOptions
import typings.stripe.stripeMod.IList
import typings.stripe.stripeMod.IResponseFn
import typings.stripe.stripeMod.StripeResource
import typings.stripe.stripeMod.issuing.cardholders.ICardholder
import typings.stripe.stripeMod.issuing.cardholders.ICardholderCreateOptions
import typings.stripe.stripeMod.issuing.cardholders.ICardholderListOptions
import typings.stripe.stripeMod.issuing.cardholders.ICardholderUpdateOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("stripe", "resources.Cardholders")
@js.native
class Cardholders () extends StripeResource {
  def create(data: ICardholderCreateOptions): js.Promise[ICardholder] = js.native
  /**
    * Creates a new Issuing Cardholder object that can be issued cards.
    */
  def create(data: ICardholderCreateOptions, options: HeaderOptions): js.Promise[ICardholder] = js.native
  def create(data: ICardholderCreateOptions, options: HeaderOptions, response: IResponseFn[ICardholder]): js.Promise[ICardholder] = js.native
  def create(data: ICardholderCreateOptions, response: IResponseFn[ICardholder]): js.Promise[ICardholder] = js.native
  def list(): js.Promise[IList[ICardholder]] = js.native
  def list(data: ICardholderListOptions): js.Promise[IList[ICardholder]] = js.native
  /**
    * Returns a list of Issuing Cardholder objects. The objects are sorted in descending order by creation date, with the most recently created object appearing first.
    */
  def list(data: ICardholderListOptions, options: HeaderOptions): js.Promise[IList[ICardholder]] = js.native
  def list(data: ICardholderListOptions, options: HeaderOptions, response: IResponseFn[IList[ICardholder]]): js.Promise[IList[ICardholder]] = js.native
  def list(data: ICardholderListOptions, response: IResponseFn[IList[ICardholder]]): js.Promise[IList[ICardholder]] = js.native
  def list(options: HeaderOptions): js.Promise[IList[ICardholder]] = js.native
  def list(options: HeaderOptions, response: IResponseFn[IList[ICardholder]]): js.Promise[IList[ICardholder]] = js.native
  def list(response: IResponseFn[IList[ICardholder]]): js.Promise[IList[ICardholder]] = js.native
  def retrieve(id: String): js.Promise[ICardholder] = js.native
  /**
    * Retrieves an Issuing Cardholder object.
    */
  def retrieve(id: String, options: HeaderOptions): js.Promise[ICardholder] = js.native
  def retrieve(id: String, options: HeaderOptions, response: IResponseFn[ICardholder]): js.Promise[ICardholder] = js.native
  def retrieve(id: String, response: IResponseFn[ICardholder]): js.Promise[ICardholder] = js.native
  def update(id: String, data: ICardholderUpdateOptions): js.Promise[ICardholder] = js.native
  /**
    * Updates the specified Issuing Cardholder object by setting the values of the parameters passed. Any parameters not provided will be left unchanged.
    */
  def update(id: String, data: ICardholderUpdateOptions, options: HeaderOptions): js.Promise[ICardholder] = js.native
  def update(
    id: String,
    data: ICardholderUpdateOptions,
    options: HeaderOptions,
    response: IResponseFn[ICardholder]
  ): js.Promise[ICardholder] = js.native
  def update(id: String, data: ICardholderUpdateOptions, response: IResponseFn[ICardholder]): js.Promise[ICardholder] = js.native
}

