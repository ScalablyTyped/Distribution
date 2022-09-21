package typings.typedoc.anon

import typings.typedoc.typedocStrings.excludePrivate
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `46` extends StObject {
  
  var name: excludePrivate
}
object `46` {
  
  inline def apply(): `46` = {
    val __obj = js.Dynamic.literal(name = "excludePrivate")
    __obj.asInstanceOf[`46`]
  }
  
  extension [Self <: `46`](x: Self) {
    
    inline def setName(value: excludePrivate): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
