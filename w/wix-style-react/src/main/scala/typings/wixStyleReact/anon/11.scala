package typings.wixStyleReact.anon

import typings.propTypes.mod.Requireable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `11` extends StObject {
  
  var children: Requireable[Any]
}
object `11` {
  
  inline def apply(children: Requireable[Any]): `11` = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    __obj.asInstanceOf[`11`]
  }
  
  extension [Self <: `11`](x: Self) {
    
    inline def setChildren(value: Requireable[Any]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
  }
}
