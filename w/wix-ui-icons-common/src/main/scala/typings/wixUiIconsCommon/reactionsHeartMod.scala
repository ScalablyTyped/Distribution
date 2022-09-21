package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.wixUiIconsCommon.reactionsDistComponentsHeartMod.HeartProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object reactionsHeartMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/on-stage/reactions/Heart", JSImport.Default)
  @js.native
  val default: FC[HeartProps] = js.native
  
  type _To = FC[HeartProps]
  
  /* This means you don't have to write `default`, but can instead just say `reactionsHeartMod.foo` */
  override def _to: FC[HeartProps] = default
}
