package typings.three

import typings.three.anon.Closed
import typings.three.srcCoreBufferGeometryMod.BufferGeometry
import typings.three.srcCoreBufferGeometryMod.NormalBufferAttributes
import typings.three.srcExtrasCoreCurveMod.Curve
import typings.three.srcMathVector3Mod.Vector3
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcGeometriesTubeGeometryMod {
  
  @JSImport("three/src/geometries/TubeGeometry", "TubeGeometry")
  @js.native
  /**
    * Create a new instance of {@link TubeGeometry}
    * @param path A 3D path that inherits from the {@link THREE.Curve | Curve} base class.
    *             Default {@link THREE.QuadraticBezierCurve3 | new THREE.QuadraticBezierCurve3(new Vector3(-1, -1, 0 ), new Vector3(-1, 1, 0), new Vector3(1, 1, 0))}.
    * @param tubularSegments The number of segments that make up the tube. Expects a `Integer`. Default `64`.
    * @param radius The radius of the tube. Expects a `Float`. Default `1`.
    * @param radialSegments The number of segments that make up the cross-section. Expects a `Integer`. Default `8`.
    * @param closed Is the tube open or closed. Default `false`.
    */
  open class TubeGeometry () extends BufferGeometry[NormalBufferAttributes] {
    def this(path: Curve[Vector3]) = this()
    def this(path: Unit, tubularSegments: Double) = this()
    def this(path: Curve[Vector3], tubularSegments: Double) = this()
    def this(path: Unit, tubularSegments: Double, radius: Double) = this()
    def this(path: Unit, tubularSegments: Unit, radius: Double) = this()
    def this(path: Curve[Vector3], tubularSegments: Double, radius: Double) = this()
    def this(path: Curve[Vector3], tubularSegments: Unit, radius: Double) = this()
    def this(path: Unit, tubularSegments: Double, radius: Double, radialSegments: Double) = this()
    def this(path: Unit, tubularSegments: Double, radius: Unit, radialSegments: Double) = this()
    def this(path: Unit, tubularSegments: Unit, radius: Double, radialSegments: Double) = this()
    def this(path: Unit, tubularSegments: Unit, radius: Unit, radialSegments: Double) = this()
    def this(path: Curve[Vector3], tubularSegments: Double, radius: Double, radialSegments: Double) = this()
    def this(path: Curve[Vector3], tubularSegments: Double, radius: Unit, radialSegments: Double) = this()
    def this(path: Curve[Vector3], tubularSegments: Unit, radius: Double, radialSegments: Double) = this()
    def this(path: Curve[Vector3], tubularSegments: Unit, radius: Unit, radialSegments: Double) = this()
    def this(path: Unit, tubularSegments: Double, radius: Double, radialSegments: Double, closed: Boolean) = this()
    def this(path: Unit, tubularSegments: Double, radius: Double, radialSegments: Unit, closed: Boolean) = this()
    def this(path: Unit, tubularSegments: Double, radius: Unit, radialSegments: Double, closed: Boolean) = this()
    def this(path: Unit, tubularSegments: Double, radius: Unit, radialSegments: Unit, closed: Boolean) = this()
    def this(path: Unit, tubularSegments: Unit, radius: Double, radialSegments: Double, closed: Boolean) = this()
    def this(path: Unit, tubularSegments: Unit, radius: Double, radialSegments: Unit, closed: Boolean) = this()
    def this(path: Unit, tubularSegments: Unit, radius: Unit, radialSegments: Double, closed: Boolean) = this()
    def this(path: Unit, tubularSegments: Unit, radius: Unit, radialSegments: Unit, closed: Boolean) = this()
    def this(
      path: Curve[Vector3],
      tubularSegments: Double,
      radius: Double,
      radialSegments: Double,
      closed: Boolean
    ) = this()
    def this(
      path: Curve[Vector3],
      tubularSegments: Double,
      radius: Double,
      radialSegments: Unit,
      closed: Boolean
    ) = this()
    def this(
      path: Curve[Vector3],
      tubularSegments: Double,
      radius: Unit,
      radialSegments: Double,
      closed: Boolean
    ) = this()
    def this(path: Curve[Vector3], tubularSegments: Double, radius: Unit, radialSegments: Unit, closed: Boolean) = this()
    def this(
      path: Curve[Vector3],
      tubularSegments: Unit,
      radius: Double,
      radialSegments: Double,
      closed: Boolean
    ) = this()
    def this(path: Curve[Vector3], tubularSegments: Unit, radius: Double, radialSegments: Unit, closed: Boolean) = this()
    def this(path: Curve[Vector3], tubularSegments: Unit, radius: Unit, radialSegments: Double, closed: Boolean) = this()
    def this(path: Curve[Vector3], tubularSegments: Unit, radius: Unit, radialSegments: Unit, closed: Boolean) = this()
    
    /**
      * An array of {@link THREE.Vector3 | Vector3} binormals
      */
    var binormals: js.Array[Vector3] = js.native
    
    /**
      * An array of {@link THREE.Vector3 | Vector3} normals
      */
    var normals: js.Array[Vector3] = js.native
    
    /**
      * An object with a property for each of the constructor parameters.
      * @remarks Any modification after instantiation does not change the geometry.
      */
    val parameters: Closed = js.native
    
    /**
      * An array of {@link THREE.Vector3 | Vector3} tangents
      */
    var tangents: js.Array[Vector3] = js.native
    
    /**
      * A Read-only _string_ to check if `this` object type.
      * @remarks Sub-classes will update this value.
      * @defaultValue `TubeGeometry`
      */
    @JSName("type")
    val type_TubeGeometry: String | typings.three.threeStrings.TubeGeometry = js.native
  }
  /* static members */
  object TubeGeometry {
    
    @JSImport("three/src/geometries/TubeGeometry", "TubeGeometry")
    @js.native
    val ^ : js.Any = js.native
    
    /** @internal */
    inline def fromJSON(data: js.Object): TubeGeometry = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(data.asInstanceOf[js.Any]).asInstanceOf[TubeGeometry]
  }
}
