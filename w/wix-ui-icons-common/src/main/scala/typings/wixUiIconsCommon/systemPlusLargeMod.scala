package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.wixUiIconsCommon.plusLargeMod.PlusLargeProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object systemPlusLargeMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/on-stage/system/PlusLarge", JSImport.Default)
  @js.native
  val default: FC[PlusLargeProps] = js.native
  
  type _To = FC[PlusLargeProps]
  
  /* This means you don't have to write `default`, but can instead just say `systemPlusLargeMod.foo` */
  override def _to: FC[PlusLargeProps] = default
}
