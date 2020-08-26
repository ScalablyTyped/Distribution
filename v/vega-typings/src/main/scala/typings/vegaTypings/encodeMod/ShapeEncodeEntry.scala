package typings.vegaTypings.encodeMod

import typings.vegaTypings.anon.Test
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ShapeEncodeEntry extends EncodeEntry {
  var shape: js.UndefOr[ProductionRule[StringValueRef]] = js.native
}

object ShapeEncodeEntry {
  @scala.inline
  def apply(): ShapeEncodeEntry = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ShapeEncodeEntry]
  }
  @scala.inline
  implicit class ShapeEncodeEntryOps[Self <: ShapeEncodeEntry] (val x: Self) extends AnyVal {
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
    def setShapeVarargs(value: (Test with StringValueRef)*): Self = this.set("shape", js.Array(value :_*))
    @scala.inline
    def setShape(value: ProductionRule[StringValueRef]): Self = this.set("shape", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShape: Self = this.set("shape", js.undefined)
  }
  
}

