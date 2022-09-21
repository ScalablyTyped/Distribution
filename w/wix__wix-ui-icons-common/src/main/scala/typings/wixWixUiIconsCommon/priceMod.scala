package typings.wixWixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object priceMod extends Shortcut {
  
  @JSImport("@wix/wix-ui-icons-common/dist/types/on-stage/general/dist/components/Price", JSImport.Default)
  @js.native
  val default: FC[PriceProps] = js.native
  
  trait PriceProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object PriceProps {
    
    inline def apply(): PriceProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PriceProps]
    }
    
    extension [Self <: PriceProps](x: Self) {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[PriceProps]
  
  /* This means you don't have to write `default`, but can instead just say `priceMod.foo` */
  override def _to: FC[PriceProps] = default
}
