package typings.vegaTypings.encodeMod

import typings.vegaTypings.anon.Test
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GroupEncodeEntry extends RectEncodeEntry {
  var clip: js.UndefOr[ProductionRule[BooleanValueRef]] = js.native
  var strokeForeground: js.UndefOr[ProductionRule[BooleanValueRef]] = js.native
  var strokeOffset: js.UndefOr[ProductionRule[NumericValueRef]] = js.native
}

object GroupEncodeEntry {
  @scala.inline
  def apply(): GroupEncodeEntry = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GroupEncodeEntry]
  }
  @scala.inline
  implicit class GroupEncodeEntryOps[Self <: GroupEncodeEntry] (val x: Self) extends AnyVal {
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
    def setClipVarargs(value: (Test with BooleanValueRef)*): Self = this.set("clip", js.Array(value :_*))
    @scala.inline
    def setClip(value: ProductionRule[BooleanValueRef]): Self = this.set("clip", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClip: Self = this.set("clip", js.undefined)
    @scala.inline
    def setStrokeForegroundVarargs(value: (Test with BooleanValueRef)*): Self = this.set("strokeForeground", js.Array(value :_*))
    @scala.inline
    def setStrokeForeground(value: ProductionRule[BooleanValueRef]): Self = this.set("strokeForeground", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStrokeForeground: Self = this.set("strokeForeground", js.undefined)
    @scala.inline
    def setStrokeOffsetVarargs(value: (Test with NumericValueRef)*): Self = this.set("strokeOffset", js.Array(value :_*))
    @scala.inline
    def setStrokeOffset(value: ProductionRule[NumericValueRef]): Self = this.set("strokeOffset", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStrokeOffset: Self = this.set("strokeOffset", js.undefined)
  }
  
}

