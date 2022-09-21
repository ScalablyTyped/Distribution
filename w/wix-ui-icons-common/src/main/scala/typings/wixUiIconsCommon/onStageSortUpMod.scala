package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.wixUiIconsCommon.sortUpMod.SortUpProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object onStageSortUpMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/on-stage/SortUp", JSImport.Default)
  @js.native
  val default: FC[SortUpProps] = js.native
  
  type _To = FC[SortUpProps]
  
  /* This means you don't have to write `default`, but can instead just say `onStageSortUpMod.foo` */
  override def _to: FC[SortUpProps] = default
}
