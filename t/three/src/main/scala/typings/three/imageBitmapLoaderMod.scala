package typings.three

import typings.std.ErrorEvent
import typings.std.EventTarget
import typings.std.ImageBitmap
import typings.std.ProgressEvent
import typings.three.loaderMod.Loader
import typings.three.loadingManagerMod.LoadingManager
import typings.three.threeBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("three/src/loaders/ImageBitmapLoader", JSImport.Namespace)
@js.native
object imageBitmapLoaderMod extends js.Object {
  
  @js.native
  class ImageBitmapLoader () extends Loader {
    def this(manager: LoadingManager) = this()
    
    val isImageBitmapLoader: `true` = js.native
    
    def load(url: String): js.Any = js.native
    def load(
      url: String,
      onLoad: js.UndefOr[scala.Nothing],
      onProgress: js.UndefOr[scala.Nothing],
      onError: js.Function1[/* event */ ErrorEvent, Unit]
    ): js.Any = js.native
    def load(
      url: String,
      onLoad: js.UndefOr[scala.Nothing],
      onProgress: js.Function1[/* request */ ProgressEvent[EventTarget], Unit]
    ): js.Any = js.native
    def load(
      url: String,
      onLoad: js.UndefOr[scala.Nothing],
      onProgress: js.Function1[/* request */ ProgressEvent[EventTarget], Unit],
      onError: js.Function1[/* event */ ErrorEvent, Unit]
    ): js.Any = js.native
    def load(url: String, onLoad: js.Function1[/* response */ ImageBitmap, Unit]): js.Any = js.native
    def load(
      url: String,
      onLoad: js.Function1[/* response */ ImageBitmap, Unit],
      onProgress: js.UndefOr[scala.Nothing],
      onError: js.Function1[/* event */ ErrorEvent, Unit]
    ): js.Any = js.native
    def load(
      url: String,
      onLoad: js.Function1[/* response */ ImageBitmap, Unit],
      onProgress: js.Function1[/* request */ ProgressEvent[EventTarget], Unit]
    ): js.Any = js.native
    def load(
      url: String,
      onLoad: js.Function1[/* response */ ImageBitmap, Unit],
      onProgress: js.Function1[/* request */ ProgressEvent[EventTarget], Unit],
      onError: js.Function1[/* event */ ErrorEvent, Unit]
    ): js.Any = js.native
    
    /**
    	 * @default { premultiplyAlpha: 'none' }
    	 */
    var options: js.UndefOr[js.Object] = js.native
    
    def setOptions(options: js.Object): ImageBitmapLoader = js.native
  }
}
