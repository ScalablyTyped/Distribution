package typings.typedoc.anon

import typings.typedoc.typedocStrings.options
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `32` extends StObject {
  
  var name: options
}
object `32` {
  
  inline def apply(): `32` = {
    val __obj = js.Dynamic.literal(name = "options")
    __obj.asInstanceOf[`32`]
  }
  
  extension [Self <: `32`](x: Self) {
    
    inline def setName(value: options): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
