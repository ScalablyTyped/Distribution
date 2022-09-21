package typings.three

import typings.three.bufferGeometryMod.BufferGeometry
import typings.three.materialMod.Material
import typings.three.threeMod.Color
import typings.three.threeMod.Mesh
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object marchingCubesMod {
  
  @JSImport("three/examples/jsm/objects/MarchingCubes", "MarchingCubes")
  @js.native
  open class MarchingCubes protected ()
    extends Mesh[BufferGeometry, Material | js.Array[Material]] {
    def this(resolution: Double, material: typings.three.threeMod.Material) = this()
    def this(resolution: Double, material: typings.three.threeMod.Material, enableUvs: Boolean) = this()
    def this(
      resolution: Double,
      material: typings.three.threeMod.Material,
      enableUvs: Boolean,
      enableColors: Boolean
    ) = this()
    def this(
      resolution: Double,
      material: typings.three.threeMod.Material,
      enableUvs: Unit,
      enableColors: Boolean
    ) = this()
    def this(
      resolution: Double,
      material: typings.three.threeMod.Material,
      enableUvs: Boolean,
      enableColors: Boolean,
      maxPolyCount: Double
    ) = this()
    def this(
      resolution: Double,
      material: typings.three.threeMod.Material,
      enableUvs: Boolean,
      enableColors: Unit,
      maxPolyCount: Double
    ) = this()
    def this(
      resolution: Double,
      material: typings.three.threeMod.Material,
      enableUvs: Unit,
      enableColors: Boolean,
      maxPolyCount: Double
    ) = this()
    def this(
      resolution: Double,
      material: typings.three.threeMod.Material,
      enableUvs: Unit,
      enableColors: Unit,
      maxPolyCount: Double
    ) = this()
    
    def addBall(ballx: Double, bally: Double, ballz: Double, strength: Double, subtract: Double): Unit = js.native
    def addBall(ballx: Double, bally: Double, ballz: Double, strength: Double, subtract: Double, colors: Color): Unit = js.native
    
    def addPlaneX(strength: Double, subtract: Double): Unit = js.native
    
    def addPlaneY(strength: Double, subtract: Double): Unit = js.native
    
    def addPlaneZ(strength: Double, subtract: Double): Unit = js.native
    
    def begin(): Unit = js.native
    
    def blur(intensity: Double): Unit = js.native
    
    var colorArray: js.typedarray.Float32Array = js.native
    
    var count: Double = js.native
    
    // deltas
    var delta: Double = js.native
    
    var enableColors: Boolean = js.native
    
    var enableUvs: Boolean = js.native
    
    def end(): Unit = js.native
    
    var field: js.typedarray.Float32Array = js.native
    
    def generateBufferGeometry(): typings.three.threeMod.BufferGeometry = js.native
    
    def generateGeometry(): typings.three.threeMod.BufferGeometry = js.native
    
    def getCell(x: Double, y: Double, z: Double): Double = js.native
    
    var halfsize: Double = js.native
    
    var hasColors: Boolean = js.native
    
    var hasNormals: Boolean = js.native
    
    var hasPositions: Boolean = js.native
    
    var hasUvs: Boolean = js.native
    
    def init(resolution: Double): Unit = js.native
    
    // parameters
    var isolation: Double = js.native
    
    var maxCount: Double = js.native
    
    var normalArray: js.typedarray.Float32Array = js.native
    
    var normal_cache: js.typedarray.Float32Array = js.native
    
    var palette: js.typedarray.Float32Array = js.native
    
    var positionArray: js.typedarray.Float32Array = js.native
    
    def render(renderCallback: Any): Unit = js.native
    
    def reset(): Unit = js.native
    
    var resolution: Double = js.native
    
    def setCell(x: Double, y: Double, z: Double, value: Double): Unit = js.native
    
    // size of field, 32 is pushing it in Javascript :)
    var size: Double = js.native
    
    var size2: Double = js.native
    
    var size3: Double = js.native
    
    var uvArray: js.typedarray.Float32Array = js.native
    
    var yd: Double = js.native
    
    var zd: Double = js.native
  }
  
  @JSImport("three/examples/jsm/objects/MarchingCubes", "edgeTable")
  @js.native
  val edgeTable: js.Array[js.typedarray.Int32Array] = js.native
  
  @JSImport("three/examples/jsm/objects/MarchingCubes", "triTable")
  @js.native
  val triTable: js.Array[js.typedarray.Int32Array] = js.native
}
