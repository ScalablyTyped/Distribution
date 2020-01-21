package typings.webPush.mod

import typings.node.Buffer
import typings.webPush.AnonBody
import typings.webPush.AnonBodyBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("web-push", "generateRequestDetails")
@js.native
object generateRequestDetails extends js.Object {
  def apply(subscription: PushSubscription): RequestDetails with AnonBody = js.native
  def apply(subscription: PushSubscription, payload: String): RequestDetails with AnonBodyBuffer = js.native
  def apply(subscription: PushSubscription, payload: String, options: RequestOptions): RequestDetails with AnonBodyBuffer = js.native
  def apply(subscription: PushSubscription, payload: Null, options: RequestOptions): RequestDetails with AnonBody = js.native
  def apply(subscription: PushSubscription, payload: Buffer): RequestDetails with AnonBodyBuffer = js.native
  def apply(subscription: PushSubscription, payload: Buffer, options: RequestOptions): RequestDetails with AnonBodyBuffer = js.native
}

