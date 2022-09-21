package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.wixUiIconsCommon.smileySmallMod.SmileySmallProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object reactionsSmileySmallMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/on-stage/reactions/SmileySmall", JSImport.Default)
  @js.native
  val default: FC[SmileySmallProps] = js.native
  
  type _To = FC[SmileySmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `reactionsSmileySmallMod.foo` */
  override def _to: FC[SmileySmallProps] = default
}
