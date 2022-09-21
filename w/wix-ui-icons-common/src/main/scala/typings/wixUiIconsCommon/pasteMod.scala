package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.wixUiIconsCommon.componentsPasteMod.PasteProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pasteMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/classic-editor/Paste", JSImport.Default)
  @js.native
  val default: FC[PasteProps] = js.native
  
  type _To = FC[PasteProps]
  
  /* This means you don't have to write `default`, but can instead just say `pasteMod.foo` */
  override def _to: FC[PasteProps] = default
}
