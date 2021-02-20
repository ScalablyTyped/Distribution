package typings.stripe.mod.resources

import typings.stripe.mod.HeaderOptions
import typings.stripe.mod.IList
import typings.stripe.mod.IListPromise
import typings.stripe.mod.IResponseFn
import typings.stripe.mod.Stripe
import typings.stripe.mod.StripeResource
import typings.stripe.mod.topups.ITopup
import typings.stripe.mod.topups.ITopupCreationOptions
import typings.stripe.mod.topups.ITopupUpdateOptions
import typings.stripe.mod.topups.ITopupsListOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("stripe", "resources.Topups")
@js.native
class Topups protected () extends StripeResource {
  def this(stripe: Stripe, urlData: js.Any) = this()
  
  def cancel(id: String): js.Promise[ITopup] = js.native
  /**
    * Cancels a top-up. Only pending top-ups can be canceled. Returns the canceled top-up. If the top-up
    * is already canceled or can’t be canceled, an error is returned.
    */
  def cancel(id: String, options: HeaderOptions): js.Promise[ITopup] = js.native
  def cancel(id: String, options: HeaderOptions, response: IResponseFn[ITopup]): js.Promise[ITopup] = js.native
  def cancel(id: String, response: IResponseFn[ITopup]): js.Promise[ITopup] = js.native
  
  def create(data: ITopupCreationOptions): js.Promise[ITopup] = js.native
  /**
    * Top up the balance of an account
    */
  def create(data: ITopupCreationOptions, options: HeaderOptions): js.Promise[ITopup] = js.native
  def create(data: ITopupCreationOptions, options: HeaderOptions, response: IResponseFn[ITopup]): js.Promise[ITopup] = js.native
  def create(data: ITopupCreationOptions, response: IResponseFn[ITopup]): js.Promise[ITopup] = js.native
  
  /**
    * A object containing the data property, which is an array of separate top-up objects. The number
    * of top-ups in the array is limited to the number designated in limit. If no more top-ups are available,
    * the resulting array will be empty. This request should never throw an error.
    */
  def list(data: ITopupsListOptions): IListPromise[ITopup] = js.native
  def list(data: ITopupsListOptions, options: HeaderOptions): IListPromise[ITopup] = js.native
  def list(data: ITopupsListOptions, options: HeaderOptions, response: IResponseFn[IList[ITopup]]): IListPromise[ITopup] = js.native
  def list(data: ITopupsListOptions, response: IResponseFn[IList[ITopup]]): IListPromise[ITopup] = js.native
  
  def retrieve(id: String): js.Promise[ITopup] = js.native
  /**
    * Retrieves the details of a top-up that has previously been created.
    */
  def retrieve(id: String, options: HeaderOptions): js.Promise[ITopup] = js.native
  def retrieve(id: String, options: HeaderOptions, response: IResponseFn[ITopup]): js.Promise[ITopup] = js.native
  def retrieve(id: String, response: IResponseFn[ITopup]): js.Promise[ITopup] = js.native
  
  def update(id: String, data: ITopupUpdateOptions): js.Promise[ITopup] = js.native
  /**
    * Updates the metadata of a top-up. Other top-up details are not editable by design.
    * Returns the newly updated top-up object if the call succeeded. Otherwise, this call throws an error.
    */
  def update(id: String, data: ITopupUpdateOptions, options: HeaderOptions): js.Promise[ITopup] = js.native
  def update(id: String, data: ITopupUpdateOptions, options: HeaderOptions, response: IResponseFn[ITopup]): js.Promise[ITopup] = js.native
  def update(id: String, data: ITopupUpdateOptions, response: IResponseFn[ITopup]): js.Promise[ITopup] = js.native
}
