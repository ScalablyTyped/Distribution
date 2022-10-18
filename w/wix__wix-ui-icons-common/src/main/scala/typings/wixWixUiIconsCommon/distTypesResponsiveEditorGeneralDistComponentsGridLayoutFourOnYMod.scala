package typings.wixWixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesResponsiveEditorGeneralDistComponentsGridLayoutFourOnYMod extends Shortcut {
  
  @JSImport("@wix/wix-ui-icons-common/dist/types/responsive-editor/general/dist/components/GridLayoutFourOnY", JSImport.Default)
  @js.native
  val default: FC[GridLayoutFourOnYProps] = js.native
  
  trait GridLayoutFourOnYProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object GridLayoutFourOnYProps {
    
    inline def apply(): GridLayoutFourOnYProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GridLayoutFourOnYProps]
    }
    
    extension [Self <: GridLayoutFourOnYProps](x: Self) {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[GridLayoutFourOnYProps]
  
  /* This means you don't have to write `default`, but can instead just say `distTypesResponsiveEditorGeneralDistComponentsGridLayoutFourOnYMod.foo` */
  override def _to: FC[GridLayoutFourOnYProps] = default
}
