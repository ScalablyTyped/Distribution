package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.wixUiIconsCommon.componentsImageGalleryMod.ImageGalleryProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object imageGalleryMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/classic-editor/ImageGallery", JSImport.Default)
  @js.native
  val default: FC[ImageGalleryProps] = js.native
  
  type _To = FC[ImageGalleryProps]
  
  /* This means you don't have to write `default`, but can instead just say `imageGalleryMod.foo` */
  override def _to: FC[ImageGalleryProps] = default
}
