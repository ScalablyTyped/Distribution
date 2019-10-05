package typings.w2ui.W2UI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait W2Event extends js.Object {
  var target: String
  def onComplete(): Unit
}

object W2Event {
  @scala.inline
  def apply(onComplete: () => Unit, target: String): W2Event = {
    val __obj = js.Dynamic.literal(onComplete = js.Any.fromFunction0(onComplete), target = target)
  
    __obj.asInstanceOf[W2Event]
  }
}

