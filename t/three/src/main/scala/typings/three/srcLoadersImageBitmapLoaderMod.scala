package typings.three

import typings.std.ErrorEvent
import typings.std.EventTarget
import typings.std.ImageBitmap
import typings.std.ProgressEvent
import typings.three.srcLoadersLoaderMod.Loader
import typings.three.srcLoadersLoadingManagerMod.LoadingManager
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcLoadersImageBitmapLoaderMod {
  
  @JSImport("three/src/loaders/ImageBitmapLoader", "ImageBitmapLoader")
  @js.native
  open class ImageBitmapLoader () extends Loader {
    def this(manager: LoadingManager) = this()
    
    val isImageBitmapLoader: true = js.native
    
    def load(url: String): Any = js.native
    def load(url: String, onLoad: js.Function1[/* response */ ImageBitmap, Unit]): Any = js.native
    def load(
      url: String,
      onLoad: js.Function1[/* response */ ImageBitmap, Unit],
      onProgress: js.Function1[/* request */ ProgressEvent[EventTarget], Unit]
    ): Any = js.native
    def load(
      url: String,
      onLoad: js.Function1[/* response */ ImageBitmap, Unit],
      onProgress: js.Function1[/* request */ ProgressEvent[EventTarget], Unit],
      onError: js.Function1[/* event */ ErrorEvent, Unit]
    ): Any = js.native
    def load(
      url: String,
      onLoad: js.Function1[/* response */ ImageBitmap, Unit],
      onProgress: Unit,
      onError: js.Function1[/* event */ ErrorEvent, Unit]
    ): Any = js.native
    def load(
      url: String,
      onLoad: Unit,
      onProgress: js.Function1[/* request */ ProgressEvent[EventTarget], Unit]
    ): Any = js.native
    def load(
      url: String,
      onLoad: Unit,
      onProgress: js.Function1[/* request */ ProgressEvent[EventTarget], Unit],
      onError: js.Function1[/* event */ ErrorEvent, Unit]
    ): Any = js.native
    def load(url: String, onLoad: Unit, onProgress: Unit, onError: js.Function1[/* event */ ErrorEvent, Unit]): Any = js.native
    
    /**
      * @default { premultiplyAlpha: 'none' }
      */
    var options: js.UndefOr[js.Object] = js.native
    
    def setOptions(options: js.Object): ImageBitmapLoader = js.native
  }
}
