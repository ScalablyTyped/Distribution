package typings.three

import typings.std.ArrayBuffer
import typings.std.ErrorEvent
import typings.std.EventTarget
import typings.std.ProgressEvent
import typings.three.srcAnimationAnimationClipMod.AnimationClip
import typings.three.srcLoadersLoaderMod.Loader
import typings.three.srcLoadersLoadingManagerMod.LoadingManager
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/src/loaders/AnimationLoader", JSImport.Namespace)
@js.native
object srcLoadersAnimationLoaderMod extends js.Object {
  @js.native
  class AnimationLoader () extends Loader {
    def this(manager: LoadingManager) = this()
    def load(url: String): js.Any = js.native
    def load(url: String, onLoad: js.Function1[/* response */ String | ArrayBuffer, Unit]): js.Any = js.native
    def load(
      url: String,
      onLoad: js.Function1[/* response */ String | ArrayBuffer, Unit],
      onProgress: js.Function1[/* request */ ProgressEvent[EventTarget], Unit]
    ): js.Any = js.native
    def load(
      url: String,
      onLoad: js.Function1[/* response */ String | ArrayBuffer, Unit],
      onProgress: js.Function1[/* request */ ProgressEvent[EventTarget], Unit],
      onError: js.Function1[/* event */ ErrorEvent, Unit]
    ): js.Any = js.native
    def parse(json: js.Any): js.Array[AnimationClip] = js.native
  }
  
}

