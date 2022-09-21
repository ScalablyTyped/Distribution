package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.wixUiIconsCommon.flagFilledMod.FlagFilledProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object wixUiIconsCommonFlagFilledMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/FlagFilled", JSImport.Default)
  @js.native
  val default: FC[FlagFilledProps] = js.native
  
  type _To = FC[FlagFilledProps]
  
  /* This means you don't have to write `default`, but can instead just say `wixUiIconsCommonFlagFilledMod.foo` */
  override def _to: FC[FlagFilledProps] = default
}
