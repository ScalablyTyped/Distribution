package typings.wixWixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesResponsiveEditorGeneralDistComponentsGridLayoutYOnTwoMod extends Shortcut {
  
  @JSImport("@wix/wix-ui-icons-common/dist/types/responsive-editor/general/dist/components/GridLayoutYOnTwo", JSImport.Default)
  @js.native
  val default: FC[GridLayoutYOnTwoProps] = js.native
  
  trait GridLayoutYOnTwoProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object GridLayoutYOnTwoProps {
    
    inline def apply(): GridLayoutYOnTwoProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GridLayoutYOnTwoProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: GridLayoutYOnTwoProps] (val x: Self) extends AnyVal {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[GridLayoutYOnTwoProps]
  
  /* This means you don't have to write `default`, but can instead just say `distTypesResponsiveEditorGeneralDistComponentsGridLayoutYOnTwoMod.foo` */
  override def _to: FC[GridLayoutYOnTwoProps] = default
}
