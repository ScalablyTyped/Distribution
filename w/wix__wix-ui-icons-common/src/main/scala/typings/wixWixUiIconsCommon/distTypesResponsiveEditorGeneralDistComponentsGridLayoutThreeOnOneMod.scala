package typings.wixWixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesResponsiveEditorGeneralDistComponentsGridLayoutThreeOnOneMod extends Shortcut {
  
  @JSImport("@wix/wix-ui-icons-common/dist/types/responsive-editor/general/dist/components/GridLayoutThreeOnOne", JSImport.Default)
  @js.native
  val default: FC[GridLayoutThreeOnOneProps] = js.native
  
  trait GridLayoutThreeOnOneProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object GridLayoutThreeOnOneProps {
    
    inline def apply(): GridLayoutThreeOnOneProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GridLayoutThreeOnOneProps]
    }
    
    extension [Self <: GridLayoutThreeOnOneProps](x: Self) {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[GridLayoutThreeOnOneProps]
  
  /* This means you don't have to write `default`, but can instead just say `distTypesResponsiveEditorGeneralDistComponentsGridLayoutThreeOnOneMod.foo` */
  override def _to: FC[GridLayoutThreeOnOneProps] = default
}
