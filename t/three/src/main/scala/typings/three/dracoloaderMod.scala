package typings.three

import typings.std.ErrorEvent
import typings.std.EventTarget
import typings.std.ProgressEvent
import typings.three.threeMod.BufferGeometry
import typings.three.threeMod.Loader
import typings.three.threeMod.LoadingManager
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dracoloaderMod {
  
  @JSImport("three/examples/jsm/loaders/DRACOLoader", "DRACOLoader")
  @js.native
  open class DRACOLoader () extends Loader {
    def this(manager: LoadingManager) = this()
    
    def dispose(): DRACOLoader = js.native
    
    def load(url: String, onLoad: js.Function1[/* geometry */ BufferGeometry, Unit]): Unit = js.native
    def load(
      url: String,
      onLoad: js.Function1[/* geometry */ BufferGeometry, Unit],
      onProgress: js.Function1[/* event */ ProgressEvent[EventTarget], Unit]
    ): Unit = js.native
    def load(
      url: String,
      onLoad: js.Function1[/* geometry */ BufferGeometry, Unit],
      onProgress: js.Function1[/* event */ ProgressEvent[EventTarget], Unit],
      onError: js.Function1[/* event */ ErrorEvent, Unit]
    ): Unit = js.native
    def load(
      url: String,
      onLoad: js.Function1[/* geometry */ BufferGeometry, Unit],
      onProgress: Unit,
      onError: js.Function1[/* event */ ErrorEvent, Unit]
    ): Unit = js.native
    
    def preload(): DRACOLoader = js.native
    
    def setDecoderConfig(config: js.Object): DRACOLoader = js.native
    
    def setDecoderPath(path: String): DRACOLoader = js.native
    
    def setWorkerLimit(workerLimit: Double): DRACOLoader = js.native
  }
}
