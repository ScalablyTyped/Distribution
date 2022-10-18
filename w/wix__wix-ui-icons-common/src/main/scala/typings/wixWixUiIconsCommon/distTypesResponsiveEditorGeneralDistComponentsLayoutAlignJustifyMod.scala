package typings.wixWixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesResponsiveEditorGeneralDistComponentsLayoutAlignJustifyMod extends Shortcut {
  
  @JSImport("@wix/wix-ui-icons-common/dist/types/responsive-editor/general/dist/components/LayoutAlignJustify", JSImport.Default)
  @js.native
  val default: FC[LayoutAlignJustifyProps] = js.native
  
  trait LayoutAlignJustifyProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object LayoutAlignJustifyProps {
    
    inline def apply(): LayoutAlignJustifyProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LayoutAlignJustifyProps]
    }
    
    extension [Self <: LayoutAlignJustifyProps](x: Self) {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[LayoutAlignJustifyProps]
  
  /* This means you don't have to write `default`, but can instead just say `distTypesResponsiveEditorGeneralDistComponentsLayoutAlignJustifyMod.foo` */
  override def _to: FC[LayoutAlignJustifyProps] = default
}
