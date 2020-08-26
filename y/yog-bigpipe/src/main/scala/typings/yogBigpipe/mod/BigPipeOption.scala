package typings.yogBigpipe.mod

import typings.yogBigpipe.anon.Default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BigPipeOption extends js.Object {
  var skipAnalysis: js.UndefOr[Boolean] = js.native
  var tpl: js.UndefOr[Default] = js.native
}

object BigPipeOption {
  @scala.inline
  def apply(): BigPipeOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BigPipeOption]
  }
  @scala.inline
  implicit class BigPipeOptionOps[Self <: BigPipeOption] (val x: Self) extends AnyVal {
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
    def setSkipAnalysis(value: Boolean): Self = this.set("skipAnalysis", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSkipAnalysis: Self = this.set("skipAnalysis", js.undefined)
    @scala.inline
    def setTpl(value: Default): Self = this.set("tpl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTpl: Self = this.set("tpl", js.undefined)
  }
  
}

