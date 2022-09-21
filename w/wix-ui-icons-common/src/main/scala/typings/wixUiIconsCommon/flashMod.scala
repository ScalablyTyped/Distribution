package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.wixUiIconsCommon.componentsFlashMod.FlashProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object flashMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/classic-editor/Flash", JSImport.Default)
  @js.native
  val default: FC[FlashProps] = js.native
  
  type _To = FC[FlashProps]
  
  /* This means you don't have to write `default`, but can instead just say `flashMod.foo` */
  override def _to: FC[FlashProps] = default
}
