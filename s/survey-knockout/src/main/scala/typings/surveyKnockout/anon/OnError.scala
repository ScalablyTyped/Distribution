package typings.surveyKnockout.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OnError extends js.Object {
  var onError: String = js.native
  var root: String = js.native
  var small: String = js.native
}

object OnError {
  @scala.inline
  def apply(onError: String, root: String, small: String): OnError = {
    val __obj = js.Dynamic.literal(onError = onError.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any], small = small.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnError]
  }
  @scala.inline
  implicit class OnErrorOps[Self <: OnError] (val x: Self) extends AnyVal {
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
    def setOnError(value: String): Self = this.set("onError", value.asInstanceOf[js.Any])
    @scala.inline
    def setRoot(value: String): Self = this.set("root", value.asInstanceOf[js.Any])
    @scala.inline
    def setSmall(value: String): Self = this.set("small", value.asInstanceOf[js.Any])
  }
  
}

