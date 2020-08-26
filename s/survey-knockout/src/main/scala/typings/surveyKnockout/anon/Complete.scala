package typings.surveyKnockout.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Complete extends js.Object {
  var complete: String = js.native
  var edit: String = js.native
  var next: String = js.native
  var prev: String = js.native
  var preview: String = js.native
  var start: String = js.native
}

object Complete {
  @scala.inline
  def apply(complete: String, edit: String, next: String, prev: String, preview: String, start: String): Complete = {
    val __obj = js.Dynamic.literal(complete = complete.asInstanceOf[js.Any], edit = edit.asInstanceOf[js.Any], next = next.asInstanceOf[js.Any], prev = prev.asInstanceOf[js.Any], preview = preview.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.asInstanceOf[Complete]
  }
  @scala.inline
  implicit class CompleteOps[Self <: Complete] (val x: Self) extends AnyVal {
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
    def setComplete(value: String): Self = this.set("complete", value.asInstanceOf[js.Any])
    @scala.inline
    def setEdit(value: String): Self = this.set("edit", value.asInstanceOf[js.Any])
    @scala.inline
    def setNext(value: String): Self = this.set("next", value.asInstanceOf[js.Any])
    @scala.inline
    def setPrev(value: String): Self = this.set("prev", value.asInstanceOf[js.Any])
    @scala.inline
    def setPreview(value: String): Self = this.set("preview", value.asInstanceOf[js.Any])
    @scala.inline
    def setStart(value: String): Self = this.set("start", value.asInstanceOf[js.Any])
  }
  
}

