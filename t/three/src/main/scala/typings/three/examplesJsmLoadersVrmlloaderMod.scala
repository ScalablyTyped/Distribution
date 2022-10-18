package typings.three

import typings.std.ErrorEvent
import typings.std.EventTarget
import typings.std.ProgressEvent
import typings.three.srcThreeMod.Loader
import typings.three.srcThreeMod.LoadingManager
import typings.three.srcThreeMod.Scene
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object examplesJsmLoadersVrmlloaderMod {
  
  @JSImport("three/examples/jsm/loaders/VRMLLoader", "VRMLLoader")
  @js.native
  open class VRMLLoader () extends Loader {
    def this(manager: LoadingManager) = this()
    
    def load(url: String, onLoad: js.Function1[/* scene */ Scene, Unit]): Unit = js.native
    def load(
      url: String,
      onLoad: js.Function1[/* scene */ Scene, Unit],
      onProgress: js.Function1[/* event */ ProgressEvent[EventTarget], Unit]
    ): Unit = js.native
    def load(
      url: String,
      onLoad: js.Function1[/* scene */ Scene, Unit],
      onProgress: js.Function1[/* event */ ProgressEvent[EventTarget], Unit],
      onError: js.Function1[/* event */ ErrorEvent, Unit]
    ): Unit = js.native
    def load(
      url: String,
      onLoad: js.Function1[/* scene */ Scene, Unit],
      onProgress: Unit,
      onError: js.Function1[/* event */ ErrorEvent, Unit]
    ): Unit = js.native
    
    def parse(data: String, path: String): Scene = js.native
  }
}
