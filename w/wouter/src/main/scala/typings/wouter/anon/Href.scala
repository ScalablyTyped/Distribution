package typings.wouter.anon

import typings.wouter.wouterUseLocationMod.Path
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Href extends js.Object {
  var href: js.UndefOr[scala.Nothing] = js.native
  var to: Path = js.native
}

object Href {
  @scala.inline
  def apply(to: Path): Href = {
    val __obj = js.Dynamic.literal(to = to.asInstanceOf[js.Any])
    __obj.asInstanceOf[Href]
  }
  @scala.inline
  implicit class HrefOps[Self <: Href] (val x: Self) extends AnyVal {
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
    def setTo(value: Path): Self = this.set("to", value.asInstanceOf[js.Any])
  }
  
}

