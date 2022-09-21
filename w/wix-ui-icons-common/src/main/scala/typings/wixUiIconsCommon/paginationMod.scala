package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.wixUiIconsCommon.componentsPaginationMod.PaginationProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object paginationMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/classic-editor/Pagination", JSImport.Default)
  @js.native
  val default: FC[PaginationProps] = js.native
  
  type _To = FC[PaginationProps]
  
  /* This means you don't have to write `default`, but can instead just say `paginationMod.foo` */
  override def _to: FC[PaginationProps] = default
}
