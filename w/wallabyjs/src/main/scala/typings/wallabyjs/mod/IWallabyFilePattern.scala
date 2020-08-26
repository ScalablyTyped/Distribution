package typings.wallabyjs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IWallabyFilePattern extends js.Object {
  var ignore: js.UndefOr[Boolean] = js.native
  var instrument: js.UndefOr[Boolean] = js.native
  var load: js.UndefOr[Boolean] = js.native
  var pattern: String = js.native
}

object IWallabyFilePattern {
  @scala.inline
  def apply(pattern: String): IWallabyFilePattern = {
    val __obj = js.Dynamic.literal(pattern = pattern.asInstanceOf[js.Any])
    __obj.asInstanceOf[IWallabyFilePattern]
  }
  @scala.inline
  implicit class IWallabyFilePatternOps[Self <: IWallabyFilePattern] (val x: Self) extends AnyVal {
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
    def setPattern(value: String): Self = this.set("pattern", value.asInstanceOf[js.Any])
    @scala.inline
    def setIgnore(value: Boolean): Self = this.set("ignore", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIgnore: Self = this.set("ignore", js.undefined)
    @scala.inline
    def setInstrument(value: Boolean): Self = this.set("instrument", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInstrument: Self = this.set("instrument", js.undefined)
    @scala.inline
    def setLoad(value: Boolean): Self = this.set("load", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLoad: Self = this.set("load", js.undefined)
  }
  
}

