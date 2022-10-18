package typings.wixWixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesResponsiveEditorGeneralDistComponentsInwardArrowsMod extends Shortcut {
  
  @JSImport("@wix/wix-ui-icons-common/dist/types/responsive-editor/general/dist/components/InwardArrows", JSImport.Default)
  @js.native
  val default: FC[InwardArrowsProps] = js.native
  
  trait InwardArrowsProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object InwardArrowsProps {
    
    inline def apply(): InwardArrowsProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[InwardArrowsProps]
    }
    
    extension [Self <: InwardArrowsProps](x: Self) {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[InwardArrowsProps]
  
  /* This means you don't have to write `default`, but can instead just say `distTypesResponsiveEditorGeneralDistComponentsInwardArrowsMod.foo` */
  override def _to: FC[InwardArrowsProps] = default
}
