package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.wixUiIconsCommon.sortDownMod.SortDownProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object onStageSortDownMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/on-stage/SortDown", JSImport.Default)
  @js.native
  val default: FC[SortDownProps] = js.native
  
  type _To = FC[SortDownProps]
  
  /* This means you don't have to write `default`, but can instead just say `onStageSortDownMod.foo` */
  override def _to: FC[SortDownProps] = default
}
