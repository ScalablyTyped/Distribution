package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.SFC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object textAreaUnderlineMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/system/dist/components/TextAreaUnderline", JSImport.Default)
  @js.native
  val default: SFC[TextAreaUnderlineProps] = js.native
  
  trait TextAreaUnderlineProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.undefined
  }
  object TextAreaUnderlineProps {
    
    inline def apply(): TextAreaUnderlineProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TextAreaUnderlineProps]
    }
    
    extension [Self <: TextAreaUnderlineProps](x: Self) {
      
      inline def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = SFC[TextAreaUnderlineProps]
  
  /* This means you don't have to write `default`, but can instead just say `textAreaUnderlineMod.foo` */
  override def _to: SFC[TextAreaUnderlineProps] = default
}
