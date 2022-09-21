package typings.typedoc.anon

import typings.typedoc.typedocStrings.excludeProtected
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `29` extends StObject {
  
  var name: excludeProtected
}
object `29` {
  
  inline def apply(): `29` = {
    val __obj = js.Dynamic.literal(name = "excludeProtected")
    __obj.asInstanceOf[`29`]
  }
  
  extension [Self <: `29`](x: Self) {
    
    inline def setName(value: excludeProtected): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
