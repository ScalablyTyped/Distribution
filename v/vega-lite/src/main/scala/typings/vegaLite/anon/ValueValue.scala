package typings.vegaLite.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ValueValue extends StObject {
  
  var value: typings.vegaLite.channeldefMod.Value[Null]
}
object ValueValue {
  
  inline def apply(): ValueValue = {
    val __obj = js.Dynamic.literal(value = null)
    __obj.asInstanceOf[ValueValue]
  }
  
  extension [Self <: ValueValue](x: Self) {
    
    inline def setValue(value: typings.vegaLite.channeldefMod.Value[Null]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueNull: Self = StObject.set(x, "value", null)
    
    inline def setValueVarargs(value: (Double | String)*): Self = StObject.set(x, "value", js.Array(value :_*))
  }
}
