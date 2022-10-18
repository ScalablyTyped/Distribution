package typings.three

import typings.std.ErrorEvent
import typings.std.EventTarget
import typings.std.ProgressEvent
import typings.three.examplesJsmLoadersColladaLoaderMod.Collada
import typings.three.srcThreeMod.Loader
import typings.three.srcThreeMod.LoadingManager
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object examplesJsmLoadersKmzloaderMod {
  
  @JSImport("three/examples/jsm/loaders/KMZLoader", "KMZLoader")
  @js.native
  open class KMZLoader () extends Loader {
    def this(manager: LoadingManager) = this()
    
    def load(url: String, onLoad: js.Function1[/* kmz */ Collada, Unit]): Unit = js.native
    def load(
      url: String,
      onLoad: js.Function1[/* kmz */ Collada, Unit],
      onProgress: js.Function1[/* event */ ProgressEvent[EventTarget], Unit]
    ): Unit = js.native
    def load(
      url: String,
      onLoad: js.Function1[/* kmz */ Collada, Unit],
      onProgress: js.Function1[/* event */ ProgressEvent[EventTarget], Unit],
      onError: js.Function1[/* event */ ErrorEvent, Unit]
    ): Unit = js.native
    def load(
      url: String,
      onLoad: js.Function1[/* kmz */ Collada, Unit],
      onProgress: Unit,
      onError: js.Function1[/* event */ ErrorEvent, Unit]
    ): Unit = js.native
    
    def parse(data: js.typedarray.ArrayBuffer): Collada = js.native
  }
}
