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
    preventDefault: js.Function0[scala.Unit],
    returnValue: scala.Boolean,
    shiftKey: scala.Double
  ): IKeyboardEventData = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("altKey")(altKey)
    __obj.updateDynamic("ctrlKey")(ctrlKey)
    __obj.updateDynamic("keyCode")(keyCode)
    __obj.updateDynamic("metaKey")(metaKey)
    __obj.updateDynamic("preventDefault")(preventDefault)
    __obj.updateDynamic("returnValue")(returnValue)
    __obj.updateDynamic("shiftKey")(shiftKey)
    __obj.asInstanceOf[IKeyboardEventData]
  }
}

