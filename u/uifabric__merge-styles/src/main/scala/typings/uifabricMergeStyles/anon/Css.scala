package typings.uifabricMergeStyles.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Css extends js.Object {
  var css: String = js.native
  var html: String = js.native
}

object Css {
  @scala.inline
  def apply(css: String, html: String): Css = {
    val __obj = js.Dynamic.literal(css = css.asInstanceOf[js.Any], html = html.asInstanceOf[js.Any])
    __obj.asInstanceOf[Css]
  }
  @scala.inline
  implicit class CssOps[Self <: Css] (val x: Self) extends AnyVal {
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
    def setCss(value: String): Self = this.set("css", value.asInstanceOf[js.Any])
    @scala.inline
    def setHtml(value: String): Self = this.set("html", value.asInstanceOf[js.Any])
  }
  
}

