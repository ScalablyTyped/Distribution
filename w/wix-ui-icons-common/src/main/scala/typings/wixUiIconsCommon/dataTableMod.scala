package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.wixUiIconsCommon.componentsDataTableMod.DataTableProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dataTableMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/classic-editor/DataTable", JSImport.Default)
  @js.native
  val default: FC[DataTableProps] = js.native
  
  type _To = FC[DataTableProps]
  
  /* This means you don't have to write `default`, but can instead just say `dataTableMod.foo` */
  override def _to: FC[DataTableProps] = default
}
