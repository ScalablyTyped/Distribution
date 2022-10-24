package typings.wixStyleReact.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait From extends StObject {
  
  var from: js.Date
  
  var to: js.Date
}
object From {
  
  inline def apply(from: js.Date, to: js.Date): From = {
    val __obj = js.Dynamic.literal(from = from.asInstanceOf[js.Any], to = to.asInstanceOf[js.Any])
    __obj.asInstanceOf[From]
  }
  
  extension [Self <: From](x: Self) {
    
    inline def setFrom(value: js.Date): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
    
    inline def setTo(value: js.Date): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
  }
}
