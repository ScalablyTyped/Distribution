package typings.typedoc.anon

import typings.typedoc.typedocStrings.defaultCategory
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `9` extends StObject {
  
  var name: defaultCategory
}
object `9` {
  
  inline def apply(): `9` = {
    val __obj = js.Dynamic.literal(name = "defaultCategory")
    __obj.asInstanceOf[`9`]
  }
  
  extension [Self <: `9`](x: Self) {
    
    inline def setName(value: defaultCategory): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
