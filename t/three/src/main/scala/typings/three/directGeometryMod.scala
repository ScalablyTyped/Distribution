package typings.three

import typings.three.anon.MaterialIndexStart
import typings.three.box3Mod.Box3
import typings.three.colorMod.Color
import typings.three.geometryMod.Geometry
import typings.three.geometryMod.MorphTarget
import typings.three.sphereMod.Sphere
import typings.three.vector2Mod.Vector2
import typings.three.vector3Mod.Vector3
import typings.three.vector4Mod.Vector4
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("three/src/core/DirectGeometry", JSImport.Namespace)
@js.native
object directGeometryMod extends js.Object {
  
  @js.native
  class DirectGeometry () extends js.Object {
    
    /**
    	 * @default null
    	 */
    var boundingBox: Box3 | Null = js.native
    
    /**
    	 * @default null
    	 */
    var boundingSphere: Sphere | Null = js.native
    
    /**
    	 * @default []
    	 */
    var colors: js.Array[Color] = js.native
    
    /**
    	 * @default false
    	 */
    var colorsNeedUpdate: Boolean = js.native
    
    def computeBoundingBox(): Unit = js.native
    
    def computeBoundingSphere(): Unit = js.native
    
    def computeGroups(geometry: Geometry): Unit = js.native
    
    def dispose(): Unit = js.native
    
    def fromGeometry(geometry: Geometry): DirectGeometry = js.native
    
    /**
    	 * @default []
    	 */
    var groups: js.Array[MaterialIndexStart] = js.native
    
    /**
    	 * @default false
    	 */
    var groupsNeedUpdate: Boolean = js.native
    
    var id: Double = js.native
    
    /**
    	 * @default []
    	 */
    var indices: js.Array[Double] = js.native
    
    /**
    	 * @default {}
    	 */
    var morphTargets: js.Array[MorphTarget] = js.native
    
    var name: String = js.native
    
    /**
    	 * @default []
    	 */
    var normals: js.Array[Vector3] = js.native
    
    /**
    	 * @default false
    	 */
    var normalsNeedUpdate: Boolean = js.native
    
    /**
    	 * @default []
    	 */
    var skinIndices: js.Array[Vector4] = js.native
    
    /**
    	 * @default []
    	 */
    var skinWeights: js.Array[Vector4] = js.native
    
    var `type`: String = js.native
    
    var uuid: String = js.native
    
    /**
    	 * @default []
    	 */
    var uvs: js.Array[Vector2] = js.native
    
    /**
    	 * @default []
    	 */
    var uvs2: js.Array[Vector2] = js.native
    
    /**
    	 * @default false
    	 */
    var uvsNeedUpdate: Boolean = js.native
    
    /**
    	 * @default []
    	 */
    var vertices: js.Array[Vector3] = js.native
    
    /**
    	 * @default false
    	 */
    var verticesNeedUpdate: Boolean = js.native
  }
}
