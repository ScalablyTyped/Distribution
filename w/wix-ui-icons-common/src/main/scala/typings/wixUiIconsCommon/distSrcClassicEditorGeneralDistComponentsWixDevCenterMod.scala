package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcClassicEditorGeneralDistComponentsWixDevCenterMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/classic-editor/general/dist/components/WixDevCenter", JSImport.Default)
  @js.native
  val default: FC[WixDevCenterProps] = js.native
  
  trait WixDevCenterProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object WixDevCenterProps {
    
    inline def apply(): WixDevCenterProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[WixDevCenterProps]
    }
    
    extension [Self <: WixDevCenterProps](x: Self) {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[WixDevCenterProps]
  
  /* This means you don't have to write `default`, but can instead just say `distSrcClassicEditorGeneralDistComponentsWixDevCenterMod.foo` */
  override def _to: FC[WixDevCenterProps] = default
}
