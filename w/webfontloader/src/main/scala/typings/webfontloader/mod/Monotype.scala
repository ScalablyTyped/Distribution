package typings.webfontloader.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Monotype extends js.Object {
  var loadAllFonts: js.UndefOr[Boolean] = js.native
  var projectId: js.UndefOr[String] = js.native
  var version: js.UndefOr[Double] = js.native
}

object Monotype {
  @scala.inline
  def apply(): Monotype = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Monotype]
  }
  @scala.inline
  implicit class MonotypeOps[Self <: Monotype] (val x: Self) extends AnyVal {
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
    def setLoadAllFonts(value: Boolean): Self = this.set("loadAllFonts", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLoadAllFonts: Self = this.set("loadAllFonts", js.undefined)
    @scala.inline
    def setProjectId(value: String): Self = this.set("projectId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProjectId: Self = this.set("projectId", js.undefined)
    @scala.inline
    def setVersion(value: Double): Self = this.set("version", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVersion: Self = this.set("version", js.undefined)
  }
  
}

