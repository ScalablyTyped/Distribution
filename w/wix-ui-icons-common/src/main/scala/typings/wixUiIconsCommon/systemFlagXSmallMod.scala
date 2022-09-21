package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.wixUiIconsCommon.flagXSmallMod.FlagXSmallProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object systemFlagXSmallMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/on-stage/system/FlagXSmall", JSImport.Default)
  @js.native
  val default: FC[FlagXSmallProps] = js.native
  
  type _To = FC[FlagXSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `systemFlagXSmallMod.foo` */
  override def _to: FC[FlagXSmallProps] = default
}
