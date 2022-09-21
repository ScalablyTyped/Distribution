package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.wixUiIconsCommon.componentsConfirmCircleMod.ConfirmCircleProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object confirmCircleMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/classic-editor/ConfirmCircle", JSImport.Default)
  @js.native
  val default: FC[ConfirmCircleProps] = js.native
  
  type _To = FC[ConfirmCircleProps]
  
  /* This means you don't have to write `default`, but can instead just say `confirmCircleMod.foo` */
  override def _to: FC[ConfirmCircleProps] = default
}
