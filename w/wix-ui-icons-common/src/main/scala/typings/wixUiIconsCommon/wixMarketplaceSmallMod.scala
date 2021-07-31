package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.SFC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object wixMarketplaceSmallMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/WixMarketplaceSmall", JSImport.Default)
  @js.native
  val default: SFC[WixMarketplaceSmallProps] = js.native
  
  trait WixMarketplaceSmallProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.undefined
  }
  object WixMarketplaceSmallProps {
    
    @scala.inline
    def apply(): WixMarketplaceSmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[WixMarketplaceSmallProps]
    }
    
    @scala.inline
    implicit class WixMarketplaceSmallPropsMutableBuilder[Self <: WixMarketplaceSmallProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = SFC[WixMarketplaceSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `wixMarketplaceSmallMod.foo` */
  override def _to: SFC[WixMarketplaceSmallProps] = default
}
