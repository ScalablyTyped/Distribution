package typings.terminalKit.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NoAlternate extends js.Object {
  var noAlternate: Boolean = js.native
}

object NoAlternate {
  @scala.inline
  def apply(noAlternate: Boolean): NoAlternate = {
    val __obj = js.Dynamic.literal(noAlternate = noAlternate.asInstanceOf[js.Any])
    __obj.asInstanceOf[NoAlternate]
  }
  @scala.inline
  implicit class NoAlternateOps[Self <: NoAlternate] (val x: Self) extends AnyVal {
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
    def setNoAlternate(value: Boolean): Self = this.set("noAlternate", value.asInstanceOf[js.Any])
  }
  
}

