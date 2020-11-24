package typings.webPush.mod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("web-push", "sendNotification")
@js.native
object sendNotification extends js.Object {
  
  def apply(subscription: PushSubscription): js.Promise[SendResult] = js.native
  def apply(subscription: PushSubscription, payload: js.UndefOr[scala.Nothing], options: RequestOptions): js.Promise[SendResult] = js.native
  def apply(subscription: PushSubscription, payload: String): js.Promise[SendResult] = js.native
  def apply(subscription: PushSubscription, payload: String, options: RequestOptions): js.Promise[SendResult] = js.native
  def apply(subscription: PushSubscription, payload: Null, options: RequestOptions): js.Promise[SendResult] = js.native
  def apply(subscription: PushSubscription, payload: Buffer): js.Promise[SendResult] = js.native
  def apply(subscription: PushSubscription, payload: Buffer, options: RequestOptions): js.Promise[SendResult] = js.native
}
