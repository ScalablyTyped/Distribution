package typings.typedoc.anon

import typings.typedoc.typedocStrings.out
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `1` extends StObject {
  
  var name: out
}
object `1` {
  
  inline def apply(): `1` = {
    val __obj = js.Dynamic.literal(name = "out")
    __obj.asInstanceOf[`1`]
  }
  
  extension [Self <: `1`](x: Self) {
    
    inline def setName(value: out): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
