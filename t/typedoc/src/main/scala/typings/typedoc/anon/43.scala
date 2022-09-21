package typings.typedoc.anon

import typings.typedoc.typedocStrings.validation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `43` extends StObject {
  
  var name: validation
}
object `43` {
  
  inline def apply(): `43` = {
    val __obj = js.Dynamic.literal(name = "validation")
    __obj.asInstanceOf[`43`]
  }
  
  extension [Self <: `43`](x: Self) {
    
    inline def setName(value: validation): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
