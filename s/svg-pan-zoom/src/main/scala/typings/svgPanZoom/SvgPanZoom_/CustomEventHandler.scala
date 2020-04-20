package typings.svgPanZoom.SvgPanZoom_

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
    val __obj = js.Dynamic.literal(destroy = destroy.asInstanceOf[js.Any], haltEventListeners = haltEventListeners.asInstanceOf[js.Any], init = js.Any.fromFunction1(init))
    __obj.asInstanceOf[CustomEventHandler]
  }
}

