package typings.three

import typings.std.ErrorEvent
import typings.std.EventTarget
import typings.std.ProgressEvent
import typings.three.bufferGeometryMod.BufferGeometry
import typings.three.instancedBufferGeometryMod.InstancedBufferGeometry
import typings.three.loaderMod.Loader
import typings.three.loadingManagerMod.LoadingManager
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("three/src/loaders/BufferGeometryLoader", JSImport.Namespace)
@js.native
object bufferGeometryLoaderMod extends js.Object {
  
  @js.native
  class BufferGeometryLoader () extends Loader {
    def this(manager: LoadingManager) = this()
    
    def load(
      url: String,
      onLoad: js.Function1[/* bufferGeometry */ InstancedBufferGeometry | BufferGeometry, Unit]
    ): Unit = js.native
    def load(
      url: String,
      onLoad: js.Function1[/* bufferGeometry */ InstancedBufferGeometry | BufferGeometry, Unit],
      onProgress: js.UndefOr[scala.Nothing],
      onError: js.Function1[/* event */ ErrorEvent, Unit]
    ): Unit = js.native
    def load(
      url: String,
      onLoad: js.Function1[/* bufferGeometry */ InstancedBufferGeometry | BufferGeometry, Unit],
      onProgress: js.Function1[/* request */ ProgressEvent[EventTarget], Unit]
    ): Unit = js.native
    def load(
      url: String,
      onLoad: js.Function1[/* bufferGeometry */ InstancedBufferGeometry | BufferGeometry, Unit],
      onProgress: js.Function1[/* request */ ProgressEvent[EventTarget], Unit],
      onError: js.Function1[/* event */ ErrorEvent, Unit]
    ): Unit = js.native
    
    def parse(json: js.Any): InstancedBufferGeometry | BufferGeometry = js.native
  }
}
