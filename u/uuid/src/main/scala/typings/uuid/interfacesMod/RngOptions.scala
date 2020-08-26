package typings.uuid.interfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RngOptions extends V4Options {
  var rng: js.UndefOr[js.Function0[InputBuffer]] = js.native
}

object RngOptions {
  @scala.inline
  def apply(): RngOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RngOptions]
  }
  @scala.inline
  implicit class RngOptionsOps[Self <: RngOptions] (val x: Self) extends AnyVal {
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
    def setRng(value: () => InputBuffer): Self = this.set("rng", js.Any.fromFunction0(value))
    @scala.inline
    def deleteRng: Self = this.set("rng", js.undefined)
  }
  
}

