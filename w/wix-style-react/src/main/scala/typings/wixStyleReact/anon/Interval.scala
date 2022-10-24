package typings.wixStyleReact.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Interval extends StObject {
  
  var interval: Any
  
  var timeout: Any
}
object Interval {
  
  inline def apply(interval: Any, timeout: Any): Interval = {
    val __obj = js.Dynamic.literal(interval = interval.asInstanceOf[js.Any], timeout = timeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[Interval]
  }
  
  extension [Self <: Interval](x: Self) {
    
    inline def setInterval(value: Any): Self = StObject.set(x, "interval", value.asInstanceOf[js.Any])
    
    inline def setTimeout(value: Any): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
  }
}
