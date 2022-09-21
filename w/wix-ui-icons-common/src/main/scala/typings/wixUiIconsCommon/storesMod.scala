package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.wixUiIconsCommon.componentsStoresMod.StoresProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object storesMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/classic-editor/system/Stores", JSImport.Default)
  @js.native
  val default: FC[StoresProps] = js.native
  
  type _To = FC[StoresProps]
  
  /* This means you don't have to write `default`, but can instead just say `storesMod.foo` */
  override def _to: FC[StoresProps] = default
}
