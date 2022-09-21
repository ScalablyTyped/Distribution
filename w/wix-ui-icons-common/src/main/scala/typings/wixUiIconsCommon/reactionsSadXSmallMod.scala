package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.wixUiIconsCommon.sadXSmallMod.SadXSmallProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object reactionsSadXSmallMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/on-stage/reactions/SadXSmall", JSImport.Default)
  @js.native
  val default: FC[SadXSmallProps] = js.native
  
  type _To = FC[SadXSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `reactionsSadXSmallMod.foo` */
  override def _to: FC[SadXSmallProps] = default
}
