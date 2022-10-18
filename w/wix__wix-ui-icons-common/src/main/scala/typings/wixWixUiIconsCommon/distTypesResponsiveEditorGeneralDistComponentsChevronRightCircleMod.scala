package typings.wixWixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesResponsiveEditorGeneralDistComponentsChevronRightCircleMod extends Shortcut {
  
  @JSImport("@wix/wix-ui-icons-common/dist/types/responsive-editor/general/dist/components/ChevronRightCircle", JSImport.Default)
  @js.native
  val default: FC[ChevronRightCircleProps] = js.native
  
  trait ChevronRightCircleProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object ChevronRightCircleProps {
    
    inline def apply(): ChevronRightCircleProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ChevronRightCircleProps]
    }
    
    extension [Self <: ChevronRightCircleProps](x: Self) {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[ChevronRightCircleProps]
  
  /* This means you don't have to write `default`, but can instead just say `distTypesResponsiveEditorGeneralDistComponentsChevronRightCircleMod.foo` */
  override def _to: FC[ChevronRightCircleProps] = default
}
