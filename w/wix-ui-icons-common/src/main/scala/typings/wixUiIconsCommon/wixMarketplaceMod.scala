package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.SFC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object wixMarketplaceMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/WixMarketplace", JSImport.Default)
  @js.native
  val default: SFC[WixMarketplaceProps] = js.native
  
  trait WixMarketplaceProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.undefined
  }
  object WixMarketplaceProps {
    
    inline def apply(): WixMarketplaceProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[WixMarketplaceProps]
    }
    
    extension [Self <: WixMarketplaceProps](x: Self) {
      
      inline def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = SFC[WixMarketplaceProps]
  
  /* This means you don't have to write `default`, but can instead just say `wixMarketplaceMod.foo` */
  override def _to: SFC[WixMarketplaceProps] = default
}
