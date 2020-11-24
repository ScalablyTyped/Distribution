package typings.vegaTypings.transformMod

import typings.vegaTypings.markMod.Compare
import typings.vegaTypings.signalMod.SignalRef
import typings.vegaTypings.utilMod.Vector2
import typings.vegaTypings.utilMod.Vector7
import typings.vegaTypings.vegaTypingsStrings.begin
import typings.vegaTypings.vegaTypingsStrings.end
import typings.vegaTypings.vegaTypingsStrings.label
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LabelTransform extends _Transforms {
  
  var anchor: js.UndefOr[js.Array[String] | String | SignalRef] = js.native
  
  var as: js.UndefOr[(Vector7[String | SignalRef]) | SignalRef] = js.native
  
  var avoidBaseMark: js.UndefOr[Boolean | SignalRef] = js.native
  
  var avoidMarks: js.UndefOr[js.Array[String]] = js.native
  
  var lineAnchor: js.UndefOr[begin | end | SignalRef] = js.native
  
  var markIndex: js.UndefOr[Double] = js.native
  
  var offset: js.UndefOr[js.Array[Double] | Double | SignalRef] = js.native
  
  var padding: js.UndefOr[Double | SignalRef] = js.native
  
  var size: (Vector2[Double | SignalRef]) | SignalRef = js.native
  
  var sort: js.UndefOr[Compare] = js.native
  
  var `type`: label = js.native
}
object LabelTransform {
  
  @scala.inline
  def apply(size: (Vector2[Double | SignalRef]) | SignalRef, `type`: label): LabelTransform = {
    val __obj = js.Dynamic.literal(size = size.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[LabelTransform]
  }
  
  @scala.inline
  implicit class LabelTransformOps[Self <: LabelTransform] (val x: Self) extends AnyVal {
    
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
    def setSize(value: (Vector2[Double | SignalRef]) | SignalRef): Self = this.set("size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: label): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnchorVarargs(value: String*): Self = this.set("anchor", js.Array(value :_*))
    
    @scala.inline
    def setAnchor(value: js.Array[String] | String | SignalRef): Self = this.set("anchor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAnchor: Self = this.set("anchor", js.undefined)
    
    @scala.inline
    def setAs(value: (Vector7[String | SignalRef]) | SignalRef): Self = this.set("as", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAs: Self = this.set("as", js.undefined)
    
    @scala.inline
    def setAvoidBaseMark(value: Boolean | SignalRef): Self = this.set("avoidBaseMark", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAvoidBaseMark: Self = this.set("avoidBaseMark", js.undefined)
    
    @scala.inline
    def setAvoidMarksVarargs(value: String*): Self = this.set("avoidMarks", js.Array(value :_*))
    
    @scala.inline
    def setAvoidMarks(value: js.Array[String]): Self = this.set("avoidMarks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAvoidMarks: Self = this.set("avoidMarks", js.undefined)
    
    @scala.inline
    def setLineAnchor(value: begin | end | SignalRef): Self = this.set("lineAnchor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLineAnchor: Self = this.set("lineAnchor", js.undefined)
    
    @scala.inline
    def setMarkIndex(value: Double): Self = this.set("markIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMarkIndex: Self = this.set("markIndex", js.undefined)
    
    @scala.inline
    def setOffsetVarargs(value: Double*): Self = this.set("offset", js.Array(value :_*))
    
    @scala.inline
    def setOffset(value: js.Array[Double] | Double | SignalRef): Self = this.set("offset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOffset: Self = this.set("offset", js.undefined)
    
    @scala.inline
    def setPadding(value: Double | SignalRef): Self = this.set("padding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePadding: Self = this.set("padding", js.undefined)
    
    @scala.inline
    def setSort(value: Compare): Self = this.set("sort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSort: Self = this.set("sort", js.undefined)
  }
}
