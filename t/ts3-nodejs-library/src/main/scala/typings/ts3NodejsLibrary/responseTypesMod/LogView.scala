package typings.ts3NodejsLibrary.responseTypesMod

import typings.ts3NodejsLibrary.teamSpeakQueryMod.TeamSpeakQuery.ResponseEntry
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LogView extends ResponseEntry {
  var fileSize: Double = js.native
  var l: String = js.native
  var lastPos: Double = js.native
}

object LogView {
  @scala.inline
  def apply(fileSize: Double, l: String, lastPos: Double): LogView = {
    val __obj = js.Dynamic.literal(fileSize = fileSize.asInstanceOf[js.Any], l = l.asInstanceOf[js.Any], lastPos = lastPos.asInstanceOf[js.Any])
    __obj.asInstanceOf[LogView]
  }
  @scala.inline
  implicit class LogViewOps[Self <: LogView] (val x: Self) extends AnyVal {
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
    def setFileSize(value: Double): Self = this.set("fileSize", value.asInstanceOf[js.Any])
    @scala.inline
    def setL(value: String): Self = this.set("l", value.asInstanceOf[js.Any])
    @scala.inline
    def setLastPos(value: Double): Self = this.set("lastPos", value.asInstanceOf[js.Any])
  }
  
}

