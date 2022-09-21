package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.wixUiIconsCommon.componentsColumnMod.ColumnProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object columnMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/classic-editor/Column", JSImport.Default)
  @js.native
  val default: FC[ColumnProps] = js.native
  
  type _To = FC[ColumnProps]
  
  /* This means you don't have to write `default`, but can instead just say `columnMod.foo` */
  override def _to: FC[ColumnProps] = default
}
