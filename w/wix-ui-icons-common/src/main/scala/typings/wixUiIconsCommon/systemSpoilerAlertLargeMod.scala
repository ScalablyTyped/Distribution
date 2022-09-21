package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.wixUiIconsCommon.spoilerAlertLargeMod.SpoilerAlertLargeProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object systemSpoilerAlertLargeMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/on-stage/system/SpoilerAlertLarge", JSImport.Default)
  @js.native
  val default: FC[SpoilerAlertLargeProps] = js.native
  
  type _To = FC[SpoilerAlertLargeProps]
  
  /* This means you don't have to write `default`, but can instead just say `systemSpoilerAlertLargeMod.foo` */
  override def _to: FC[SpoilerAlertLargeProps] = default
}
