package typings.three

import typings.three.colorMod.Color
import typings.three.vector3Mod.Vector3
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("three/src/core/Face3", JSImport.Namespace)
@js.native
object face3Mod extends js.Object {
  
  @js.native
  class Face3 protected () extends js.Object {
    /**
    	 * @param a Vertex A index.
    	 * @param b Vertex B index.
    	 * @param c Vertex C index.
    	 * @param normal Face normal or array of vertex normals.
    	 * @param color Face color or array of vertex colors.
    	 * @param materialIndex Material index.
    	 */
    def this(a: Double, b: Double, c: Double) = this()
    def this(a: Double, b: Double, c: Double, normal: Vector3) = this()
    def this(a: Double, b: Double, c: Double, vertexNormals: js.Array[Vector3]) = this()
    def this(a: Double, b: Double, c: Double, normal: js.UndefOr[scala.Nothing], color: Color) = this()
    def this(a: Double, b: Double, c: Double, normal: js.UndefOr[scala.Nothing], vertexColors: js.Array[Color]) = this()
    def this(a: Double, b: Double, c: Double, normal: Vector3, color: Color) = this()
    def this(a: Double, b: Double, c: Double, normal: Vector3, vertexColors: js.Array[Color]) = this()
    def this(a: Double, b: Double, c: Double, vertexNormals: js.Array[Vector3], color: Color) = this()
    def this(a: Double, b: Double, c: Double, vertexNormals: js.Array[Vector3], vertexColors: js.Array[Color]) = this()
    def this(
      a: Double,
      b: Double,
      c: Double,
      normal: js.UndefOr[scala.Nothing],
      color: js.UndefOr[scala.Nothing],
      materialIndex: Double
    ) = this()
    def this(
      a: Double,
      b: Double,
      c: Double,
      normal: js.UndefOr[scala.Nothing],
      color: Color,
      materialIndex: Double
    ) = this()
    def this(
      a: Double,
      b: Double,
      c: Double,
      normal: js.UndefOr[scala.Nothing],
      vertexColors: js.Array[Color],
      materialIndex: Double
    ) = this()
    def this(
      a: Double,
      b: Double,
      c: Double,
      normal: Vector3,
      color: js.UndefOr[scala.Nothing],
      materialIndex: Double
    ) = this()
    def this(a: Double, b: Double, c: Double, normal: Vector3, color: Color, materialIndex: Double) = this()
    def this(
      a: Double,
      b: Double,
      c: Double,
      normal: Vector3,
      vertexColors: js.Array[Color],
      materialIndex: Double
    ) = this()
    def this(
      a: Double,
      b: Double,
      c: Double,
      vertexNormals: js.Array[Vector3],
      color: js.UndefOr[scala.Nothing],
      materialIndex: Double
    ) = this()
    def this(
      a: Double,
      b: Double,
      c: Double,
      vertexNormals: js.Array[Vector3],
      color: Color,
      materialIndex: Double
    ) = this()
    def this(
      a: Double,
      b: Double,
      c: Double,
      vertexNormals: js.Array[Vector3],
      vertexColors: js.Array[Color],
      materialIndex: Double
    ) = this()
    
    /**
    	 * Vertex A index.
    	 */
    var a: Double = js.native
    
    /**
    	 * Vertex B index.
    	 */
    var b: Double = js.native
    
    /**
    	 * Vertex C index.
    	 */
    var c: Double = js.native
    
    /**
    	 * Face color.
    	 * @default new THREE.Color()
    	 */
    var color: Color = js.native
    
    def copy(source: Face3): this.type = js.native
    
    /**
    	 * Material index (points to {@link Mesh.material}).
    	 * @default 0
    	 */
    var materialIndex: Double = js.native
    
    /**
    	 * Face normal.
    	 * @default new THREE.Vector3()
    	 */
    var normal: Vector3 = js.native
    
    /**
    	 * Array of 3 vertex colors.
    	 * @default []
    	 */
    var vertexColors: js.Array[Color] = js.native
    
    /**
    	 * Array of 3 vertex normals.
    	 * @default []
    	 */
    var vertexNormals: js.Array[Vector3] = js.native
  }
}
