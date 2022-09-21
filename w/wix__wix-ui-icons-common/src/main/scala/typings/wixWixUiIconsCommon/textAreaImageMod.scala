package typings.wixWixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object textAreaImageMod extends Shortcut {
  
  @JSImport("@wix/wix-ui-icons-common/dist/types/system/dist/components/TextAreaImage", JSImport.Default)
  @js.native
  val default: FC[TextAreaImageProps] = js.native
  
  trait TextAreaImageProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object TextAreaImageProps {
    
    inline def apply(): TextAreaImageProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TextAreaImageProps]
    }
    
    extension [Self <: TextAreaImageProps](x: Self) {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[TextAreaImageProps]
  
  /* This means you don't have to write `default`, but can instead just say `textAreaImageMod.foo` */
  override def _to: FC[TextAreaImageProps] = default
}
