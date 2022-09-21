package typings.typedoc.anon

import typings.typedoc.typedocStrings.sort
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `21` extends StObject {
  
  var name: sort
}
object `21` {
  
  inline def apply(): `21` = {
    val __obj = js.Dynamic.literal(name = "sort")
    __obj.asInstanceOf[`21`]
  }
  
  extension [Self <: `21`](x: Self) {
    
    inline def setName(value: sort): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
