package typings.stripe.stripeMod.resources

import typings.stripe.stripeMod.HeaderOptions
import typings.stripe.stripeMod.IDataOptions
import typings.stripe.stripeMod.IList
import typings.stripe.stripeMod.IListPromise
import typings.stripe.stripeMod.IResponseFn
import typings.stripe.stripeMod.StripeResource
import typings.stripe.stripeMod.fileUploads.IFileUpdate
import typings.stripe.stripeMod.fileUploads.IFileUploadCreationOptions
import typings.stripe.stripeMod.fileUploads.IFileUploadListOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("stripe", "resources.FileUploads")
@js.native
class FileUploads () extends StripeResource {
  def create(data: IFileUploadCreationOptions): js.Promise[IFileUpdate] = js.native
  /**
    * To upload a file to Stripe, you’ll need to send a request of type multipart/form-data.
    * The request should contain the file you would like to upload, as well as the parameters for creating a file.
    *
    * All of Stripe’s officially supported API libraries should have support for sending multipart/form-data.
    */
  def create(data: IFileUploadCreationOptions, options: HeaderOptions): js.Promise[IFileUpdate] = js.native
  def create(data: IFileUploadCreationOptions, options: HeaderOptions, response: IResponseFn[IFileUpdate]): js.Promise[IFileUpdate] = js.native
  def create(data: IFileUploadCreationOptions, response: IResponseFn[IFileUpdate]): js.Promise[IFileUpdate] = js.native
  def list(): IListPromise[IFileUpdate] = js.native
  def list(data: IFileUploadListOptions): IListPromise[IFileUpdate] = js.native
  /**
    * Returns a list of the files that you have uploaded to Stripe.
    * The file uploads are returned sorted by creation date, with the most recently created file uploads appearing first.
    */
  def list(data: IFileUploadListOptions, options: HeaderOptions): IListPromise[IFileUpdate] = js.native
  def list(data: IFileUploadListOptions, options: HeaderOptions, response: IResponseFn[IList[IFileUpdate]]): IListPromise[IFileUpdate] = js.native
  def list(data: IFileUploadListOptions, response: IResponseFn[IList[IFileUpdate]]): IListPromise[IFileUpdate] = js.native
  def list(options: HeaderOptions): IListPromise[IFileUpdate] = js.native
  def list(options: HeaderOptions, response: IResponseFn[IList[IFileUpdate]]): IListPromise[IFileUpdate] = js.native
  def list(response: IResponseFn[IList[IFileUpdate]]): IListPromise[IFileUpdate] = js.native
  def retrieve(id: String): js.Promise[IFileUpdate] = js.native
  def retrieve(id: String, data: IDataOptions): js.Promise[IFileUpdate] = js.native
  /**
    * Retrieves the details of an existing file object.
    * Supply the unique file upload ID from a file creation request, and Stripe will return the corresponding transfer information.
    */
  def retrieve(id: String, data: IDataOptions, options: HeaderOptions): js.Promise[IFileUpdate] = js.native
  def retrieve(id: String, data: IDataOptions, options: HeaderOptions, response: IResponseFn[IFileUpdate]): js.Promise[IFileUpdate] = js.native
  def retrieve(id: String, data: IDataOptions, response: IResponseFn[IFileUpdate]): js.Promise[IFileUpdate] = js.native
  def retrieve(id: String, options: HeaderOptions): js.Promise[IFileUpdate] = js.native
  def retrieve(id: String, options: HeaderOptions, response: IResponseFn[IFileUpdate]): js.Promise[IFileUpdate] = js.native
  def retrieve(id: String, response: IResponseFn[IFileUpdate]): js.Promise[IFileUpdate] = js.native
}

