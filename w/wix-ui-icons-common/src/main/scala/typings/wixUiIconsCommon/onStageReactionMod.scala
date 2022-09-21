package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.wixUiIconsCommon.reactionMod.ReactionProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object onStageReactionMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/on-stage/Reaction", JSImport.Default)
  @js.native
  val default: FC[ReactionProps] = js.native
  
  type _To = FC[ReactionProps]
  
  /* This means you don't have to write `default`, but can instead just say `onStageReactionMod.foo` */
  override def _to: FC[ReactionProps] = default
}
