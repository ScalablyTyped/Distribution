package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.wixUiIconsCommon.likeHeartMod.LikeHeartProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object onStageLikeHeartMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/on-stage/LikeHeart", JSImport.Default)
  @js.native
  val default: FC[LikeHeartProps] = js.native
  
  type _To = FC[LikeHeartProps]
  
  /* This means you don't have to write `default`, but can instead just say `onStageLikeHeartMod.foo` */
  override def _to: FC[LikeHeartProps] = default
}
