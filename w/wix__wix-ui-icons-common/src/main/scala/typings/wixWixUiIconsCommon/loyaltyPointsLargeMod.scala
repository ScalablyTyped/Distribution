package typings.wixWixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object loyaltyPointsLargeMod extends Shortcut {
  
  @JSImport("@wix/wix-ui-icons-common/dist/types/on-stage/system/dist/components/LoyaltyPointsLarge", JSImport.Default)
  @js.native
  val default: FC[LoyaltyPointsLargeProps] = js.native
  
  trait LoyaltyPointsLargeProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object LoyaltyPointsLargeProps {
    
    inline def apply(): LoyaltyPointsLargeProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LoyaltyPointsLargeProps]
    }
    
    extension [Self <: LoyaltyPointsLargeProps](x: Self) {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[LoyaltyPointsLargeProps]
  
  /* This means you don't have to write `default`, but can instead just say `loyaltyPointsLargeMod.foo` */
  override def _to: FC[LoyaltyPointsLargeProps] = default
}
