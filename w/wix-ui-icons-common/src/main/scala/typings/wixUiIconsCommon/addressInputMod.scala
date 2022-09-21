package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.wixUiIconsCommon.componentsAddressInputMod.AddressInputProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object addressInputMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/classic-editor/AddressInput", JSImport.Default)
  @js.native
  val default: FC[AddressInputProps] = js.native
  
  type _To = FC[AddressInputProps]
  
  /* This means you don't have to write `default`, but can instead just say `addressInputMod.foo` */
  override def _to: FC[AddressInputProps] = default
}
