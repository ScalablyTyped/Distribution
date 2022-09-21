package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.wixUiIconsCommon.componentsFileJsonMod.FileJsonProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object fileJsonMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/classic-editor/FileJson", JSImport.Default)
  @js.native
  val default: FC[FileJsonProps] = js.native
  
  type _To = FC[FileJsonProps]
  
  /* This means you don't have to write `default`, but can instead just say `fileJsonMod.foo` */
  override def _to: FC[FileJsonProps] = default
}
