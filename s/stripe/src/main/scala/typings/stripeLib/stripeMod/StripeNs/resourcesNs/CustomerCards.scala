package typings
package stripeLib.stripeMod.StripeNs.resourcesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CustomerCards
  extends stripeLib.stripeMod.StripeNs.StripeResource {
  def create(data: stripeLib.Anon_Card): stdLib.Promise[stripeLib.stripeMod.StripeNs.cardsNs.ICard] = js.native
  /**
               * When you create a new credit card, you must specify a customer or recipient to create it on. If the card's owner has no default card,
               * then the new card will become the default. However, if the owner already has a default then it will not change. To change the default,
               * you should either update the customer to have a new default_source or update the recipient to have a new default_card.
               *
               * @returns Returns the card object.
               */
  def create(data: stripeLib.Anon_Card, options: stripeLib.stripeMod.StripeNs.HeaderOptions): stdLib.Promise[stripeLib.stripeMod.StripeNs.cardsNs.ICard] = js.native
  /**
               * When you create a new credit card, you must specify a customer or recipient to create it on. If the card's owner has no default card,
               * then the new card will become the default. However, if the owner already has a default then it will not change. To change the default,
               * you should either update the customer to have a new default_source or update the recipient to have a new default_card.
               *
               * @returns Returns the card object.
               */
  def create(
    data: stripeLib.Anon_Card,
    options: stripeLib.stripeMod.StripeNs.HeaderOptions,
    response: stripeLib.stripeMod.StripeNs.IResponseFn[stripeLib.stripeMod.StripeNs.cardsNs.ICard]
  ): stdLib.Promise[stripeLib.stripeMod.StripeNs.cardsNs.ICard] = js.native
  def create(
    data: stripeLib.Anon_Card,
    response: stripeLib.stripeMod.StripeNs.IResponseFn[stripeLib.stripeMod.StripeNs.cardsNs.ICard]
  ): stdLib.Promise[stripeLib.stripeMod.StripeNs.cardsNs.ICard] = js.native
  def del(cardId: java.lang.String): stdLib.Promise[stripeLib.stripeMod.StripeNs.IDeleteConfirmation] = js.native
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
  def del(cardId: java.lang.String, options: stripeLib.stripeMod.StripeNs.HeaderOptions): stdLib.Promise[stripeLib.stripeMod.StripeNs.IDeleteConfirmation] = js.native
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
  def del(
    cardId: java.lang.String,
    options: stripeLib.stripeMod.StripeNs.HeaderOptions,
    response: stripeLib.stripeMod.StripeNs.IResponseFn[stripeLib.stripeMod.StripeNs.IDeleteConfirmation]
  ): stdLib.Promise[stripeLib.stripeMod.StripeNs.IDeleteConfirmation] = js.native
  def del(
    cardId: java.lang.String,
    response: stripeLib.stripeMod.StripeNs.IResponseFn[stripeLib.stripeMod.StripeNs.IDeleteConfirmation]
  ): stdLib.Promise[stripeLib.stripeMod.StripeNs.IDeleteConfirmation] = js.native
  def list(): stdLib.Promise[stripeLib.stripeMod.StripeNs.IList[stripeLib.stripeMod.StripeNs.cardsNs.ICard]] = js.native
  def list(data: stripeLib.stripeMod.StripeNs.IListOptions): stdLib.Promise[stripeLib.stripeMod.StripeNs.IList[stripeLib.stripeMod.StripeNs.cardsNs.ICard]] = js.native
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
  def list(
    data: stripeLib.stripeMod.StripeNs.IListOptions,
    options: stripeLib.stripeMod.StripeNs.HeaderOptions
  ): stdLib.Promise[stripeLib.stripeMod.StripeNs.IList[stripeLib.stripeMod.StripeNs.cardsNs.ICard]] = js.native
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
  def list(
    data: stripeLib.stripeMod.StripeNs.IListOptions,
    options: stripeLib.stripeMod.StripeNs.HeaderOptions,
    response: stripeLib.stripeMod.StripeNs.IResponseFn[stripeLib.stripeMod.StripeNs.IList[stripeLib.stripeMod.StripeNs.cardsNs.ICard]]
  ): stdLib.Promise[stripeLib.stripeMod.StripeNs.IList[stripeLib.stripeMod.StripeNs.cardsNs.ICard]] = js.native
  def list(
    data: stripeLib.stripeMod.StripeNs.IListOptions,
    response: stripeLib.stripeMod.StripeNs.IResponseFn[stripeLib.stripeMod.StripeNs.IList[stripeLib.stripeMod.StripeNs.cardsNs.ICard]]
  ): stdLib.Promise[stripeLib.stripeMod.StripeNs.IList[stripeLib.stripeMod.StripeNs.cardsNs.ICard]] = js.native
  def list(options: stripeLib.stripeMod.StripeNs.HeaderOptions): stdLib.Promise[stripeLib.stripeMod.StripeNs.IList[stripeLib.stripeMod.StripeNs.cardsNs.ICard]] = js.native
  def list(
    options: stripeLib.stripeMod.StripeNs.HeaderOptions,
    response: stripeLib.stripeMod.StripeNs.IResponseFn[stripeLib.stripeMod.StripeNs.IList[stripeLib.stripeMod.StripeNs.cardsNs.ICard]]
  ): stdLib.Promise[stripeLib.stripeMod.StripeNs.IList[stripeLib.stripeMod.StripeNs.cardsNs.ICard]] = js.native
  def list(
    response: stripeLib.stripeMod.StripeNs.IResponseFn[stripeLib.stripeMod.StripeNs.IList[stripeLib.stripeMod.StripeNs.cardsNs.ICard]]
  ): stdLib.Promise[stripeLib.stripeMod.StripeNs.IList[stripeLib.stripeMod.StripeNs.cardsNs.ICard]] = js.native
  def retrieve(cardId: java.lang.String): stdLib.Promise[stripeLib.stripeMod.StripeNs.cardsNs.ICard] = js.native
  /**
               * By default, you can see the 10 most recent cards stored on a customer or recipient directly on the customer or recipient object, but
               * you can also retrieve details about a specific card stored on the customer or recipient.
               *
               * @returns Returns the card object.
               *
               * @param cardId The ID of the card to be retrieved.
               */
  def retrieve(cardId: java.lang.String, options: stripeLib.stripeMod.StripeNs.HeaderOptions): stdLib.Promise[stripeLib.stripeMod.StripeNs.cardsNs.ICard] = js.native
  /**
               * By default, you can see the 10 most recent cards stored on a customer or recipient directly on the customer or recipient object, but
               * you can also retrieve details about a specific card stored on the customer or recipient.
               *
               * @returns Returns the card object.
               *
               * @param cardId The ID of the card to be retrieved.
               */
  def retrieve(
    cardId: java.lang.String,
    options: stripeLib.stripeMod.StripeNs.HeaderOptions,
    response: stripeLib.stripeMod.StripeNs.IResponseFn[stripeLib.stripeMod.StripeNs.cardsNs.ICard]
  ): stdLib.Promise[stripeLib.stripeMod.StripeNs.cardsNs.ICard] = js.native
  def retrieve(
    cardId: java.lang.String,
    response: stripeLib.stripeMod.StripeNs.IResponseFn[stripeLib.stripeMod.StripeNs.cardsNs.ICard]
  ): stdLib.Promise[stripeLib.stripeMod.StripeNs.cardsNs.ICard] = js.native
  def update(cardId: java.lang.String, data: stripeLib.stripeMod.StripeNs.cardsNs.ICardUpdateOptions): stdLib.Promise[stripeLib.stripeMod.StripeNs.cardsNs.ICard] = js.native
  /**
               * If you need to update only some card details, like the billing address or expiration date, you can do so without having to re-enter the
               * full card details. Stripe also works directly with card networks so that your customers can continue using your service without
               * interruption. When you update a card, Stripe will automatically validate the card.
               *
               * @returns Returns the card object.
               *
               * @param cardId The ID of the card to be retrieved.
               */
  def update(
    cardId: java.lang.String,
    data: stripeLib.stripeMod.StripeNs.cardsNs.ICardUpdateOptions,
    options: stripeLib.stripeMod.StripeNs.HeaderOptions
  ): stdLib.Promise[stripeLib.stripeMod.StripeNs.cardsNs.ICard] = js.native
  /**
               * If you need to update only some card details, like the billing address or expiration date, you can do so without having to re-enter the
               * full card details. Stripe also works directly with card networks so that your customers can continue using your service without
               * interruption. When you update a card, Stripe will automatically validate the card.
               *
               * @returns Returns the card object.
               *
               * @param cardId The ID of the card to be retrieved.
               */
  def update(
    cardId: java.lang.String,
    data: stripeLib.stripeMod.StripeNs.cardsNs.ICardUpdateOptions,
    options: stripeLib.stripeMod.StripeNs.HeaderOptions,
    response: stripeLib.stripeMod.StripeNs.IResponseFn[stripeLib.stripeMod.StripeNs.cardsNs.ICard]
  ): stdLib.Promise[stripeLib.stripeMod.StripeNs.cardsNs.ICard] = js.native
  def update(
    cardId: java.lang.String,
    data: stripeLib.stripeMod.StripeNs.cardsNs.ICardUpdateOptions,
    response: stripeLib.stripeMod.StripeNs.IResponseFn[stripeLib.stripeMod.StripeNs.cardsNs.ICard]
  ): stdLib.Promise[stripeLib.stripeMod.StripeNs.cardsNs.ICard] = js.native
}

