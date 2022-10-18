package typings.wixWixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesResponsiveEditorGeneralDistComponentsVerticalArrowsMod extends Shortcut {
  
  @JSImport("@wix/wix-ui-icons-common/dist/types/responsive-editor/general/dist/components/VerticalArrows", JSImport.Default)
  @js.native
  val default: FC[VerticalArrowsProps] = js.native
  
  trait VerticalArrowsProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object VerticalArrowsProps {
    
    inline def apply(): VerticalArrowsProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[VerticalArrowsProps]
    }
    
    extension [Self <: VerticalArrowsProps](x: Self) {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[VerticalArrowsProps]
  
  /* This means you don't have to write `default`, but can instead just say `distTypesResponsiveEditorGeneralDistComponentsVerticalArrowsMod.foo` */
  override def _to: FC[VerticalArrowsProps] = default
}
