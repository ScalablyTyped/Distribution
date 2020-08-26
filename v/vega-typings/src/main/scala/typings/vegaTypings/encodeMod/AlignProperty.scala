package typings.vegaTypings.encodeMod

import typings.vegaTypings.anon.Test
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AlignProperty extends js.Object {
  var align: js.UndefOr[ProductionRule[ScaledValueRef[Align]]] = js.native
}

object AlignProperty {
  @scala.inline
  def apply(): AlignProperty = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AlignProperty]
  }
  @scala.inline
  implicit class AlignPropertyOps[Self <: AlignProperty] (val x: Self) extends AnyVal {
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
    def setAlignVarargs(value: (Test with ScaledValueRef[Align])*): Self = this.set("align", js.Array(value :_*))
    @scala.inline
    def setAlign(value: ProductionRule[ScaledValueRef[Align]]): Self = this.set("align", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAlign: Self = this.set("align", js.undefined)
  }
  
}

