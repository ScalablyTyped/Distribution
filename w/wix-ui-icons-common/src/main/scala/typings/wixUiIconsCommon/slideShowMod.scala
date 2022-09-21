package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.wixUiIconsCommon.componentsSlideShowMod.SlideShowProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object slideShowMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/classic-editor/SlideShow", JSImport.Default)
  @js.native
  val default: FC[SlideShowProps] = js.native
  
  type _To = FC[SlideShowProps]
  
  /* This means you don't have to write `default`, but can instead just say `slideShowMod.foo` */
  override def _to: FC[SlideShowProps] = default
}
