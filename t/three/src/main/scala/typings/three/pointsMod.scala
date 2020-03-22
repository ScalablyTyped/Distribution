package typings.three

import org.scalablytyped.runtime.StringDictionary
import typings.three.bufferGeometryMod.BufferGeometry
import typings.three.geometryMod.Geometry
import typings.three.materialMod.Material
import typings.three.object3DMod.Object3D
import typings.three.threeBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/src/objects/Points", JSImport.Namespace)
@js.native
object pointsMod extends js.Object {
  @js.native
  /**
  	 * @param geometry An instance of Geometry or BufferGeometry.
  	 * @param material An instance of Material (optional).
  	 */
  class Points () extends Object3D {
    def this(geometry: BufferGeometry) = this()
    def this(geometry: Geometry) = this()
    def this(geometry: BufferGeometry, material: js.Array[Material]) = this()
    def this(geometry: BufferGeometry, material: Material) = this()
    def this(geometry: Geometry, material: js.Array[Material]) = this()
    def this(geometry: Geometry, material: Material) = this()
    /**
    	 * An instance of Geometry or BufferGeometry, where each vertex designates the position of a particle in the system.
    	 */
    var geometry: Geometry | BufferGeometry = js.native
    val isPoints: `true` = js.native
    /**
    	 * An instance of Material, defining the object's appearance. Default is a PointsMaterial with randomised colour.
    	 */
    var material: Material | js.Array[Material] = js.native
    var morphTargetDictionary: js.UndefOr[StringDictionary[Double]] = js.native
    var morphTargetInfluences: js.UndefOr[js.Array[Double]] = js.native
    @JSName("type")
    var type_Points: typings.three.threeStrings.Points = js.native
    def updateMorphTargets(): Unit = js.native
  }
  
}

