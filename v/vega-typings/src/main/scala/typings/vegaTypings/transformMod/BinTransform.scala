package typings.vegaTypings.transformMod

import typings.vegaTypings.signalMod.SignalRef
import typings.vegaTypings.utilMod.Vector2
import typings.vegaTypings.vegaTypingsStrings.bin
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BinTransform
  extends BaseBin
     with _Transforms {
  var anchor: js.UndefOr[Double | SignalRef] = js.native
  var as: js.UndefOr[(Vector2[String | SignalRef]) | SignalRef] = js.native
  var extent: (Vector2[Double | SignalRef]) | SignalRef = js.native
  var field: FieldRef = js.native
  var interval: js.UndefOr[Boolean | SignalRef] = js.native
  var name: js.UndefOr[String | SignalRef] = js.native
  var signal: js.UndefOr[SignalName] = js.native
  var span: js.UndefOr[Double | SignalRef] = js.native
  var `type`: bin = js.native
}

object BinTransform {
  @scala.inline
  def apply(extent: (Vector2[Double | SignalRef]) | SignalRef, field: FieldRef, `type`: bin): BinTransform = {
    val __obj = js.Dynamic.literal(extent = extent.asInstanceOf[js.Any], field = field.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[BinTransform]
  }
  @scala.inline
  implicit class BinTransformOps[Self <: BinTransform] (val x: Self) extends AnyVal {
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
    def setExtent(value: (Vector2[Double | SignalRef]) | SignalRef): Self = this.set("extent", value.asInstanceOf[js.Any])
    @scala.inline
    def setField(value: FieldRef): Self = this.set("field", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: bin): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setAnchor(value: Double | SignalRef): Self = this.set("anchor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAnchor: Self = this.set("anchor", js.undefined)
    @scala.inline
    def setAs(value: (Vector2[String | SignalRef]) | SignalRef): Self = this.set("as", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAs: Self = this.set("as", js.undefined)
    @scala.inline
    def setInterval(value: Boolean | SignalRef): Self = this.set("interval", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInterval: Self = this.set("interval", js.undefined)
    @scala.inline
    def setName(value: String | SignalRef): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setSignal(value: SignalName): Self = this.set("signal", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSignal: Self = this.set("signal", js.undefined)
    @scala.inline
    def setSpan(value: Double | SignalRef): Self = this.set("span", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSpan: Self = this.set("span", js.undefined)
  }
  
}

