package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.SFC
import typings.wixUiIconsCommon.noteMod.NoteProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object wixUiIconsCommonNoteMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/Note", JSImport.Default)
  @js.native
  val default: SFC[NoteProps] = js.native
  
  type _To = SFC[NoteProps]
  
  /* This means you don't have to write `default`, but can instead just say `wixUiIconsCommonNoteMod.foo` */
  override def _to: SFC[NoteProps] = default
}
