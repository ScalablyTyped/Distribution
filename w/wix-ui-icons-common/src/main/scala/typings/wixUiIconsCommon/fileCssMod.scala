package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.wixUiIconsCommon.componentsFileCssMod.FileCssProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object fileCssMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/classic-editor/FileCss", JSImport.Default)
  @js.native
  val default: FC[FileCssProps] = js.native
  
  type _To = FC[FileCssProps]
  
  /* This means you don't have to write `default`, but can instead just say `fileCssMod.foo` */
  override def _to: FC[FileCssProps] = default
}
