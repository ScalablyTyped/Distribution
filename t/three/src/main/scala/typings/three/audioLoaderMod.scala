package typings.three

import typings.std.AudioBuffer
import typings.std.ErrorEvent
import typings.std.EventTarget
import typings.std.ProgressEvent
import typings.three.loaderMod.Loader
import typings.three.loadingManagerMod.LoadingManager
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/src/loaders/AudioLoader", JSImport.Namespace)
@js.native
object audioLoaderMod extends js.Object {
  @js.native
  class AudioLoader () extends Loader {
    def this(manager: LoadingManager) = this()
    def load(url: String, onLoad: js.Function1[/* audioBuffer */ AudioBuffer, Unit]): Unit = js.native
    def load(
      url: String,
      onLoad: js.Function1[/* audioBuffer */ AudioBuffer, Unit],
      onProgress: js.Function1[/* request */ ProgressEvent[EventTarget], Unit]
    ): Unit = js.native
    def load(
      url: String,
      onLoad: js.Function1[/* audioBuffer */ AudioBuffer, Unit],
      onProgress: js.Function1[/* request */ ProgressEvent[EventTarget], Unit],
      onError: js.Function1[/* event */ ErrorEvent, Unit]
    ): Unit = js.native
  }
  
}

