package typings.wixWixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesGeneralDistComponentsCurrencyMod extends Shortcut {
  
  @JSImport("@wix/wix-ui-icons-common/dist/types/general/dist/components/Currency", JSImport.Default)
  @js.native
  val default: FC[CurrencyProps] = js.native
  
  trait CurrencyProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object CurrencyProps {
    
    inline def apply(): CurrencyProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CurrencyProps]
    }
    
    extension [Self <: CurrencyProps](x: Self) {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[CurrencyProps]
  
  /* This means you don't have to write `default`, but can instead just say `distTypesGeneralDistComponentsCurrencyMod.foo` */
  override def _to: FC[CurrencyProps] = default
}
