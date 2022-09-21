package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.wixUiIconsCommon.componentsInteractionsMod.InteractionsProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object interactionsMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/classic-editor/system/Interactions", JSImport.Default)
  @js.native
  val default: FC[InteractionsProps] = js.native
  
  type _To = FC[InteractionsProps]
  
  /* This means you don't have to write `default`, but can instead just say `interactionsMod.foo` */
  override def _to: FC[InteractionsProps] = default
}
