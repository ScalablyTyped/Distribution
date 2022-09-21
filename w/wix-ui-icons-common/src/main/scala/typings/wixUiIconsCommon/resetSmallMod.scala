package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.wixUiIconsCommon.componentsResetSmallMod.ResetSmallProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object resetSmallMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/classic-editor/ResetSmall", JSImport.Default)
  @js.native
  val default: FC[ResetSmallProps] = js.native
  
  type _To = FC[ResetSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `resetSmallMod.foo` */
  override def _to: FC[ResetSmallProps] = default
}
