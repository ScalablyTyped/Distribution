package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.wixUiIconsCommon.componentsImageButtonMod.ImageButtonProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object imageButtonMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/classic-editor/ImageButton", JSImport.Default)
  @js.native
  val default: FC[ImageButtonProps] = js.native
  
  type _To = FC[ImageButtonProps]
  
  /* This means you don't have to write `default`, but can instead just say `imageButtonMod.foo` */
  override def _to: FC[ImageButtonProps] = default
}
