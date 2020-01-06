package typings.webDashPush.webDashPushMod

import typings.node.Buffer
import typings.webDashPush.Anon_Body
import typings.webDashPush.Anon_BodyBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("web-push", "generateRequestDetails")
@js.native
object generateRequestDetails extends js.Object {
  def apply(subscription: PushSubscription): RequestDetails with Anon_Body = js.native
  def apply(subscription: PushSubscription, payload: String): RequestDetails with Anon_BodyBuffer = js.native
  def apply(subscription: PushSubscription, payload: String, options: RequestOptions): RequestDetails with Anon_BodyBuffer = js.native
  def apply(subscription: PushSubscription, payload: Null, options: RequestOptions): RequestDetails with Anon_Body = js.native
  def apply(subscription: PushSubscription, payload: Buffer): RequestDetails with Anon_BodyBuffer = js.native
  def apply(subscription: PushSubscription, payload: Buffer, options: RequestOptions): RequestDetails with Anon_BodyBuffer = js.native
}

