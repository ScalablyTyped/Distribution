package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.SFC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object phoneMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/Phone", JSImport.Default)
  @js.native
  val default: SFC[PhoneProps] = js.native
  
  trait PhoneProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.undefined
  }
  object PhoneProps {
    
    inline def apply(): PhoneProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PhoneProps]
    }
    
    extension [Self <: PhoneProps](x: Self) {
      
      inline def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = SFC[PhoneProps]
  
  /* This means you don't have to write `default`, but can instead just say `phoneMod.foo` */
  override def _to: SFC[PhoneProps] = default
}
