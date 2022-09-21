package typings.wixWixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.wixWixUiIconsCommon.categoryTableCategoryTableMod.CategoryTableProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object categoryTableMod extends Shortcut {
  
  @JSImport("@wix/wix-ui-icons-common/dist/types/stories/components/category-table", JSImport.Default)
  @js.native
  val default: FC[CategoryTableProps] = js.native
  
  type _To = FC[CategoryTableProps]
  
  /* This means you don't have to write `default`, but can instead just say `categoryTableMod.foo` */
  override def _to: FC[CategoryTableProps] = default
}
