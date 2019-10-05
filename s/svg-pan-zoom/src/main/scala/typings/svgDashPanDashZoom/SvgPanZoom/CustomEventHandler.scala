package typings.svgDashPanDashZoom.SvgPanZoom

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CustomEventHandler extends js.Object {
  var destroy: js.Function
  var haltEventListeners: js.Array[String]
  def init(options: CustomEventOptions): Unit
}

object CustomEventHandler {
  @scala.inline
  def apply(destroy: js.Function, haltEventListeners: js.Array[String], init: CustomEventOptions => Unit): CustomEventHandler = {
    val __obj = js.Dynamic.literal(destroy = destroy, haltEventListeners = haltEventListeners, init = js.Any.fromFunction1(init))
  
    __obj.asInstanceOf[CustomEventHandler]
  }
}

