package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.wixUiIconsCommon.minimizeSmallMod.MinimizeSmallProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object onStageMinimizeSmallMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/on-stage/MinimizeSmall", JSImport.Default)
  @js.native
  val default: FC[MinimizeSmallProps] = js.native
  
  type _To = FC[MinimizeSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `onStageMinimizeSmallMod.foo` */
  override def _to: FC[MinimizeSmallProps] = default
}
