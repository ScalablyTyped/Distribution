package typings
package wonderDotJsLib.distEs2015EventInterfaceIEventDataMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IKeyboardEventData extends IEventData {
  var altKey: scala.Double
  var ctrlKey: scala.Double
  var keyCode: scala.Double
  var metaKey: scala.Double
  var shiftKey: scala.Double
}

object IKeyboardEventData {
  @scala.inline
  def apply(
    altKey: scala.Double,
    ctrlKey: scala.Double,
    keyCode: scala.Double,
    metaKey: scala.Double,
    preventDefault: () => scala.Unit,
    returnValue: scala.Boolean,
    shiftKey: scala.Double
  ): IKeyboardEventData = {
    val __obj = js.Dynamic.literal(altKey = altKey, ctrlKey = ctrlKey, keyCode = keyCode, metaKey = metaKey, preventDefault = js.Any.fromFunction0(preventDefault), returnValue = returnValue, shiftKey = shiftKey)
  
    __obj.asInstanceOf[IKeyboardEventData]
  }
}

