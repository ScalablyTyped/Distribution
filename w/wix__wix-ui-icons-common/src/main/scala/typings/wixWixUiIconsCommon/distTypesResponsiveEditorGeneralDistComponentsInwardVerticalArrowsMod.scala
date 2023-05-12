package typings.wixWixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesResponsiveEditorGeneralDistComponentsInwardVerticalArrowsMod extends Shortcut {
  
  @JSImport("@wix/wix-ui-icons-common/dist/types/responsive-editor/general/dist/components/InwardVerticalArrows", JSImport.Default)
  @js.native
  val default: FC[InwardVerticalArrowsProps] = js.native
  
  trait InwardVerticalArrowsProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object InwardVerticalArrowsProps {
    
    inline def apply(): InwardVerticalArrowsProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[InwardVerticalArrowsProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: InwardVerticalArrowsProps] (val x: Self) extends AnyVal {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[InwardVerticalArrowsProps]
  
  /* This means you don't have to write `default`, but can instead just say `distTypesResponsiveEditorGeneralDistComponentsInwardVerticalArrowsMod.foo` */
  override def _to: FC[InwardVerticalArrowsProps] = default
}
