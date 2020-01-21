package typings.web3CoreSubscriptions.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("web3-core-subscriptions", "Subscriptions")
@js.native
class Subscriptions protected () extends js.Object {
  def this(options: SubscriptionsOptions) = this()
  var name: String = js.native
  val requestManager: js.Any = js.native
  var subscriptions: SubscriptionsModel = js.native
  var `type`: String = js.native
  def attachToObject(obj: js.Any): Unit = js.native
  def buildCall(): js.Function0[_] = js.native
  def setRequestManager(requestManager: js.Any): Unit = js.native
}

