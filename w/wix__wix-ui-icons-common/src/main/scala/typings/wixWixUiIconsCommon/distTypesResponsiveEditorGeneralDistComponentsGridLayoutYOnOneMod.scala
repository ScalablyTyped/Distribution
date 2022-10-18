package typings.wixWixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesResponsiveEditorGeneralDistComponentsGridLayoutYOnOneMod extends Shortcut {
  
  @JSImport("@wix/wix-ui-icons-common/dist/types/responsive-editor/general/dist/components/GridLayoutYOnOne", JSImport.Default)
  @js.native
  val default: FC[GridLayoutYOnOneProps] = js.native
  
  trait GridLayoutYOnOneProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object GridLayoutYOnOneProps {
    
    inline def apply(): GridLayoutYOnOneProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GridLayoutYOnOneProps]
    }
    
    extension [Self <: GridLayoutYOnOneProps](x: Self) {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[GridLayoutYOnOneProps]
  
  /* This means you don't have to write `default`, but can instead just say `distTypesResponsiveEditorGeneralDistComponentsGridLayoutYOnOneMod.foo` */
  override def _to: FC[GridLayoutYOnOneProps] = default
}
