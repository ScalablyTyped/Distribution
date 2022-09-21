package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.wixUiIconsCommon.sadSmallMod.SadSmallProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object reactionsSadSmallMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/on-stage/reactions/SadSmall", JSImport.Default)
  @js.native
  val default: FC[SadSmallProps] = js.native
  
  type _To = FC[SadSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `reactionsSadSmallMod.foo` */
  override def _to: FC[SadSmallProps] = default
}
