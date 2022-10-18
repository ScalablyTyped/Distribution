package typings.victoryCore.anon

import typings.victoryCore.libTypesPropTypesMod._CategoryPropType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `1`
  extends StObject
     with _CategoryPropType {
  
  var x: js.Array[String]
}
object `1` {
  
  inline def apply(x: js.Array[String]): `1` = {
    val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any])
    __obj.asInstanceOf[`1`]
  }
  
  extension [Self <: `1`](x: Self) {
    
    inline def setX(value: js.Array[String]): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    inline def setXVarargs(value: String*): Self = StObject.set(x, "x", js.Array(value*))
  }
}
