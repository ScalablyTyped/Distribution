package typings
package xtermLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DocumentAndElementEventHandlersEventMap extends js.Object {
  var copy: ClipboardEvent
  var cut: ClipboardEvent
  var paste: ClipboardEvent
}

object DocumentAndElementEventHandlersEventMap {
  @scala.inline
  def apply(copy: ClipboardEvent, cut: ClipboardEvent, paste: ClipboardEvent): DocumentAndElementEventHandlersEventMap = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("copy")(copy)
    __obj.updateDynamic("cut")(cut)
    __obj.updateDynamic("paste")(paste)
    __obj.asInstanceOf[DocumentAndElementEventHandlersEventMap]
  }
}

