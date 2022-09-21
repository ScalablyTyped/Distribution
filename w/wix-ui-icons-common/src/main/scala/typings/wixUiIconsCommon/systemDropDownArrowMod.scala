package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.wixUiIconsCommon.dropDownArrowMod.DropDownArrowProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object systemDropDownArrowMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/system/DropDownArrow", JSImport.Default)
  @js.native
  val default: FC[DropDownArrowProps] = js.native
  
  type _To = FC[DropDownArrowProps]
  
  /* This means you don't have to write `default`, but can instead just say `systemDropDownArrowMod.foo` */
  override def _to: FC[DropDownArrowProps] = default
}
