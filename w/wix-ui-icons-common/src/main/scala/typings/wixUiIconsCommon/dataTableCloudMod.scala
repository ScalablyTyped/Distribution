package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.wixUiIconsCommon.componentsDataTableCloudMod.DataTableCloudProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dataTableCloudMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/classic-editor/DataTableCloud", JSImport.Default)
  @js.native
  val default: FC[DataTableCloudProps] = js.native
  
  type _To = FC[DataTableCloudProps]
  
  /* This means you don't have to write `default`, but can instead just say `dataTableCloudMod.foo` */
  override def _to: FC[DataTableCloudProps] = default
}
