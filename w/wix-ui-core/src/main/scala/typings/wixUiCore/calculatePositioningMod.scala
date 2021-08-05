package typings.wixUiCore

import typings.react.mod.RefObject
import typings.std.HTMLDivElement
import typings.std.HTMLLIElement
import typings.std.HTMLUListElement
import typings.wixUiCore.horizontalMenuItemHorizontalMenuItemMod.ExpandSize
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object calculatePositioningMod {
  
  @JSImport("wix-ui-core/dist/src/components/horizontal-menu/horizontal-menu-layout/calculatePositioning", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def calculatePositioning(hasExpandSizeLayoutRefRootMenuRefMaxOverflowWidthMenuItemRef: CalculatePositioningProps): js.Object = ^.asInstanceOf[js.Dynamic].applyDynamic("calculatePositioning")(hasExpandSizeLayoutRefRootMenuRefMaxOverflowWidthMenuItemRef.asInstanceOf[js.Any]).asInstanceOf[js.Object]
  
  trait CalculatePositioningProps extends StObject {
    
    var expandSize: ExpandSize
    
    var layoutRef: RefObject[HTMLDivElement]
    
    var maxOverflowWidth: Double
    
    var menuItemRef: RefObject[HTMLLIElement]
    
    var rootMenuRef: RefObject[HTMLUListElement]
  }
  object CalculatePositioningProps {
    
    inline def apply(
      expandSize: ExpandSize,
      layoutRef: RefObject[HTMLDivElement],
      maxOverflowWidth: Double,
      menuItemRef: RefObject[HTMLLIElement],
      rootMenuRef: RefObject[HTMLUListElement]
    ): CalculatePositioningProps = {
      val __obj = js.Dynamic.literal(expandSize = expandSize.asInstanceOf[js.Any], layoutRef = layoutRef.asInstanceOf[js.Any], maxOverflowWidth = maxOverflowWidth.asInstanceOf[js.Any], menuItemRef = menuItemRef.asInstanceOf[js.Any], rootMenuRef = rootMenuRef.asInstanceOf[js.Any])
      __obj.asInstanceOf[CalculatePositioningProps]
    }
    
    extension [Self <: CalculatePositioningProps](x: Self) {
      
      inline def setExpandSize(value: ExpandSize): Self = StObject.set(x, "expandSize", value.asInstanceOf[js.Any])
      
      inline def setLayoutRef(value: RefObject[HTMLDivElement]): Self = StObject.set(x, "layoutRef", value.asInstanceOf[js.Any])
      
      inline def setMaxOverflowWidth(value: Double): Self = StObject.set(x, "maxOverflowWidth", value.asInstanceOf[js.Any])
      
      inline def setMenuItemRef(value: RefObject[HTMLLIElement]): Self = StObject.set(x, "menuItemRef", value.asInstanceOf[js.Any])
      
      inline def setRootMenuRef(value: RefObject[HTMLUListElement]): Self = StObject.set(x, "rootMenuRef", value.asInstanceOf[js.Any])
    }
  }
}
