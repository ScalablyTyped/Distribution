package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcGeneralDistComponentsWixMarketplaceSmallMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/WixMarketplaceSmall", JSImport.Default)
  @js.native
  val default: FC[WixMarketplaceSmallProps] = js.native
  
  trait WixMarketplaceSmallProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object WixMarketplaceSmallProps {
    
    inline def apply(): WixMarketplaceSmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[WixMarketplaceSmallProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: WixMarketplaceSmallProps] (val x: Self) extends AnyVal {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[WixMarketplaceSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `distSrcGeneralDistComponentsWixMarketplaceSmallMod.foo` */
  override def _to: FC[WixMarketplaceSmallProps] = default
}
