package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.wixUiIconsCommon.componentsParentMod.ParentProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object parentMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/classic-editor/Parent", JSImport.Default)
  @js.native
  val default: FC[ParentProps] = js.native
  
  type _To = FC[ParentProps]
  
  /* This means you don't have to write `default`, but can instead just say `parentMod.foo` */
  override def _to: FC[ParentProps] = default
}
