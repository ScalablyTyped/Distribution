package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.wixUiIconsCommon.emailLargeMod.EmailLargeProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object systemEmailLargeMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/on-stage/system/EmailLarge", JSImport.Default)
  @js.native
  val default: FC[EmailLargeProps] = js.native
  
  type _To = FC[EmailLargeProps]
  
  /* This means you don't have to write `default`, but can instead just say `systemEmailLargeMod.foo` */
  override def _to: FC[EmailLargeProps] = default
}
