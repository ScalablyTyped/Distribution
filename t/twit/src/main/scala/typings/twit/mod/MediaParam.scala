package typings.twit.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MediaParam extends js.Object {
  var file_path: String = js.native
}

object MediaParam {
  @scala.inline
  def apply(file_path: String): MediaParam = {
    val __obj = js.Dynamic.literal(file_path = file_path.asInstanceOf[js.Any])
    __obj.asInstanceOf[MediaParam]
  }
  @scala.inline
  implicit class MediaParamOps[Self <: MediaParam] (val x: Self) extends AnyVal {
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
    def setFile_path(value: String): Self = this.set("file_path", value.asInstanceOf[js.Any])
  }
  
}

