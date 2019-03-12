package typings
package wonderDotJsLib.distEs2015EventInterfaceIEventDataMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IEventData extends js.Object {
  var returnValue: scala.Boolean
  def preventDefault(): scala.Unit
}

object IEventData {
  @scala.inline
  def apply(preventDefault: () => scala.Unit, returnValue: scala.Boolean): IEventData = {
    val __obj = js.Dynamic.literal(preventDefault = js.Any.fromFunction0(preventDefault), returnValue = returnValue)
  
    __obj.asInstanceOf[IEventData]
  }
}

