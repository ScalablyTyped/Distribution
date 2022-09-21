package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.wixUiIconsCommon.componentsArrangeMod.ArrangeProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object arrangeMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/classic-editor/Arrange", JSImport.Default)
  @js.native
  val default: FC[ArrangeProps] = js.native
  
  type _To = FC[ArrangeProps]
  
  /* This means you don't have to write `default`, but can instead just say `arrangeMod.foo` */
  override def _to: FC[ArrangeProps] = default
}
