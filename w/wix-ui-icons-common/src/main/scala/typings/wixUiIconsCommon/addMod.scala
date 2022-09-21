package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.wixUiIconsCommon.componentsAddMod.AddProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object addMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/classic-editor/Add", JSImport.Default)
  @js.native
  val default: FC[AddProps] = js.native
  
  type _To = FC[AddProps]
  
  /* This means you don't have to write `default`, but can instead just say `addMod.foo` */
  override def _to: FC[AddProps] = default
}
