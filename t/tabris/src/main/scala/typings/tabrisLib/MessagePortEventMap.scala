package typings
package tabrisLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MessagePortEventMap extends js.Object {
  var message: MessageEvent
}

object MessagePortEventMap {
  @scala.inline
  def apply(message: MessageEvent): MessagePortEventMap = {
    val __obj = js.Dynamic.literal(message = message)
  
    __obj.asInstanceOf[MessagePortEventMap]
  }
}

