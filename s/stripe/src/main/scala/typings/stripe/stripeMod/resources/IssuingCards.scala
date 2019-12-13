package typings.stripe.stripeMod.resources

import typings.stripe.stripeMod.HeaderOptions
import typings.stripe.stripeMod.IList
import typings.stripe.stripeMod.IResponseFn
import typings.stripe.stripeMod.StripeResource
import typings.stripe.stripeMod.issuing.cards.IIssuingCard
import typings.stripe.stripeMod.issuing.cards.IIssuingCardCreateOptions
import typings.stripe.stripeMod.issuing.cards.IIssuingCardDetails
import typings.stripe.stripeMod.issuing.cards.IIssuingCardListOptions
import typings.stripe.stripeMod.issuing.cards.IIssuingCardUpdateOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("stripe", "resources.IssuingCards")
@js.native
class IssuingCards () extends StripeResource {
  def create(data: IIssuingCardCreateOptions): js.Promise[IIssuingCard] = js.native
  /**
    * Creates an Issuing Card object.
    */
  def create(data: IIssuingCardCreateOptions, options: HeaderOptions): js.Promise[IIssuingCard] = js.native
  def create(data: IIssuingCardCreateOptions, options: HeaderOptions, response: IResponseFn[IIssuingCard]): js.Promise[IIssuingCard] = js.native
  def create(data: IIssuingCardCreateOptions, response: IResponseFn[IIssuingCard]): js.Promise[IIssuingCard] = js.native
  def list(): js.Promise[IList[IIssuingCard]] = js.native
  def list(data: IIssuingCardListOptions): js.Promise[IList[IIssuingCard]] = js.native
  /**
    * Returns a list of Issuing Card objects. The objects are sorted in descending order by creation date, with the most recently created object appearing first.
    */
  def list(data: IIssuingCardListOptions, options: HeaderOptions): js.Promise[IList[IIssuingCard]] = js.native
  def list(data: IIssuingCardListOptions, options: HeaderOptions, response: IResponseFn[IList[IIssuingCard]]): js.Promise[IList[IIssuingCard]] = js.native
  def list(data: IIssuingCardListOptions, response: IResponseFn[IList[IIssuingCard]]): js.Promise[IList[IIssuingCard]] = js.native
  def list(options: HeaderOptions): js.Promise[IList[IIssuingCard]] = js.native
  def list(options: HeaderOptions, response: IResponseFn[IList[IIssuingCard]]): js.Promise[IList[IIssuingCard]] = js.native
  def list(response: IResponseFn[IList[IIssuingCard]]): js.Promise[IList[IIssuingCard]] = js.native
  def retrieve(id: String): js.Promise[IIssuingCard] = js.native
  /**
    * Retrieves an Issuing Card object.
    */
  def retrieve(id: String, options: HeaderOptions): js.Promise[IIssuingCard] = js.native
  def retrieve(id: String, options: HeaderOptions, response: IResponseFn[IIssuingCard]): js.Promise[IIssuingCard] = js.native
  def retrieve(id: String, response: IResponseFn[IIssuingCard]): js.Promise[IIssuingCard] = js.native
  def retrieveDetails(id: String): js.Promise[IIssuingCardDetails] = js.native
  /**
    * For virtual cards only. Retrieves an Issuing card_details object that contains the sensitive details of a virtual card.
    */
  def retrieveDetails(id: String, options: HeaderOptions): js.Promise[IIssuingCardDetails] = js.native
  def retrieveDetails(id: String, options: HeaderOptions, response: IResponseFn[IIssuingCardDetails]): js.Promise[IIssuingCardDetails] = js.native
  def retrieveDetails(id: String, response: IResponseFn[IIssuingCardDetails]): js.Promise[IIssuingCardDetails] = js.native
  def update(id: String, data: IIssuingCardUpdateOptions): js.Promise[IIssuingCard] = js.native
  /**
    * Updates the specified Issuing Card object by setting the values of the parameters passed. Any parameters not provided will be left unchanged.
    */
  def update(id: String, data: IIssuingCardUpdateOptions, options: HeaderOptions): js.Promise[IIssuingCard] = js.native
  def update(
    id: String,
    data: IIssuingCardUpdateOptions,
    options: HeaderOptions,
    response: IResponseFn[IIssuingCard]
  ): js.Promise[IIssuingCard] = js.native
  def update(id: String, data: IIssuingCardUpdateOptions, response: IResponseFn[IIssuingCard]): js.Promise[IIssuingCard] = js.native
}

