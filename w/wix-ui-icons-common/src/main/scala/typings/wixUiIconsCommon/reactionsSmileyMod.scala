package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.wixUiIconsCommon.smileyMod.SmileyProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object reactionsSmileyMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/on-stage/reactions/Smiley", JSImport.Default)
  @js.native
  val default: FC[SmileyProps] = js.native
  
  type _To = FC[SmileyProps]
  
  /* This means you don't have to write `default`, but can instead just say `reactionsSmileyMod.foo` */
  override def _to: FC[SmileyProps] = default
}
