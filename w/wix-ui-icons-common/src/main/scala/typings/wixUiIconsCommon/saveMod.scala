package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.wixUiIconsCommon.componentsSaveMod.SaveProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object saveMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/classic-editor/Save", JSImport.Default)
  @js.native
  val default: FC[SaveProps] = js.native
  
  type _To = FC[SaveProps]
  
  /* This means you don't have to write `default`, but can instead just say `saveMod.foo` */
  override def _to: FC[SaveProps] = default
}
