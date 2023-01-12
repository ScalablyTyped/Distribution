package typings.swaggerJsdoc.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses
  extends StObject
     with /* key */ StringDictionary[Any] {
  
  var default: js.UndefOr[Response | Reference] = js.undefined
}
object Responses {
  
  inline def apply(): Responses = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Responses]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Responses] (val x: Self) extends AnyVal {
    
    inline def setDefault(value: Response | Reference): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
    
    inline def setDefaultUndefined: Self = StObject.set(x, "default", js.undefined)
  }
}
