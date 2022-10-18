package typings.three

import typings.std.ErrorEvent
import typings.std.EventTarget
import typings.std.ProgressEvent
import typings.three.srcCoreBufferGeometryMod.BufferGeometry
import typings.three.srcThreeMod.Color
import typings.three.srcThreeMod.Group
import typings.three.srcThreeMod.Loader
import typings.three.srcThreeMod.LoadingManager
import typings.three.srcThreeMod.Material
import typings.three.srcThreeMod.Mesh
import typings.three.srcThreeMod.Texture
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object examplesJsmLoadersTdsloaderMod {
  
  @JSImport("three/examples/jsm/loaders/TDSLoader", "TDSLoader")
  @js.native
  open class TDSLoader () extends Loader {
    def this(manager: LoadingManager) = this()
    
    var debug: Boolean = js.native
    
    def debugMessage(message: js.Object): Unit = js.native
    
    def endChunk(chunk: js.Object): Unit = js.native
    
    var group: Group = js.native
    
    def load(url: String, onLoad: js.Function1[/* object */ Group, Unit]): Unit = js.native
    def load(
      url: String,
      onLoad: js.Function1[/* object */ Group, Unit],
      onProgress: js.Function1[/* event */ ProgressEvent[EventTarget], Unit]
    ): Unit = js.native
    def load(
      url: String,
      onLoad: js.Function1[/* object */ Group, Unit],
      onProgress: js.Function1[/* event */ ProgressEvent[EventTarget], Unit],
      onError: js.Function1[/* event */ ErrorEvent, Unit]
    ): Unit = js.native
    def load(
      url: String,
      onLoad: js.Function1[/* object */ Group, Unit],
      onProgress: Unit,
      onError: js.Function1[/* event */ ErrorEvent, Unit]
    ): Unit = js.native
    
    @JSName("manager")
    var manager_TDSLoader: LoadingManager = js.native
    
    var materials: js.Array[Material] = js.native
    
    var meshes: js.Array[
        Mesh[
          BufferGeometry, 
          typings.three.srcMaterialsMaterialMod.Material | js.Array[typings.three.srcMaterialsMaterialMod.Material]
        ]
      ] = js.native
    
    def nextChunk(data: js.typedarray.DataView, chunk: js.Object): Unit = js.native
    
    def parse(arraybuffer: js.typedarray.ArrayBuffer, path: String): Group = js.native
    
    var position: Double = js.native
    
    def readByte(data: js.typedarray.DataView): Double = js.native
    
    def readChunk(data: js.typedarray.DataView): js.Object = js.native
    
    def readColor(data: js.typedarray.DataView): Color = js.native
    
    def readDWord(data: js.typedarray.DataView): Double = js.native
    
    def readFaceArray(
      data: js.typedarray.DataView,
      mesh: Mesh[
          BufferGeometry, 
          typings.three.srcMaterialsMaterialMod.Material | js.Array[typings.three.srcMaterialsMaterialMod.Material]
        ]
    ): Unit = js.native
    
    def readFile(arraybuffer: js.typedarray.ArrayBuffer, path: String): Unit = js.native
    
    def readFloat(data: js.typedarray.DataView): Double = js.native
    
    def readInt(data: js.typedarray.DataView): Double = js.native
    
    def readMap(data: js.typedarray.DataView, path: String): Texture = js.native
    
    def readMaterialEntry(data: js.typedarray.DataView, path: String): Unit = js.native
    
    def readMaterialGroup(data: js.typedarray.DataView): js.Object = js.native
    
    def readMesh(data: js.typedarray.DataView): Mesh[
        BufferGeometry, 
        typings.three.srcMaterialsMaterialMod.Material | js.Array[typings.three.srcMaterialsMaterialMod.Material]
      ] = js.native
    
    def readMeshData(data: js.typedarray.DataView, path: String): Unit = js.native
    
    def readNamedObject(data: js.typedarray.DataView): Unit = js.native
    
    def readShort(data: js.typedarray.DataView): Double = js.native
    
    def readString(data: js.typedarray.DataView, maxLength: Double): String = js.native
    
    def readWord(data: js.typedarray.DataView): Double = js.native
    
    def resetPosition(): Unit = js.native
  }
}
