package typings.vegaTypings.typesSpecTransformMod

import typings.vegaTypings.typesSpecSignalMod.SignalRef
import typings.vegaTypings.typesSpecUtilMod.Vector2
import typings.vegaTypings.vegaTypingsStrings.fold
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FoldTransform
  extends StObject
     with Transforms {
  
  var as: js.UndefOr[(Vector2[String | SignalRef]) | SignalRef] = js.undefined
  
  var fields: js.Array[FieldRef] | SignalRef
  
  var `type`: fold
}
object FoldTransform {
  
  inline def apply(fields: js.Array[FieldRef] | SignalRef): FoldTransform = {
    val __obj = js.Dynamic.literal(fields = fields.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("fold")
    __obj.asInstanceOf[FoldTransform]
  }
  
  extension [Self <: FoldTransform](x: Self) {
    
    inline def setAs(value: (Vector2[String | SignalRef]) | SignalRef): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
    
    inline def setAsUndefined: Self = StObject.set(x, "as", js.undefined)
    
    inline def setFields(value: js.Array[FieldRef] | SignalRef): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    inline def setFieldsVarargs(value: FieldRef*): Self = StObject.set(x, "fields", js.Array(value*))
    
    inline def setType(value: fold): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
