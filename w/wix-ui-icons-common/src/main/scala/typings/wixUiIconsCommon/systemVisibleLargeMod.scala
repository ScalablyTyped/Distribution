package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.wixUiIconsCommon.visibleLargeMod.VisibleLargeProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object systemVisibleLargeMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/on-stage/system/VisibleLarge", JSImport.Default)
  @js.native
  val default: FC[VisibleLargeProps] = js.native
  
  type _To = FC[VisibleLargeProps]
  
  /* This means you don't have to write `default`, but can instead just say `systemVisibleLargeMod.foo` */
  override def _to: FC[VisibleLargeProps] = default
}
