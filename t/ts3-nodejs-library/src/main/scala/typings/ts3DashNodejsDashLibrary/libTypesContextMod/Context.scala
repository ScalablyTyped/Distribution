package typings.ts3DashNodejsDashLibrary.libTypesContextMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Context extends js.Object {
  var client_nickname: js.UndefOr[String] = js.undefined
  var events: js.Array[ActiveEvent]
  var login: js.UndefOr[LoginInfo] = js.undefined
  var selectType: SelectType
  var selected: Double
}

object Context {
  @scala.inline
  def apply(
    events: js.Array[ActiveEvent],
    selectType: SelectType,
    selected: Double,
    client_nickname: String = null,
    login: LoginInfo = null
  ): Context = {
    val __obj = js.Dynamic.literal(events = events.asInstanceOf[js.Any], selectType = selectType.asInstanceOf[js.Any], selected = selected.asInstanceOf[js.Any])
    if (client_nickname != null) __obj.updateDynamic("client_nickname")(client_nickname.asInstanceOf[js.Any])
    if (login != null) __obj.updateDynamic("login")(login.asInstanceOf[js.Any])
    __obj.asInstanceOf[Context]
  }
}

