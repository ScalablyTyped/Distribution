package typings.webix.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Seconds extends StObject {
  
  var seconds: String
}
object Seconds {
  
  inline def apply(seconds: String): Seconds = {
    val __obj = js.Dynamic.literal(seconds = seconds.asInstanceOf[js.Any])
    __obj.asInstanceOf[Seconds]
  }
  
  extension [Self <: Seconds](x: Self) {
    
    inline def setSeconds(value: String): Self = StObject.set(x, "seconds", value.asInstanceOf[js.Any])
  }
}
