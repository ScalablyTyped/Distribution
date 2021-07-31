package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.SFC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object layoutGalleryMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/LayoutGallery", JSImport.Default)
  @js.native
  val default: SFC[LayoutGalleryProps] = js.native
  
  trait LayoutGalleryProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.undefined
  }
  object LayoutGalleryProps {
    
    @scala.inline
    def apply(): LayoutGalleryProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LayoutGalleryProps]
    }
    
    @scala.inline
    implicit class LayoutGalleryPropsMutableBuilder[Self <: LayoutGalleryProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = SFC[LayoutGalleryProps]
  
  /* This means you don't have to write `default`, but can instead just say `layoutGalleryMod.foo` */
  override def _to: SFC[LayoutGalleryProps] = default
}
