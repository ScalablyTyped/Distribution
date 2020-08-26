package typings.vegaTypings.transformMod

import typings.vegaTypings.signalMod.SignalRef
import typings.vegaTypings.vegaTypingsStrings.linkpath
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LinkPathTransform extends _Transforms {
  var as: js.UndefOr[String | SignalRef] = js.native
  var orient: js.UndefOr[LinkPathOrient | SignalRef] = js.native
  var require: js.UndefOr[SignalRef] = js.native
  var shape: js.UndefOr[LinkPathShape | SignalRef] = js.native
  var sourceX: js.UndefOr[FieldRef] = js.native
  var sourceY: js.UndefOr[FieldRef] = js.native
  var targetX: js.UndefOr[FieldRef] = js.native
  var targetY: js.UndefOr[FieldRef] = js.native
  var `type`: linkpath = js.native
}

object LinkPathTransform {
  @scala.inline
  def apply(`type`: linkpath): LinkPathTransform = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[LinkPathTransform]
  }
  @scala.inline
  implicit class LinkPathTransformOps[Self <: LinkPathTransform] (val x: Self) extends AnyVal {
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
    def setType(value: linkpath): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setAs(value: String | SignalRef): Self = this.set("as", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAs: Self = this.set("as", js.undefined)
    @scala.inline
    def setOrient(value: LinkPathOrient | SignalRef): Self = this.set("orient", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOrient: Self = this.set("orient", js.undefined)
    @scala.inline
    def setRequire(value: SignalRef): Self = this.set("require", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRequire: Self = this.set("require", js.undefined)
    @scala.inline
    def setShape(value: LinkPathShape | SignalRef): Self = this.set("shape", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShape: Self = this.set("shape", js.undefined)
    @scala.inline
    def setSourceX(value: FieldRef): Self = this.set("sourceX", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSourceX: Self = this.set("sourceX", js.undefined)
    @scala.inline
    def setSourceY(value: FieldRef): Self = this.set("sourceY", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSourceY: Self = this.set("sourceY", js.undefined)
    @scala.inline
    def setTargetX(value: FieldRef): Self = this.set("targetX", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTargetX: Self = this.set("targetX", js.undefined)
    @scala.inline
    def setTargetY(value: FieldRef): Self = this.set("targetY", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTargetY: Self = this.set("targetY", js.undefined)
  }
  
}

