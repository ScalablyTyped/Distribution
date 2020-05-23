package typings.vortexWebClient.DDS

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Topic extends js.Object {
  /**
    * Called when topic gets registered in the runtime
    */
  def onregistered(): Unit
  /**
    * Called when topic gets unregistered in the runtime
    */
  def onunregistered(): Unit
}

object Topic {
  @scala.inline
  def apply(onregistered: () => Unit, onunregistered: () => Unit): Topic = {
    val __obj = js.Dynamic.literal(onregistered = js.Any.fromFunction0(onregistered), onunregistered = js.Any.fromFunction0(onunregistered))
    __obj.asInstanceOf[Topic]
  }
}

