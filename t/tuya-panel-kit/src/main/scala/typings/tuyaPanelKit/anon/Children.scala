package typings.tuyaPanelKit.anon

import typings.react.mod.ComponentType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Children extends StObject {
  
  var children: js.UndefOr[scala.Nothing] = js.native
  
  /**
    * React component to render for this screen.
    */
  var component: ComponentType[_] = js.native
  
  var getComponent: js.UndefOr[scala.Nothing] = js.native
}
object Children {
  
  @scala.inline
  def apply(component: ComponentType[_]): Children = {
    val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any])
    __obj.asInstanceOf[Children]
  }
  
  @scala.inline
  implicit class ChildrenMutableBuilder[Self <: Children] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setComponent(value: ComponentType[_]): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
  }
}
