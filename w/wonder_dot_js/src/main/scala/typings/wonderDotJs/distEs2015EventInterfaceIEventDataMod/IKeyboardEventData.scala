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
    val __obj = js.Dynamic.literal(altKey = altKey.asInstanceOf[js.Any], ctrlKey = ctrlKey.asInstanceOf[js.Any], keyCode = keyCode.asInstanceOf[js.Any], metaKey = metaKey.asInstanceOf[js.Any], preventDefault = js.Any.fromFunction0(preventDefault), returnValue = returnValue.asInstanceOf[js.Any], shiftKey = shiftKey.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IKeyboardEventData]
  }
}

