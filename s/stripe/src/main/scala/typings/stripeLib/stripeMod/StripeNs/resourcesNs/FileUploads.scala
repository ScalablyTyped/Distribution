package typings
package stripeLib.stripeMod.StripeNs.resourcesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FileUploads
  extends stripeLib.stripeMod.StripeNs.StripeResource {
  def create(data: stripeLib.stripeMod.StripeNs.fileUploadsNs.IFileUploadCreationOptions): js.Promise[stripeLib.stripeMod.StripeNs.fileUploadsNs.IFileUpdate] = js.native
  /**
    * To upload a file to Stripe, you’ll need to send a request of type multipart/form-data.
    * The request should contain the file you would like to upload, as well as the parameters for creating a file.
    *
    * All of Stripe’s officially supported API libraries should have support for sending multipart/form-data.
    */
  def create(
    data: stripeLib.stripeMod.StripeNs.fileUploadsNs.IFileUploadCreationOptions,
    options: stripeLib.stripeMod.StripeNs.HeaderOptions
  ): js.Promise[stripeLib.stripeMod.StripeNs.fileUploadsNs.IFileUpdate] = js.native
  def create(
    data: stripeLib.stripeMod.StripeNs.fileUploadsNs.IFileUploadCreationOptions,
    options: stripeLib.stripeMod.StripeNs.HeaderOptions,
    response: stripeLib.stripeMod.StripeNs.IResponseFn[stripeLib.stripeMod.StripeNs.fileUploadsNs.IFileUpdate]
  ): js.Promise[stripeLib.stripeMod.StripeNs.fileUploadsNs.IFileUpdate] = js.native
  def create(
    data: stripeLib.stripeMod.StripeNs.fileUploadsNs.IFileUploadCreationOptions,
    response: stripeLib.stripeMod.StripeNs.IResponseFn[stripeLib.stripeMod.StripeNs.fileUploadsNs.IFileUpdate]
  ): js.Promise[stripeLib.stripeMod.StripeNs.fileUploadsNs.IFileUpdate] = js.native
  def list(): js.Promise[
    stripeLib.stripeMod.StripeNs.IList[stripeLib.stripeMod.StripeNs.fileUploadsNs.IFileUpdate]
  ] = js.native
  def list(data: stripeLib.stripeMod.StripeNs.fileUploadsNs.IFileUploadListOptions): js.Promise[
    stripeLib.stripeMod.StripeNs.IList[stripeLib.stripeMod.StripeNs.fileUploadsNs.IFileUpdate]
  ] = js.native
  /**
    * Returns a list of the files that you have uploaded to Stripe.
    * The file uploads are returned sorted by creation date, with the most recently created file uploads appearing first.
    */
  def list(
    data: stripeLib.stripeMod.StripeNs.fileUploadsNs.IFileUploadListOptions,
    options: stripeLib.stripeMod.StripeNs.HeaderOptions
  ): js.Promise[
    stripeLib.stripeMod.StripeNs.IList[stripeLib.stripeMod.StripeNs.fileUploadsNs.IFileUpdate]
  ] = js.native
  def list(
    data: stripeLib.stripeMod.StripeNs.fileUploadsNs.IFileUploadListOptions,
    options: stripeLib.stripeMod.StripeNs.HeaderOptions,
    response: stripeLib.stripeMod.StripeNs.IResponseFn[
      stripeLib.stripeMod.StripeNs.IList[stripeLib.stripeMod.StripeNs.fileUploadsNs.IFileUpdate]
    ]
  ): js.Promise[
    stripeLib.stripeMod.StripeNs.IList[stripeLib.stripeMod.StripeNs.fileUploadsNs.IFileUpdate]
  ] = js.native
  def list(
    data: stripeLib.stripeMod.StripeNs.fileUploadsNs.IFileUploadListOptions,
    response: stripeLib.stripeMod.StripeNs.IResponseFn[
      stripeLib.stripeMod.StripeNs.IList[stripeLib.stripeMod.StripeNs.fileUploadsNs.IFileUpdate]
    ]
  ): js.Promise[
    stripeLib.stripeMod.StripeNs.IList[stripeLib.stripeMod.StripeNs.fileUploadsNs.IFileUpdate]
  ] = js.native
  def list(options: stripeLib.stripeMod.StripeNs.HeaderOptions): js.Promise[
    stripeLib.stripeMod.StripeNs.IList[stripeLib.stripeMod.StripeNs.fileUploadsNs.IFileUpdate]
  ] = js.native
  def list(
    options: stripeLib.stripeMod.StripeNs.HeaderOptions,
    response: stripeLib.stripeMod.StripeNs.IResponseFn[
      stripeLib.stripeMod.StripeNs.IList[stripeLib.stripeMod.StripeNs.fileUploadsNs.IFileUpdate]
    ]
  ): js.Promise[
    stripeLib.stripeMod.StripeNs.IList[stripeLib.stripeMod.StripeNs.fileUploadsNs.IFileUpdate]
  ] = js.native
  def list(
    response: stripeLib.stripeMod.StripeNs.IResponseFn[
      stripeLib.stripeMod.StripeNs.IList[stripeLib.stripeMod.StripeNs.fileUploadsNs.IFileUpdate]
    ]
  ): js.Promise[
    stripeLib.stripeMod.StripeNs.IList[stripeLib.stripeMod.StripeNs.fileUploadsNs.IFileUpdate]
  ] = js.native
  def retrieve(id: java.lang.String): js.Promise[stripeLib.stripeMod.StripeNs.fileUploadsNs.IFileUpdate] = js.native
  def retrieve(id: java.lang.String, data: stripeLib.stripeMod.StripeNs.IDataOptions): js.Promise[stripeLib.stripeMod.StripeNs.fileUploadsNs.IFileUpdate] = js.native
  /**
    * Retrieves the details of an existing file object.
    * Supply the unique file upload ID from a file creation request, and Stripe will return the corresponding transfer information.
    */
  def retrieve(
    id: java.lang.String,
    data: stripeLib.stripeMod.StripeNs.IDataOptions,
    options: stripeLib.stripeMod.StripeNs.HeaderOptions
  ): js.Promise[stripeLib.stripeMod.StripeNs.fileUploadsNs.IFileUpdate] = js.native
  def retrieve(
    id: java.lang.String,
    data: stripeLib.stripeMod.StripeNs.IDataOptions,
    options: stripeLib.stripeMod.StripeNs.HeaderOptions,
    response: stripeLib.stripeMod.StripeNs.IResponseFn[stripeLib.stripeMod.StripeNs.fileUploadsNs.IFileUpdate]
  ): js.Promise[stripeLib.stripeMod.StripeNs.fileUploadsNs.IFileUpdate] = js.native
  def retrieve(
    id: java.lang.String,
    data: stripeLib.stripeMod.StripeNs.IDataOptions,
    response: stripeLib.stripeMod.StripeNs.IResponseFn[stripeLib.stripeMod.StripeNs.fileUploadsNs.IFileUpdate]
  ): js.Promise[stripeLib.stripeMod.StripeNs.fileUploadsNs.IFileUpdate] = js.native
  def retrieve(id: java.lang.String, options: stripeLib.stripeMod.StripeNs.HeaderOptions): js.Promise[stripeLib.stripeMod.StripeNs.fileUploadsNs.IFileUpdate] = js.native
  def retrieve(
    id: java.lang.String,
    options: stripeLib.stripeMod.StripeNs.HeaderOptions,
    response: stripeLib.stripeMod.StripeNs.IResponseFn[stripeLib.stripeMod.StripeNs.fileUploadsNs.IFileUpdate]
  ): js.Promise[stripeLib.stripeMod.StripeNs.fileUploadsNs.IFileUpdate] = js.native
  def retrieve(
    id: java.lang.String,
    response: stripeLib.stripeMod.StripeNs.IResponseFn[stripeLib.stripeMod.StripeNs.fileUploadsNs.IFileUpdate]
  ): js.Promise[stripeLib.stripeMod.StripeNs.fileUploadsNs.IFileUpdate] = js.native
}

