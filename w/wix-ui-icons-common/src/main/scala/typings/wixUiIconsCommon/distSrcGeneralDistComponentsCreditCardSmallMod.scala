package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcGeneralDistComponentsCreditCardSmallMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/CreditCardSmall", JSImport.Default)
  @js.native
  val default: FC[CreditCardSmallProps] = js.native
  
  trait CreditCardSmallProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object CreditCardSmallProps {
    
    inline def apply(): CreditCardSmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CreditCardSmallProps]
    }
    
    extension [Self <: CreditCardSmallProps](x: Self) {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[CreditCardSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `distSrcGeneralDistComponentsCreditCardSmallMod.foo` */
  override def _to: FC[CreditCardSmallProps] = default
}
