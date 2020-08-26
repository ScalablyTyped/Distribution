package typings.unimodulesCore.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CurrentVersion extends js.Object {
  var currentVersion: js.UndefOr[String] = js.native
  var replacement: js.UndefOr[String] = js.native
  var versionToRemove: js.UndefOr[String] = js.native
}

object CurrentVersion {
  @scala.inline
  def apply(): CurrentVersion = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CurrentVersion]
  }
  @scala.inline
  implicit class CurrentVersionOps[Self <: CurrentVersion] (val x: Self) extends AnyVal {
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
    def setCurrentVersion(value: String): Self = this.set("currentVersion", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCurrentVersion: Self = this.set("currentVersion", js.undefined)
    @scala.inline
    def setReplacement(value: String): Self = this.set("replacement", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReplacement: Self = this.set("replacement", js.undefined)
    @scala.inline
    def setVersionToRemove(value: String): Self = this.set("versionToRemove", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVersionToRemove: Self = this.set("versionToRemove", js.undefined)
  }
  
}

