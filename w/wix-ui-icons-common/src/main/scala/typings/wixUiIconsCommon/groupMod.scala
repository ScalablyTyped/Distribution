package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.wixUiIconsCommon.componentsGroupMod.GroupProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object groupMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/classic-editor/Group", JSImport.Default)
  @js.native
  val default: FC[GroupProps] = js.native
  
  type _To = FC[GroupProps]
  
  /* This means you don't have to write `default`, but can instead just say `groupMod.foo` */
  override def _to: FC[GroupProps] = default
}
