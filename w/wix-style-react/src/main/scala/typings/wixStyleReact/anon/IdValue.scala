package typings.wixStyleReact.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IdValue extends StObject {
  
  var id: Double
  
  var value: js.UndefOr[String] = js.undefined
}
object IdValue {
  
  inline def apply(id: Double): IdValue = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[IdValue]
  }
  
  extension [Self <: IdValue](x: Self) {
    
    inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
