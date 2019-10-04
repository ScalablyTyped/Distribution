package typings.three.srcLoadersAudioLoaderMod

import typings.three.srcLoadersLoaderMod.Loader
import typings.three.srcLoadersLoadingManagerMod.LoadingManager
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/src/loaders/AudioLoader", "AudioLoader")
@js.native
class AudioLoader () extends Loader {
  def this(manager: LoadingManager) = this()
  def load(url: String, onLoad: js.Function, onPrgress: js.Function, onError: js.Function): Unit = js.native
}

