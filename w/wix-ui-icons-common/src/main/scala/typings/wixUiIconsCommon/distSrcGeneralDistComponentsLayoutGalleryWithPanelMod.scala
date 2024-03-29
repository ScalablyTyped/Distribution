package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcGeneralDistComponentsLayoutGalleryWithPanelMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/LayoutGalleryWithPanel", JSImport.Default)
  @js.native
  val default: FC[LayoutGalleryWithPanelProps] = js.native
  
  trait LayoutGalleryWithPanelProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object LayoutGalleryWithPanelProps {
    
    inline def apply(): LayoutGalleryWithPanelProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LayoutGalleryWithPanelProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: LayoutGalleryWithPanelProps] (val x: Self) extends AnyVal {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[LayoutGalleryWithPanelProps]
  
  /* This means you don't have to write `default`, but can instead just say `distSrcGeneralDistComponentsLayoutGalleryWithPanelMod.foo` */
  override def _to: FC[LayoutGalleryWithPanelProps] = default
}
