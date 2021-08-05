package typings.typedoc.anon

import typings.typedoc.typedocStrings.out
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `0` extends StObject {
  
  var name: out
}
object `0` {
  
  inline def apply(): `0` = {
    val __obj = js.Dynamic.literal(name = "out")
    __obj.asInstanceOf[`0`]
  }
  
  extension [Self <: `0`](x: Self) {
    
    inline def setName(value: out): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
