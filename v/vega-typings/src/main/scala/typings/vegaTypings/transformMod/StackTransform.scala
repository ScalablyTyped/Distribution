package typings.vegaTypings.transformMod

import typings.vegaTypings.markMod.Compare
import typings.vegaTypings.signalMod.SignalRef
import typings.vegaTypings.utilMod.Vector2
import typings.vegaTypings.vegaTypingsStrings.stack
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StackTransform extends _Transforms {
  var as: js.UndefOr[(Vector2[String | SignalRef]) | SignalRef] = js.native
  var field: js.UndefOr[FieldRef] = js.native
  var groupby: js.UndefOr[js.Array[FieldRef]] = js.native
  var offset: js.UndefOr[StackOffset | SignalRef] = js.native
  var sort: js.UndefOr[Compare] = js.native
  var `type`: stack = js.native
}

object StackTransform {
  @scala.inline
  def apply(`type`: stack): StackTransform = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[StackTransform]
  }
  @scala.inline
  implicit class StackTransformOps[Self <: StackTransform] (val x: Self) extends AnyVal {
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
    def setType(value: stack): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setAs(value: (Vector2[String | SignalRef]) | SignalRef): Self = this.set("as", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAs: Self = this.set("as", js.undefined)
    @scala.inline
    def setField(value: FieldRef): Self = this.set("field", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteField: Self = this.set("field", js.undefined)
    @scala.inline
    def setGroupbyVarargs(value: FieldRef*): Self = this.set("groupby", js.Array(value :_*))
    @scala.inline
    def setGroupby(value: js.Array[FieldRef]): Self = this.set("groupby", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGroupby: Self = this.set("groupby", js.undefined)
    @scala.inline
    def setOffset(value: StackOffset | SignalRef): Self = this.set("offset", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOffset: Self = this.set("offset", js.undefined)
    @scala.inline
    def setSort(value: Compare): Self = this.set("sort", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSort: Self = this.set("sort", js.undefined)
  }
  
}

