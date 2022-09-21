package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.wixUiIconsCommon.componentsConfirmBoldMod.ConfirmBoldProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object confirmBoldMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/classic-editor/ConfirmBold", JSImport.Default)
  @js.native
  val default: FC[ConfirmBoldProps] = js.native
  
  type _To = FC[ConfirmBoldProps]
  
  /* This means you don't have to write `default`, but can instead just say `confirmBoldMod.foo` */
  override def _to: FC[ConfirmBoldProps] = default
}
