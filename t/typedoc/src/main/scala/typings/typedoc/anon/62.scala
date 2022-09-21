package typings.typedoc.anon

import typings.typedoc.typedocStrings.requiredToBeDocumented
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `62` extends StObject {
  
  var name: requiredToBeDocumented
}
object `62` {
  
  inline def apply(): `62` = {
    val __obj = js.Dynamic.literal(name = "requiredToBeDocumented")
    __obj.asInstanceOf[`62`]
  }
  
  extension [Self <: `62`](x: Self) {
    
    inline def setName(value: requiredToBeDocumented): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
