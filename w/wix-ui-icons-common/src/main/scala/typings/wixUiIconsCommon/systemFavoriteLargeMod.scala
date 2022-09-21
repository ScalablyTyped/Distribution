package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.wixUiIconsCommon.favoriteLargeMod.FavoriteLargeProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object systemFavoriteLargeMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/on-stage/system/FavoriteLarge", JSImport.Default)
  @js.native
  val default: FC[FavoriteLargeProps] = js.native
  
  type _To = FC[FavoriteLargeProps]
  
  /* This means you don't have to write `default`, but can instead just say `systemFavoriteLargeMod.foo` */
  override def _to: FC[FavoriteLargeProps] = default
}
