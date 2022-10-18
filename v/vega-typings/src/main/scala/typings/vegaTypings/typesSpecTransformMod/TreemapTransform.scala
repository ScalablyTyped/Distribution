package typings.vegaTypings.typesSpecTransformMod

import typings.vegaTypings.typesSpecMarkMod.Compare
import typings.vegaTypings.typesSpecSignalMod.SignalRef
import typings.vegaTypings.typesSpecUtilMod.Vector2
import typings.vegaTypings.typesSpecUtilMod.Vector6
import typings.vegaTypings.vegaTypingsStrings.treemap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TreemapTransform
  extends StObject
     with Transforms {
  
  var as: js.UndefOr[(Vector6[String | SignalRef]) | SignalRef] = js.undefined
  
  var field: js.UndefOr[FieldRef] = js.undefined
  
  var method: js.UndefOr[TreemapMethod | SignalRef] = js.undefined
  
  var padding: js.UndefOr[Double | SignalRef] = js.undefined
  
  var paddingBottom: js.UndefOr[Double | SignalRef] = js.undefined
  
  var paddingInner: js.UndefOr[Double | SignalRef] = js.undefined
  
  var paddingLeft: js.UndefOr[Double | SignalRef] = js.undefined
  
  var paddingOuter: js.UndefOr[Double | SignalRef] = js.undefined
  
  var paddingRight: js.UndefOr[Double | SignalRef] = js.undefined
  
  var paddingTop: js.UndefOr[Double | SignalRef] = js.undefined
  
  var ratio: js.UndefOr[Double | SignalRef] = js.undefined
  
  var round: js.UndefOr[Boolean | SignalRef] = js.undefined
  
  var size: js.UndefOr[(Vector2[Double | SignalRef]) | SignalRef] = js.undefined
  
  var sort: js.UndefOr[Compare] = js.undefined
  
  var `type`: treemap
}
object TreemapTransform {
  
  inline def apply(): TreemapTransform = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("treemap")
    __obj.asInstanceOf[TreemapTransform]
  }
  
  extension [Self <: TreemapTransform](x: Self) {
    
    inline def setAs(value: (Vector6[String | SignalRef]) | SignalRef): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
    
    inline def setAsUndefined: Self = StObject.set(x, "as", js.undefined)
    
    inline def setField(value: FieldRef): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
    
    inline def setFieldUndefined: Self = StObject.set(x, "field", js.undefined)
    
    inline def setMethod(value: TreemapMethod | SignalRef): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    inline def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
    
    inline def setPadding(value: Double | SignalRef): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
    
    inline def setPaddingBottom(value: Double | SignalRef): Self = StObject.set(x, "paddingBottom", value.asInstanceOf[js.Any])
    
    inline def setPaddingBottomUndefined: Self = StObject.set(x, "paddingBottom", js.undefined)
    
    inline def setPaddingInner(value: Double | SignalRef): Self = StObject.set(x, "paddingInner", value.asInstanceOf[js.Any])
    
    inline def setPaddingInnerUndefined: Self = StObject.set(x, "paddingInner", js.undefined)
    
    inline def setPaddingLeft(value: Double | SignalRef): Self = StObject.set(x, "paddingLeft", value.asInstanceOf[js.Any])
    
    inline def setPaddingLeftUndefined: Self = StObject.set(x, "paddingLeft", js.undefined)
    
    inline def setPaddingOuter(value: Double | SignalRef): Self = StObject.set(x, "paddingOuter", value.asInstanceOf[js.Any])
    
    inline def setPaddingOuterUndefined: Self = StObject.set(x, "paddingOuter", js.undefined)
    
    inline def setPaddingRight(value: Double | SignalRef): Self = StObject.set(x, "paddingRight", value.asInstanceOf[js.Any])
    
    inline def setPaddingRightUndefined: Self = StObject.set(x, "paddingRight", js.undefined)
    
    inline def setPaddingTop(value: Double | SignalRef): Self = StObject.set(x, "paddingTop", value.asInstanceOf[js.Any])
    
    inline def setPaddingTopUndefined: Self = StObject.set(x, "paddingTop", js.undefined)
    
    inline def setPaddingUndefined: Self = StObject.set(x, "padding", js.undefined)
    
    inline def setRatio(value: Double | SignalRef): Self = StObject.set(x, "ratio", value.asInstanceOf[js.Any])
    
    inline def setRatioUndefined: Self = StObject.set(x, "ratio", js.undefined)
    
    inline def setRound(value: Boolean | SignalRef): Self = StObject.set(x, "round", value.asInstanceOf[js.Any])
    
    inline def setRoundUndefined: Self = StObject.set(x, "round", js.undefined)
    
    inline def setSize(value: (Vector2[Double | SignalRef]) | SignalRef): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    inline def setSort(value: Compare): Self = StObject.set(x, "sort", value.asInstanceOf[js.Any])
    
    inline def setSortUndefined: Self = StObject.set(x, "sort", js.undefined)
    
    inline def setType(value: treemap): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
