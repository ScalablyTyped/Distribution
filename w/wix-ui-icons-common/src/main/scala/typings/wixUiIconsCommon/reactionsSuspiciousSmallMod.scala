package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.wixUiIconsCommon.suspiciousSmallMod.SuspiciousSmallProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object reactionsSuspiciousSmallMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/on-stage/reactions/SuspiciousSmall", JSImport.Default)
  @js.native
  val default: FC[SuspiciousSmallProps] = js.native
  
  type _To = FC[SuspiciousSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `reactionsSuspiciousSmallMod.foo` */
  override def _to: FC[SuspiciousSmallProps] = default
}
