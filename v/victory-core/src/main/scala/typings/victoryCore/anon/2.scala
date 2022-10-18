package typings.victoryCore.anon

import typings.victoryCore.libTypesPropTypesMod._CategoryPropType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `2`
  extends StObject
     with _CategoryPropType {
  
  var y: js.Array[String]
}
object `2` {
  
  inline def apply(y: js.Array[String]): `2` = {
    val __obj = js.Dynamic.literal(y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[`2`]
  }
  
  extension [Self <: `2`](x: Self) {
    
    inline def setY(value: js.Array[String]): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    
    inline def setYVarargs(value: String*): Self = StObject.set(x, "y", js.Array(value*))
  }
}
