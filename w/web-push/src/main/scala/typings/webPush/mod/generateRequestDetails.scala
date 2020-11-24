package typings.webPush.mod

import typings.node.Buffer
import typings.webPush.anon.RequestDetailsbodynull
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("web-push", "generateRequestDetails")
@js.native
object generateRequestDetails extends js.Object {
  
  def apply(subscription: PushSubscription): RequestDetailsbodynull = js.native
  def apply(subscription: PushSubscription, payload: js.UndefOr[scala.Nothing], options: RequestOptions): RequestDetailsbodynull = js.native
  def apply(subscription: PushSubscription, payload: String): RequestDetails = js.native
  def apply(subscription: PushSubscription, payload: String, options: RequestOptions): RequestDetails = js.native
  def apply(subscription: PushSubscription, payload: Null, options: RequestOptions): RequestDetailsbodynull = js.native
  def apply(subscription: PushSubscription, payload: Buffer): RequestDetails = js.native
  def apply(subscription: PushSubscription, payload: Buffer, options: RequestOptions): RequestDetails = js.native
}
