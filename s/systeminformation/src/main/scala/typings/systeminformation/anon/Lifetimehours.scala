package typings.systeminformation.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Lifetimehours extends StObject {
  
  var lifetime_hours: Double
  
  var status: Value
  
  var `type`: String
}
object Lifetimehours {
  
  inline def apply(lifetime_hours: Double, status: Value, `type`: String): Lifetimehours = {
    val __obj = js.Dynamic.literal(lifetime_hours = lifetime_hours.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Lifetimehours]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Lifetimehours] (val x: Self) extends AnyVal {
    
    inline def setLifetime_hours(value: Double): Self = StObject.set(x, "lifetime_hours", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: Value): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
