package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.wixUiIconsCommon.dragAndDropLargeMod.DragAndDropLargeProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object systemDragAndDropLargeMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/system/DragAndDropLarge", JSImport.Default)
  @js.native
  val default: FC[DragAndDropLargeProps] = js.native
  
  type _To = FC[DragAndDropLargeProps]
  
  /* This means you don't have to write `default`, but can instead just say `systemDragAndDropLargeMod.foo` */
  override def _to: FC[DragAndDropLargeProps] = default
}
