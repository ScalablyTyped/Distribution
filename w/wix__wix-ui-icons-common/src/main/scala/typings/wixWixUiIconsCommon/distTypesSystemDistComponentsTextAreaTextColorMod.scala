package typings.wixWixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesSystemDistComponentsTextAreaTextColorMod extends Shortcut {
  
  @JSImport("@wix/wix-ui-icons-common/dist/types/system/dist/components/TextAreaTextColor", JSImport.Default)
  @js.native
  val default: FC[TextAreaTextColorProps] = js.native
  
  trait TextAreaTextColorProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object TextAreaTextColorProps {
    
    inline def apply(): TextAreaTextColorProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TextAreaTextColorProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TextAreaTextColorProps] (val x: Self) extends AnyVal {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[TextAreaTextColorProps]
  
  /* This means you don't have to write `default`, but can instead just say `distTypesSystemDistComponentsTextAreaTextColorMod.foo` */
  override def _to: FC[TextAreaTextColorProps] = default
}
