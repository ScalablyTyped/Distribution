package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.wixUiIconsCommon.componentsPinBoldMod.PinBoldProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pinBoldMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/classic-editor/PinBold", JSImport.Default)
  @js.native
  val default: FC[PinBoldProps] = js.native
  
  type _To = FC[PinBoldProps]
  
  /* This means you don't have to write `default`, but can instead just say `pinBoldMod.foo` */
  override def _to: FC[PinBoldProps] = default
}
