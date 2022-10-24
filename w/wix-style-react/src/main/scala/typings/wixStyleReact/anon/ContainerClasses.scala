package typings.wixStyleReact.anon

import typings.propTypes.mod.ReactNodeLike
import typings.propTypes.mod.Requireable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContainerClasses extends StObject {
  
  var children: Requireable[ReactNodeLike]
  
  var containerClasses: Requireable[String]
  
  var containerDataHook: Requireable[String]
  
  var skin: Requireable[String]
}
object ContainerClasses {
  
  inline def apply(
    children: Requireable[ReactNodeLike],
    containerClasses: Requireable[String],
    containerDataHook: Requireable[String],
    skin: Requireable[String]
  ): ContainerClasses = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], containerClasses = containerClasses.asInstanceOf[js.Any], containerDataHook = containerDataHook.asInstanceOf[js.Any], skin = skin.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContainerClasses]
  }
  
  extension [Self <: ContainerClasses](x: Self) {
    
    inline def setChildren(value: Requireable[ReactNodeLike]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setContainerClasses(value: Requireable[String]): Self = StObject.set(x, "containerClasses", value.asInstanceOf[js.Any])
    
    inline def setContainerDataHook(value: Requireable[String]): Self = StObject.set(x, "containerDataHook", value.asInstanceOf[js.Any])
    
    inline def setSkin(value: Requireable[String]): Self = StObject.set(x, "skin", value.asInstanceOf[js.Any])
  }
}
