package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.wixUiIconsCommon.componentsReplaceMod.ReplaceProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object replaceMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/classic-editor/Replace", JSImport.Default)
  @js.native
  val default: FC[ReplaceProps] = js.native
  
  type _To = FC[ReplaceProps]
  
  /* This means you don't have to write `default`, but can instead just say `replaceMod.foo` */
  override def _to: FC[ReplaceProps] = default
}
