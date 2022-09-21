package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.wixUiIconsCommon.componentsPasteStyleMod.PasteStyleProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pasteStyleMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/classic-editor/system/PasteStyle", JSImport.Default)
  @js.native
  val default: FC[PasteStyleProps] = js.native
  
  type _To = FC[PasteStyleProps]
  
  /* This means you don't have to write `default`, but can instead just say `pasteStyleMod.foo` */
  override def _to: FC[PasteStyleProps] = default
}
