package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.wixUiIconsCommon.componentsRadioButtonMod.RadioButtonProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object radioButtonMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/classic-editor/RadioButton", JSImport.Default)
  @js.native
  val default: FC[RadioButtonProps] = js.native
  
  type _To = FC[RadioButtonProps]
  
  /* This means you don't have to write `default`, but can instead just say `radioButtonMod.foo` */
  override def _to: FC[RadioButtonProps] = default
}
