package typings.wixWixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesResponsiveEditorGeneralDistComponentsArrowsCrossMod extends Shortcut {
  
  @JSImport("@wix/wix-ui-icons-common/dist/types/responsive-editor/general/dist/components/ArrowsCross", JSImport.Default)
  @js.native
  val default: FC[ArrowsCrossProps] = js.native
  
  trait ArrowsCrossProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object ArrowsCrossProps {
    
    inline def apply(): ArrowsCrossProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ArrowsCrossProps]
    }
    
    extension [Self <: ArrowsCrossProps](x: Self) {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[ArrowsCrossProps]
  
  /* This means you don't have to write `default`, but can instead just say `distTypesResponsiveEditorGeneralDistComponentsArrowsCrossMod.foo` */
  override def _to: FC[ArrowsCrossProps] = default
}
