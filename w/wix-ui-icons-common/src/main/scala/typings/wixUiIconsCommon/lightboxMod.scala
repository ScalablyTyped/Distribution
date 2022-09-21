package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.wixUiIconsCommon.componentsLightboxMod.LightboxProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object lightboxMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/classic-editor/Lightbox", JSImport.Default)
  @js.native
  val default: FC[LightboxProps] = js.native
  
  type _To = FC[LightboxProps]
  
  /* This means you don't have to write `default`, but can instead just say `lightboxMod.foo` */
  override def _to: FC[LightboxProps] = default
}
