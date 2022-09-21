package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.wixUiIconsCommon.foodInStockMod.FoodInStockProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object wixUiIconsCommonFoodInStockMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/FoodInStock", JSImport.Default)
  @js.native
  val default: FC[FoodInStockProps] = js.native
  
  type _To = FC[FoodInStockProps]
  
  /* This means you don't have to write `default`, but can instead just say `wixUiIconsCommonFoodInStockMod.foo` */
  override def _to: FC[FoodInStockProps] = default
}
