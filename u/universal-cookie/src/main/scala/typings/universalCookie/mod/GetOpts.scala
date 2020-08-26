package typings.universalCookie.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetOpts extends js.Object {
  /**
    * do not convert the cookie into an object no matter what
    */
  var doNotParse: Boolean = js.native
}

object GetOpts {
  @scala.inline
  def apply(doNotParse: Boolean): GetOpts = {
    val __obj = js.Dynamic.literal(doNotParse = doNotParse.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetOpts]
  }
  @scala.inline
  implicit class GetOptsOps[Self <: GetOpts] (val x: Self) extends AnyVal {
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
    def setDoNotParse(value: Boolean): Self = this.set("doNotParse", value.asInstanceOf[js.Any])
  }
  
}

