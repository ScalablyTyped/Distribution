package typings.vegaTypings.typesSpecTransformMod

import typings.vegaTypings.typesSpecSignalMod.SignalRef
import typings.vegaTypings.typesSpecUtilMod.Vector2
import typings.vegaTypings.vegaTypingsStrings.pie
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PieTransform
  extends StObject
     with Transforms {
  
  var as: js.UndefOr[(Vector2[String | SignalRef]) | SignalRef] = js.undefined
  
  var endAngle: js.UndefOr[Double | SignalRef] = js.undefined
  
  var field: js.UndefOr[FieldRef] = js.undefined
  
  var sort: js.UndefOr[Boolean | SignalRef] = js.undefined
  
  var startAngle: js.UndefOr[Double | SignalRef] = js.undefined
  
  var `type`: pie
}
object PieTransform {
  
  inline def apply(): PieTransform = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("pie")
    __obj.asInstanceOf[PieTransform]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PieTransform] (val x: Self) extends AnyVal {
    
    inline def setAs(value: (Vector2[String | SignalRef]) | SignalRef): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
    
    inline def setAsUndefined: Self = StObject.set(x, "as", js.undefined)
    
    inline def setEndAngle(value: Double | SignalRef): Self = StObject.set(x, "endAngle", value.asInstanceOf[js.Any])
    
    inline def setEndAngleUndefined: Self = StObject.set(x, "endAngle", js.undefined)
    
    inline def setField(value: FieldRef): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
    
    inline def setFieldUndefined: Self = StObject.set(x, "field", js.undefined)
    
    inline def setSort(value: Boolean | SignalRef): Self = StObject.set(x, "sort", value.asInstanceOf[js.Any])
    
    inline def setSortUndefined: Self = StObject.set(x, "sort", js.undefined)
    
    inline def setStartAngle(value: Double | SignalRef): Self = StObject.set(x, "startAngle", value.asInstanceOf[js.Any])
    
    inline def setStartAngleUndefined: Self = StObject.set(x, "startAngle", js.undefined)
    
    inline def setType(value: pie): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
