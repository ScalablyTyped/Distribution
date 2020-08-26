package typings.svgPanZoom.SvgPanZoom

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CustomEventHandler extends js.Object {
  var destroy: js.Function = js.native
  var haltEventListeners: js.Array[String] = js.native
  def init(options: CustomEventOptions): Unit = js.native
}

object CustomEventHandler {
  @scala.inline
  def apply(destroy: js.Function, haltEventListeners: js.Array[String], init: CustomEventOptions => Unit): CustomEventHandler = {
    val __obj = js.Dynamic.literal(destroy = destroy.asInstanceOf[js.Any], haltEventListeners = haltEventListeners.asInstanceOf[js.Any], init = js.Any.fromFunction1(init))
    __obj.asInstanceOf[CustomEventHandler]
  }
  @scala.inline
  implicit class CustomEventHandlerOps[Self <: CustomEventHandler] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDestroy(value: js.Function): Self = this.set("destroy", value.asInstanceOf[js.Any])
    @scala.inline
    def setHaltEventListenersVarargs(value: String*): Self = this.set("haltEventListeners", js.Array(value :_*))
    @scala.inline
    def setHaltEventListeners(value: js.Array[String]): Self = this.set("haltEventListeners", value.asInstanceOf[js.Any])
    @scala.inline
    def setInit(value: CustomEventOptions => Unit): Self = this.set("init", js.Any.fromFunction1(value))
  }
  
}

