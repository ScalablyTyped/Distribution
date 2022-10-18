package typings.wixWixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesResponsiveEditorSystemDistComponentsCollapseArrowMod extends Shortcut {
  
  @JSImport("@wix/wix-ui-icons-common/dist/types/responsive-editor/system/dist/components/CollapseArrow", JSImport.Default)
  @js.native
  val default: FC[CollapseArrowProps] = js.native
  
  trait CollapseArrowProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object CollapseArrowProps {
    
    inline def apply(): CollapseArrowProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CollapseArrowProps]
    }
    
    extension [Self <: CollapseArrowProps](x: Self) {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[CollapseArrowProps]
  
  /* This means you don't have to write `default`, but can instead just say `distTypesResponsiveEditorSystemDistComponentsCollapseArrowMod.foo` */
  override def _to: FC[CollapseArrowProps] = default
}
