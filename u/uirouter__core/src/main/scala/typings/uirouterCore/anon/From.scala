package typings.uirouterCore.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait From extends StObject {
  
  var from: js.Any
  
  var to: js.Any
}
object From {
  
  inline def apply(from: js.Any, to: js.Any): From = {
    val __obj = js.Dynamic.literal(from = from.asInstanceOf[js.Any], to = to.asInstanceOf[js.Any])
    __obj.asInstanceOf[From]
  }
  
  extension [Self <: From](x: Self) {
    
    inline def setFrom(value: js.Any): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
    
    inline def setTo(value: js.Any): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
  }
}
