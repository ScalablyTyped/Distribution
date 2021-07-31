package typings.stripe.mod.resources

import typings.stripe.mod.HeaderOptions
import typings.stripe.mod.IDataOptions
import typings.stripe.mod.IList
import typings.stripe.mod.IListPromise
import typings.stripe.mod.IResponseFn
import typings.stripe.mod.Stripe
import typings.stripe.mod.StripeResource
import typings.stripe.mod.fileLinks.IFileLink
import typings.stripe.mod.fileLinks.IFileLinksCreationOptions
import typings.stripe.mod.fileLinks.IFileLinksListOptions
import typings.stripe.mod.fileLinks.IFileLinksUpdateOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("stripe", "resources.FileLinks")
@js.native
class FileLinks protected () extends StripeResource {
  def this(stripe: Stripe, urlData: js.Any) = this()
  
  def create(data: IFileLinksCreationOptions): js.Promise[IFileLink] = js.native
  /**
    * Creates a new file link object.
    */
  def create(data: IFileLinksCreationOptions, options: HeaderOptions): js.Promise[IFileLink] = js.native
  def create(data: IFileLinksCreationOptions, options: HeaderOptions, response: IResponseFn[IFileLink]): js.Promise[IFileLink] = js.native
  def create(data: IFileLinksCreationOptions, response: IResponseFn[IFileLink]): js.Promise[IFileLink] = js.native
  
  def list(): IListPromise[IFileLink] = js.native
  def list(data: IFileLinksListOptions): IListPromise[IFileLink] = js.native
  /**
    * Returns a list of file links
    */
  def list(data: IFileLinksListOptions, options: HeaderOptions): IListPromise[IFileLink] = js.native
  def list(data: IFileLinksListOptions, options: HeaderOptions, response: IResponseFn[IList[IFileLink]]): IListPromise[IFileLink] = js.native
  def list(data: IFileLinksListOptions, response: IResponseFn[IList[IFileLink]]): IListPromise[IFileLink] = js.native
  def list(options: HeaderOptions): IListPromise[IFileLink] = js.native
  def list(options: HeaderOptions, response: IResponseFn[IList[IFileLink]]): IListPromise[IFileLink] = js.native
  def list(response: IResponseFn[IList[IFileLink]]): IListPromise[IFileLink] = js.native
  
  def retrieve(id: String): js.Promise[IFileLink] = js.native
  def retrieve(id: String, data: IDataOptions): js.Promise[IFileLink] = js.native
  /**
    * Returns a file link object if a valid identifier was provided, and throws an error otherwise.
    */
  def retrieve(id: String, data: IDataOptions, options: HeaderOptions): js.Promise[IFileLink] = js.native
  def retrieve(id: String, data: IDataOptions, options: HeaderOptions, response: IResponseFn[IFileLink]): js.Promise[IFileLink] = js.native
  def retrieve(id: String, data: IDataOptions, response: IResponseFn[IFileLink]): js.Promise[IFileLink] = js.native
  def retrieve(id: String, options: HeaderOptions): js.Promise[IFileLink] = js.native
  def retrieve(id: String, options: HeaderOptions, response: IResponseFn[IFileLink]): js.Promise[IFileLink] = js.native
  def retrieve(id: String, response: IResponseFn[IFileLink]): js.Promise[IFileLink] = js.native
  
  def update(id: String, data: IFileLinksUpdateOptions): js.Promise[IFileLink] = js.native
  /**
    * Updates an existing file link object. Expired links can no longer be updated. Returns the file link object if successful,
    * and throws an error otherwise.
    */
  def update(id: String, data: IFileLinksUpdateOptions, options: HeaderOptions): js.Promise[IFileLink] = js.native
  def update(
    id: String,
    data: IFileLinksUpdateOptions,
    options: HeaderOptions,
    response: IResponseFn[IFileLink]
  ): js.Promise[IFileLink] = js.native
  def update(id: String, data: IFileLinksUpdateOptions, response: IResponseFn[IFileLink]): js.Promise[IFileLink] = js.native
}
