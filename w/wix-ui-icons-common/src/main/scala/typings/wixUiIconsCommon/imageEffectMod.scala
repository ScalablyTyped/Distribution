package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.wixUiIconsCommon.componentsImageEffectMod.ImageEffectProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object imageEffectMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/classic-editor/ImageEffect", JSImport.Default)
  @js.native
  val default: FC[ImageEffectProps] = js.native
  
  type _To = FC[ImageEffectProps]
  
  /* This means you don't have to write `default`, but can instead just say `imageEffectMod.foo` */
  override def _to: FC[ImageEffectProps] = default
}
