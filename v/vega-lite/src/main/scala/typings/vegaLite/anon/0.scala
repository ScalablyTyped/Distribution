package typings.vegaLite.anon

import typings.vegaLite.buildSrcChanneldefMod.Conditional
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `0` extends StObject {
  
  var condition: Conditional[Any]
}
object `0` {
  
  inline def apply(condition: Conditional[Any]): `0` = {
    val __obj = js.Dynamic.literal(condition = condition.asInstanceOf[js.Any])
    __obj.asInstanceOf[`0`]
  }
  
  extension [Self <: `0`](x: Self) {
    
    inline def setCondition(value: Conditional[Any]): Self = StObject.set(x, "condition", value.asInstanceOf[js.Any])
  }
}
