package typings
package stripeLib.stripeMod.StripeNs.resourcesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Plans
  extends stripeLib.stripeMod.StripeNs.StripeResource {
  def create(data: stripeLib.stripeMod.StripeNs.plansNs.IPlanCreationOptions): js.Promise[stripeLib.stripeMod.StripeNs.plansNs.IPlan] = js.native
  /**
    * You can create plans easily via the plan management page of the Stripe dashboard. Plan creation is also
    * accessible via the API if you need to create plans on the fly.
    *
    * @returns The newly created plan
    *
    * @param data Creation options for the new plan.
    */
  def create(
    data: stripeLib.stripeMod.StripeNs.plansNs.IPlanCreationOptions,
    options: stripeLib.stripeMod.StripeNs.HeaderOptions
  ): js.Promise[stripeLib.stripeMod.StripeNs.plansNs.IPlan] = js.native
  def create(
    data: stripeLib.stripeMod.StripeNs.plansNs.IPlanCreationOptions,
    options: stripeLib.stripeMod.StripeNs.HeaderOptions,
    response: stripeLib.stripeMod.StripeNs.IResponseFn[stripeLib.stripeMod.StripeNs.plansNs.IPlan]
  ): js.Promise[stripeLib.stripeMod.StripeNs.plansNs.IPlan] = js.native
  def create(
    data: stripeLib.stripeMod.StripeNs.plansNs.IPlanCreationOptions,
    response: stripeLib.stripeMod.StripeNs.IResponseFn[stripeLib.stripeMod.StripeNs.plansNs.IPlan]
  ): js.Promise[stripeLib.stripeMod.StripeNs.plansNs.IPlan] = js.native
  def del(planName: java.lang.String): js.Promise[stripeLib.stripeMod.StripeNs.IDeleteConfirmation] = js.native
  /**
    * You can delete plans via the plan management page of the Stripe dashboard. However, deleting a plan does not affect
    * any current subscribers to the plan; it merely means that new subscribers can't be added to that plan. You can also
    * delete plans via the API.
    *
    * @returns An object with the deleted plan's ID and a deleted flag upon success. Otherwise, this call throws an error, such as if the plan has already been deleted.
    *
    * @param planName The identifier of the plan to be deleted.
    */
  def del(planName: java.lang.String, options: stripeLib.stripeMod.StripeNs.HeaderOptions): js.Promise[stripeLib.stripeMod.StripeNs.IDeleteConfirmation] = js.native
  def del(
    planName: java.lang.String,
    options: stripeLib.stripeMod.StripeNs.HeaderOptions,
    response: stripeLib.stripeMod.StripeNs.IResponseFn[stripeLib.stripeMod.StripeNs.IDeleteConfirmation]
  ): js.Promise[stripeLib.stripeMod.StripeNs.IDeleteConfirmation] = js.native
  def del(
    planName: java.lang.String,
    response: stripeLib.stripeMod.StripeNs.IResponseFn[stripeLib.stripeMod.StripeNs.IDeleteConfirmation]
  ): js.Promise[stripeLib.stripeMod.StripeNs.IDeleteConfirmation] = js.native
  def list(): js.Promise[stripeLib.stripeMod.StripeNs.IList[stripeLib.stripeMod.StripeNs.plansNs.IPlan]] = js.native
  def list(data: IPlanListOptions): js.Promise[stripeLib.stripeMod.StripeNs.IList[stripeLib.stripeMod.StripeNs.plansNs.IPlan]] = js.native
  /**
    * Returns a list of your plans.
    *
    * @returns An object with a data property that contains an array of up to limit plans, starting after plan starting_after.
    * Each entry in the array is a separate plan object. If no more plans are available, the resulting array will be empty. This
    * request should never throw an error. You can optionally request that the response include the total count of all plans. To
    * do so, specify include[]=total_count in your request.
    */
  def list(data: IPlanListOptions, options: stripeLib.stripeMod.StripeNs.HeaderOptions): js.Promise[stripeLib.stripeMod.StripeNs.IList[stripeLib.stripeMod.StripeNs.plansNs.IPlan]] = js.native
  def list(
    data: IPlanListOptions,
    options: stripeLib.stripeMod.StripeNs.HeaderOptions,
    response: stripeLib.stripeMod.StripeNs.IResponseFn[stripeLib.stripeMod.StripeNs.IList[stripeLib.stripeMod.StripeNs.plansNs.IPlan]]
  ): js.Promise[stripeLib.stripeMod.StripeNs.IList[stripeLib.stripeMod.StripeNs.plansNs.IPlan]] = js.native
  def list(
    data: IPlanListOptions,
    response: stripeLib.stripeMod.StripeNs.IResponseFn[stripeLib.stripeMod.StripeNs.IList[stripeLib.stripeMod.StripeNs.plansNs.IPlan]]
  ): js.Promise[stripeLib.stripeMod.StripeNs.IList[stripeLib.stripeMod.StripeNs.plansNs.IPlan]] = js.native
  def list(options: stripeLib.stripeMod.StripeNs.HeaderOptions): js.Promise[stripeLib.stripeMod.StripeNs.IList[stripeLib.stripeMod.StripeNs.plansNs.IPlan]] = js.native
  def list(
    options: stripeLib.stripeMod.StripeNs.HeaderOptions,
    response: stripeLib.stripeMod.StripeNs.IResponseFn[stripeLib.stripeMod.StripeNs.IList[stripeLib.stripeMod.StripeNs.plansNs.IPlan]]
  ): js.Promise[stripeLib.stripeMod.StripeNs.IList[stripeLib.stripeMod.StripeNs.plansNs.IPlan]] = js.native
  def list(
    response: stripeLib.stripeMod.StripeNs.IResponseFn[stripeLib.stripeMod.StripeNs.IList[stripeLib.stripeMod.StripeNs.plansNs.IPlan]]
  ): js.Promise[stripeLib.stripeMod.StripeNs.IList[stripeLib.stripeMod.StripeNs.plansNs.IPlan]] = js.native
  def retrieve(planName: java.lang.String): js.Promise[stripeLib.stripeMod.StripeNs.plansNs.IPlan] = js.native
  /**
    * Retrieves the plan with the given ID.
    *
    * @returns Returns a plan if a valid plan ID was provided. Throws an error otherwise.
    *
    * @param planName The identifier of the desired plan.
    */
  def retrieve(planName: java.lang.String, options: stripeLib.stripeMod.StripeNs.HeaderOptions): js.Promise[stripeLib.stripeMod.StripeNs.plansNs.IPlan] = js.native
  def retrieve(
    planName: java.lang.String,
    options: stripeLib.stripeMod.StripeNs.HeaderOptions,
    response: stripeLib.stripeMod.StripeNs.IResponseFn[stripeLib.stripeMod.StripeNs.plansNs.IPlan]
  ): js.Promise[stripeLib.stripeMod.StripeNs.plansNs.IPlan] = js.native
  def retrieve(
    planName: java.lang.String,
    response: stripeLib.stripeMod.StripeNs.IResponseFn[stripeLib.stripeMod.StripeNs.plansNs.IPlan]
  ): js.Promise[stripeLib.stripeMod.StripeNs.plansNs.IPlan] = js.native
  def update(planName: java.lang.String, data: stripeLib.stripeMod.StripeNs.plansNs.IPlanUpdateOptions): js.Promise[stripeLib.stripeMod.StripeNs.plansNs.IPlan] = js.native
  /**
    * Updates the name of a plan. Other plan details (price, interval, etc.) are, by design, not editable.
    *
    * @returns The updated plan object is returned upon success. Otherwise, this call throws an error.
    *
    * @param planName The identifier of the plan to update
    * @param data The fields to update
    */
  def update(
    planName: java.lang.String,
    data: stripeLib.stripeMod.StripeNs.plansNs.IPlanUpdateOptions,
    options: stripeLib.stripeMod.StripeNs.HeaderOptions
  ): js.Promise[stripeLib.stripeMod.StripeNs.plansNs.IPlan] = js.native
  def update(
    planName: java.lang.String,
    data: stripeLib.stripeMod.StripeNs.plansNs.IPlanUpdateOptions,
    options: stripeLib.stripeMod.StripeNs.HeaderOptions,
    response: stripeLib.stripeMod.StripeNs.IResponseFn[stripeLib.stripeMod.StripeNs.plansNs.IPlan]
  ): js.Promise[stripeLib.stripeMod.StripeNs.plansNs.IPlan] = js.native
  def update(
    planName: java.lang.String,
    data: stripeLib.stripeMod.StripeNs.plansNs.IPlanUpdateOptions,
    response: stripeLib.stripeMod.StripeNs.IResponseFn[stripeLib.stripeMod.StripeNs.plansNs.IPlan]
  ): js.Promise[stripeLib.stripeMod.StripeNs.plansNs.IPlan] = js.native
}

