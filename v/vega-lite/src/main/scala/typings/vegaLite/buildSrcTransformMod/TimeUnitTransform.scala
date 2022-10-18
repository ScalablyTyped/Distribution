package typings.vegaLite.buildSrcTransformMod

import typings.vegaLite.buildSrcChanneldefMod.FieldName
import typings.vegaLite.buildSrcTimeunitMod.TimeUnit
import typings.vegaLite.buildSrcTimeunitMod.TimeUnitParams
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TimeUnitTransform
  extends StObject
     with Transform {
  
  /**
    * The output field to write the timeUnit value.
    */
  var as: FieldName
  
  /**
    * The data field to apply time unit.
    */
  var field: FieldName
  
  /**
    * The timeUnit.
    */
  var timeUnit: TimeUnit | TimeUnitParams
}
object TimeUnitTransform {
  
  inline def apply(as: FieldName, field: FieldName, timeUnit: TimeUnit | TimeUnitParams): TimeUnitTransform = {
    val __obj = js.Dynamic.literal(as = as.asInstanceOf[js.Any], field = field.asInstanceOf[js.Any], timeUnit = timeUnit.asInstanceOf[js.Any])
    __obj.asInstanceOf[TimeUnitTransform]
  }
  
  extension [Self <: TimeUnitTransform](x: Self) {
    
    inline def setAs(value: FieldName): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
    
    inline def setField(value: FieldName): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
    
    inline def setTimeUnit(value: TimeUnit | TimeUnitParams): Self = StObject.set(x, "timeUnit", value.asInstanceOf[js.Any])
  }
}
