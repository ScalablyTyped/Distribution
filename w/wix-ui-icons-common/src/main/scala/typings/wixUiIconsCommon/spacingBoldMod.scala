package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.wixUiIconsCommon.componentsSpacingBoldMod.SpacingBoldProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object spacingBoldMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/classic-editor/SpacingBold", JSImport.Default)
  @js.native
  val default: FC[SpacingBoldProps] = js.native
  
  type _To = FC[SpacingBoldProps]
  
  /* This means you don't have to write `default`, but can instead just say `spacingBoldMod.foo` */
  override def _to: FC[SpacingBoldProps] = default
}
