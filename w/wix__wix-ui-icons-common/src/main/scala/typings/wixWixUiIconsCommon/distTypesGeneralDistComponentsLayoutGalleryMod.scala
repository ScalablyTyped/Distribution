package typings.wixWixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesGeneralDistComponentsLayoutGalleryMod extends Shortcut {
  
  @JSImport("@wix/wix-ui-icons-common/dist/types/general/dist/components/LayoutGallery", JSImport.Default)
  @js.native
  val default: FC[LayoutGalleryProps] = js.native
  
  trait LayoutGalleryProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object LayoutGalleryProps {
    
    inline def apply(): LayoutGalleryProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LayoutGalleryProps]
    }
    
    extension [Self <: LayoutGalleryProps](x: Self) {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[LayoutGalleryProps]
  
  /* This means you don't have to write `default`, but can instead just say `distTypesGeneralDistComponentsLayoutGalleryMod.foo` */
  override def _to: FC[LayoutGalleryProps] = default
}
