package typings.typedoc.anon

import typings.typedoc.typedocStrings.skipErrorChecking
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `24` extends StObject {
  
  var name: skipErrorChecking
}
object `24` {
  
  inline def apply(): `24` = {
    val __obj = js.Dynamic.literal(name = "skipErrorChecking")
    __obj.asInstanceOf[`24`]
  }
  
  extension [Self <: `24`](x: Self) {
    
    inline def setName(value: skipErrorChecking): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
