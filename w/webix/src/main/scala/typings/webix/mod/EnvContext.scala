package typings.webix.mod

import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnvContext extends StObject {
  
  var target: HTMLElement
  
  var time: js.Date
  
  var x: Double
  
  var y: Double
}
object EnvContext {
  
  inline def apply(target: HTMLElement, time: js.Date, x: Double, y: Double): EnvContext = {
    val __obj = js.Dynamic.literal(target = target.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnvContext]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EnvContext] (val x: Self) extends AnyVal {
    
    inline def setTarget(value: HTMLElement): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    inline def setTime(value: js.Date): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
    
    inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
  }
}
