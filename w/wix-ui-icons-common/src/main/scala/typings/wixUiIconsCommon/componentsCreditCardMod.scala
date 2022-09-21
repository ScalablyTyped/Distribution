package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object componentsCreditCardMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/classic-editor/general/dist/components/CreditCard", JSImport.Default)
  @js.native
  val default: FC[CreditCardProps] = js.native
  
  trait CreditCardProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object CreditCardProps {
    
    inline def apply(): CreditCardProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CreditCardProps]
    }
    
    extension [Self <: CreditCardProps](x: Self) {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[CreditCardProps]
  
  /* This means you don't have to write `default`, but can instead just say `componentsCreditCardMod.foo` */
  override def _to: FC[CreditCardProps] = default
}
