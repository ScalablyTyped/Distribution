package typings.wixWixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesResponsiveEditorGeneralDistComponentsEaseInQuadMod extends Shortcut {
  
  @JSImport("@wix/wix-ui-icons-common/dist/types/responsive-editor/general/dist/components/EaseInQuad", JSImport.Default)
  @js.native
  val default: FC[EaseInQuadProps] = js.native
  
  trait EaseInQuadProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object EaseInQuadProps {
    
    inline def apply(): EaseInQuadProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[EaseInQuadProps]
    }
    
    extension [Self <: EaseInQuadProps](x: Self) {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[EaseInQuadProps]
  
  /* This means you don't have to write `default`, but can instead just say `distTypesResponsiveEditorGeneralDistComponentsEaseInQuadMod.foo` */
  override def _to: FC[EaseInQuadProps] = default
}
