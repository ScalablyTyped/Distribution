package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.wixUiIconsCommon.componentsCheckboxListMod.CheckboxListProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object checkboxListMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/classic-editor/CheckboxList", JSImport.Default)
  @js.native
  val default: FC[CheckboxListProps] = js.native
  
  type _To = FC[CheckboxListProps]
  
  /* This means you don't have to write `default`, but can instead just say `checkboxListMod.foo` */
  override def _to: FC[CheckboxListProps] = default
}
