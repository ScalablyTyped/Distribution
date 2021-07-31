package typings.vegaLite.anon

import typings.vegaLite.srcTimeunitMod.TimeUnitParams
import typings.vegaLite.srcTypeMod.Type
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TimeUnit extends StObject {
  
  var timeUnit: typings.vegaLite.srcTimeunitMod.TimeUnit | TimeUnitParams
  
  var `type`: js.UndefOr[Type] = js.undefined
  
  var undefinedIfExprNotRequired: js.UndefOr[Boolean] = js.undefined
  
  var wrapTime: js.UndefOr[Boolean] = js.undefined
}
object TimeUnit {
  
  @scala.inline
  def apply(timeUnit: typings.vegaLite.srcTimeunitMod.TimeUnit | TimeUnitParams): TimeUnit = {
    val __obj = js.Dynamic.literal(timeUnit = timeUnit.asInstanceOf[js.Any])
    __obj.asInstanceOf[TimeUnit]
  }
  
  @scala.inline
  implicit class TimeUnitMutableBuilder[Self <: TimeUnit] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTimeUnit(value: typings.vegaLite.srcTimeunitMod.TimeUnit | TimeUnitParams): Self = StObject.set(x, "timeUnit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: Type): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    @scala.inline
    def setUndefinedIfExprNotRequired(value: Boolean): Self = StObject.set(x, "undefinedIfExprNotRequired", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUndefinedIfExprNotRequiredUndefined: Self = StObject.set(x, "undefinedIfExprNotRequired", js.undefined)
    
    @scala.inline
    def setWrapTime(value: Boolean): Self = StObject.set(x, "wrapTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWrapTimeUndefined: Self = StObject.set(x, "wrapTime", js.undefined)
  }
}
