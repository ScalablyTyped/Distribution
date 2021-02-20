package typings.vegaLite.transformMod

import typings.vegaLite.channeldefMod.FieldName
import typings.vegaLite.srcTimeunitMod.TimeUnit
import typings.vegaLite.srcTimeunitMod.TimeUnitParams
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TimeUnitTransform extends Transform {
  
  /**
    * The output field to write the timeUnit value.
    */
  var as: FieldName = js.native
  
  /**
    * The data field to apply time unit.
    */
  var field: FieldName = js.native
  
  /**
    * The timeUnit.
    */
  var timeUnit: TimeUnit | TimeUnitParams = js.native
}
object TimeUnitTransform {
  
  @scala.inline
  def apply(as: FieldName, field: FieldName, timeUnit: TimeUnit | TimeUnitParams): TimeUnitTransform = {
    val __obj = js.Dynamic.literal(as = as.asInstanceOf[js.Any], field = field.asInstanceOf[js.Any], timeUnit = timeUnit.asInstanceOf[js.Any])
    __obj.asInstanceOf[TimeUnitTransform]
  }
  
  @scala.inline
  implicit class TimeUnitTransformMutableBuilder[Self <: TimeUnitTransform] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAs(value: FieldName): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setField(value: FieldName): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeUnit(value: TimeUnit | TimeUnitParams): Self = StObject.set(x, "timeUnit", value.asInstanceOf[js.Any])
  }
}
