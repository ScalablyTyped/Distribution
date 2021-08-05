package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.SFC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object emailAlertMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/EmailAlert", JSImport.Default)
  @js.native
  val default: SFC[EmailAlertProps] = js.native
  
  trait EmailAlertProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.undefined
  }
  object EmailAlertProps {
    
    inline def apply(): EmailAlertProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[EmailAlertProps]
    }
    
    extension [Self <: EmailAlertProps](x: Self) {
      
      inline def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = SFC[EmailAlertProps]
  
  /* This means you don't have to write `default`, but can instead just say `emailAlertMod.foo` */
  override def _to: SFC[EmailAlertProps] = default
}
