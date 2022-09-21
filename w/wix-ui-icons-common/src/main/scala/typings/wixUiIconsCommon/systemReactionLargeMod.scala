package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.wixUiIconsCommon.reactionLargeMod.ReactionLargeProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object systemReactionLargeMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/on-stage/system/ReactionLarge", JSImport.Default)
  @js.native
  val default: FC[ReactionLargeProps] = js.native
  
  type _To = FC[ReactionLargeProps]
  
  /* This means you don't have to write `default`, but can instead just say `systemReactionLargeMod.foo` */
  override def _to: FC[ReactionLargeProps] = default
}
