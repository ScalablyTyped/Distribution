package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.wixUiIconsCommon.componentsAnchorMod.AnchorProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anchorMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/classic-editor/Anchor", JSImport.Default)
  @js.native
  val default: FC[AnchorProps] = js.native
  
  type _To = FC[AnchorProps]
  
  /* This means you don't have to write `default`, but can instead just say `anchorMod.foo` */
  override def _to: FC[AnchorProps] = default
}
