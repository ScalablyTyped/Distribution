package typings.vegaTypings.transformMod

import typings.vegaTypings.markMod.Compare
import typings.vegaTypings.signalMod.SignalRef
import typings.vegaTypings.utilMod.Vector2
import typings.vegaTypings.utilMod.Vector7
import typings.vegaTypings.vegaTypingsStrings.begin
import typings.vegaTypings.vegaTypingsStrings.end
import typings.vegaTypings.vegaTypingsStrings.label
import org.scalablytyped.runtime.StObject
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
  implicit class LabelTransformMutableBuilder[Self <: LabelTransform] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAnchor(value: js.Array[String] | String | SignalRef): Self = StObject.set(x, "anchor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnchorUndefined: Self = StObject.set(x, "anchor", js.undefined)
    
    @scala.inline
    def setAnchorVarargs(value: String*): Self = StObject.set(x, "anchor", js.Array(value :_*))
    
    @scala.inline
    def setAs(value: (Vector7[String | SignalRef]) | SignalRef): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAsUndefined: Self = StObject.set(x, "as", js.undefined)
    
    @scala.inline
    def setAvoidBaseMark(value: Boolean | SignalRef): Self = StObject.set(x, "avoidBaseMark", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAvoidBaseMarkUndefined: Self = StObject.set(x, "avoidBaseMark", js.undefined)
    
    @scala.inline
    def setAvoidMarks(value: js.Array[String]): Self = StObject.set(x, "avoidMarks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAvoidMarksUndefined: Self = StObject.set(x, "avoidMarks", js.undefined)
    
    @scala.inline
    def setAvoidMarksVarargs(value: String*): Self = StObject.set(x, "avoidMarks", js.Array(value :_*))
    
    @scala.inline
    def setLineAnchor(value: begin | end | SignalRef): Self = StObject.set(x, "lineAnchor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLineAnchorUndefined: Self = StObject.set(x, "lineAnchor", js.undefined)
    
    @scala.inline
    def setMarkIndex(value: Double): Self = StObject.set(x, "markIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarkIndexUndefined: Self = StObject.set(x, "markIndex", js.undefined)
    
    @scala.inline
    def setOffset(value: js.Array[Double] | Double | SignalRef): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
    
    @scala.inline
    def setOffsetVarargs(value: Double*): Self = StObject.set(x, "offset", js.Array(value :_*))
    
    @scala.inline
    def setPadding(value: Double | SignalRef): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPaddingUndefined: Self = StObject.set(x, "padding", js.undefined)
    
    @scala.inline
    def setSize(value: (Vector2[Double | SignalRef]) | SignalRef): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSort(value: Compare): Self = StObject.set(x, "sort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSortUndefined: Self = StObject.set(x, "sort", js.undefined)
    
    @scala.inline
    def setType(value: label): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
