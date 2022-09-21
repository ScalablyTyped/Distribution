package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.wixUiIconsCommon.componentsCornersMod.CornersProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cornersMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/classic-editor/Corners", JSImport.Default)
  @js.native
  val default: FC[CornersProps] = js.native
  
  type _To = FC[CornersProps]
  
  /* This means you don't have to write `default`, but can instead just say `cornersMod.foo` */
  override def _to: FC[CornersProps] = default
}
