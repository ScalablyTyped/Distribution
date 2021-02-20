package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.SFC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object layoutGallerySmallMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/LayoutGallerySmall", JSImport.Default)
  @js.native
  val default: SFC[LayoutGallerySmallProps] = js.native
  
  @js.native
  trait LayoutGallerySmallProps extends SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.native
  }
  object LayoutGallerySmallProps {
    
    @scala.inline
    def apply(): LayoutGallerySmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LayoutGallerySmallProps]
    }
    
    @scala.inline
    implicit class LayoutGallerySmallPropsMutableBuilder[Self <: LayoutGallerySmallProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = SFC[LayoutGallerySmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `layoutGallerySmallMod.foo` */
  override def _to: SFC[LayoutGallerySmallProps] = default
}
