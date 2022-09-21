package typings.typedoc.anon

import typings.typedoc.typedocStrings.categoryOrder
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `49` extends StObject {
  
  var name: categoryOrder
}
object `49` {
  
  inline def apply(): `49` = {
    val __obj = js.Dynamic.literal(name = "categoryOrder")
    __obj.asInstanceOf[`49`]
  }
  
  extension [Self <: `49`](x: Self) {
    
    inline def setName(value: categoryOrder): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
