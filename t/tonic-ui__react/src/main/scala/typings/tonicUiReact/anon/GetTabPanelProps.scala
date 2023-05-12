package typings.tonicUiReact.anon

import typings.std.HTMLDivElement
import typings.tonicUiReact.mod.TonicProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetTabPanelProps extends StObject {
  
  def getTabPanelProps(): TonicProps[HTMLDivElement]
  
  var index: Double
  
  var isSelected: Boolean
}
object GetTabPanelProps {
  
  inline def apply(getTabPanelProps: () => TonicProps[HTMLDivElement], index: Double, isSelected: Boolean): GetTabPanelProps = {
    val __obj = js.Dynamic.literal(getTabPanelProps = js.Any.fromFunction0(getTabPanelProps), index = index.asInstanceOf[js.Any], isSelected = isSelected.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetTabPanelProps]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetTabPanelProps] (val x: Self) extends AnyVal {
    
    inline def setGetTabPanelProps(value: () => TonicProps[HTMLDivElement]): Self = StObject.set(x, "getTabPanelProps", js.Any.fromFunction0(value))
    
    inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    inline def setIsSelected(value: Boolean): Self = StObject.set(x, "isSelected", value.asInstanceOf[js.Any])
  }
}
