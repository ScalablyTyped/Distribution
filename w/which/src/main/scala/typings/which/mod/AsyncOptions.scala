package typings.which.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Options for which() async API */
@js.native
trait AsyncOptions extends js.Object {
  /** If true, return all matches, instead of just the first one. Note that this means the function returns an array of strings instead of a single string. */
  var all: js.UndefOr[Boolean] = js.native
  /** Use instead of the PATH environment variable. */
  var path: js.UndefOr[String] = js.native
  /** Use instead of the PATHEXT environment variable. */
  var pathExt: js.UndefOr[String] = js.native
}

object AsyncOptions {
  @scala.inline
  def apply(): AsyncOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AsyncOptions]
  }
  @scala.inline
  implicit class AsyncOptionsOps[Self <: AsyncOptions] (val x: Self) extends AnyVal {
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
    def setAll(value: Boolean): Self = this.set("all", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAll: Self = this.set("all", js.undefined)
    @scala.inline
    def setPath(value: String): Self = this.set("path", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePath: Self = this.set("path", js.undefined)
    @scala.inline
    def setPathExt(value: String): Self = this.set("pathExt", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePathExt: Self = this.set("pathExt", js.undefined)
  }
  
}

