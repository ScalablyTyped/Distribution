package typings.victoryCore.anon

import typings.propTypes.mod.ReactElementLike
import typings.propTypes.mod.ReactNodeLike
import typings.propTypes.mod.Requireable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GroupComponent extends StObject {
  
  var children: Requireable[ReactNodeLike]
  
  var groupComponent: Requireable[ReactElementLike]
}
object GroupComponent {
  
  inline def apply(children: Requireable[ReactNodeLike], groupComponent: Requireable[ReactElementLike]): GroupComponent = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], groupComponent = groupComponent.asInstanceOf[js.Any])
    __obj.asInstanceOf[GroupComponent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GroupComponent] (val x: Self) extends AnyVal {
    
    inline def setChildren(value: Requireable[ReactNodeLike]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setGroupComponent(value: Requireable[ReactElementLike]): Self = StObject.set(x, "groupComponent", value.asInstanceOf[js.Any])
  }
}
