package typings.three

import typings.std.ErrorEvent
import typings.std.EventTarget
import typings.std.ProgressEvent
import typings.three.srcCoreBufferGeometryMod.BufferGeometry
import typings.three.srcCoreBufferGeometryMod.NormalBufferAttributes
import typings.three.srcCoreInstancedBufferGeometryMod.InstancedBufferGeometry
import typings.three.srcLoadersLoaderMod.Loader
import typings.three.srcLoadersLoadingManagerMod.LoadingManager
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcLoadersBufferGeometryLoaderMod {
  
  @JSImport("three/src/loaders/BufferGeometryLoader", "BufferGeometryLoader")
  @js.native
  open class BufferGeometryLoader () extends Loader {
    def this(manager: LoadingManager) = this()
    
    def load(
      url: String,
      onLoad: js.Function1[
          /* bufferGeometry */ InstancedBufferGeometry | BufferGeometry[NormalBufferAttributes], 
          Unit
        ]
    ): Unit = js.native
    def load(
      url: String,
      onLoad: js.Function1[
          /* bufferGeometry */ InstancedBufferGeometry | BufferGeometry[NormalBufferAttributes], 
          Unit
        ],
      onProgress: js.Function1[/* request */ ProgressEvent[EventTarget], Unit]
    ): Unit = js.native
    def load(
      url: String,
      onLoad: js.Function1[
          /* bufferGeometry */ InstancedBufferGeometry | BufferGeometry[NormalBufferAttributes], 
          Unit
        ],
      onProgress: js.Function1[/* request */ ProgressEvent[EventTarget], Unit],
      onError: js.Function1[/* event */ ErrorEvent, Unit]
    ): Unit = js.native
    def load(
      url: String,
      onLoad: js.Function1[
          /* bufferGeometry */ InstancedBufferGeometry | BufferGeometry[NormalBufferAttributes], 
          Unit
        ],
      onProgress: Unit,
      onError: js.Function1[/* event */ ErrorEvent, Unit]
    ): Unit = js.native
    
    def loadAsync(url: String): js.Promise[InstancedBufferGeometry | BufferGeometry[NormalBufferAttributes]] = js.native
    def loadAsync(url: String, onProgress: js.Function1[/* event */ ProgressEvent[EventTarget], Unit]): js.Promise[InstancedBufferGeometry | BufferGeometry[NormalBufferAttributes]] = js.native
    
    def parse(json: Any): InstancedBufferGeometry | BufferGeometry[NormalBufferAttributes] = js.native
  }
}
