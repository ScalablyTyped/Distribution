package typings.typedoc.anon

import typings.typedoc.typedocStrings.markedOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `10` extends StObject {
  
  var name: markedOptions
}
object `10` {
  
  inline def apply(): `10` = {
    val __obj = js.Dynamic.literal(name = "markedOptions")
    __obj.asInstanceOf[`10`]
  }
  
  extension [Self <: `10`](x: Self) {
    
    inline def setName(value: markedOptions): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
