package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.wixUiIconsCommon.pinFillMod.PinFillProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object onStagePinFillMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/on-stage/PinFill", JSImport.Default)
  @js.native
  val default: FC[PinFillProps] = js.native
  
  type _To = FC[PinFillProps]
  
  /* This means you don't have to write `default`, but can instead just say `onStagePinFillMod.foo` */
  override def _to: FC[PinFillProps] = default
}
