package typings.wixWixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesResponsiveEditorGeneralDistComponentsGridLayoutOneOnTwoMod extends Shortcut {
  
  @JSImport("@wix/wix-ui-icons-common/dist/types/responsive-editor/general/dist/components/GridLayoutOneOnTwo", JSImport.Default)
  @js.native
  val default: FC[GridLayoutOneOnTwoProps] = js.native
  
  trait GridLayoutOneOnTwoProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object GridLayoutOneOnTwoProps {
    
    inline def apply(): GridLayoutOneOnTwoProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GridLayoutOneOnTwoProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: GridLayoutOneOnTwoProps] (val x: Self) extends AnyVal {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[GridLayoutOneOnTwoProps]
  
  /* This means you don't have to write `default`, but can instead just say `distTypesResponsiveEditorGeneralDistComponentsGridLayoutOneOnTwoMod.foo` */
  override def _to: FC[GridLayoutOneOnTwoProps] = default
}
