package typings.validator.mod.validator

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IsFloatOptions extends js.Object {
  /**
    * greater than
    */
  var gt: js.UndefOr[Double] = js.native
  /**
    * FloatLocale
    */
  var locale: js.UndefOr[FloatLocale] = js.native
  /**
    * less than
    */
  var lt: js.UndefOr[Double] = js.native
  /**
    * greater or equal
    */
  var max: js.UndefOr[Double] = js.native
  /**
    * less or equal
    */
  var min: js.UndefOr[Double] = js.native
}

object IsFloatOptions {
  @scala.inline
  def apply(): IsFloatOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IsFloatOptions]
  }
  @scala.inline
  implicit class IsFloatOptionsOps[Self <: IsFloatOptions] (val x: Self) extends AnyVal {
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
    def setGt(value: Double): Self = this.set("gt", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGt: Self = this.set("gt", js.undefined)
    @scala.inline
    def setLocale(value: FloatLocale): Self = this.set("locale", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocale: Self = this.set("locale", js.undefined)
    @scala.inline
    def setLt(value: Double): Self = this.set("lt", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLt: Self = this.set("lt", js.undefined)
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

