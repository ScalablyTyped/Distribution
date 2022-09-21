package typings.vegaTypings.transformMod

import typings.vegaTypings.markMod.Compare
import typings.vegaTypings.signalMod.SignalRef
import typings.vegaTypings.utilMod.Vector2
import typings.vegaTypings.utilMod.Vector7
import typings.vegaTypings.vegaTypingsStrings.label
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LabelTransform
  extends StObject
     with Transforms {
  
  var anchor: js.UndefOr[js.Array[LabelAnchor] | LabelAnchor | SignalRef] = js.undefined
  
  var as: js.UndefOr[(Vector7[String | SignalRef]) | SignalRef] = js.undefined
  
  var avoidBaseMark: js.UndefOr[Boolean | SignalRef] = js.undefined
  
  var avoidMarks: js.UndefOr[js.Array[String]] = js.undefined
  
  var lineAnchor: js.UndefOr[LineLabelAnchor | SignalRef] = js.undefined
  
  var markIndex: js.UndefOr[Double] = js.undefined
  
  var method: js.UndefOr[AreaLabelMethod] = js.undefined
  
  var offset: js.UndefOr[js.Array[Double] | Double | SignalRef] = js.undefined
  
  var padding: js.UndefOr[Double | Null | SignalRef] = js.undefined
  
  var size: (Vector2[Double | SignalRef]) | SignalRef
  
  var sort: js.UndefOr[Compare] = js.undefined
  
  var `type`: label
}
object LabelTransform {
  
  inline def apply(size: (Vector2[Double | SignalRef]) | SignalRef): LabelTransform = {
    val __obj = js.Dynamic.literal(size = size.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("label")
    __obj.asInstanceOf[LabelTransform]
  }
  
  extension [Self <: LabelTransform](x: Self) {
    
    inline def setAnchor(value: js.Array[LabelAnchor] | LabelAnchor | SignalRef): Self = StObject.set(x, "anchor", value.asInstanceOf[js.Any])
    
    inline def setAnchorUndefined: Self = StObject.set(x, "anchor", js.undefined)
    
    inline def setAnchorVarargs(value: LabelAnchor*): Self = StObject.set(x, "anchor", js.Array(value*))
    
    inline def setAs(value: (Vector7[String | SignalRef]) | SignalRef): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
    
    inline def setAsUndefined: Self = StObject.set(x, "as", js.undefined)
    
    inline def setAvoidBaseMark(value: Boolean | SignalRef): Self = StObject.set(x, "avoidBaseMark", value.asInstanceOf[js.Any])
    
    inline def setAvoidBaseMarkUndefined: Self = StObject.set(x, "avoidBaseMark", js.undefined)
    
    inline def setAvoidMarks(value: js.Array[String]): Self = StObject.set(x, "avoidMarks", value.asInstanceOf[js.Any])
    
    inline def setAvoidMarksUndefined: Self = StObject.set(x, "avoidMarks", js.undefined)
    
    inline def setAvoidMarksVarargs(value: String*): Self = StObject.set(x, "avoidMarks", js.Array(value*))
    
    inline def setLineAnchor(value: LineLabelAnchor | SignalRef): Self = StObject.set(x, "lineAnchor", value.asInstanceOf[js.Any])
    
    inline def setLineAnchorUndefined: Self = StObject.set(x, "lineAnchor", js.undefined)
    
    inline def setMarkIndex(value: Double): Self = StObject.set(x, "markIndex", value.asInstanceOf[js.Any])
    
    inline def setMarkIndexUndefined: Self = StObject.set(x, "markIndex", js.undefined)
    
    inline def setMethod(value: AreaLabelMethod): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    inline def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
    
    inline def setOffset(value: js.Array[Double] | Double | SignalRef): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    inline def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
    
    inline def setOffsetVarargs(value: Double*): Self = StObject.set(x, "offset", js.Array(value*))
    
    inline def setPadding(value: Double | SignalRef): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
    
    inline def setPaddingNull: Self = StObject.set(x, "padding", null)
    
    inline def setPaddingUndefined: Self = StObject.set(x, "padding", js.undefined)
    
    inline def setSize(value: (Vector2[Double | SignalRef]) | SignalRef): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setSort(value: Compare): Self = StObject.set(x, "sort", value.asInstanceOf[js.Any])
    
    inline def setSortUndefined: Self = StObject.set(x, "sort", js.undefined)
    
    inline def setType(value: label): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
