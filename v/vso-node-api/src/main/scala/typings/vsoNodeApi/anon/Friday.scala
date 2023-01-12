package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Friday extends StObject {
  
  var all: scala.Double
  
  var friday: scala.Double
  
  var monday: scala.Double
  
  var none: scala.Double
  
  var saturday: scala.Double
  
  var sunday: scala.Double
  
  var thursday: scala.Double
  
  var tuesday: scala.Double
  
  var wednesday: scala.Double
}
object Friday {
  
  inline def apply(
    all: scala.Double,
    friday: scala.Double,
    monday: scala.Double,
    none: scala.Double,
    saturday: scala.Double,
    sunday: scala.Double,
    thursday: scala.Double,
    tuesday: scala.Double,
    wednesday: scala.Double
  ): Friday = {
    val __obj = js.Dynamic.literal(all = all.asInstanceOf[js.Any], friday = friday.asInstanceOf[js.Any], monday = monday.asInstanceOf[js.Any], none = none.asInstanceOf[js.Any], saturday = saturday.asInstanceOf[js.Any], sunday = sunday.asInstanceOf[js.Any], thursday = thursday.asInstanceOf[js.Any], tuesday = tuesday.asInstanceOf[js.Any], wednesday = wednesday.asInstanceOf[js.Any])
    __obj.asInstanceOf[Friday]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Friday] (val x: Self) extends AnyVal {
    
    inline def setAll(value: scala.Double): Self = StObject.set(x, "all", value.asInstanceOf[js.Any])
    
    inline def setFriday(value: scala.Double): Self = StObject.set(x, "friday", value.asInstanceOf[js.Any])
    
    inline def setMonday(value: scala.Double): Self = StObject.set(x, "monday", value.asInstanceOf[js.Any])
    
    inline def setNone(value: scala.Double): Self = StObject.set(x, "none", value.asInstanceOf[js.Any])
    
    inline def setSaturday(value: scala.Double): Self = StObject.set(x, "saturday", value.asInstanceOf[js.Any])
    
    inline def setSunday(value: scala.Double): Self = StObject.set(x, "sunday", value.asInstanceOf[js.Any])
    
    inline def setThursday(value: scala.Double): Self = StObject.set(x, "thursday", value.asInstanceOf[js.Any])
    
    inline def setTuesday(value: scala.Double): Self = StObject.set(x, "tuesday", value.asInstanceOf[js.Any])
    
    inline def setWednesday(value: scala.Double): Self = StObject.set(x, "wednesday", value.asInstanceOf[js.Any])
  }
}
