package typings.tabris.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `0` extends StObject {
  
  var children: String | Double | Boolean | (js.Array[Null | String | Double | Boolean])
}
object `0` {
  
  inline def apply(children: String | Double | Boolean | (js.Array[Null | String | Double | Boolean])): `0` = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    __obj.asInstanceOf[`0`]
  }
  
  extension [Self <: `0`](x: Self) {
    
    inline def setChildren(value: String | Double | Boolean | (js.Array[Null | String | Double | Boolean])): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenVarargs(value: (Null | String | Double | Boolean)*): Self = StObject.set(x, "children", js.Array(value*))
  }
}
