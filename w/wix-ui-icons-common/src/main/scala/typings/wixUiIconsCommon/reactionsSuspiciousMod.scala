package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.wixUiIconsCommon.suspiciousMod.SuspiciousProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object reactionsSuspiciousMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/on-stage/reactions/Suspicious", JSImport.Default)
  @js.native
  val default: FC[SuspiciousProps] = js.native
  
  type _To = FC[SuspiciousProps]
  
  /* This means you don't have to write `default`, but can instead just say `reactionsSuspiciousMod.foo` */
  override def _to: FC[SuspiciousProps] = default
}
