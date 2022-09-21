package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.wixUiIconsCommon.componentsCopyStyleMod.CopyStyleProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object copyStyleMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/classic-editor/system/CopyStyle", JSImport.Default)
  @js.native
  val default: FC[CopyStyleProps] = js.native
  
  type _To = FC[CopyStyleProps]
  
  /* This means you don't have to write `default`, but can instead just say `copyStyleMod.foo` */
  override def _to: FC[CopyStyleProps] = default
}
