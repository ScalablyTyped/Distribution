package typings.ts3NodejsLibrary.contextMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BaseContext extends js.Object {
  var clientNickname: js.UndefOr[String] = js.native
  var events: js.Array[ActiveEvent] = js.native
  var login: js.UndefOr[LoginInfo] = js.native
  var selectType: SelectType = js.native
}

object BaseContext {
  @scala.inline
  def apply(events: js.Array[ActiveEvent], selectType: SelectType): BaseContext = {
    val __obj = js.Dynamic.literal(events = events.asInstanceOf[js.Any], selectType = selectType.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseContext]
  }
  @scala.inline
  implicit class BaseContextOps[Self <: BaseContext] (val x: Self) extends AnyVal {
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
    def setEventsVarargs(value: ActiveEvent*): Self = this.set("events", js.Array(value :_*))
    @scala.inline
    def setEvents(value: js.Array[ActiveEvent]): Self = this.set("events", value.asInstanceOf[js.Any])
    @scala.inline
    def setSelectType(value: SelectType): Self = this.set("selectType", value.asInstanceOf[js.Any])
    @scala.inline
    def setClientNickname(value: String): Self = this.set("clientNickname", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClientNickname: Self = this.set("clientNickname", js.undefined)
    @scala.inline
    def setLogin(value: LoginInfo): Self = this.set("login", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLogin: Self = this.set("login", js.undefined)
  }
  
}

