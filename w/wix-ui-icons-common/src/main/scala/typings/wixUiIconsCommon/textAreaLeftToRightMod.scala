package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.SFC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object textAreaLeftToRightMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/system/dist/components/TextAreaLeftToRight", JSImport.Default)
  @js.native
  val default: SFC[TextAreaLeftToRightProps] = js.native
  
  trait TextAreaLeftToRightProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.undefined
  }
  object TextAreaLeftToRightProps {
    
    inline def apply(): TextAreaLeftToRightProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TextAreaLeftToRightProps]
    }
    
    extension [Self <: TextAreaLeftToRightProps](x: Self) {
      
      inline def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = SFC[TextAreaLeftToRightProps]
  
  /* This means you don't have to write `default`, but can instead just say `textAreaLeftToRightMod.foo` */
  override def _to: SFC[TextAreaLeftToRightProps] = default
}
