package typings.typestubIpfs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InitOptions extends js.Object {
  var bits: js.UndefOr[Double] = js.native
  var emptyRepo: js.UndefOr[Boolean] = js.native
  var log: js.UndefOr[js.Function] = js.native
}

object InitOptions {
  @scala.inline
  def apply(): InitOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InitOptions]
  }
  @scala.inline
  implicit class InitOptionsOps[Self <: InitOptions] (val x: Self) extends AnyVal {
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
    def setBits(value: Double): Self = this.set("bits", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBits: Self = this.set("bits", js.undefined)
    @scala.inline
    def setEmptyRepo(value: Boolean): Self = this.set("emptyRepo", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEmptyRepo: Self = this.set("emptyRepo", js.undefined)
    @scala.inline
    def setLog(value: js.Function): Self = this.set("log", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLog: Self = this.set("log", js.undefined)
  }
  
}

