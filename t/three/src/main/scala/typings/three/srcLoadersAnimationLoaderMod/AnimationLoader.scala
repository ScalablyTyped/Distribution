package typings.three.srcLoadersAnimationLoaderMod

import typings.std.ArrayBuffer
import typings.std.ErrorEvent
import typings.std.ProgressEvent
import typings.three.srcAnimationAnimationClipMod.AnimationClip
import typings.three.srcLoadersLoadingManagerMod.LoadingManager
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/src/loaders/AnimationLoader", "AnimationLoader")
@js.native
class AnimationLoader () extends js.Object {
  def this(manager: LoadingManager) = this()
  var manager: LoadingManager = js.native
  def load(url: String): js.Any = js.native
  def load(url: String, onLoad: js.Function1[/* response */ String | ArrayBuffer, Unit]): js.Any = js.native
  def load(
    url: String,
    onLoad: js.Function1[/* response */ String | ArrayBuffer, Unit],
    onProgress: js.Function1[/* request */ ProgressEvent, Unit]
  ): js.Any = js.native
  def load(
    url: String,
    onLoad: js.Function1[/* response */ String | ArrayBuffer, Unit],
    onProgress: js.Function1[/* request */ ProgressEvent, Unit],
    onError: js.Function1[/* event */ ErrorEvent, Unit]
  ): js.Any = js.native
  def parse(json: js.Any): js.Array[AnimationClip] = js.native
  def setPath(path: String): AnimationLoader = js.native
}

