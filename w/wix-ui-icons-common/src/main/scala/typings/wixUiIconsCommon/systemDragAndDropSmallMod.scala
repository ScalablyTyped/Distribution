package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.wixUiIconsCommon.dragAndDropSmallMod.DragAndDropSmallProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object systemDragAndDropSmallMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/system/DragAndDropSmall", JSImport.Default)
  @js.native
  val default: FC[DragAndDropSmallProps] = js.native
  
  type _To = FC[DragAndDropSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `systemDragAndDropSmallMod.foo` */
  override def _to: FC[DragAndDropSmallProps] = default
}
