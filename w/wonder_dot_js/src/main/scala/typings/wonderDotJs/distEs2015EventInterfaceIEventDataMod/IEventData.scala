package typings.wonderDotJs.distEs2015EventInterfaceIEventDataMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IEventData extends js.Object {
  var returnValue: Boolean
  def preventDefault(): Unit
}

object IEventData {
  @scala.inline
  def apply(preventDefault: () => Unit, returnValue: Boolean): IEventData = {
    val __obj = js.Dynamic.literal(preventDefault = js.Any.fromFunction0(preventDefault), returnValue = returnValue.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IEventData]
  }
}

