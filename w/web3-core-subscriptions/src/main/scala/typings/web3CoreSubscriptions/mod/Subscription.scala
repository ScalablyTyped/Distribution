package typings.web3CoreSubscriptions.mod

import typings.std.Error
import typings.web3CoreSubscriptions.web3CoreSubscriptionsStrings.changed
import typings.web3CoreSubscriptions.web3CoreSubscriptionsStrings.connected
import typings.web3CoreSubscriptions.web3CoreSubscriptionsStrings.data
import typings.web3CoreSubscriptions.web3CoreSubscriptionsStrings.error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("web3-core-subscriptions", "Subscription")
@js.native
class Subscription[T] protected () extends js.Object {
  def this(options: SubscriptionOptions) = this()
  var arguments: js.Any = js.native
  var id: String = js.native
  var lastBlock: Double = js.native
  var options: SubscriptionOptions = js.native
  def callback(): Unit = js.native
  @JSName("on")
  def on_changed(`type`: changed, handler: js.Function1[/* data */ T, Unit]): Subscription[T] = js.native
  @JSName("on")
  def on_connected(`type`: connected, handler: js.Function1[/* subscriptionId */ String, Unit]): Subscription[T] = js.native
  @JSName("on")
  def on_data(`type`: data, handler: js.Function1[/* data */ T, Unit]): Subscription[T] = js.native
  @JSName("on")
  def on_error(`type`: error, handler: js.Function1[/* data */ Error, Unit]): Subscription[T] = js.native
  def subscribe(): Subscription[T] = js.native
  def subscribe(callback: js.Function2[/* error */ Error, /* result */ T, Unit]): Subscription[T] = js.native
  def unsubscribe(): js.Promise[js.UndefOr[Boolean]] = js.native
  def unsubscribe(callback: js.Function2[/* error */ Error, /* result */ Boolean, Unit]): js.Promise[js.UndefOr[Boolean]] = js.native
}

