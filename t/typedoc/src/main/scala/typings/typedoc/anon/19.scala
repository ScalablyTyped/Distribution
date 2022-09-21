package typings.typedoc.anon

import typings.typedoc.typedocStrings.defaultCategory
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `19` extends StObject {
  
  var name: defaultCategory
}
object `19` {
  
  inline def apply(): `19` = {
    val __obj = js.Dynamic.literal(name = "defaultCategory")
    __obj.asInstanceOf[`19`]
  }
  
  extension [Self <: `19`](x: Self) {
    
    inline def setName(value: defaultCategory): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
