package typings.stripe.stripeMod.resources

import typings.stripe.stripeMod.HeaderOptions
import typings.stripe.stripeMod.IDeleteConfirmation
import typings.stripe.stripeMod.IList
import typings.stripe.stripeMod.IListPromise
import typings.stripe.stripeMod.IResponseFn
import typings.stripe.stripeMod.StripeResource
import typings.stripe.stripeMod.plans.IPlan
import typings.stripe.stripeMod.plans.IPlanCreationOptions
import typings.stripe.stripeMod.plans.IPlanUpdateOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("stripe", "resources.Plans")
@js.native
class Plans () extends StripeResource {
  def create(data: IPlanCreationOptions): js.Promise[IPlan] = js.native
  /**
    * You can create plans easily via the plan management page of the Stripe dashboard. Plan creation is also
    * accessible via the API if you need to create plans on the fly.
    *
    * @returns The newly created plan
    *
    * @param data Creation options for the new plan.
    */
  def create(data: IPlanCreationOptions, options: HeaderOptions): js.Promise[IPlan] = js.native
  def create(data: IPlanCreationOptions, options: HeaderOptions, response: IResponseFn[IPlan]): js.Promise[IPlan] = js.native
  def create(data: IPlanCreationOptions, response: IResponseFn[IPlan]): js.Promise[IPlan] = js.native
  def del(planName: String): js.Promise[IDeleteConfirmation] = js.native
  /**
    * You can delete plans via the plan management page of the Stripe dashboard. However, deleting a plan does not affect
    * any current subscribers to the plan; it merely means that new subscribers can't be added to that plan. You can also
    * delete plans via the API.
    *
    * @returns An object with the deleted plan's ID and a deleted flag upon success. Otherwise, this call throws an error, such as if the plan has already been deleted.
    *
    * @param planName The identifier of the plan to be deleted.
    */
  def del(planName: String, options: HeaderOptions): js.Promise[IDeleteConfirmation] = js.native
  def del(planName: String, options: HeaderOptions, response: IResponseFn[IDeleteConfirmation]): js.Promise[IDeleteConfirmation] = js.native
  def del(planName: String, response: IResponseFn[IDeleteConfirmation]): js.Promise[IDeleteConfirmation] = js.native
  def list(): IListPromise[IPlan] = js.native
  def list(data: IPlanListOptions): IListPromise[IPlan] = js.native
  /**
    * Returns a list of your plans.
    *
    * @returns An object with a data property that contains an array of up to limit plans, starting after plan starting_after.
    * Each entry in the array is a separate plan object. If no more plans are available, the resulting array will be empty. This
    * request should never throw an error. You can optionally request that the response include the total count of all plans. To
    * do so, specify include[]=total_count in your request.
    */
  def list(data: IPlanListOptions, options: HeaderOptions): IListPromise[IPlan] = js.native
  def list(data: IPlanListOptions, options: HeaderOptions, response: IResponseFn[IList[IPlan]]): IListPromise[IPlan] = js.native
  def list(data: IPlanListOptions, response: IResponseFn[IList[IPlan]]): IListPromise[IPlan] = js.native
  def list(options: HeaderOptions): IListPromise[IPlan] = js.native
  def list(options: HeaderOptions, response: IResponseFn[IList[IPlan]]): IListPromise[IPlan] = js.native
  def list(response: IResponseFn[IList[IPlan]]): IListPromise[IPlan] = js.native
  def retrieve(planName: String): js.Promise[IPlan] = js.native
  /**
    * Retrieves the plan with the given ID.
    *
    * @returns Returns a plan if a valid plan ID was provided. Throws an error otherwise.
    *
    * @param planName The identifier of the desired plan.
    */
  def retrieve(planName: String, options: HeaderOptions): js.Promise[IPlan] = js.native
  def retrieve(planName: String, options: HeaderOptions, response: IResponseFn[IPlan]): js.Promise[IPlan] = js.native
  def retrieve(planName: String, response: IResponseFn[IPlan]): js.Promise[IPlan] = js.native
  def update(planName: String, data: IPlanUpdateOptions): js.Promise[IPlan] = js.native
  /**
    * Updates the name of a plan. Other plan details (price, interval, etc.) are, by design, not editable.
    *
    * @returns The updated plan object is returned upon success. Otherwise, this call throws an error.
    *
    * @param planName The identifier of the plan to update
    * @param data The fields to update
    */
  def update(planName: String, data: IPlanUpdateOptions, options: HeaderOptions): js.Promise[IPlan] = js.native
  def update(planName: String, data: IPlanUpdateOptions, options: HeaderOptions, response: IResponseFn[IPlan]): js.Promise[IPlan] = js.native
  def update(planName: String, data: IPlanUpdateOptions, response: IResponseFn[IPlan]): js.Promise[IPlan] = js.native
}

