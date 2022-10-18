package typings.wixWixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesResponsiveEditorGeneralDistComponentsChevronRightBoldMod extends Shortcut {
  
  @JSImport("@wix/wix-ui-icons-common/dist/types/responsive-editor/general/dist/components/ChevronRightBold", JSImport.Default)
  @js.native
  val default: FC[ChevronRightBoldProps] = js.native
  
  trait ChevronRightBoldProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object ChevronRightBoldProps {
    
    inline def apply(): ChevronRightBoldProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ChevronRightBoldProps]
    }
    
    extension [Self <: ChevronRightBoldProps](x: Self) {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[ChevronRightBoldProps]
  
  /* This means you don't have to write `default`, but can instead just say `distTypesResponsiveEditorGeneralDistComponentsChevronRightBoldMod.foo` */
  override def _to: FC[ChevronRightBoldProps] = default
}
