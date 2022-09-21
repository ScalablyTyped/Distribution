package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.wixUiIconsCommon.componentsThumbUpMod.ThumbUpProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object reactionsThumbUpMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/on-stage/reactions/ThumbUp", JSImport.Default)
  @js.native
  val default: FC[ThumbUpProps] = js.native
  
  type _To = FC[ThumbUpProps]
  
  /* This means you don't have to write `default`, but can instead just say `reactionsThumbUpMod.foo` */
  override def _to: FC[ThumbUpProps] = default
}
