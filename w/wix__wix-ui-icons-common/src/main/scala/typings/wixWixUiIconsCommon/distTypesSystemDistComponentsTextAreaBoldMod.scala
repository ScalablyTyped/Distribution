package typings.wixWixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesSystemDistComponentsTextAreaBoldMod extends Shortcut {
  
  @JSImport("@wix/wix-ui-icons-common/dist/types/system/dist/components/TextAreaBold", JSImport.Default)
  @js.native
  val default: FC[TextAreaBoldProps] = js.native
  
  trait TextAreaBoldProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object TextAreaBoldProps {
    
    inline def apply(): TextAreaBoldProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TextAreaBoldProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TextAreaBoldProps] (val x: Self) extends AnyVal {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[TextAreaBoldProps]
  
  /* This means you don't have to write `default`, but can instead just say `distTypesSystemDistComponentsTextAreaBoldMod.foo` */
  override def _to: FC[TextAreaBoldProps] = default
}
