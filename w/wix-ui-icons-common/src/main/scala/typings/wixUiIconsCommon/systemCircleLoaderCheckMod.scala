package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.wixUiIconsCommon.circleLoaderCheckMod.CircleLoaderCheckProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object systemCircleLoaderCheckMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/system/CircleLoaderCheck", JSImport.Default)
  @js.native
  val default: FC[CircleLoaderCheckProps] = js.native
  
  type _To = FC[CircleLoaderCheckProps]
  
  /* This means you don't have to write `default`, but can instead just say `systemCircleLoaderCheckMod.foo` */
  override def _to: FC[CircleLoaderCheckProps] = default
}
