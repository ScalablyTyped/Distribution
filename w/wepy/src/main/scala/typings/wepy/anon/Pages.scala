package typings.wepy.anon

import typings.wepy.pageMod.PageConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Pages extends js.Object {
  var pages: js.Array[String] = js.native
  var window: PageConfig = js.native
}

object Pages {
  @scala.inline
  def apply(pages: js.Array[String], window: PageConfig): Pages = {
    val __obj = js.Dynamic.literal(pages = pages.asInstanceOf[js.Any], window = window.asInstanceOf[js.Any])
    __obj.asInstanceOf[Pages]
  }
  @scala.inline
  implicit class PagesOps[Self <: Pages] (val x: Self) extends AnyVal {
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
    def setPagesVarargs(value: String*): Self = this.set("pages", js.Array(value :_*))
    @scala.inline
    def setPages(value: js.Array[String]): Self = this.set("pages", value.asInstanceOf[js.Any])
    @scala.inline
    def setWindow(value: PageConfig): Self = this.set("window", value.asInstanceOf[js.Any])
  }
  
}

