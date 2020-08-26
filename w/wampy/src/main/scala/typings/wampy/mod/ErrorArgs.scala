package typings.wampy.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ErrorArgs extends js.Object {
  var details: Dict = js.native
  var error: String = js.native
}

object ErrorArgs {
  @scala.inline
  def apply(details: Dict, error: String): ErrorArgs = {
    val __obj = js.Dynamic.literal(details = details.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any])
    __obj.asInstanceOf[ErrorArgs]
  }
  @scala.inline
  implicit class ErrorArgsOps[Self <: ErrorArgs] (val x: Self) extends AnyVal {
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
    def setDetails(value: Dict): Self = this.set("details", value.asInstanceOf[js.Any])
    @scala.inline
    def setError(value: String): Self = this.set("error", value.asInstanceOf[js.Any])
  }
  
}

