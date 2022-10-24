package typings.wixStyleReact.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `14` extends StObject {
  
  var date: js.Date | Null
}
object `14` {
  
  inline def apply(): `14` = {
    val __obj = js.Dynamic.literal(date = null)
    __obj.asInstanceOf[`14`]
  }
  
  extension [Self <: `14`](x: Self) {
    
    inline def setDate(value: js.Date): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
    
    inline def setDateNull: Self = StObject.set(x, "date", null)
  }
}
