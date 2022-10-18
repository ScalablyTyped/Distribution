package typings.typedoc.anon

import typings.typedoc.typedocStrings.includes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `23` extends StObject {
  
  var name: includes
}
object `23` {
  
  inline def apply(): `23` = {
    val __obj = js.Dynamic.literal(name = "includes")
    __obj.asInstanceOf[`23`]
  }
  
  extension [Self <: `23`](x: Self) {
    
    inline def setName(value: includes): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
