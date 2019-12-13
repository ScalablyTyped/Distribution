package typings.stripe.stripeMod.resources

import typings.stripe.stripeMod.HeaderOptions
import typings.stripe.stripeMod.IList
import typings.stripe.stripeMod.IResponseFn
import typings.stripe.stripeMod.StripeResource
import typings.stripe.stripeMod.issuing.authorizations.IAuthorization
import typings.stripe.stripeMod.issuing.authorizations.IAuthorizationApproveOptions
import typings.stripe.stripeMod.issuing.authorizations.IAuthorizationDeclineOptions
import typings.stripe.stripeMod.issuing.authorizations.IAuthorizationListOptions
import typings.stripe.stripeMod.issuing.authorizations.IAuthorizationUpdateOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("stripe", "resources.Authorizations")
@js.native
class Authorizations () extends StripeResource {
  def approve(id: String): js.Promise[IAuthorization] = js.native
  def approve(id: String, data: IAuthorizationApproveOptions): js.Promise[IAuthorization] = js.native
  /**
    * Approves a pending Issuing Authorization object.
    */
  def approve(id: String, data: IAuthorizationApproveOptions, options: HeaderOptions): js.Promise[IAuthorization] = js.native
  def approve(
    id: String,
    data: IAuthorizationApproveOptions,
    options: HeaderOptions,
    response: IResponseFn[IAuthorization]
  ): js.Promise[IAuthorization] = js.native
  def approve(id: String, data: IAuthorizationApproveOptions, response: IResponseFn[IAuthorization]): js.Promise[IAuthorization] = js.native
  def approve(id: String, options: HeaderOptions): js.Promise[IAuthorization] = js.native
  def approve(id: String, options: HeaderOptions, response: IResponseFn[IAuthorization]): js.Promise[IAuthorization] = js.native
  def approve(id: String, response: IResponseFn[IAuthorization]): js.Promise[IAuthorization] = js.native
  def decline(id: String): js.Promise[IAuthorization] = js.native
  def decline(id: String, data: IAuthorizationDeclineOptions): js.Promise[IAuthorization] = js.native
  /**
    * Declines a pending Issuing Authorization object.
    */
  def decline(id: String, data: IAuthorizationDeclineOptions, options: HeaderOptions): js.Promise[IAuthorization] = js.native
  def decline(
    id: String,
    data: IAuthorizationDeclineOptions,
    options: HeaderOptions,
    response: IResponseFn[IAuthorization]
  ): js.Promise[IAuthorization] = js.native
  def decline(id: String, data: IAuthorizationDeclineOptions, response: IResponseFn[IAuthorization]): js.Promise[IAuthorization] = js.native
  def decline(id: String, options: HeaderOptions): js.Promise[IAuthorization] = js.native
  def decline(id: String, options: HeaderOptions, response: IResponseFn[IAuthorization]): js.Promise[IAuthorization] = js.native
  def decline(id: String, response: IResponseFn[IAuthorization]): js.Promise[IAuthorization] = js.native
  def list(): js.Promise[IList[IAuthorization]] = js.native
  def list(data: IAuthorizationListOptions): js.Promise[IList[IAuthorization]] = js.native
  /**
    * Returns a list of Issuing Authorization objects. The objects are sorted in descending order by creation date,
    * with the most recently created object appearing first.
    */
  def list(data: IAuthorizationListOptions, options: HeaderOptions): js.Promise[IList[IAuthorization]] = js.native
  def list(
    data: IAuthorizationListOptions,
    options: HeaderOptions,
    response: IResponseFn[IList[IAuthorization]]
  ): js.Promise[IList[IAuthorization]] = js.native
  def list(data: IAuthorizationListOptions, response: IResponseFn[IList[IAuthorization]]): js.Promise[IList[IAuthorization]] = js.native
  def list(options: HeaderOptions): js.Promise[IList[IAuthorization]] = js.native
  def list(options: HeaderOptions, response: IResponseFn[IList[IAuthorization]]): js.Promise[IList[IAuthorization]] = js.native
  def list(response: IResponseFn[IList[IAuthorization]]): js.Promise[IList[IAuthorization]] = js.native
  def retrieve(id: String): js.Promise[IAuthorization] = js.native
  /**
    * Retrieves an Issuing Authorization object.
    */
  def retrieve(id: String, options: HeaderOptions): js.Promise[IAuthorization] = js.native
  def retrieve(id: String, options: HeaderOptions, response: IResponseFn[IAuthorization]): js.Promise[IAuthorization] = js.native
  def retrieve(id: String, response: IResponseFn[IAuthorization]): js.Promise[IAuthorization] = js.native
  def update(id: String, data: IAuthorizationUpdateOptions): js.Promise[IAuthorization] = js.native
  /**
    * Updates the specified Issuing Authorization object by setting the values of the parameters passed. Any parameters not provided will be left unchanged.
    */
  def update(id: String, data: IAuthorizationUpdateOptions, options: HeaderOptions): js.Promise[IAuthorization] = js.native
  def update(
    id: String,
    data: IAuthorizationUpdateOptions,
    options: HeaderOptions,
    response: IResponseFn[IAuthorization]
  ): js.Promise[IAuthorization] = js.native
  def update(id: String, data: IAuthorizationUpdateOptions, response: IResponseFn[IAuthorization]): js.Promise[IAuthorization] = js.native
}

