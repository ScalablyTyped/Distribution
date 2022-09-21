package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.wixUiIconsCommon.componentsMinusCircleMod.MinusCircleProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object minusCircleMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/classic-editor/MinusCircle", JSImport.Default)
  @js.native
  val default: FC[MinusCircleProps] = js.native
  
  type _To = FC[MinusCircleProps]
  
  /* This means you don't have to write `default`, but can instead just say `minusCircleMod.foo` */
  override def _to: FC[MinusCircleProps] = default
}
