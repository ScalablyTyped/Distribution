package typings.wixWixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesResponsiveEditorGeneralDistComponentsHorizontalArrowsSquareMod extends Shortcut {
  
  @JSImport("@wix/wix-ui-icons-common/dist/types/responsive-editor/general/dist/components/HorizontalArrowsSquare", JSImport.Default)
  @js.native
  val default: FC[HorizontalArrowsSquareProps] = js.native
  
  trait HorizontalArrowsSquareProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object HorizontalArrowsSquareProps {
    
    inline def apply(): HorizontalArrowsSquareProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[HorizontalArrowsSquareProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: HorizontalArrowsSquareProps] (val x: Self) extends AnyVal {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[HorizontalArrowsSquareProps]
  
  /* This means you don't have to write `default`, but can instead just say `distTypesResponsiveEditorGeneralDistComponentsHorizontalArrowsSquareMod.foo` */
  override def _to: FC[HorizontalArrowsSquareProps] = default
}
