package typings.typedoc.anon

import typings.typedoc.typedocStrings.exclude
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `18` extends StObject {
  
  var name: exclude
}
object `18` {
  
  inline def apply(): `18` = {
    val __obj = js.Dynamic.literal(name = "exclude")
    __obj.asInstanceOf[`18`]
  }
  
  extension [Self <: `18`](x: Self) {
    
    inline def setName(value: exclude): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
