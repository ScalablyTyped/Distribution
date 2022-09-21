package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.wixUiIconsCommon.storesSmallMod.StoresSmallProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object onStageStoresSmallMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/on-stage/StoresSmall", JSImport.Default)
  @js.native
  val default: FC[StoresSmallProps] = js.native
  
  type _To = FC[StoresSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `onStageStoresSmallMod.foo` */
  override def _to: FC[StoresSmallProps] = default
}
