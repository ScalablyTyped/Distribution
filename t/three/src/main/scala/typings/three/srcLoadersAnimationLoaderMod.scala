package typings.three

import typings.std.ErrorEvent
import typings.std.EventTarget
import typings.std.ProgressEvent
import typings.three.srcAnimationAnimationClipMod.AnimationClip
import typings.three.srcLoadersLoaderMod.Loader
import typings.three.srcLoadersLoadingManagerMod.LoadingManager
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcLoadersAnimationLoaderMod {
  
  @JSImport("three/src/loaders/AnimationLoader", "AnimationLoader")
  @js.native
  open class AnimationLoader () extends Loader {
    def this(manager: LoadingManager) = this()
    
    def load(url: String, onLoad: js.Function1[/* response */ js.Array[AnimationClip], Unit]): Unit = js.native
    def load(
      url: String,
      onLoad: js.Function1[/* response */ js.Array[AnimationClip], Unit],
      onProgress: js.Function1[/* request */ ProgressEvent[EventTarget], Unit]
    ): Unit = js.native
    def load(
      url: String,
      onLoad: js.Function1[/* response */ js.Array[AnimationClip], Unit],
      onProgress: js.Function1[/* request */ ProgressEvent[EventTarget], Unit],
      onError: js.Function1[/* event */ ErrorEvent, Unit]
    ): Unit = js.native
    def load(
      url: String,
      onLoad: js.Function1[/* response */ js.Array[AnimationClip], Unit],
      onProgress: Unit,
      onError: js.Function1[/* event */ ErrorEvent, Unit]
    ): Unit = js.native
    
    def parse(json: Any): js.Array[AnimationClip] = js.native
  }
}
