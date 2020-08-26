package typings.vegaTypings.signalMod

import typings.vegaTypings.onEventsMod.OnEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BaseSignal extends js.Object {
  var description: js.UndefOr[String] = js.native
  var name: String = js.native
  var on: js.UndefOr[js.Array[OnEvent]] = js.native
}

object BaseSignal {
  @scala.inline
  def apply(name: String): BaseSignal = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseSignal]
  }
  @scala.inline
  implicit class BaseSignalOps[Self <: BaseSignal] (val x: Self) extends AnyVal {
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
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    @scala.inline
    def setOnVarargs(value: OnEvent*): Self = this.set("on", js.Array(value :_*))
    @scala.inline
    def setOn(value: js.Array[OnEvent]): Self = this.set("on", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOn: Self = this.set("on", js.undefined)
  }
  
}

