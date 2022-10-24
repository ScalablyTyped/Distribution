package typings.wixStyleReact.anon

import typings.propTypes.mod.ReactNodeLike
import typings.propTypes.mod.Requireable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChildrenRequireable extends StObject {
  
  var children: Requireable[ReactNodeLike]
  
  var value: Requireable[String]
}
object ChildrenRequireable {
  
  inline def apply(children: Requireable[ReactNodeLike], value: Requireable[String]): ChildrenRequireable = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChildrenRequireable]
  }
  
  extension [Self <: ChildrenRequireable](x: Self) {
    
    inline def setChildren(value: Requireable[ReactNodeLike]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setValue(value: Requireable[String]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
