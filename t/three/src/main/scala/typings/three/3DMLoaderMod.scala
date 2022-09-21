package typings.three

import typings.std.ArrayBufferLike
import typings.std.ErrorEvent
import typings.std.EventTarget
import typings.std.ProgressEvent
import typings.three.eventDispatcherMod.Event
import typings.three.threeMod.Loader
import typings.three.threeMod.LoadingManager
import typings.three.threeMod.Object3D
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object `3DMLoaderMod` {
  
  @JSImport("three/examples/jsm/loaders/3DMLoader", "Rhino3dmLoader")
  @js.native
  open class Rhino3dmLoader () extends Loader {
    def this(manager: LoadingManager) = this()
    
    def dispose(): Rhino3dmLoader = js.native
    
    def load(url: String, onLoad: js.Function1[/* object */ Object3D[Event], Unit]): Unit = js.native
    def load(
      url: String,
      onLoad: js.Function1[/* object */ Object3D[Event], Unit],
      onProgress: js.Function1[/* event */ ProgressEvent[EventTarget], Unit]
    ): Unit = js.native
    def load(
      url: String,
      onLoad: js.Function1[/* object */ Object3D[Event], Unit],
      onProgress: js.Function1[/* event */ ProgressEvent[EventTarget], Unit],
      onError: js.Function1[/* event */ ErrorEvent, Unit]
    ): Unit = js.native
    def load(
      url: String,
      onLoad: js.Function1[/* object */ Object3D[Event], Unit],
      onProgress: Unit,
      onError: js.Function1[/* event */ ErrorEvent, Unit]
    ): Unit = js.native
    
    def parse(data: ArrayBufferLike, onLoad: js.Function1[/* object */ Object3D[Event], Unit]): Unit = js.native
    def parse(
      data: ArrayBufferLike,
      onLoad: js.Function1[/* object */ Object3D[Event], Unit],
      onError: js.Function1[/* event */ ErrorEvent, Unit]
    ): Unit = js.native
    
    def setLibraryPath(path: String): Rhino3dmLoader = js.native
    
    def setWorkerLimit(workerLimit: Double): Rhino3dmLoader = js.native
  }
}
