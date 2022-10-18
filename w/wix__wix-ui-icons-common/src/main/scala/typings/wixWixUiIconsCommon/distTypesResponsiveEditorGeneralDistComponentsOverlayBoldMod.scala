package typings.wixWixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesResponsiveEditorGeneralDistComponentsOverlayBoldMod extends Shortcut {
  
  @JSImport("@wix/wix-ui-icons-common/dist/types/responsive-editor/general/dist/components/OverlayBold", JSImport.Default)
  @js.native
  val default: FC[OverlayBoldProps] = js.native
  
  trait OverlayBoldProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object OverlayBoldProps {
    
    inline def apply(): OverlayBoldProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[OverlayBoldProps]
    }
    
    extension [Self <: OverlayBoldProps](x: Self) {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[OverlayBoldProps]
  
  /* This means you don't have to write `default`, but can instead just say `distTypesResponsiveEditorGeneralDistComponentsOverlayBoldMod.foo` */
  override def _to: FC[OverlayBoldProps] = default
}
