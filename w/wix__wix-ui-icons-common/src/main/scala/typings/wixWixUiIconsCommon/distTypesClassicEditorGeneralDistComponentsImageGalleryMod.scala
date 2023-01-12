package typings.wixWixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesClassicEditorGeneralDistComponentsImageGalleryMod extends Shortcut {
  
  @JSImport("@wix/wix-ui-icons-common/dist/types/classic-editor/general/dist/components/ImageGallery", JSImport.Default)
  @js.native
  val default: FC[ImageGalleryProps] = js.native
  
  trait ImageGalleryProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object ImageGalleryProps {
    
    inline def apply(): ImageGalleryProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ImageGalleryProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ImageGalleryProps] (val x: Self) extends AnyVal {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[ImageGalleryProps]
  
  /* This means you don't have to write `default`, but can instead just say `distTypesClassicEditorGeneralDistComponentsImageGalleryMod.foo` */
  override def _to: FC[ImageGalleryProps] = default
}
