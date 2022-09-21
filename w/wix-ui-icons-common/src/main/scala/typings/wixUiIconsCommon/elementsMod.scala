package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.wixUiIconsCommon.componentsElementsMod.ElementsProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object elementsMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/classic-editor/system/Elements", JSImport.Default)
  @js.native
  val default: FC[ElementsProps] = js.native
  
  type _To = FC[ElementsProps]
  
  /* This means you don't have to write `default`, but can instead just say `elementsMod.foo` */
  override def _to: FC[ElementsProps] = default
}
