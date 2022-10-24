package typings.wixStyleReact.anon

import typings.propTypes.mod.Requireable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait To extends StObject {
  
  var from: Requireable[js.Date]
  
  var to: Requireable[js.Date]
}
object To {
  
  inline def apply(from: Requireable[js.Date], to: Requireable[js.Date]): To = {
    val __obj = js.Dynamic.literal(from = from.asInstanceOf[js.Any], to = to.asInstanceOf[js.Any])
    __obj.asInstanceOf[To]
  }
  
  extension [Self <: To](x: Self) {
    
    inline def setFrom(value: Requireable[js.Date]): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
    
    inline def setTo(value: Requireable[js.Date]): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
  }
}
