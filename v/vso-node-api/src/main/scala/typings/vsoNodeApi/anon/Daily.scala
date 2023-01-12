package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Daily extends StObject {
  
  var daily: scala.Double
}
object Daily {
  
  inline def apply(daily: scala.Double): Daily = {
    val __obj = js.Dynamic.literal(daily = daily.asInstanceOf[js.Any])
    __obj.asInstanceOf[Daily]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Daily] (val x: Self) extends AnyVal {
    
    inline def setDaily(value: scala.Double): Self = StObject.set(x, "daily", value.asInstanceOf[js.Any])
  }
}
