package typings.uifabricMergeStyles.istyleoptionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IStyleOptions extends js.Object {
  var rtl: js.UndefOr[Boolean] = js.native
  var specificityMultiplier: js.UndefOr[Double] = js.native
}

object IStyleOptions {
  @scala.inline
  def apply(): IStyleOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IStyleOptions]
  }
  @scala.inline
  implicit class IStyleOptionsOps[Self <: IStyleOptions] (val x: Self) extends AnyVal {
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
    def setRtl(value: Boolean): Self = this.set("rtl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRtl: Self = this.set("rtl", js.undefined)
    @scala.inline
    def setSpecificityMultiplier(value: Double): Self = this.set("specificityMultiplier", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSpecificityMultiplier: Self = this.set("specificityMultiplier", js.undefined)
  }
  
}

