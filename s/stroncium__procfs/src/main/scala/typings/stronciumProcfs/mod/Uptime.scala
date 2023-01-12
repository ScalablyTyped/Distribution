package typings.stronciumProcfs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Uptime extends StObject {
  
  var idle: Double
  
  var time: Double
}
object Uptime {
  
  inline def apply(idle: Double, time: Double): Uptime = {
    val __obj = js.Dynamic.literal(idle = idle.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any])
    __obj.asInstanceOf[Uptime]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Uptime] (val x: Self) extends AnyVal {
    
    inline def setIdle(value: Double): Self = StObject.set(x, "idle", value.asInstanceOf[js.Any])
    
    inline def setTime(value: Double): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
  }
}
