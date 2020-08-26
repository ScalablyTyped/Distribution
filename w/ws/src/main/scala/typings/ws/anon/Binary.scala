package typings.ws.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Binary extends js.Object {
  var binary: js.UndefOr[Boolean] = js.native
  var compress: js.UndefOr[Boolean] = js.native
  var fin: js.UndefOr[Boolean] = js.native
  var mask: js.UndefOr[Boolean] = js.native
}

object Binary {
  @scala.inline
  def apply(): Binary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Binary]
  }
  @scala.inline
  implicit class BinaryOps[Self <: Binary] (val x: Self) extends AnyVal {
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
    def setBinary(value: Boolean): Self = this.set("binary", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBinary: Self = this.set("binary", js.undefined)
    @scala.inline
    def setCompress(value: Boolean): Self = this.set("compress", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCompress: Self = this.set("compress", js.undefined)
    @scala.inline
    def setFin(value: Boolean): Self = this.set("fin", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFin: Self = this.set("fin", js.undefined)
    @scala.inline
    def setMask(value: Boolean): Self = this.set("mask", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMask: Self = this.set("mask", js.undefined)
  }
  
}

