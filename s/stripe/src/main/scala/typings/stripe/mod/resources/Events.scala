package typings.stripe.mod.resources

import typings.stripe.mod.HeaderOptions
import typings.stripe.mod.IDataOptions
import typings.stripe.mod.IList
import typings.stripe.mod.IListPromise
import typings.stripe.mod.IResponseFn
import typings.stripe.mod.Stripe
import typings.stripe.mod.StripeResource
import typings.stripe.mod.events.IEvent
import typings.stripe.mod.events.IEventListOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("stripe", "resources.Events")
@js.native
class Events protected () extends StripeResource {
  def this(stripe: Stripe, urlData: js.Any) = this()
  
  def list(): IListPromise[IEvent] = js.native
  def list(data: IEventListOptions): IListPromise[IEvent] = js.native
  /**
    * List events, going back up to 30 days.
    */
  def list(data: IEventListOptions, options: HeaderOptions): IListPromise[IEvent] = js.native
  def list(data: IEventListOptions, options: HeaderOptions, response: IResponseFn[IList[IEvent]]): IListPromise[IEvent] = js.native
  def list(data: IEventListOptions, response: IResponseFn[IList[IEvent]]): IListPromise[IEvent] = js.native
  def list(options: HeaderOptions): IListPromise[IEvent] = js.native
  def list(options: HeaderOptions, response: IResponseFn[IList[IEvent]]): IListPromise[IEvent] = js.native
  def list(response: IResponseFn[IList[IEvent]]): IListPromise[IEvent] = js.native
  
  def retrieve(id: String): js.Promise[IEvent] = js.native
  def retrieve(id: String, data: IDataOptions): js.Promise[IEvent] = js.native
  /**
    * Retrieves the details of an event. Supply the unique identifier of the event, which you might have
    * received in a webhook.
    */
  def retrieve(id: String, data: IDataOptions, options: HeaderOptions): js.Promise[IEvent] = js.native
  def retrieve(id: String, data: IDataOptions, options: HeaderOptions, response: IResponseFn[IEvent]): js.Promise[IEvent] = js.native
  def retrieve(id: String, data: IDataOptions, response: IResponseFn[IEvent]): js.Promise[IEvent] = js.native
  def retrieve(id: String, options: HeaderOptions): js.Promise[IEvent] = js.native
  def retrieve(id: String, options: HeaderOptions, response: IResponseFn[IEvent]): js.Promise[IEvent] = js.native
  def retrieve(id: String, response: IResponseFn[IEvent]): js.Promise[IEvent] = js.native
}
