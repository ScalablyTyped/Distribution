package typings.stripe.stripeMod.resources

import typings.stripe.stripeMod.HeaderOptions
import typings.stripe.stripeMod.IList
import typings.stripe.stripeMod.IListOptionsCreated
import typings.stripe.stripeMod.IListPromise
import typings.stripe.stripeMod.IResponseFn
import typings.stripe.stripeMod.StripeResource
import typings.stripe.stripeMod.reviews.IReview
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("stripe", "resources.Reviews")
@js.native
class Reviews () extends StripeResource {
  def approve(id: String): js.Promise[IReview] = js.native
  /**
    * Approves a Review object, closing it and removing it from the list of reviews. Returns the approved
    * review object.
    * @param id - The identifier of the review to be approved.
    */
  def approve(id: String, options: HeaderOptions): js.Promise[IReview] = js.native
  def approve(id: String, options: HeaderOptions, response: IResponseFn[IReview]): js.Promise[IReview] = js.native
  def approve(id: String, response: IResponseFn[IReview]): js.Promise[IReview] = js.native
  def list(): IListPromise[IReview] = js.native
  def list(data: IListOptionsCreated): IListPromise[IReview] = js.native
  /**
    * Returns a list of Review objects that have open set to true. The objects are sorted in descending
    * order by creation date, with the most recently created object appearing first.
    */
  def list(data: IListOptionsCreated, options: HeaderOptions): IListPromise[IReview] = js.native
  def list(data: IListOptionsCreated, options: HeaderOptions, response: IResponseFn[IList[IReview]]): IListPromise[IReview] = js.native
  def list(data: IListOptionsCreated, response: IResponseFn[IList[IReview]]): IListPromise[IReview] = js.native
  def list(options: HeaderOptions): IListPromise[IReview] = js.native
  def list(options: HeaderOptions, response: IResponseFn[IList[IReview]]): IListPromise[IReview] = js.native
  def list(response: IResponseFn[IList[IReview]]): IListPromise[IReview] = js.native
  def retrieve(id: String): js.Promise[IReview] = js.native
  def retrieve(id: String, options: HeaderOptions): js.Promise[IReview] = js.native
  def retrieve(id: String, options: HeaderOptions, response: IResponseFn[IReview]): js.Promise[IReview] = js.native
  def retrieve(id: String, response: IResponseFn[IReview]): js.Promise[IReview] = js.native
}

