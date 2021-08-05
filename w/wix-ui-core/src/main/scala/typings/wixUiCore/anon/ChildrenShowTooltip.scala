package typings.wixUiCore.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChildrenShowTooltip extends StObject {
  
  def children(extendedProps: js.Any): typings.react.mod.global.JSX.Element
  
  var showTooltip: Boolean
}
object ChildrenShowTooltip {
  
  inline def apply(children: js.Any => typings.react.mod.global.JSX.Element, showTooltip: Boolean): ChildrenShowTooltip = {
    val __obj = js.Dynamic.literal(children = js.Any.fromFunction1(children), showTooltip = showTooltip.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChildrenShowTooltip]
  }
  
  extension [Self <: ChildrenShowTooltip](x: Self) {
    
    inline def setChildren(value: js.Any => typings.react.mod.global.JSX.Element): Self = StObject.set(x, "children", js.Any.fromFunction1(value))
    
    inline def setShowTooltip(value: Boolean): Self = StObject.set(x, "showTooltip", value.asInstanceOf[js.Any])
  }
}
