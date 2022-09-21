package typings.typedoc.anon

import typings.typedoc.typedocStrings.excludeExternals
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `60` extends StObject {
  
  var name: excludeExternals
}
object `60` {
  
  inline def apply(): `60` = {
    val __obj = js.Dynamic.literal(name = "excludeExternals")
    __obj.asInstanceOf[`60`]
  }
  
  extension [Self <: `60`](x: Self) {
    
    inline def setName(value: excludeExternals): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
