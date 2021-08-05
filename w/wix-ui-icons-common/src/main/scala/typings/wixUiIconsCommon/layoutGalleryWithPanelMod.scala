package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.SFC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object layoutGalleryWithPanelMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/LayoutGalleryWithPanel", JSImport.Default)
  @js.native
  val default: SFC[LayoutGalleryWithPanelProps] = js.native
  
  trait LayoutGalleryWithPanelProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.undefined
  }
  object LayoutGalleryWithPanelProps {
    
    inline def apply(): LayoutGalleryWithPanelProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LayoutGalleryWithPanelProps]
    }
    
    extension [Self <: LayoutGalleryWithPanelProps](x: Self) {
      
      inline def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = SFC[LayoutGalleryWithPanelProps]
  
  /* This means you don't have to write `default`, but can instead just say `layoutGalleryWithPanelMod.foo` */
  override def _to: SFC[LayoutGalleryWithPanelProps] = default
}
