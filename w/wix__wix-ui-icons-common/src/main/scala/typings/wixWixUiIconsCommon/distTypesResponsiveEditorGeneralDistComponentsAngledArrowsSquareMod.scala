package typings.wixWixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesResponsiveEditorGeneralDistComponentsAngledArrowsSquareMod extends Shortcut {
  
  @JSImport("@wix/wix-ui-icons-common/dist/types/responsive-editor/general/dist/components/AngledArrowsSquare", JSImport.Default)
  @js.native
  val default: FC[AngledArrowsSquareProps] = js.native
  
  trait AngledArrowsSquareProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object AngledArrowsSquareProps {
    
    inline def apply(): AngledArrowsSquareProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AngledArrowsSquareProps]
    }
    
    extension [Self <: AngledArrowsSquareProps](x: Self) {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[AngledArrowsSquareProps]
  
  /* This means you don't have to write `default`, but can instead just say `distTypesResponsiveEditorGeneralDistComponentsAngledArrowsSquareMod.foo` */
  override def _to: FC[AngledArrowsSquareProps] = default
}
