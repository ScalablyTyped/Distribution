package typings.victoryCore.anon

import typings.victoryCore.libTypesPropTypesMod._CategoryPropType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `3`
  extends StObject
     with _CategoryPropType {
  
  var x: js.Array[String]
}
object `3` {
  
  inline def apply(x: js.Array[String]): `3` = {
    val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any])
    __obj.asInstanceOf[`3`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `3`] (val x: Self) extends AnyVal {
    
    inline def setX(value: js.Array[String]): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    inline def setXVarargs(value: String*): Self = StObject.set(x, "x", js.Array(value*))
  }
}
