package typings.wixWixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesGeneralDistComponentsSaleChannelsMod extends Shortcut {
  
  @JSImport("@wix/wix-ui-icons-common/dist/types/general/dist/components/SaleChannels", JSImport.Default)
  @js.native
  val default: FC[SaleChannelsProps] = js.native
  
  trait SaleChannelsProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object SaleChannelsProps {
    
    inline def apply(): SaleChannelsProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SaleChannelsProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SaleChannelsProps] (val x: Self) extends AnyVal {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[SaleChannelsProps]
  
  /* This means you don't have to write `default`, but can instead just say `distTypesGeneralDistComponentsSaleChannelsMod.foo` */
  override def _to: FC[SaleChannelsProps] = default
}
