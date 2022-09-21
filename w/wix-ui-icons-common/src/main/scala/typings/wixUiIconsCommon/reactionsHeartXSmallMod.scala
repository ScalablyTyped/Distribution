package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.wixUiIconsCommon.heartXSmallMod.HeartXSmallProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object reactionsHeartXSmallMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/on-stage/reactions/HeartXSmall", JSImport.Default)
  @js.native
  val default: FC[HeartXSmallProps] = js.native
  
  type _To = FC[HeartXSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `reactionsHeartXSmallMod.foo` */
  override def _to: FC[HeartXSmallProps] = default
}
