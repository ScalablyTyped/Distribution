package typings.wixStyleReact.mod

import typings.react.mod.FC
import typings.wixStyleReact.mediaOverlayMod.MediaOverlayContentProps
import typings.wixStyleReact.mediaOverlayMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("wix-style-react", "MediaOverlay")
@js.native
class MediaOverlay () extends default
/* static members */
object MediaOverlay {
  
  @JSImport("wix-style-react", "MediaOverlay")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("wix-style-react", "MediaOverlay.Content")
  @js.native
  def Content: FC[MediaOverlayContentProps] = js.native
  inline def Content_=(x: FC[MediaOverlayContentProps]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Content")(x.asInstanceOf[js.Any])
  
  @JSImport("wix-style-react", "MediaOverlay.DragHandle")
  @js.native
  def DragHandle: FC[js.Object] = js.native
  inline def DragHandle_=(x: FC[js.Object]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DragHandle")(x.asInstanceOf[js.Any])
}
