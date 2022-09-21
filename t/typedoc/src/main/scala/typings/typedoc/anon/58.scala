package typings.typedoc.anon

import typings.typedoc.typedocStrings.name
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `58` extends StObject {
  
  var name: typings.typedoc.typedocStrings.name
}
object `58` {
  
  inline def apply(): `58` = {
    val __obj = js.Dynamic.literal(name = "name")
    __obj.asInstanceOf[`58`]
  }
  
  extension [Self <: `58`](x: Self) {
    
    inline def setName(value: name): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
