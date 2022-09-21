package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.wixUiIconsCommon.componentsHeartSmallMod.HeartSmallProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object reactionsHeartSmallMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/on-stage/reactions/HeartSmall", JSImport.Default)
  @js.native
  val default: FC[HeartSmallProps] = js.native
  
  type _To = FC[HeartSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `reactionsHeartSmallMod.foo` */
  override def _to: FC[HeartSmallProps] = default
}
