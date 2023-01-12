package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcGeneralDistComponentsLoyaltySmallMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/LoyaltySmall", JSImport.Default)
  @js.native
  val default: FC[LoyaltySmallProps] = js.native
  
  trait LoyaltySmallProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object LoyaltySmallProps {
    
    inline def apply(): LoyaltySmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LoyaltySmallProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: LoyaltySmallProps] (val x: Self) extends AnyVal {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[LoyaltySmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `distSrcGeneralDistComponentsLoyaltySmallMod.foo` */
  override def _to: FC[LoyaltySmallProps] = default
}
