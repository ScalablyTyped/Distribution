package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.wixUiIconsCommon.smileyXSmallMod.SmileyXSmallProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object reactionsSmileyXSmallMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/on-stage/reactions/SmileyXSmall", JSImport.Default)
  @js.native
  val default: FC[SmileyXSmallProps] = js.native
  
  type _To = FC[SmileyXSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `reactionsSmileyXSmallMod.foo` */
  override def _to: FC[SmileyXSmallProps] = default
}
