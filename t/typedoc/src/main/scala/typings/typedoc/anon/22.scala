package typings.typedoc.anon

import typings.typedoc.typedocStrings.includes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `22` extends StObject {
  
  var name: includes
}
object `22` {
  
  inline def apply(): `22` = {
    val __obj = js.Dynamic.literal(name = "includes")
    __obj.asInstanceOf[`22`]
  }
  
  extension [Self <: `22`](x: Self) {
    
    inline def setName(value: includes): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
