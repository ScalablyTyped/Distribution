package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.wixUiIconsCommon.distComponentsChevronLeftMod.ChevronLeftProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object chevronLeftMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/classic-editor/system/ChevronLeft", JSImport.Default)
  @js.native
  val default: FC[ChevronLeftProps] = js.native
  
  type _To = FC[ChevronLeftProps]
  
  /* This means you don't have to write `default`, but can instead just say `chevronLeftMod.foo` */
  override def _to: FC[ChevronLeftProps] = default
}
