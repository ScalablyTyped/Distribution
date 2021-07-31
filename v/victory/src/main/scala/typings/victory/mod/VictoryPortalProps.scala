package typings.victory.mod

import typings.react.mod.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VictoryPortalProps extends StObject {
  
  /**
    * The children of this component define the content of the label.
    * This makes using the component similar to normal HTML spans or labels. strings, numbers, and functions of data / value are supported.
    */
  var children: js.UndefOr[ReactElement] = js.undefined
  
  /**
    * The groupComponent prop takes a component instance which will be used to create a group element for VictoryPortal to render its child component into. This prop defaults to a <g> tag.
    */
  var groupComponent: js.UndefOr[ReactElement] = js.undefined
}
object VictoryPortalProps {
  
  @scala.inline
  def apply(): VictoryPortalProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VictoryPortalProps]
  }
  
  @scala.inline
  implicit class VictoryPortalPropsMutableBuilder[Self <: VictoryPortalProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChildren(value: ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    @scala.inline
    def setGroupComponent(value: ReactElement): Self = StObject.set(x, "groupComponent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupComponentUndefined: Self = StObject.set(x, "groupComponent", js.undefined)
  }
}
