package typings.wonderDotJs.distEs2015EventInterfaceIEventDataMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IKeyboardEventData extends IEventData {
  var altKey: Double
  var ctrlKey: Double
  var keyCode: Double
  var metaKey: Double
  var shiftKey: Double
}

object IKeyboardEventData {
  @scala.inline
  def apply(
    altKey: Double,
    ctrlKey: Double,
    keyCode: Double,
    metaKey: Double,
    preventDefault: () => Unit,
    returnValue: Boolean,
    shiftKey: Double
  ): IKeyboardEventData = {
    val __obj = js.Dynamic.literal(altKey = altKey, ctrlKey = ctrlKey, keyCode = keyCode, metaKey = metaKey, preventDefault = js.Any.fromFunction0(preventDefault), returnValue = returnValue, shiftKey = shiftKey)
  
    __obj.asInstanceOf[IKeyboardEventData]
  }
}

