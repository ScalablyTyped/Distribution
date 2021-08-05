package typings.vegaTypings.scaleMod

import typings.vegaTypings.vegaTypingsStrings.linear
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LinearScale
  extends StObject
     with NumericScale
     with Scale {
  
  @JSName("type")
  var type_LinearScale: js.UndefOr[linear] = js.undefined
}
object LinearScale {
  
  inline def apply(name: String): LinearScale = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[LinearScale]
  }
  
  extension [Self <: LinearScale](x: Self) {
    
    inline def setType(value: linear): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
