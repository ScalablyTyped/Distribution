package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Friday extends StObject {
  
  var all: scala.Double = js.native
  
  var friday: scala.Double = js.native
  
  var monday: scala.Double = js.native
  
  var none: scala.Double = js.native
  
  var saturday: scala.Double = js.native
  
  var sunday: scala.Double = js.native
  
  var thursday: scala.Double = js.native
  
  var tuesday: scala.Double = js.native
  
  var wednesday: scala.Double = js.native
}
object Friday {
  
  @scala.inline
  def apply(
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
  implicit class FridayMutableBuilder[Self <: Friday] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAll(value: scala.Double): Self = StObject.set(x, "all", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFriday(value: scala.Double): Self = StObject.set(x, "friday", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMonday(value: scala.Double): Self = StObject.set(x, "monday", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNone(value: scala.Double): Self = StObject.set(x, "none", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSaturday(value: scala.Double): Self = StObject.set(x, "saturday", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSunday(value: scala.Double): Self = StObject.set(x, "sunday", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThursday(value: scala.Double): Self = StObject.set(x, "thursday", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTuesday(value: scala.Double): Self = StObject.set(x, "tuesday", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWednesday(value: scala.Double): Self = StObject.set(x, "wednesday", value.asInstanceOf[js.Any])
  }
}
