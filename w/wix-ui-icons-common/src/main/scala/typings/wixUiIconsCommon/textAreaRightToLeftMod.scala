package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.SFC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object textAreaRightToLeftMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/system/dist/components/TextAreaRightToLeft", JSImport.Default)
  @js.native
  val default: SFC[TextAreaRightToLeftProps] = js.native
  
  trait TextAreaRightToLeftProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.undefined
  }
  object TextAreaRightToLeftProps {
    
    inline def apply(): TextAreaRightToLeftProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TextAreaRightToLeftProps]
    }
    
    extension [Self <: TextAreaRightToLeftProps](x: Self) {
      
      inline def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = SFC[TextAreaRightToLeftProps]
  
  /* This means you don't have to write `default`, but can instead just say `textAreaRightToLeftMod.foo` */
  override def _to: SFC[TextAreaRightToLeftProps] = default
}
