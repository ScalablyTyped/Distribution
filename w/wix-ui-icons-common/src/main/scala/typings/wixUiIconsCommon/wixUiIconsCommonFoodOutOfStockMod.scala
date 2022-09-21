package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.wixUiIconsCommon.foodOutOfStockMod.FoodOutOfStockProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object wixUiIconsCommonFoodOutOfStockMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/FoodOutOfStock", JSImport.Default)
  @js.native
  val default: FC[FoodOutOfStockProps] = js.native
  
  type _To = FC[FoodOutOfStockProps]
  
  /* This means you don't have to write `default`, but can instead just say `wixUiIconsCommonFoodOutOfStockMod.foo` */
  override def _to: FC[FoodOutOfStockProps] = default
}
