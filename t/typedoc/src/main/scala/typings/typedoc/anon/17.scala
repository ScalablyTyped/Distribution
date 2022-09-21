package typings.typedoc.anon

import typings.typedoc.typedocStrings.emit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `17` extends StObject {
  
  var name: emit
}
object `17` {
  
  inline def apply(): `17` = {
    val __obj = js.Dynamic.literal(name = "emit")
    __obj.asInstanceOf[`17`]
  }
  
  extension [Self <: `17`](x: Self) {
    
    inline def setName(value: emit): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
