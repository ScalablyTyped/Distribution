package typings.walk.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WalkOptions extends js.Object {
  var filters: js.UndefOr[js.Array[String]] = js.native
  var followLinks: js.UndefOr[Boolean] = js.native
  var listeners: js.UndefOr[WalkOptionsListeners] = js.native
}

object WalkOptions {
  @scala.inline
  def apply(): WalkOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WalkOptions]
  }
  @scala.inline
  implicit class WalkOptionsOps[Self <: WalkOptions] (val x: Self) extends AnyVal {
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
    def setFiltersVarargs(value: String*): Self = this.set("filters", js.Array(value :_*))
    @scala.inline
    def setFilters(value: js.Array[String]): Self = this.set("filters", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFilters: Self = this.set("filters", js.undefined)
    @scala.inline
    def setFollowLinks(value: Boolean): Self = this.set("followLinks", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFollowLinks: Self = this.set("followLinks", js.undefined)
    @scala.inline
    def setListeners(value: WalkOptionsListeners): Self = this.set("listeners", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteListeners: Self = this.set("listeners", js.undefined)
  }
  
}

