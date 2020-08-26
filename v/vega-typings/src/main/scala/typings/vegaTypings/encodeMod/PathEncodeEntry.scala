package typings.vegaTypings.encodeMod

import typings.vegaTypings.anon.Test
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PathEncodeEntry extends EncodeEntry {
  var angle: js.UndefOr[ProductionRule[NumericValueRef]] = js.native
  var path: js.UndefOr[ProductionRule[StringValueRef]] = js.native
  var scaleX: js.UndefOr[ProductionRule[NumericValueRef]] = js.native
  var scaleY: js.UndefOr[ProductionRule[NumericValueRef]] = js.native
}

object PathEncodeEntry {
  @scala.inline
  def apply(): PathEncodeEntry = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PathEncodeEntry]
  }
  @scala.inline
  implicit class PathEncodeEntryOps[Self <: PathEncodeEntry] (val x: Self) extends AnyVal {
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
    def setAngleVarargs(value: (Test with NumericValueRef)*): Self = this.set("angle", js.Array(value :_*))
    @scala.inline
    def setAngle(value: ProductionRule[NumericValueRef]): Self = this.set("angle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAngle: Self = this.set("angle", js.undefined)
    @scala.inline
    def setPathVarargs(value: (Test with StringValueRef)*): Self = this.set("path", js.Array(value :_*))
    @scala.inline
    def setPath(value: ProductionRule[StringValueRef]): Self = this.set("path", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePath: Self = this.set("path", js.undefined)
    @scala.inline
    def setScaleXVarargs(value: (Test with NumericValueRef)*): Self = this.set("scaleX", js.Array(value :_*))
    @scala.inline
    def setScaleX(value: ProductionRule[NumericValueRef]): Self = this.set("scaleX", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScaleX: Self = this.set("scaleX", js.undefined)
    @scala.inline
    def setScaleYVarargs(value: (Test with NumericValueRef)*): Self = this.set("scaleY", js.Array(value :_*))
    @scala.inline
    def setScaleY(value: ProductionRule[NumericValueRef]): Self = this.set("scaleY", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScaleY: Self = this.set("scaleY", js.undefined)
  }
  
}

