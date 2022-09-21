package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.wixUiIconsCommon.systemDistComponentsCloseMod.CloseProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object systemCloseMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/system/Close", JSImport.Default)
  @js.native
  val default: FC[CloseProps] = js.native
  
  type _To = FC[CloseProps]
  
  /* This means you don't have to write `default`, but can instead just say `systemCloseMod.foo` */
  override def _to: FC[CloseProps] = default
}
