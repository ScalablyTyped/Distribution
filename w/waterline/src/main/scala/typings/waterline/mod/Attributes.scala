package typings.waterline.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Attributes
  extends StObject
     with /* index */ StringDictionary[Attribute] {
  
  var toJSON: js.UndefOr[js.Function0[String]] = js.undefined
  
  var toObject: js.UndefOr[js.Function0[js.Any]] = js.undefined
}
object Attributes {
  
  inline def apply(): Attributes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Attributes]
  }
  
  extension [Self <: Attributes](x: Self) {
    
    inline def setToJSON(value: () => String): Self = StObject.set(x, "toJSON", js.Any.fromFunction0(value))
    
    inline def setToJSONUndefined: Self = StObject.set(x, "toJSON", js.undefined)
    
    inline def setToObject(value: () => js.Any): Self = StObject.set(x, "toObject", js.Any.fromFunction0(value))
    
    inline def setToObjectUndefined: Self = StObject.set(x, "toObject", js.undefined)
  }
}
