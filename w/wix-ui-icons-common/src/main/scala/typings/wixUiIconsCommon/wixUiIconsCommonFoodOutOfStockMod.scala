package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.SFC
import typings.wixUiIconsCommon.foodOutOfStockMod.FoodOutOfStockProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object wixUiIconsCommonFoodOutOfStockMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/FoodOutOfStock", JSImport.Default)
  @js.native
  val default: SFC[FoodOutOfStockProps] = js.native
  
  type _To = SFC[FoodOutOfStockProps]
  
  /* This means you don't have to write `default`, but can instead just say `wixUiIconsCommonFoodOutOfStockMod.foo` */
  override def _to: SFC[FoodOutOfStockProps] = default
}
