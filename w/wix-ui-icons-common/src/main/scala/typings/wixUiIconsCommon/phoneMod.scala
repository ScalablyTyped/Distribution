package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.wixUiIconsCommon.componentsPhoneMod.PhoneProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object phoneMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/classic-editor/Phone", JSImport.Default)
  @js.native
  val default: FC[PhoneProps] = js.native
  
  type _To = FC[PhoneProps]
  
  /* This means you don't have to write `default`, but can instead just say `phoneMod.foo` */
  override def _to: FC[PhoneProps] = default
}
