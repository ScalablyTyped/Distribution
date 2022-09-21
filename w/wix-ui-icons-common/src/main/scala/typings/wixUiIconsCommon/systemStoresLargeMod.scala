package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.wixUiIconsCommon.storesLargeMod.StoresLargeProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object systemStoresLargeMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/on-stage/system/StoresLarge", JSImport.Default)
  @js.native
  val default: FC[StoresLargeProps] = js.native
  
  type _To = FC[StoresLargeProps]
  
  /* This means you don't have to write `default`, but can instead just say `systemStoresLargeMod.foo` */
  override def _to: FC[StoresLargeProps] = default
}
