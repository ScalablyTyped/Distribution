package typings.wouter.anon

import typings.wouter.useLocationMod.Path
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HrefTo extends js.Object {
  var href: js.UndefOr[scala.Nothing] = js.native
  var to: Path = js.native
}

object HrefTo {
  @scala.inline
  def apply(to: Path): HrefTo = {
    val __obj = js.Dynamic.literal(to = to.asInstanceOf[js.Any])
    __obj.asInstanceOf[HrefTo]
  }
  @scala.inline
  implicit class HrefToOps[Self <: HrefTo] (val x: Self) extends AnyVal {
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

