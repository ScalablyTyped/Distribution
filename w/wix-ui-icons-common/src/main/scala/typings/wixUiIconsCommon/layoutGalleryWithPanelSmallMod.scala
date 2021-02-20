package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.SFC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object layoutGalleryWithPanelSmallMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/LayoutGalleryWithPanelSmall", JSImport.Default)
  @js.native
  val default: SFC[LayoutGalleryWithPanelSmallProps] = js.native
  
  @js.native
  trait LayoutGalleryWithPanelSmallProps extends SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.native
  }
  object LayoutGalleryWithPanelSmallProps {
    
    @scala.inline
    def apply(): LayoutGalleryWithPanelSmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LayoutGalleryWithPanelSmallProps]
    }
    
    @scala.inline
    implicit class LayoutGalleryWithPanelSmallPropsMutableBuilder[Self <: LayoutGalleryWithPanelSmallProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = SFC[LayoutGalleryWithPanelSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `layoutGalleryWithPanelSmallMod.foo` */
  override def _to: SFC[LayoutGalleryWithPanelSmallProps] = default
}
