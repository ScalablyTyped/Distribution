package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Allow extends StObject {
  
  var allow: scala.Double
  
  var completed: scala.Double
  
  var disallow: scala.Double
}
object Allow {
  
  inline def apply(allow: scala.Double, completed: scala.Double, disallow: scala.Double): Allow = {
    val __obj = js.Dynamic.literal(allow = allow.asInstanceOf[js.Any], completed = completed.asInstanceOf[js.Any], disallow = disallow.asInstanceOf[js.Any])
    __obj.asInstanceOf[Allow]
  }
  
  extension [Self <: Allow](x: Self) {
    
    inline def setAllow(value: scala.Double): Self = StObject.set(x, "allow", value.asInstanceOf[js.Any])
    
    inline def setCompleted(value: scala.Double): Self = StObject.set(x, "completed", value.asInstanceOf[js.Any])
    
    inline def setDisallow(value: scala.Double): Self = StObject.set(x, "disallow", value.asInstanceOf[js.Any])
  }
}
