package typings.vegaTypings.typesSpecEncodeMod

import typings.vegaTypings.anon.Test
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GroupEncodeEntry
  extends StObject
     with RectEncodeEntry {
  
  var clip: js.UndefOr[ProductionRule[BooleanValueRef]] = js.undefined
  
  var strokeForeground: js.UndefOr[ProductionRule[BooleanValueRef]] = js.undefined
  
  var strokeOffset: js.UndefOr[ProductionRule[NumericValueRef]] = js.undefined
}
object GroupEncodeEntry {
  
  inline def apply(): GroupEncodeEntry = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GroupEncodeEntry]
  }
  
  extension [Self <: GroupEncodeEntry](x: Self) {
    
    inline def setClip(value: ProductionRule[BooleanValueRef]): Self = StObject.set(x, "clip", value.asInstanceOf[js.Any])
    
    inline def setClipUndefined: Self = StObject.set(x, "clip", js.undefined)
    
    inline def setClipVarargs(value: (Test & BooleanValueRef)*): Self = StObject.set(x, "clip", js.Array(value*))
    
    inline def setStrokeForeground(value: ProductionRule[BooleanValueRef]): Self = StObject.set(x, "strokeForeground", value.asInstanceOf[js.Any])
    
    inline def setStrokeForegroundUndefined: Self = StObject.set(x, "strokeForeground", js.undefined)
    
    inline def setStrokeForegroundVarargs(value: (Test & BooleanValueRef)*): Self = StObject.set(x, "strokeForeground", js.Array(value*))
    
    inline def setStrokeOffset(value: ProductionRule[NumericValueRef]): Self = StObject.set(x, "strokeOffset", value.asInstanceOf[js.Any])
    
    inline def setStrokeOffsetUndefined: Self = StObject.set(x, "strokeOffset", js.undefined)
    
    inline def setStrokeOffsetVarargs(value: (Test & NumericValueRef)*): Self = StObject.set(x, "strokeOffset", js.Array(value*))
  }
}
