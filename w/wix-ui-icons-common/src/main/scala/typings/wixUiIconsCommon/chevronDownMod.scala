package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.wixUiIconsCommon.componentsChevronDownMod.ChevronDownProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object chevronDownMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/classic-editor/ChevronDown", JSImport.Default)
  @js.native
  val default: FC[ChevronDownProps] = js.native
  
  type _To = FC[ChevronDownProps]
  
  /* This means you don't have to write `default`, but can instead just say `chevronDownMod.foo` */
  override def _to: FC[ChevronDownProps] = default
}
