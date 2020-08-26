package typings.workboxPrecaching.installResultMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InstallResult extends js.Object {
  var notUpdatedURLs: js.Array[String] = js.native
  var updatedURLs: js.Array[String] = js.native
}

object InstallResult {
  @scala.inline
  def apply(notUpdatedURLs: js.Array[String], updatedURLs: js.Array[String]): InstallResult = {
    val __obj = js.Dynamic.literal(notUpdatedURLs = notUpdatedURLs.asInstanceOf[js.Any], updatedURLs = updatedURLs.asInstanceOf[js.Any])
    __obj.asInstanceOf[InstallResult]
  }
  @scala.inline
  implicit class InstallResultOps[Self <: InstallResult] (val x: Self) extends AnyVal {
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
    def setNotUpdatedURLsVarargs(value: String*): Self = this.set("notUpdatedURLs", js.Array(value :_*))
    @scala.inline
    def setNotUpdatedURLs(value: js.Array[String]): Self = this.set("notUpdatedURLs", value.asInstanceOf[js.Any])
    @scala.inline
    def setUpdatedURLsVarargs(value: String*): Self = this.set("updatedURLs", js.Array(value :_*))
    @scala.inline
    def setUpdatedURLs(value: js.Array[String]): Self = this.set("updatedURLs", value.asInstanceOf[js.Any])
  }
  
}

