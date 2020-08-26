package typings.vegaTypings.transformMod

import typings.vegaTypings.signalMod.SignalRef
import typings.vegaTypings.vegaTypingsStrings.flatten
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FlattenTransform extends _Transforms {
  var as: js.UndefOr[(js.Array[String | SignalRef]) | SignalRef] = js.native
  var fields: js.Array[FieldRef] | SignalRef = js.native
  var index: js.UndefOr[String | SignalRef] = js.native
  var `type`: flatten = js.native
}

object FlattenTransform {
  @scala.inline
  def apply(fields: js.Array[FieldRef] | SignalRef, `type`: flatten): FlattenTransform = {
    val __obj = js.Dynamic.literal(fields = fields.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[FlattenTransform]
  }
  @scala.inline
  implicit class FlattenTransformOps[Self <: FlattenTransform] (val x: Self) extends AnyVal {
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
    def setFieldsVarargs(value: FieldRef*): Self = this.set("fields", js.Array(value :_*))
    @scala.inline
    def setFields(value: js.Array[FieldRef] | SignalRef): Self = this.set("fields", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: flatten): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setAsVarargs(value: (String | SignalRef)*): Self = this.set("as", js.Array(value :_*))
    @scala.inline
    def setAs(value: (js.Array[String | SignalRef]) | SignalRef): Self = this.set("as", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAs: Self = this.set("as", js.undefined)
    @scala.inline
    def setIndex(value: String | SignalRef): Self = this.set("index", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIndex: Self = this.set("index", js.undefined)
  }
  
}

