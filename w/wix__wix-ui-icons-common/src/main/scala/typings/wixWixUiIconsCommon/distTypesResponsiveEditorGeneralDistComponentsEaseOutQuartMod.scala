package typings.wixWixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesResponsiveEditorGeneralDistComponentsEaseOutQuartMod extends Shortcut {
  
  @JSImport("@wix/wix-ui-icons-common/dist/types/responsive-editor/general/dist/components/EaseOutQuart", JSImport.Default)
  @js.native
  val default: FC[EaseOutQuartProps] = js.native
  
  trait EaseOutQuartProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object EaseOutQuartProps {
    
    inline def apply(): EaseOutQuartProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[EaseOutQuartProps]
    }
    
    extension [Self <: EaseOutQuartProps](x: Self) {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[EaseOutQuartProps]
  
  /* This means you don't have to write `default`, but can instead just say `distTypesResponsiveEditorGeneralDistComponentsEaseOutQuartMod.foo` */
  override def _to: FC[EaseOutQuartProps] = default
}
