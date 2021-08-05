package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.SFC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object textAreaBoldMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/system/dist/components/TextAreaBold", JSImport.Default)
  @js.native
  val default: SFC[TextAreaBoldProps] = js.native
  
  trait TextAreaBoldProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.undefined
  }
  object TextAreaBoldProps {
    
    inline def apply(): TextAreaBoldProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TextAreaBoldProps]
    }
    
    extension [Self <: TextAreaBoldProps](x: Self) {
      
      inline def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = SFC[TextAreaBoldProps]
  
  /* This means you don't have to write `default`, but can instead just say `textAreaBoldMod.foo` */
  override def _to: SFC[TextAreaBoldProps] = default
}
