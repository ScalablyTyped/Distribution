package typings.typedoc.anon

import typings.typedoc.typedocStrings.visibilityFilters
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `11` extends StObject {
  
  var name: visibilityFilters
}
object `11` {
  
  inline def apply(): `11` = {
    val __obj = js.Dynamic.literal(name = "visibilityFilters")
    __obj.asInstanceOf[`11`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `11`] (val x: Self) extends AnyVal {
    
    inline def setName(value: visibilityFilters): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
