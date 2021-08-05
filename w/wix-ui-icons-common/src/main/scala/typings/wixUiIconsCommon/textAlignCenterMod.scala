package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.SFC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object textAlignCenterMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/TextAlignCenter", JSImport.Default)
  @js.native
  val default: SFC[TextAlignCenterProps] = js.native
  
  trait TextAlignCenterProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.undefined
  }
  object TextAlignCenterProps {
    
    inline def apply(): TextAlignCenterProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TextAlignCenterProps]
    }
    
    extension [Self <: TextAlignCenterProps](x: Self) {
      
      inline def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = SFC[TextAlignCenterProps]
  
  /* This means you don't have to write `default`, but can instead just say `textAlignCenterMod.foo` */
  override def _to: SFC[TextAlignCenterProps] = default
}
