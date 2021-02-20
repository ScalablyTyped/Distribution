package typings.vegaTypings.transformMod

import typings.vegaTypings.markMod.Compare
import typings.vegaTypings.signalMod.SignalRef
import typings.vegaTypings.utilMod.Vector2
import typings.vegaTypings.utilMod.Vector6
import typings.vegaTypings.vegaTypingsStrings.treemap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TreemapTransform extends _Transforms {
  
  var as: js.UndefOr[(Vector6[String | SignalRef]) | SignalRef] = js.native
  
  var field: js.UndefOr[FieldRef] = js.native
  
  var method: js.UndefOr[TreemapMethod | SignalRef] = js.native
  
  var padding: js.UndefOr[Double | SignalRef] = js.native
  
  var paddingBottom: js.UndefOr[Double | SignalRef] = js.native
  
  var paddingInner: js.UndefOr[Double | SignalRef] = js.native
  
  var paddingLeft: js.UndefOr[Double | SignalRef] = js.native
  
  var paddingOuter: js.UndefOr[Double | SignalRef] = js.native
  
  var paddingRight: js.UndefOr[Double | SignalRef] = js.native
  
  var paddingTop: js.UndefOr[Double | SignalRef] = js.native
  
  var ratio: js.UndefOr[Double | SignalRef] = js.native
  
  var round: js.UndefOr[Boolean | SignalRef] = js.native
  
  var size: js.UndefOr[(Vector2[Double | SignalRef]) | SignalRef] = js.native
  
  var sort: js.UndefOr[Compare] = js.native
  
  var `type`: treemap = js.native
}
object TreemapTransform {
  
  @scala.inline
  def apply(`type`: treemap): TreemapTransform = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TreemapTransform]
  }
  
  @scala.inline
  implicit class TreemapTransformMutableBuilder[Self <: TreemapTransform] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAs(value: (Vector6[String | SignalRef]) | SignalRef): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAsUndefined: Self = StObject.set(x, "as", js.undefined)
    
    @scala.inline
    def setField(value: FieldRef): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFieldUndefined: Self = StObject.set(x, "field", js.undefined)
    
    @scala.inline
    def setMethod(value: TreemapMethod | SignalRef): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
    
    @scala.inline
    def setPadding(value: Double | SignalRef): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPaddingBottom(value: Double | SignalRef): Self = StObject.set(x, "paddingBottom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPaddingBottomUndefined: Self = StObject.set(x, "paddingBottom", js.undefined)
    
    @scala.inline
    def setPaddingInner(value: Double | SignalRef): Self = StObject.set(x, "paddingInner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPaddingInnerUndefined: Self = StObject.set(x, "paddingInner", js.undefined)
    
    @scala.inline
    def setPaddingLeft(value: Double | SignalRef): Self = StObject.set(x, "paddingLeft", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPaddingLeftUndefined: Self = StObject.set(x, "paddingLeft", js.undefined)
    
    @scala.inline
    def setPaddingOuter(value: Double | SignalRef): Self = StObject.set(x, "paddingOuter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPaddingOuterUndefined: Self = StObject.set(x, "paddingOuter", js.undefined)
    
    @scala.inline
    def setPaddingRight(value: Double | SignalRef): Self = StObject.set(x, "paddingRight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPaddingRightUndefined: Self = StObject.set(x, "paddingRight", js.undefined)
    
    @scala.inline
    def setPaddingTop(value: Double | SignalRef): Self = StObject.set(x, "paddingTop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPaddingTopUndefined: Self = StObject.set(x, "paddingTop", js.undefined)
    
    @scala.inline
    def setPaddingUndefined: Self = StObject.set(x, "padding", js.undefined)
    
    @scala.inline
    def setRatio(value: Double | SignalRef): Self = StObject.set(x, "ratio", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRatioUndefined: Self = StObject.set(x, "ratio", js.undefined)
    
    @scala.inline
    def setRound(value: Boolean | SignalRef): Self = StObject.set(x, "round", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoundUndefined: Self = StObject.set(x, "round", js.undefined)
    
    @scala.inline
    def setSize(value: (Vector2[Double | SignalRef]) | SignalRef): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    @scala.inline
    def setSort(value: Compare): Self = StObject.set(x, "sort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSortUndefined: Self = StObject.set(x, "sort", js.undefined)
    
    @scala.inline
    def setType(value: treemap): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
