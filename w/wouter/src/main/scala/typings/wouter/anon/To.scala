package typings.wouter.anon

import typings.wouter.wouterUseLocationMod.Path
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait To extends js.Object {
  var href: Path = js.native
  var to: js.UndefOr[scala.Nothing] = js.native
}

object To {
  @scala.inline
  def apply(href: Path): To = {
    val __obj = js.Dynamic.literal(href = href.asInstanceOf[js.Any])
    __obj.asInstanceOf[To]
  }
  @scala.inline
  implicit class ToOps[Self <: To] (val x: Self) extends AnyVal {
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
    def setHref(value: Path): Self = this.set("href", value.asInstanceOf[js.Any])
  }
  
}

