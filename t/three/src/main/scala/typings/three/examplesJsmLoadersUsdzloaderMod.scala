package typings.three

import typings.std.ErrorEvent
import typings.std.EventTarget
import typings.std.ProgressEvent
import typings.three.mod.Group
import typings.three.srcCoreBufferGeometryMod.BufferGeometry
import typings.three.srcMaterialsMaterialMod.Material
import typings.three.srcThreeMod.Loader
import typings.three.srcThreeMod.LoadingManager
import typings.three.srcThreeMod.Mesh
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object examplesJsmLoadersUsdzloaderMod {
  
  @JSImport("three/examples/jsm/loaders/USDZLoader", "USDAParser")
  @js.native
  open class USDAParser () extends StObject {
    
    def parse(text: String): js.Object = js.native
  }
  
  @JSImport("three/examples/jsm/loaders/USDZLoader", "USDZLoader")
  @js.native
  open class USDZLoader () extends Loader {
    def this(manager: LoadingManager) = this()
    
    def load(
      url: String,
      onLoad: js.Function1[/* usdz */ Mesh[BufferGeometry, Material | js.Array[Material]], Unit]
    ): Unit = js.native
    def load(
      url: String,
      onLoad: js.Function1[/* usdz */ Mesh[BufferGeometry, Material | js.Array[Material]], Unit],
      onProgress: js.Function1[/* event */ ProgressEvent[EventTarget], Unit]
    ): Unit = js.native
    def load(
      url: String,
      onLoad: js.Function1[/* usdz */ Mesh[BufferGeometry, Material | js.Array[Material]], Unit],
      onProgress: js.Function1[/* event */ ProgressEvent[EventTarget], Unit],
      onError: js.Function1[/* event */ ErrorEvent, Unit]
    ): Unit = js.native
    def load(
      url: String,
      onLoad: js.Function1[/* usdz */ Mesh[BufferGeometry, Material | js.Array[Material]], Unit],
      onProgress: Unit,
      onError: js.Function1[/* event */ ErrorEvent, Unit]
    ): Unit = js.native
    
    def parse(buffer: String): Group = js.native
    def parse(buffer: js.typedarray.ArrayBuffer): Group = js.native
  }
}
