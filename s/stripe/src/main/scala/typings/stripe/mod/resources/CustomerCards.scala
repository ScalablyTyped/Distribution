package typings.stripe.mod.resources

import typings.stripe.AnonCard
import typings.stripe.mod.HeaderOptions
import typings.stripe.mod.IDeleteConfirmation
import typings.stripe.mod.IList
import typings.stripe.mod.IListOptions
import typings.stripe.mod.IListPromise
import typings.stripe.mod.IResponseFn
import typings.stripe.mod.StripeResource
import typings.stripe.mod.cards.ICard
import typings.stripe.mod.cards.ICardUpdateOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("stripe", "resources.CustomerCards")
@js.native
class CustomerCards () extends StripeResource {
  def create(data: AnonCard): js.Promise[ICard] = js.native
  /**
    * When you create a new credit card, you must specify a customer or recipient to create it on. If the card's owner has no default card,
    * then the new card will become the default. However, if the owner already has a default then it will not change. To change the default,
    * you should either update the customer to have a new default_source or update the recipient to have a new default_card.
    *
    * @returns Returns the card object.
    */
  def create(data: AnonCard, options: HeaderOptions): js.Promise[ICard] = js.native
  def create(data: AnonCard, options: HeaderOptions, response: IResponseFn[ICard]): js.Promise[ICard] = js.native
  def create(data: AnonCard, response: IResponseFn[ICard]): js.Promise[ICard] = js.native
  def del(cardId: String): js.Promise[IDeleteConfirmation] = js.native
  /**
    * You can delete cards from a customer or recipient. If you delete a card that is currently the
    * default source on a customer, then the most recently added source will become the new default.
    * If you delete a card that is the last remaining source on the customer then the default_source
    * attribute will become null. Similarly, if you delete the default card on a recipient, then the
    * most recently added card will become the new default. If you delete the last remaining card on
    * a recipient, then the default_card attribute will become null. Note that for cards belonging to
    * customers, you may want to prevent customers on paid subscriptions from deleting all cards on
    * file so that there is at least one default card for the next invoice payment attempt.
    *
    * @returns Returns the deleted card object.
    *
    * @param cardId The ID of the card to be retrieved.
    */
  def del(cardId: String, options: HeaderOptions): js.Promise[IDeleteConfirmation] = js.native
  def del(cardId: String, options: HeaderOptions, response: IResponseFn[IDeleteConfirmation]): js.Promise[IDeleteConfirmation] = js.native
  def del(cardId: String, response: IResponseFn[IDeleteConfirmation]): js.Promise[IDeleteConfirmation] = js.native
  def list(): IListPromise[ICard] = js.native
  def list(data: IListOptions): IListPromise[ICard] = js.native
  /**
    * You can see a list of the cards belonging to a customer or recipient. Note that the 10 most recent
    * cards are always available by default on the customer or recipient object. If you need more than
    * those 10, you can use this API method and the limit and starting_after parameters to page through
    * additional cards.
    *
    * @returns Returns a list of the cards stored on the customer or recipient. You can optionally request
    * that the response include the total count of all cards for the customer or recipient. To do so,
    * specify include[]=total_count in your request.
    * @param data Filtering options
    */
  def list(data: IListOptions, options: HeaderOptions): IListPromise[ICard] = js.native
  def list(data: IListOptions, options: HeaderOptions, response: IResponseFn[IList[ICard]]): IListPromise[ICard] = js.native
  def list(data: IListOptions, response: IResponseFn[IList[ICard]]): IListPromise[ICard] = js.native
  def list(options: HeaderOptions): IListPromise[ICard] = js.native
  def list(options: HeaderOptions, response: IResponseFn[IList[ICard]]): IListPromise[ICard] = js.native
  def list(response: IResponseFn[IList[ICard]]): IListPromise[ICard] = js.native
  def retrieve(cardId: String): js.Promise[ICard] = js.native
  /**
    * By default, you can see the 10 most recent cards stored on a customer or recipient directly on the customer or recipient object, but
    * you can also retrieve details about a specific card stored on the customer or recipient.
    *
    * @returns Returns the card object.
    *
    * @param cardId The ID of the card to be retrieved.
    */
  def retrieve(cardId: String, options: HeaderOptions): js.Promise[ICard] = js.native
  def retrieve(cardId: String, options: HeaderOptions, response: IResponseFn[ICard]): js.Promise[ICard] = js.native
  def retrieve(cardId: String, response: IResponseFn[ICard]): js.Promise[ICard] = js.native
  def update(cardId: String, data: ICardUpdateOptions): js.Promise[ICard] = js.native
  /**
    * If you need to update only some card details, like the billing address or expiration date, you can do so without having to re-enter the
    * full card details. Stripe also works directly with card networks so that your customers can continue using your service without
    * interruption. When you update a card, Stripe will automatically validate the card.
    *
    * @returns Returns the card object.
    *
    * @param cardId The ID of the card to be retrieved.
    */
  def update(cardId: String, data: ICardUpdateOptions, options: HeaderOptions): js.Promise[ICard] = js.native
  def update(cardId: String, data: ICardUpdateOptions, options: HeaderOptions, response: IResponseFn[ICard]): js.Promise[ICard] = js.native
  def update(cardId: String, data: ICardUpdateOptions, response: IResponseFn[ICard]): js.Promise[ICard] = js.native
}

