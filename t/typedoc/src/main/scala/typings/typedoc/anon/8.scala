package typings.typedoc.anon

import typings.typedoc.typedocStrings.logger
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `8` extends StObject {
  
  var name: logger
}
object `8` {
  
  inline def apply(): `8` = {
    val __obj = js.Dynamic.literal(name = "logger")
    __obj.asInstanceOf[`8`]
  }
  
  extension [Self <: `8`](x: Self) {
    
    inline def setName(value: logger): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
