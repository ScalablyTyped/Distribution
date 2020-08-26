package typings.webcl.WEBCL

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// 3.10
@js.native
trait WebCLEvent extends js.Object {
  def getInfo(name: EventInfo): js.Any = js.native
  def getProfilingInfo(name: ProfilingInfo): Double = js.native
  def release(): Unit = js.native
  def setCallback(commandExecCallbackType: CommandExecutionStatus, notify: WebCLCallback): Unit = js.native
}

object WebCLEvent {
  @scala.inline
  def apply(
    getInfo: EventInfo => js.Any,
    getProfilingInfo: ProfilingInfo => Double,
    release: () => Unit,
    setCallback: (CommandExecutionStatus, WebCLCallback) => Unit
  ): WebCLEvent = {
    val __obj = js.Dynamic.literal(getInfo = js.Any.fromFunction1(getInfo), getProfilingInfo = js.Any.fromFunction1(getProfilingInfo), release = js.Any.fromFunction0(release), setCallback = js.Any.fromFunction2(setCallback))
    __obj.asInstanceOf[WebCLEvent]
  }
  @scala.inline
  implicit class WebCLEventOps[Self <: WebCLEvent] (val x: Self) extends AnyVal {
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
    def setGetInfo(value: EventInfo => js.Any): Self = this.set("getInfo", js.Any.fromFunction1(value))
    @scala.inline
    def setGetProfilingInfo(value: ProfilingInfo => Double): Self = this.set("getProfilingInfo", js.Any.fromFunction1(value))
    @scala.inline
    def setRelease(value: () => Unit): Self = this.set("release", js.Any.fromFunction0(value))
    @scala.inline
    def setSetCallback(value: (CommandExecutionStatus, WebCLCallback) => Unit): Self = this.set("setCallback", js.Any.fromFunction2(value))
  }
  
}

