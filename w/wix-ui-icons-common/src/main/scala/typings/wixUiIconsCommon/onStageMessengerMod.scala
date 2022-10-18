package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.wixUiIconsCommon.distSrcOnStageGeneralDistComponentsMessengerMod.MessengerProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object onStageMessengerMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/on-stage/Messenger", JSImport.Default)
  @js.native
  val default: FC[MessengerProps] = js.native
  
  type _To = FC[MessengerProps]
  
  /* This means you don't have to write `default`, but can instead just say `onStageMessengerMod.foo` */
  override def _to: FC[MessengerProps] = default
}
