package typings.validator.mod.validator

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IsLengthOptions extends js.Object {
  /**
    * @default undefined
    */
  var max: js.UndefOr[Double] = js.native
  /**
    * @default 0
    */
  var min: js.UndefOr[Double] = js.native
}

object IsLengthOptions {
  @scala.inline
  def apply(): IsLengthOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IsLengthOptions]
  }
  @scala.inline
  implicit class IsLengthOptionsOps[Self <: IsLengthOptions] (val x: Self) extends AnyVal {
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
    def setMax(value: Double): Self = this.set("max", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMax: Self = this.set("max", js.undefined)
    @scala.inline
    def setMin(value: Double): Self = this.set("min", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMin: Self = this.set("min", js.undefined)
  }
  
}

