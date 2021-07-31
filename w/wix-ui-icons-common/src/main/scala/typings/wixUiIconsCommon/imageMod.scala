package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.SFC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object imageMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/Image", JSImport.Default)
  @js.native
  val default: SFC[ImageProps] = js.native
  
  trait ImageProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.undefined
  }
  object ImageProps {
    
    @scala.inline
    def apply(): ImageProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ImageProps]
    }
    
    @scala.inline
    implicit class ImagePropsMutableBuilder[Self <: ImageProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = SFC[ImageProps]
  
  /* This means you don't have to write `default`, but can instead just say `imageMod.foo` */
  override def _to: SFC[ImageProps] = default
}
