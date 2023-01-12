package typings.wixWixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesClassicEditorGeneralDistComponentsImageGalleryBoldMod extends Shortcut {
  
  @JSImport("@wix/wix-ui-icons-common/dist/types/classic-editor/general/dist/components/ImageGalleryBold", JSImport.Default)
  @js.native
  val default: FC[ImageGalleryBoldProps] = js.native
  
  trait ImageGalleryBoldProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object ImageGalleryBoldProps {
    
    inline def apply(): ImageGalleryBoldProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ImageGalleryBoldProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ImageGalleryBoldProps] (val x: Self) extends AnyVal {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[ImageGalleryBoldProps]
  
  /* This means you don't have to write `default`, but can instead just say `distTypesClassicEditorGeneralDistComponentsImageGalleryBoldMod.foo` */
  override def _to: FC[ImageGalleryBoldProps] = default
}
