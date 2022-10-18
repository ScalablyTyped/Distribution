package typings.wixWixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesResponsiveEditorGeneralDistComponentsChevronUpBoldSmallMod extends Shortcut {
  
  @JSImport("@wix/wix-ui-icons-common/dist/types/responsive-editor/general/dist/components/ChevronUpBoldSmall", JSImport.Default)
  @js.native
  val default: FC[ChevronUpBoldSmallProps] = js.native
  
  trait ChevronUpBoldSmallProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object ChevronUpBoldSmallProps {
    
    inline def apply(): ChevronUpBoldSmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ChevronUpBoldSmallProps]
    }
    
    extension [Self <: ChevronUpBoldSmallProps](x: Self) {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[ChevronUpBoldSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `distTypesResponsiveEditorGeneralDistComponentsChevronUpBoldSmallMod.foo` */
  override def _to: FC[ChevronUpBoldSmallProps] = default
}
