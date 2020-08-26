package typings.vegaTypings.transformMod

import typings.vegaTypings.markMod.Compare
import typings.vegaTypings.signalMod.SignalRef
import typings.vegaTypings.utilMod.Vector2
import typings.vegaTypings.utilMod.Vector5
import typings.vegaTypings.vegaTypingsStrings.pack
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PackTransform extends _Transforms {
  var as: js.UndefOr[(Vector5[String | SignalRef]) | SignalRef] = js.native
  var field: js.UndefOr[FieldRef] = js.native
  var padding: js.UndefOr[Double | SignalRef] = js.native
  var radius: js.UndefOr[FieldRef] = js.native
  var size: js.UndefOr[(Vector2[Double | SignalRef]) | SignalRef] = js.native
  var sort: js.UndefOr[Compare] = js.native
  var `type`: pack = js.native
}

object PackTransform {
  @scala.inline
  def apply(`type`: pack): PackTransform = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PackTransform]
  }
  @scala.inline
  implicit class PackTransformOps[Self <: PackTransform] (val x: Self) extends AnyVal {
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
    def setType(value: pack): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setAs(value: (Vector5[String | SignalRef]) | SignalRef): Self = this.set("as", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAs: Self = this.set("as", js.undefined)
    @scala.inline
    def setField(value: FieldRef): Self = this.set("field", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteField: Self = this.set("field", js.undefined)
    @scala.inline
    def setPadding(value: Double | SignalRef): Self = this.set("padding", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePadding: Self = this.set("padding", js.undefined)
    @scala.inline
    def setRadius(value: FieldRef): Self = this.set("radius", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRadius: Self = this.set("radius", js.undefined)
    @scala.inline
    def setSize(value: (Vector2[Double | SignalRef]) | SignalRef): Self = this.set("size", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
    @scala.inline
    def setSort(value: Compare): Self = this.set("sort", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSort: Self = this.set("sort", js.undefined)
  }
  
}

