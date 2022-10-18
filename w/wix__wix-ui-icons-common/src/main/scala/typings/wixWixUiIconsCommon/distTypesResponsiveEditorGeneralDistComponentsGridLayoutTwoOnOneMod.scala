package typings.wixWixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesResponsiveEditorGeneralDistComponentsGridLayoutTwoOnOneMod extends Shortcut {
  
  @JSImport("@wix/wix-ui-icons-common/dist/types/responsive-editor/general/dist/components/GridLayoutTwoOnOne", JSImport.Default)
  @js.native
  val default: FC[GridLayoutTwoOnOneProps] = js.native
  
  trait GridLayoutTwoOnOneProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object GridLayoutTwoOnOneProps {
    
    inline def apply(): GridLayoutTwoOnOneProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GridLayoutTwoOnOneProps]
    }
    
    extension [Self <: GridLayoutTwoOnOneProps](x: Self) {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[GridLayoutTwoOnOneProps]
  
  /* This means you don't have to write `default`, but can instead just say `distTypesResponsiveEditorGeneralDistComponentsGridLayoutTwoOnOneMod.foo` */
  override def _to: FC[GridLayoutTwoOnOneProps] = default
}
