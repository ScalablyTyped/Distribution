package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.wixUiIconsCommon.componentsNumericListRightMod.NumericListRightProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object numericListRightMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/classic-editor/NumericListRight", JSImport.Default)
  @js.native
  val default: FC[NumericListRightProps] = js.native
  
  type _To = FC[NumericListRightProps]
  
  /* This means you don't have to write `default`, but can instead just say `numericListRightMod.foo` */
  override def _to: FC[NumericListRightProps] = default
}
