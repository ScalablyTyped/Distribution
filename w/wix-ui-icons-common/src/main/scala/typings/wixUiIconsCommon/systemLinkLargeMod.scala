package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.wixUiIconsCommon.linkLargeMod.LinkLargeProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object systemLinkLargeMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/on-stage/system/LinkLarge", JSImport.Default)
  @js.native
  val default: FC[LinkLargeProps] = js.native
  
  type _To = FC[LinkLargeProps]
  
  /* This means you don't have to write `default`, but can instead just say `systemLinkLargeMod.foo` */
  override def _to: FC[LinkLargeProps] = default
}
