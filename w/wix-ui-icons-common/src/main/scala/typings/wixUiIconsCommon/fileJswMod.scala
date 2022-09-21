package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.wixUiIconsCommon.componentsFileJswMod.FileJswProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object fileJswMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/classic-editor/FileJsw", JSImport.Default)
  @js.native
  val default: FC[FileJswProps] = js.native
  
  type _To = FC[FileJswProps]
  
  /* This means you don't have to write `default`, but can instead just say `fileJswMod.foo` */
  override def _to: FC[FileJswProps] = default
}
