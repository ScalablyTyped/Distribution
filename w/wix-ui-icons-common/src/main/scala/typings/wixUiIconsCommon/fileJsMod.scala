package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.wixUiIconsCommon.componentsFileJsMod.FileJsProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object fileJsMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/classic-editor/FileJs", JSImport.Default)
  @js.native
  val default: FC[FileJsProps] = js.native
  
  type _To = FC[FileJsProps]
  
  /* This means you don't have to write `default`, but can instead just say `fileJsMod.foo` */
  override def _to: FC[FileJsProps] = default
}
