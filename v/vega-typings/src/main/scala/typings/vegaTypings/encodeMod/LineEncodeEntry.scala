package typings.vegaTypings.encodeMod

import typings.vegaTypings.anon.Test
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LineEncodeEntry
  extends EncodeEntry
     with DefinedProperty {
  var interpolate: js.UndefOr[ProductionRule[ScaledValueRef[Interpolate]]] = js.native
  var tension: js.UndefOr[ProductionRule[NumericValueRef]] = js.native
}

object LineEncodeEntry {
  @scala.inline
  def apply(): LineEncodeEntry = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LineEncodeEntry]
  }
  @scala.inline
  implicit class LineEncodeEntryOps[Self <: LineEncodeEntry] (val x: Self) extends AnyVal {
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
    def setInterpolateVarargs(value: (Test with ScaledValueRef[Interpolate])*): Self = this.set("interpolate", js.Array(value :_*))
    @scala.inline
    def setInterpolate(value: ProductionRule[ScaledValueRef[Interpolate]]): Self = this.set("interpolate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInterpolate: Self = this.set("interpolate", js.undefined)
    @scala.inline
    def setTensionVarargs(value: (Test with NumericValueRef)*): Self = this.set("tension", js.Array(value :_*))
    @scala.inline
    def setTension(value: ProductionRule[NumericValueRef]): Self = this.set("tension", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTension: Self = this.set("tension", js.undefined)
  }
  
}

