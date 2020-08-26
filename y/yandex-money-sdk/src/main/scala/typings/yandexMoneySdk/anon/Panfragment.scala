package typings.yandexMoneySdk.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Panfragment extends js.Object {
  var pan_fragment: js.UndefOr[String] = js.native
  var `type`: js.UndefOr[String] = js.native
}

object Panfragment {
  @scala.inline
  def apply(): Panfragment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Panfragment]
  }
  @scala.inline
  implicit class PanfragmentOps[Self <: Panfragment] (val x: Self) extends AnyVal {
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
    def setPan_fragment(value: String): Self = this.set("pan_fragment", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePan_fragment: Self = this.set("pan_fragment", js.undefined)
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
  
}

