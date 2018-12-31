package typings
package themingLib.themingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Broadcast[T /* <: Theme */] extends js.Object {
  def getState(): T
  def subscribe(callback: js.Function0[scala.Unit]): SubscriptionId
  def unsubscribe(id: SubscriptionId): scala.Unit
}

