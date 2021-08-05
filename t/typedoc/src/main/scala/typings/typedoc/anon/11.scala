package typings.typedoc.anon

import typings.typedoc.typedocStrings.includes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `11` extends StObject {
  
  var name: includes
}
object `11` {
  
  inline def apply(): `11` = {
    val __obj = js.Dynamic.literal(name = "includes")
    __obj.asInstanceOf[`11`]
  }
  
  extension [Self <: `11`](x: Self) {
    
    inline def setName(value: includes): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
