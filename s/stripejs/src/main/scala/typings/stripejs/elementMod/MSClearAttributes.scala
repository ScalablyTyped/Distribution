package typings.stripejs.elementMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MSClearAttributes extends StyleAttributes {
  var display: js.UndefOr[String] = js.native
}

object MSClearAttributes {
  @scala.inline
  def apply(): MSClearAttributes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MSClearAttributes]
  }
  @scala.inline
  implicit class MSClearAttributesOps[Self <: MSClearAttributes] (val x: Self) extends AnyVal {
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
    def setDisplay(value: String): Self = this.set("display", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisplay: Self = this.set("display", js.undefined)
  }
  
}

