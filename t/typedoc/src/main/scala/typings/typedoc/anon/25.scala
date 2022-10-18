package typings.typedoc.anon

import typings.typedoc.typedocStrings.skipErrorChecking
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `25` extends StObject {
  
  var name: skipErrorChecking
}
object `25` {
  
  inline def apply(): `25` = {
    val __obj = js.Dynamic.literal(name = "skipErrorChecking")
    __obj.asInstanceOf[`25`]
  }
  
  extension [Self <: `25`](x: Self) {
    
    inline def setName(value: skipErrorChecking): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
