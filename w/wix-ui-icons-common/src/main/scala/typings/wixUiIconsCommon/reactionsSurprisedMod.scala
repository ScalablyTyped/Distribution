package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.wixUiIconsCommon.surprisedMod.SurprisedProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object reactionsSurprisedMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/on-stage/reactions/Surprised", JSImport.Default)
  @js.native
  val default: FC[SurprisedProps] = js.native
  
  type _To = FC[SurprisedProps]
  
  /* This means you don't have to write `default`, but can instead just say `reactionsSurprisedMod.foo` */
  override def _to: FC[SurprisedProps] = default
}
