package typings
package w2uiLib.W2UINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait W2Event extends js.Object {
  var target: java.lang.String
  def onComplete(): scala.Unit
}

object W2Event {
  @scala.inline
  def apply(onComplete: () => scala.Unit, target: java.lang.String): W2Event = {
    val __obj = js.Dynamic.literal(onComplete = js.Any.fromFunction0(onComplete), target = target)
  
    __obj.asInstanceOf[W2Event]
  }
}

