package typings.terminalKit.textBufferMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  var dst: typings.terminalKit.screenBufferMod.^ = js.native
  var forceInBound: js.UndefOr[Double] = js.native
  var height: js.UndefOr[Double] = js.native
  var hidden: js.UndefOr[Boolean] = js.native
  var tabWidth: js.UndefOr[Double] = js.native
  var width: js.UndefOr[Double] = js.native
  var wrap: js.UndefOr[Boolean] = js.native
  var x: js.UndefOr[Double] = js.native
  var y: js.UndefOr[Double] = js.native
}

object Options {
  @scala.inline
  def apply(dst: typings.terminalKit.screenBufferMod.^): Options = {
    val __obj = js.Dynamic.literal(dst = dst.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
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
    def setDst(value: typings.terminalKit.screenBufferMod.^): Self = this.set("dst", value.asInstanceOf[js.Any])
    @scala.inline
    def setForceInBound(value: Double): Self = this.set("forceInBound", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteForceInBound: Self = this.set("forceInBound", js.undefined)
    @scala.inline
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    @scala.inline
    def setHidden(value: Boolean): Self = this.set("hidden", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHidden: Self = this.set("hidden", js.undefined)
    @scala.inline
    def setTabWidth(value: Double): Self = this.set("tabWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTabWidth: Self = this.set("tabWidth", js.undefined)
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
    @scala.inline
    def setWrap(value: Boolean): Self = this.set("wrap", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWrap: Self = this.set("wrap", js.undefined)
    @scala.inline
    def setX(value: Double): Self = this.set("x", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteX: Self = this.set("x", js.undefined)
    @scala.inline
    def setY(value: Double): Self = this.set("y", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteY: Self = this.set("y", js.undefined)
  }
  
}

