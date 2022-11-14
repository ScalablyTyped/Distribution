package typings.tabris.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `32` extends StObject {
  
  var `type`: js.UndefOr[String] = js.undefined
}
object `32` {
  
  inline def apply(): `32` = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`32`]
  }
  
  extension [Self <: `32`](x: Self) {
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
