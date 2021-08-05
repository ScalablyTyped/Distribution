package typings.wixUiCore.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `0` extends StObject {
  
  var children: js.Array[typings.react.mod.global.JSX.Element]
}
object `0` {
  
  inline def apply(children: js.Array[typings.react.mod.global.JSX.Element]): `0` = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    __obj.asInstanceOf[`0`]
  }
  
  extension [Self <: `0`](x: Self) {
    
    inline def setChildren(value: js.Array[typings.react.mod.global.JSX.Element]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenVarargs(value: typings.react.mod.global.JSX.Element*): Self = StObject.set(x, "children", js.Array(value :_*))
  }
}
