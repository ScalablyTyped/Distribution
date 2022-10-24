package typings.wixStyleReact.anon

import typings.propTypes.mod.Requireable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FromRequireable extends StObject {
  
  var from: Requireable[String | js.Date]
  
  var to: Requireable[String | js.Date]
}
object FromRequireable {
  
  inline def apply(from: Requireable[String | js.Date], to: Requireable[String | js.Date]): FromRequireable = {
    val __obj = js.Dynamic.literal(from = from.asInstanceOf[js.Any], to = to.asInstanceOf[js.Any])
    __obj.asInstanceOf[FromRequireable]
  }
  
  extension [Self <: FromRequireable](x: Self) {
    
    inline def setFrom(value: Requireable[String | js.Date]): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
    
    inline def setTo(value: Requireable[String | js.Date]): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
  }
}
