package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.wixUiIconsCommon.closeXSmallMod.CloseXSmallProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object systemCloseXSmallMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/on-stage/system/CloseXSmall", JSImport.Default)
  @js.native
  val default: FC[CloseXSmallProps] = js.native
  
  type _To = FC[CloseXSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `systemCloseXSmallMod.foo` */
  override def _to: FC[CloseXSmallProps] = default
}
