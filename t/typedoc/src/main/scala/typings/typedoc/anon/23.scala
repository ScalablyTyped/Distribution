package typings.typedoc.anon

import typings.typedoc.typedocStrings.excludeInternal
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `23` extends StObject {
  
  var name: excludeInternal
}
object `23` {
  
  inline def apply(): `23` = {
    val __obj = js.Dynamic.literal(name = "excludeInternal")
    __obj.asInstanceOf[`23`]
  }
  
  extension [Self <: `23`](x: Self) {
    
    inline def setName(value: excludeInternal): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
