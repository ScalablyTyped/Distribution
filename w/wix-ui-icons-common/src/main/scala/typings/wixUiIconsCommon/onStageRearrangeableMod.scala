package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.wixUiIconsCommon.rearrangeableMod.RearrangeableProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object onStageRearrangeableMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/on-stage/Rearrangeable", JSImport.Default)
  @js.native
  val default: FC[RearrangeableProps] = js.native
  
  type _To = FC[RearrangeableProps]
  
  /* This means you don't have to write `default`, but can instead just say `onStageRearrangeableMod.foo` */
  override def _to: FC[RearrangeableProps] = default
}
