package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Hourly extends StObject {
  
  var daily: scala.Double
  
  var hourly: scala.Double
}
object Hourly {
  
  inline def apply(daily: scala.Double, hourly: scala.Double): Hourly = {
    val __obj = js.Dynamic.literal(daily = daily.asInstanceOf[js.Any], hourly = hourly.asInstanceOf[js.Any])
    __obj.asInstanceOf[Hourly]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Hourly] (val x: Self) extends AnyVal {
    
    inline def setDaily(value: scala.Double): Self = StObject.set(x, "daily", value.asInstanceOf[js.Any])
    
    inline def setHourly(value: scala.Double): Self = StObject.set(x, "hourly", value.asInstanceOf[js.Any])
  }
}
