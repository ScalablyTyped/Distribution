package typings.ts3NodejsLibrary.responseTypesMod

import typings.ts3NodejsLibrary.teamSpeakQueryMod.TeamSpeakQuery.ResponseEntry
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait QueryErrorMessage extends ResponseEntry {
  var extraMsg: js.UndefOr[String] = js.native
  var failedPermid: js.UndefOr[Double] = js.native
  var id: String = js.native
  var msg: String = js.native
}

object QueryErrorMessage {
  @scala.inline
  def apply(id: String, msg: String): QueryErrorMessage = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], msg = msg.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryErrorMessage]
  }
  @scala.inline
  implicit class QueryErrorMessageOps[Self <: QueryErrorMessage] (val x: Self) extends AnyVal {
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
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setMsg(value: String): Self = this.set("msg", value.asInstanceOf[js.Any])
    @scala.inline
    def setExtraMsg(value: String): Self = this.set("extraMsg", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExtraMsg: Self = this.set("extraMsg", js.undefined)
    @scala.inline
    def setFailedPermid(value: Double): Self = this.set("failedPermid", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFailedPermid: Self = this.set("failedPermid", js.undefined)
  }
  
}

