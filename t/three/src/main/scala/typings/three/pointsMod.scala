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
  class Points[TGeometry /* <: Geometry | BufferGeometry */, TMaterial /* <: Material | js.Array[Material] */] () extends Object3D {
    def this(geometry: TGeometry) = this()
    def this(geometry: TGeometry, material: TMaterial) = this()
    def this(geometry: js.UndefOr[scala.Nothing], material: TMaterial) = this()
    /**
    	 * An instance of Geometry or BufferGeometry, where each vertex designates the position of a particle in the system.
    	 */
    var geometry: TGeometry = js.native
    val isPoints: `true` = js.native
    /**
    	 * An instance of Material, defining the object's appearance. Default is a PointsMaterial with randomised colour.
    	 */
    var material: TMaterial = js.native
    var morphTargetDictionary: js.UndefOr[StringDictionary[Double]] = js.native
    var morphTargetInfluences: js.UndefOr[js.Array[Double]] = js.native
    @JSName("type")
    var type_Points: typings.three.threeStrings.Points = js.native
    def updateMorphTargets(): Unit = js.native
  }
  
}

