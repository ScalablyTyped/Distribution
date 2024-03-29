package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcSystemDistComponentsTextAreaImageMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/system/dist/components/TextAreaImage", JSImport.Default)
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
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TextAreaImageProps] (val x: Self) extends AnyVal {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[TextAreaImageProps]
  
  /* This means you don't have to write `default`, but can instead just say `distSrcSystemDistComponentsTextAreaImageMod.foo` */
  override def _to: FC[TextAreaImageProps] = default
}
