package typings.wixWixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesResponsiveEditorGeneralDistComponentsEaseInOutQuadMod extends Shortcut {
  
  @JSImport("@wix/wix-ui-icons-common/dist/types/responsive-editor/general/dist/components/EaseInOutQuad", JSImport.Default)
  @js.native
  val default: FC[EaseInOutQuadProps] = js.native
  
  trait EaseInOutQuadProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object EaseInOutQuadProps {
    
    inline def apply(): EaseInOutQuadProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[EaseInOutQuadProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: EaseInOutQuadProps] (val x: Self) extends AnyVal {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[EaseInOutQuadProps]
  
  /* This means you don't have to write `default`, but can instead just say `distTypesResponsiveEditorGeneralDistComponentsEaseInOutQuadMod.foo` */
  override def _to: FC[EaseInOutQuadProps] = default
}
