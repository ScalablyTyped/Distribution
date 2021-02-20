package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Hourly extends StObject {
  
  var daily: scala.Double = js.native
  
  var hourly: scala.Double = js.native
}
object Hourly {
  
  @scala.inline
  def apply(daily: scala.Double, hourly: scala.Double): Hourly = {
    val __obj = js.Dynamic.literal(daily = daily.asInstanceOf[js.Any], hourly = hourly.asInstanceOf[js.Any])
    __obj.asInstanceOf[Hourly]
  }
  
  @scala.inline
  implicit class HourlyMutableBuilder[Self <: Hourly] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDaily(value: scala.Double): Self = StObject.set(x, "daily", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHourly(value: scala.Double): Self = StObject.set(x, "hourly", value.asInstanceOf[js.Any])
  }
}
