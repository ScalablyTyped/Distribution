package typings.stripe.mod.resources

import typings.stripe.mod.HeaderOptions
import typings.stripe.mod.IResponseFn
import typings.stripe.mod.StripeResource
import typings.stripe.mod.sources.ISource
import typings.stripe.mod.sources.ISourceCreationOptions
import typings.stripe.mod.sources.ISourceRetrieveOptions
import typings.stripe.mod.sources.ISourceUpdateOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("stripe", "resources.Sources")
@js.native
class Sources () extends StripeResource {
  def create(data: ISourceCreationOptions): js.Promise[ISource] = js.native
  /** Create Source: https://stripe.com/docs/api/sources/create */
  def create(data: ISourceCreationOptions, options: HeaderOptions): js.Promise[ISource] = js.native
  def create(data: ISourceCreationOptions, options: HeaderOptions, response: IResponseFn[ISource]): js.Promise[ISource] = js.native
  def create(data: ISourceCreationOptions, response: IResponseFn[ISource]): js.Promise[ISource] = js.native
  def retrieve(id: String): js.Promise[ISource] = js.native
  /** Retrieve Source: https://stripe.com/docs/api/sources/retrieve */
  def retrieve(id: String, data: js.UndefOr[ISourceRetrieveOptions], options: HeaderOptions): js.Promise[ISource] = js.native
  def retrieve(
    id: String,
    data: js.UndefOr[ISourceRetrieveOptions],
    options: HeaderOptions,
    response: IResponseFn[ISource]
  ): js.Promise[ISource] = js.native
  def retrieve(id: String, data: ISourceRetrieveOptions): js.Promise[ISource] = js.native
  def retrieve(id: String, data: ISourceRetrieveOptions, response: IResponseFn[ISource]): js.Promise[ISource] = js.native
  def update(id: String, data: ISourceUpdateOptions): js.Promise[ISource] = js.native
  /** Update Source: https://stripe.com/docs/api/sources/update */
  def update(id: String, data: ISourceUpdateOptions, options: HeaderOptions): js.Promise[ISource] = js.native
  def update(id: String, data: ISourceUpdateOptions, options: HeaderOptions, response: IResponseFn[ISource]): js.Promise[ISource] = js.native
  def update(id: String, data: ISourceUpdateOptions, response: IResponseFn[ISource]): js.Promise[ISource] = js.native
}

