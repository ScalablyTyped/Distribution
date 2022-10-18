package typings.wixWixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesGeneralDistComponentsLayoutListWithPanelSmallMod extends Shortcut {
  
  @JSImport("@wix/wix-ui-icons-common/dist/types/general/dist/components/LayoutListWithPanelSmall", JSImport.Default)
  @js.native
  val default: FC[LayoutListWithPanelSmallProps] = js.native
  
  trait LayoutListWithPanelSmallProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object LayoutListWithPanelSmallProps {
    
    inline def apply(): LayoutListWithPanelSmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LayoutListWithPanelSmallProps]
    }
    
    extension [Self <: LayoutListWithPanelSmallProps](x: Self) {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[LayoutListWithPanelSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `distTypesGeneralDistComponentsLayoutListWithPanelSmallMod.foo` */
  override def _to: FC[LayoutListWithPanelSmallProps] = default
}
