package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.wixUiIconsCommon.percentLargeMod.PercentLargeProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object systemPercentLargeMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/on-stage/system/PercentLarge", JSImport.Default)
  @js.native
  val default: FC[PercentLargeProps] = js.native
  
  type _To = FC[PercentLargeProps]
  
  /* This means you don't have to write `default`, but can instead just say `systemPercentLargeMod.foo` */
  override def _to: FC[PercentLargeProps] = default
}
