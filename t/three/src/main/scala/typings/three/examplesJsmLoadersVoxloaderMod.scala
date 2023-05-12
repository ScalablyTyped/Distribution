package typings.three

import typings.std.ErrorEvent
import typings.std.EventTarget
import typings.std.ProgressEvent
import typings.three.anon.X
import typings.three.srcCoreBufferGeometryMod.BufferGeometry
import typings.three.srcCoreBufferGeometryMod.NormalBufferAttributes
import typings.three.srcMaterialsMaterialMod.Material
import typings.three.srcThreeMod.Data3DTexture
import typings.three.srcThreeMod.Loader
import typings.three.srcThreeMod.LoadingManager
import typings.three.srcThreeMod.Mesh
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object examplesJsmLoadersVoxloaderMod {
  
  @JSImport("three/examples/jsm/loaders/VOXLoader", "VOXData3DTexture")
  @js.native
  open class VOXData3DTexture protected () extends Data3DTexture {
    def this(chunk: Chunk) = this()
  }
  
  @JSImport("three/examples/jsm/loaders/VOXLoader", "VOXLoader")
  @js.native
  open class VOXLoader () extends Loader {
    def this(manager: LoadingManager) = this()
    
    def load(url: String, onLoad: js.Function1[/* chunks */ js.Array[Chunk], Unit]): Unit = js.native
    def load(
      url: String,
      onLoad: js.Function1[/* chunks */ js.Array[Chunk], Unit],
      onProgress: js.Function1[/* event */ ProgressEvent[EventTarget], Unit]
    ): Unit = js.native
    def load(
      url: String,
      onLoad: js.Function1[/* chunks */ js.Array[Chunk], Unit],
      onProgress: js.Function1[/* event */ ProgressEvent[EventTarget], Unit],
      onError: js.Function1[/* event */ ErrorEvent, Unit]
    ): Unit = js.native
    def load(
      url: String,
      onLoad: js.Function1[/* chunks */ js.Array[Chunk], Unit],
      onProgress: Unit,
      onError: js.Function1[/* event */ ErrorEvent, Unit]
    ): Unit = js.native
    
    def loadAsync(url: String): js.Promise[js.Array[Chunk]] = js.native
    def loadAsync(url: String, onProgress: js.Function1[/* event */ ProgressEvent[EventTarget], Unit]): js.Promise[js.Array[Chunk]] = js.native
    
    def parse(data: js.typedarray.ArrayBuffer): js.Array[js.Object] = js.native
  }
  
  @JSImport("three/examples/jsm/loaders/VOXLoader", "VOXMesh")
  @js.native
  open class VOXMesh protected ()
    extends Mesh[BufferGeometry[NormalBufferAttributes], Material | js.Array[Material]] {
    def this(chunk: Chunk) = this()
  }
  
  trait Chunk extends StObject {
    
    var data: js.typedarray.Uint8Array
    
    var palette: js.Array[Double]
    
    var size: X
  }
  object Chunk {
    
    inline def apply(data: js.typedarray.Uint8Array, palette: js.Array[Double], size: X): Chunk = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], palette = palette.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
      __obj.asInstanceOf[Chunk]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Chunk] (val x: Self) extends AnyVal {
      
      inline def setData(value: js.typedarray.Uint8Array): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setPalette(value: js.Array[Double]): Self = StObject.set(x, "palette", value.asInstanceOf[js.Any])
      
      inline def setPaletteVarargs(value: Double*): Self = StObject.set(x, "palette", js.Array(value*))
      
      inline def setSize(value: X): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    }
  }
}
