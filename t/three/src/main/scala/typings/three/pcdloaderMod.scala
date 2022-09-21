package typings.three

import typings.std.ErrorEvent
import typings.std.EventTarget
import typings.std.ProgressEvent
import typings.three.bufferGeometryMod.BufferGeometry
import typings.three.materialMod.Material
import typings.three.threeMod.Loader
import typings.three.threeMod.LoadingManager
import typings.three.threeMod.Points
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pcdloaderMod {
  
  @JSImport("three/examples/jsm/loaders/PCDLoader", "PCDLoader")
  @js.native
  open class PCDLoader () extends Loader {
    def this(manager: LoadingManager) = this()
    
    var littleEndian: Boolean = js.native
    
    def load(
      url: String,
      onLoad: js.Function1[/* points */ Points[BufferGeometry, Material | js.Array[Material]], Unit]
    ): Unit = js.native
    def load(
      url: String,
      onLoad: js.Function1[/* points */ Points[BufferGeometry, Material | js.Array[Material]], Unit],
      onProgress: js.Function1[/* event */ ProgressEvent[EventTarget], Unit]
    ): Unit = js.native
    def load(
      url: String,
      onLoad: js.Function1[/* points */ Points[BufferGeometry, Material | js.Array[Material]], Unit],
      onProgress: js.Function1[/* event */ ProgressEvent[EventTarget], Unit],
      onError: js.Function1[/* event */ ErrorEvent, Unit]
    ): Unit = js.native
    def load(
      url: String,
      onLoad: js.Function1[/* points */ Points[BufferGeometry, Material | js.Array[Material]], Unit],
      onProgress: Unit,
      onError: js.Function1[/* event */ ErrorEvent, Unit]
    ): Unit = js.native
    
    def parse(data: String, url: String): Points[BufferGeometry, Material | js.Array[Material]] = js.native
    def parse(data: js.typedarray.ArrayBuffer, url: String): Points[BufferGeometry, Material | js.Array[Material]] = js.native
  }
}
