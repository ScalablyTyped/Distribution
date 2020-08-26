package typings.webpackBlocksDevServer.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ContextObject extends js.Object {
  var `match`: js.Any = js.native
  var parsedUrl: js.Any = js.native
  var request: js.Any = js.native
}

object ContextObject {
  @scala.inline
  def apply(`match`: js.Any, parsedUrl: js.Any, request: js.Any): ContextObject = {
    val __obj = js.Dynamic.literal(parsedUrl = parsedUrl.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any])
    __obj.updateDynamic("match")(`match`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContextObject]
  }
  @scala.inline
  implicit class ContextObjectOps[Self <: ContextObject] (val x: Self) extends AnyVal {
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
    def setMatch(value: js.Any): Self = this.set("match", value.asInstanceOf[js.Any])
    @scala.inline
    def setParsedUrl(value: js.Any): Self = this.set("parsedUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def setRequest(value: js.Any): Self = this.set("request", value.asInstanceOf[js.Any])
  }
  
}

