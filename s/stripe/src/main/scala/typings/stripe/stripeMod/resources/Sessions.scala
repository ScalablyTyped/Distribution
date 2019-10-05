package typings.stripe.stripeMod.resources

import typings.stripe.stripeMod.HeaderOptions
import typings.stripe.stripeMod.IResponseFn
import typings.stripe.stripeMod.StripeResource
import typings.stripe.stripeMod.checkouts.sessions.ICheckoutCreationOptions
import typings.stripe.stripeMod.checkouts.sessions.ICheckoutSession
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("stripe", "resources.Sessions")
@js.native
class Sessions () extends StripeResource {
  def create(data: ICheckoutCreationOptions): js.Promise[ICheckoutSession] = js.native
  def create(data: ICheckoutCreationOptions, response: IResponseFn[ICheckoutSession]): js.Promise[ICheckoutSession] = js.native
  def retrieve(data: String): js.Promise[ICheckoutSession] = js.native
  def retrieve(data: String, options: HeaderOptions): js.Promise[ICheckoutSession] = js.native
  def retrieve(data: String, options: HeaderOptions, response: IResponseFn[ICheckoutSession]): js.Promise[ICheckoutSession] = js.native
  def retrieve(data: String, response: IResponseFn[ICheckoutSession]): js.Promise[ICheckoutSession] = js.native
}

