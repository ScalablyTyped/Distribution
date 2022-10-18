package typings.wixWixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesResponsiveEditorGeneralDistComponentsEaseInQuartMod extends Shortcut {
  
  @JSImport("@wix/wix-ui-icons-common/dist/types/responsive-editor/general/dist/components/EaseInQuart", JSImport.Default)
  @js.native
  val default: FC[EaseInQuartProps] = js.native
  
  trait EaseInQuartProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object EaseInQuartProps {
    
    inline def apply(): EaseInQuartProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[EaseInQuartProps]
    }
    
    extension [Self <: EaseInQuartProps](x: Self) {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[EaseInQuartProps]
  
  /* This means you don't have to write `default`, but can instead just say `distTypesResponsiveEditorGeneralDistComponentsEaseInQuartMod.foo` */
  override def _to: FC[EaseInQuartProps] = default
}
