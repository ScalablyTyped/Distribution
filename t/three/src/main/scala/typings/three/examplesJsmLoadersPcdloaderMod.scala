package typings.three

import typings.std.ErrorEvent
import typings.std.EventTarget
import typings.std.ProgressEvent
import typings.three.srcCoreBufferGeometryMod.BufferGeometry
import typings.three.srcCoreBufferGeometryMod.NormalBufferAttributes
import typings.three.srcMaterialsMaterialMod.Material
import typings.three.srcThreeMod.Loader
import typings.three.srcThreeMod.LoadingManager
import typings.three.srcThreeMod.Points
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object examplesJsmLoadersPcdloaderMod {
  
  @JSImport("three/examples/jsm/loaders/PCDLoader", "PCDLoader")
  @js.native
  open class PCDLoader () extends Loader {
    def this(manager: LoadingManager) = this()
    
    var littleEndian: Boolean = js.native
    
    def load(
      url: String,
      onLoad: js.Function1[
          /* points */ Points[BufferGeometry[NormalBufferAttributes], Material | js.Array[Material]], 
          Unit
        ]
    ): Unit = js.native
    def load(
      url: String,
      onLoad: js.Function1[
          /* points */ Points[BufferGeometry[NormalBufferAttributes], Material | js.Array[Material]], 
          Unit
        ],
      onProgress: js.Function1[/* event */ ProgressEvent[EventTarget], Unit]
    ): Unit = js.native
    def load(
      url: String,
      onLoad: js.Function1[
          /* points */ Points[BufferGeometry[NormalBufferAttributes], Material | js.Array[Material]], 
          Unit
        ],
      onProgress: js.Function1[/* event */ ProgressEvent[EventTarget], Unit],
      onError: js.Function1[/* event */ ErrorEvent, Unit]
    ): Unit = js.native
    def load(
      url: String,
      onLoad: js.Function1[
          /* points */ Points[BufferGeometry[NormalBufferAttributes], Material | js.Array[Material]], 
          Unit
        ],
      onProgress: Unit,
      onError: js.Function1[/* event */ ErrorEvent, Unit]
    ): Unit = js.native
    
    def loadAsync(url: String): js.Promise[Points[BufferGeometry[NormalBufferAttributes], Material | js.Array[Material]]] = js.native
    def loadAsync(url: String, onProgress: js.Function1[/* event */ ProgressEvent[EventTarget], Unit]): js.Promise[Points[BufferGeometry[NormalBufferAttributes], Material | js.Array[Material]]] = js.native
    
    def parse(data: String): Points[BufferGeometry[NormalBufferAttributes], Material | js.Array[Material]] = js.native
    def parse(data: js.typedarray.ArrayBuffer): Points[BufferGeometry[NormalBufferAttributes], Material | js.Array[Material]] = js.native
  }
}
