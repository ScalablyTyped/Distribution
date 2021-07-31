package typings.three

import typings.three.anon.Closed
import typings.three.bufferGeometryMod.BufferGeometry
import typings.three.curveMod.Curve
import typings.three.vector3Mod.Vector3
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tubeBufferGeometryMod {
  
  @JSImport("three/src/geometries/TubeBufferGeometry", "TubeBufferGeometry")
  @js.native
  class TubeBufferGeometry protected () extends BufferGeometry {
    /**
    	 * @param path
    	 * @param [tubularSegments=64]
    	 * @param [radius=1]
    	 * @param [radiusSegments=8]
    	 * @param [closed=false]
    	 */
    def this(path: Curve[Vector3]) = this()
    def this(path: Curve[Vector3], tubularSegments: Double) = this()
    def this(path: Curve[Vector3], tubularSegments: Double, radius: Double) = this()
    def this(path: Curve[Vector3], tubularSegments: Unit, radius: Double) = this()
    def this(path: Curve[Vector3], tubularSegments: Double, radius: Double, radiusSegments: Double) = this()
    def this(path: Curve[Vector3], tubularSegments: Double, radius: Unit, radiusSegments: Double) = this()
    def this(path: Curve[Vector3], tubularSegments: Unit, radius: Double, radiusSegments: Double) = this()
    def this(path: Curve[Vector3], tubularSegments: Unit, radius: Unit, radiusSegments: Double) = this()
    def this(
      path: Curve[Vector3],
      tubularSegments: Double,
      radius: Double,
      radiusSegments: Double,
      closed: Boolean
    ) = this()
    def this(
      path: Curve[Vector3],
      tubularSegments: Double,
      radius: Double,
      radiusSegments: Unit,
      closed: Boolean
    ) = this()
    def this(
      path: Curve[Vector3],
      tubularSegments: Double,
      radius: Unit,
      radiusSegments: Double,
      closed: Boolean
    ) = this()
    def this(path: Curve[Vector3], tubularSegments: Double, radius: Unit, radiusSegments: Unit, closed: Boolean) = this()
    def this(
      path: Curve[Vector3],
      tubularSegments: Unit,
      radius: Double,
      radiusSegments: Double,
      closed: Boolean
    ) = this()
    def this(path: Curve[Vector3], tubularSegments: Unit, radius: Double, radiusSegments: Unit, closed: Boolean) = this()
    def this(path: Curve[Vector3], tubularSegments: Unit, radius: Unit, radiusSegments: Double, closed: Boolean) = this()
    def this(path: Curve[Vector3], tubularSegments: Unit, radius: Unit, radiusSegments: Unit, closed: Boolean) = this()
    
    var binormals: js.Array[Vector3] = js.native
    
    var normals: js.Array[Vector3] = js.native
    
    var parameters: Closed = js.native
    
    var tangents: js.Array[Vector3] = js.native
  }
}
