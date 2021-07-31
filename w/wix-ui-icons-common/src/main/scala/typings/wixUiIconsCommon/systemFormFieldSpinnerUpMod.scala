package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.SFC
import typings.wixUiIconsCommon.formFieldSpinnerUpMod.FormFieldSpinnerUpProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object systemFormFieldSpinnerUpMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/system/FormFieldSpinnerUp", JSImport.Default)
  @js.native
  val default: SFC[FormFieldSpinnerUpProps] = js.native
  
  type _To = SFC[FormFieldSpinnerUpProps]
  
  /* This means you don't have to write `default`, but can instead just say `systemFormFieldSpinnerUpMod.foo` */
  override def _to: SFC[FormFieldSpinnerUpProps] = default
}
