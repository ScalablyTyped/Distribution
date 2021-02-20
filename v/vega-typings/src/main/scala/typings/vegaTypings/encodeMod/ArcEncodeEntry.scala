package typings.vegaTypings.encodeMod

import typings.vegaTypings.anon.Test
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ArcEncodeEntry extends EncodeEntry {
  
  var cornerRadius: js.UndefOr[ProductionRule[NumericValueRef]] = js.native
  
  var endAngle: js.UndefOr[ProductionRule[NumericValueRef]] = js.native
  
  var innerRadius: js.UndefOr[ProductionRule[NumericValueRef]] = js.native
  
  var outerRadius: js.UndefOr[ProductionRule[NumericValueRef]] = js.native
  
  var padAngle: js.UndefOr[ProductionRule[NumericValueRef]] = js.native
  
  var startAngle: js.UndefOr[ProductionRule[NumericValueRef]] = js.native
}
object ArcEncodeEntry {
  
  @scala.inline
  def apply(): ArcEncodeEntry = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ArcEncodeEntry]
  }
  
  @scala.inline
  implicit class ArcEncodeEntryMutableBuilder[Self <: ArcEncodeEntry] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCornerRadius(value: ProductionRule[NumericValueRef]): Self = StObject.set(x, "cornerRadius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCornerRadiusUndefined: Self = StObject.set(x, "cornerRadius", js.undefined)
    
    @scala.inline
    def setCornerRadiusVarargs(value: (Test with NumericValueRef)*): Self = StObject.set(x, "cornerRadius", js.Array(value :_*))
    
    @scala.inline
    def setEndAngle(value: ProductionRule[NumericValueRef]): Self = StObject.set(x, "endAngle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndAngleUndefined: Self = StObject.set(x, "endAngle", js.undefined)
    
    @scala.inline
    def setEndAngleVarargs(value: (Test with NumericValueRef)*): Self = StObject.set(x, "endAngle", js.Array(value :_*))
    
    @scala.inline
    def setInnerRadius(value: ProductionRule[NumericValueRef]): Self = StObject.set(x, "innerRadius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInnerRadiusUndefined: Self = StObject.set(x, "innerRadius", js.undefined)
    
    @scala.inline
    def setInnerRadiusVarargs(value: (Test with NumericValueRef)*): Self = StObject.set(x, "innerRadius", js.Array(value :_*))
    
    @scala.inline
    def setOuterRadius(value: ProductionRule[NumericValueRef]): Self = StObject.set(x, "outerRadius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOuterRadiusUndefined: Self = StObject.set(x, "outerRadius", js.undefined)
    
    @scala.inline
    def setOuterRadiusVarargs(value: (Test with NumericValueRef)*): Self = StObject.set(x, "outerRadius", js.Array(value :_*))
    
    @scala.inline
    def setPadAngle(value: ProductionRule[NumericValueRef]): Self = StObject.set(x, "padAngle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPadAngleUndefined: Self = StObject.set(x, "padAngle", js.undefined)
    
    @scala.inline
    def setPadAngleVarargs(value: (Test with NumericValueRef)*): Self = StObject.set(x, "padAngle", js.Array(value :_*))
    
    @scala.inline
    def setStartAngle(value: ProductionRule[NumericValueRef]): Self = StObject.set(x, "startAngle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartAngleUndefined: Self = StObject.set(x, "startAngle", js.undefined)
    
    @scala.inline
    def setStartAngleVarargs(value: (Test with NumericValueRef)*): Self = StObject.set(x, "startAngle", js.Array(value :_*))
  }
}
