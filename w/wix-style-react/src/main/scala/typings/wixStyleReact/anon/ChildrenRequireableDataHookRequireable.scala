package typings.wixStyleReact.anon

import typings.propTypes.mod.ReactNodeLike
import typings.propTypes.mod.Requireable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChildrenRequireableDataHookRequireable extends StObject {
  
  var children: Requireable[ReactNodeLike]
  
  var dataHook: Requireable[String]
}
object ChildrenRequireableDataHookRequireable {
  
  inline def apply(children: Requireable[ReactNodeLike], dataHook: Requireable[String]): ChildrenRequireableDataHookRequireable = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], dataHook = dataHook.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChildrenRequireableDataHookRequireable]
  }
  
  extension [Self <: ChildrenRequireableDataHookRequireable](x: Self) {
    
    inline def setChildren(value: Requireable[ReactNodeLike]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setDataHook(value: Requireable[String]): Self = StObject.set(x, "dataHook", value.asInstanceOf[js.Any])
  }
}
