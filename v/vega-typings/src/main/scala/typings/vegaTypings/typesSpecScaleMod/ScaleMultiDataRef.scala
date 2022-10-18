package typings.vegaTypings.typesSpecScaleMod

import typings.vegaTypings.typesSpecSignalMod.SignalRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ScaleMultiDataRef extends StObject {
  
  var fields: js.Array[(js.Array[String | Double | Boolean]) | ScaleDataRef | SignalRef]
}
object ScaleMultiDataRef {
  
  inline def apply(fields: js.Array[(js.Array[String | Double | Boolean]) | ScaleDataRef | SignalRef]): ScaleMultiDataRef = {
    val __obj = js.Dynamic.literal(fields = fields.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScaleMultiDataRef]
  }
  
  extension [Self <: ScaleMultiDataRef](x: Self) {
    
    inline def setFields(value: js.Array[(js.Array[String | Double | Boolean]) | ScaleDataRef | SignalRef]): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    inline def setFieldsVarargs(value: ((js.Array[String | Double | Boolean]) | ScaleDataRef | SignalRef)*): Self = StObject.set(x, "fields", js.Array(value*))
  }
}
