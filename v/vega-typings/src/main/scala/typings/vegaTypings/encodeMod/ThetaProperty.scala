package typings.vegaTypings.encodeMod

import typings.vegaTypings.anon.Test
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ThetaProperty extends js.Object {
  var theta: js.UndefOr[ProductionRule[NumericValueRef]] = js.native
}

object ThetaProperty {
  @scala.inline
  def apply(): ThetaProperty = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ThetaProperty]
  }
  @scala.inline
  implicit class ThetaPropertyOps[Self <: ThetaProperty] (val x: Self) extends AnyVal {
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
    def setThetaVarargs(value: (Test with NumericValueRef)*): Self = this.set("theta", js.Array(value :_*))
    @scala.inline
    def setTheta(value: ProductionRule[NumericValueRef]): Self = this.set("theta", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTheta: Self = this.set("theta", js.undefined)
  }
  
}

