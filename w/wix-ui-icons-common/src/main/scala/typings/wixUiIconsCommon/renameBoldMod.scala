package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.wixUiIconsCommon.componentsRenameBoldMod.RenameBoldProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object renameBoldMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/classic-editor/RenameBold", JSImport.Default)
  @js.native
  val default: FC[RenameBoldProps] = js.native
  
  type _To = FC[RenameBoldProps]
  
  /* This means you don't have to write `default`, but can instead just say `renameBoldMod.foo` */
  override def _to: FC[RenameBoldProps] = default
}
