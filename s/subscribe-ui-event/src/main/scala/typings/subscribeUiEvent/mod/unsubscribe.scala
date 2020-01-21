package typings.subscribeUiEvent.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("subscribe-ui-event", "unsubscribe")
@js.native
object unsubscribe extends js.Object {
  def apply[T /* <: UIEventType */](eventType: T, callback: UIEventCallback[T]): Unit = js.native
}

