package typings.tuyaPanelKit.anon

import typings.react.mod.ComponentType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Component extends js.Object {
  
  var children: js.UndefOr[scala.Nothing] = js.native
  
  var component: js.UndefOr[scala.Nothing] = js.native
  
  /**
    * Lazily get a React component to render for this screen.
    */
  def getComponent(): ComponentType[_] = js.native
}
object Component {
  
  @scala.inline
  def apply(getComponent: () => ComponentType[_]): Component = {
    val __obj = js.Dynamic.literal(getComponent = js.Any.fromFunction0(getComponent))
    __obj.asInstanceOf[Component]
  }
  
  @scala.inline
  implicit class ComponentOps[Self <: Component] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setGetComponent(value: () => ComponentType[_]): Self = this.set("getComponent", js.Any.fromFunction0(value))
  }
}
