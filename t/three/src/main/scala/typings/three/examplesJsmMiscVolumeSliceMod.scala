package typings.three

import typings.std.CanvasRenderingContext2D
import typings.std.HTMLCanvasElement
import typings.three.examplesJsmMiscVolumeMod.Volume
import typings.three.srcCoreBufferGeometryMod.BufferGeometry
import typings.three.srcCoreBufferGeometryMod.NormalBufferAttributes
import typings.three.srcMaterialsMaterialMod.Material
import typings.three.srcThreeMod.Matrix3
import typings.three.srcThreeMod.Mesh
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object examplesJsmMiscVolumeSliceMod {
  
  @JSImport("three/examples/jsm/misc/VolumeSlice", "VolumeSlice")
  @js.native
  open class VolumeSlice protected () extends StObject {
    def this(volume: Volume) = this()
    def this(volume: Volume, index: Double) = this()
    def this(volume: Volume, index: Double, axis: String) = this()
    def this(volume: Volume, index: Unit, axis: String) = this()
    
    var axis: String = js.native
    
    var canvas: HTMLCanvasElement = js.native
    
    var canvasBuffer: HTMLCanvasElement = js.native
    
    var ctx: CanvasRenderingContext2D = js.native
    
    var ctxBuffer: CanvasRenderingContext2D = js.native
    
    var geometryNeedsUpdate: Boolean = js.native
    
    var iLength: Double = js.native
    
    var index: Double = js.native
    
    var jLength: Double = js.native
    
    var matrix: Matrix3 = js.native
    
    var mesh: Mesh[BufferGeometry[NormalBufferAttributes], Material | js.Array[Material]] = js.native
    
    def repaint(): Unit = js.native
    
    var sliceAccess: Double = js.native
    
    def updateGeometry(): Unit = js.native
  }
}
