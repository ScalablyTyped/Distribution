package typings.three

import typings.three.srcCoreBufferGeometryMod.BufferGeometry
import typings.three.srcCoreBufferGeometryMod.NormalBufferAttributes
import typings.three.srcExtrasCoreCurveMod.Curve
import typings.three.srcExtrasCoreShapeMod.Shape
import typings.three.srcGeometriesExtrudeGeometryMod.ExtrudeGeometryOptions
import typings.three.srcMathVector2Mod.Vector2
import typings.three.srcMathVector3Mod.Vector3
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcGeometriesGeometriesMod {
  
  @JSImport("three/src/geometries/Geometries", "BoxGeometry")
  @js.native
  open class BoxGeometry protected ()
    extends typings.three.srcGeometriesBoxGeometryMod.BoxGeometry {
    /**
      * Create a new instance of {@link BoxGeometry}
      * @param width Width; that is, the length of the edges parallel to the X axis. Optional; Expects a `Float`. Default `1`
      * @param height Height; that is, the length of the edges parallel to the Y axis. Optional; Expects a `Float`. Default `1`
      * @param depth Depth; that is, the length of the edges parallel to the Z axis. Optional; Expects a `Float`. Default `1`
      * @param widthSegments Number of segmented rectangular faces along the width of the sides. Optional; Expects a `Integer`. Default `1`
      * @param heightSegments Number of segmented rectangular faces along the height of the sides. Optional; Expects a `Integer`. Default `1`
      * @param depthSegments Number of segmented rectangular faces along the depth of the sides. Optional; Expects a `Integer`. Default `1`
      */
    def this(
      width: js.UndefOr[Double],
      height: js.UndefOr[Double],
      depth: js.UndefOr[Double],
      widthSegments: js.UndefOr[Double],
      heightSegments: js.UndefOr[Double],
      depthSegments: js.UndefOr[Double]
    ) = this()
  }
  /* static members */
  object BoxGeometry {
    
    @JSImport("three/src/geometries/Geometries", "BoxGeometry")
    @js.native
    val ^ : js.Any = js.native
    
    /** @internal */
    inline def fromJSON(data: js.Object): typings.three.srcGeometriesBoxGeometryMod.BoxGeometry = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(data.asInstanceOf[js.Any]).asInstanceOf[typings.three.srcGeometriesBoxGeometryMod.BoxGeometry]
  }
  
  @JSImport("three/src/geometries/Geometries", "CapsuleGeometry")
  @js.native
  /**
    * Create a new instance of {@link CapsuleGeometry}
    * @param radius Radius of the capsule. Expects a `Float`. Default `1`
    * @param length Length of the middle section. Expects a `Float`. Default `1`
    * @param capSubdivisions Number of curve segments used to build the caps. Expects a `Integer`. Default `4`
    * @param radialSegments Number of segmented faces around the circumference of the capsule. Expects a `Integer`. Default `8`
    */
  open class CapsuleGeometry ()
    extends typings.three.srcGeometriesCapsuleGeometryMod.CapsuleGeometry {
    def this(radius: Double) = this()
    def this(radius: Double, length: Double) = this()
    def this(radius: Unit, length: Double) = this()
    def this(radius: Double, length: Double, capSegments: Double) = this()
    def this(radius: Double, length: Unit, capSegments: Double) = this()
    def this(radius: Unit, length: Double, capSegments: Double) = this()
    def this(radius: Unit, length: Unit, capSegments: Double) = this()
    def this(radius: Double, length: Double, capSegments: Double, radialSegments: Double) = this()
    def this(radius: Double, length: Double, capSegments: Unit, radialSegments: Double) = this()
    def this(radius: Double, length: Unit, capSegments: Double, radialSegments: Double) = this()
    def this(radius: Double, length: Unit, capSegments: Unit, radialSegments: Double) = this()
    def this(radius: Unit, length: Double, capSegments: Double, radialSegments: Double) = this()
    def this(radius: Unit, length: Double, capSegments: Unit, radialSegments: Double) = this()
    def this(radius: Unit, length: Unit, capSegments: Double, radialSegments: Double) = this()
    def this(radius: Unit, length: Unit, capSegments: Unit, radialSegments: Double) = this()
  }
  /* static members */
  object CapsuleGeometry {
    
    @JSImport("three/src/geometries/Geometries", "CapsuleGeometry")
    @js.native
    val ^ : js.Any = js.native
    
    /** @internal */
    inline def fromJSON(data: js.Object): typings.three.srcGeometriesCapsuleGeometryMod.CapsuleGeometry = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(data.asInstanceOf[js.Any]).asInstanceOf[typings.three.srcGeometriesCapsuleGeometryMod.CapsuleGeometry]
  }
  
  @JSImport("three/src/geometries/Geometries", "CircleGeometry")
  @js.native
  /**
    * Create a new instance of {@link CircleGeometry}
    * @param radius Radius of the circle. Expects a `Float`. Default `1`
    * @param segments Number of segments (triangles). Expects a `Integer`. Minimum `3`. Default `32`
    * @param thetaStart Start angle for first segment. Expects a `Float`. Default `0`, _(three o'clock position)_.
    * @param thetaLength The central angle, often called theta, of the circular sector. Expects a `Float`. Default `Math.PI * 2`, _which makes for a complete circle_.
    */
  open class CircleGeometry ()
    extends typings.three.srcGeometriesCircleGeometryMod.CircleGeometry {
    def this(radius: Double) = this()
    def this(radius: Double, segments: Double) = this()
    def this(radius: Unit, segments: Double) = this()
    def this(radius: Double, segments: Double, thetaStart: Double) = this()
    def this(radius: Double, segments: Unit, thetaStart: Double) = this()
    def this(radius: Unit, segments: Double, thetaStart: Double) = this()
    def this(radius: Unit, segments: Unit, thetaStart: Double) = this()
    def this(radius: Double, segments: Double, thetaStart: Double, thetaLength: Double) = this()
    def this(radius: Double, segments: Double, thetaStart: Unit, thetaLength: Double) = this()
    def this(radius: Double, segments: Unit, thetaStart: Double, thetaLength: Double) = this()
    def this(radius: Double, segments: Unit, thetaStart: Unit, thetaLength: Double) = this()
    def this(radius: Unit, segments: Double, thetaStart: Double, thetaLength: Double) = this()
    def this(radius: Unit, segments: Double, thetaStart: Unit, thetaLength: Double) = this()
    def this(radius: Unit, segments: Unit, thetaStart: Double, thetaLength: Double) = this()
    def this(radius: Unit, segments: Unit, thetaStart: Unit, thetaLength: Double) = this()
  }
  /* static members */
  object CircleGeometry {
    
    @JSImport("three/src/geometries/Geometries", "CircleGeometry")
    @js.native
    val ^ : js.Any = js.native
    
    /** @internal */
    inline def fromJSON(data: js.Object): typings.three.srcGeometriesCircleGeometryMod.CircleGeometry = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(data.asInstanceOf[js.Any]).asInstanceOf[typings.three.srcGeometriesCircleGeometryMod.CircleGeometry]
  }
  
  @JSImport("three/src/geometries/Geometries", "ConeGeometry")
  @js.native
  open class ConeGeometry protected ()
    extends typings.three.srcGeometriesConeGeometryMod.ConeGeometry {
    /**
      * Create a new instance of {@link ConeGeometry}
      * @param radius Radius of the cone base. Expects a `Float`. Default `1`
      * @param height Height of the cone. Expects a `Float`. Default `1`
      * @param radialSegments Number of segmented faces around the circumference of the cone. Expects a `Integer`. Default `32`
      * @param heightSegments Number of rows of faces along the height of the cone. Expects a `Integer`. Default `1`
      * @param openEnded A Boolean indicating whether the base of the cone is open or capped. Default `false`, _meaning capped_.
      * @param thetaStart Start angle for first segment. Expects a `Float`. Default `0`, _(three o'clock position)_.
      * @param thetaLength The central angle, often called theta, of the circular sector. Expects a `Float`. Default `Math.PI * 2`, _which makes for a complete cone_.
      */
    def this(
      radius: js.UndefOr[Double],
      height: js.UndefOr[Double],
      radialSegments: js.UndefOr[Double],
      heightSegments: js.UndefOr[Double],
      openEnded: js.UndefOr[Boolean],
      thetaStart: js.UndefOr[Double],
      thetaLength: js.UndefOr[Double]
    ) = this()
  }
  /* static members */
  object ConeGeometry {
    
    @JSImport("three/src/geometries/Geometries", "ConeGeometry")
    @js.native
    val ^ : js.Any = js.native
    
    /** @internal */
    inline def fromJSON(data: js.Object): typings.three.srcGeometriesConeGeometryMod.ConeGeometry = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(data.asInstanceOf[js.Any]).asInstanceOf[typings.three.srcGeometriesConeGeometryMod.ConeGeometry]
  }
  
  @JSImport("three/src/geometries/Geometries", "CylinderGeometry")
  @js.native
  open class CylinderGeometry protected ()
    extends typings.three.srcGeometriesCylinderGeometryMod.CylinderGeometry {
    /**
      * Create a new instance of {@link CylinderGeometry}
      * @param radiusTop Radius of the cylinder at the top. Default `1`
      * @param radiusBottom Radius of the cylinder at the bottom. Default `1`
      * @param height Height of the cylinder. Default `1`
      * @param radialSegments Number of segmented faces around the circumference of the cylinder. Default `32`
      * @param heightSegments Number of rows of faces along the height of the cylinder. Expects a `Integer`. Default `1`
      * @param openEnded A Boolean indicating whether the ends of the cylinder are open or capped. Default `false`, _meaning capped_.
      * @param thetaStart Start angle for first segment. Default `0`, _(three o'clock position)_.
      * @param thetaLength The central angle, often called theta, of the circular sector. Default `Math.PI * 2`, _which makes for a complete cylinder.
      */
    def this(
      radiusTop: js.UndefOr[Double],
      radiusBottom: js.UndefOr[Double],
      height: js.UndefOr[Double],
      radialSegments: js.UndefOr[Double],
      heightSegments: js.UndefOr[Double],
      openEnded: js.UndefOr[Boolean],
      thetaStart: js.UndefOr[Double],
      thetaLength: js.UndefOr[Double]
    ) = this()
  }
  /* static members */
  object CylinderGeometry {
    
    @JSImport("three/src/geometries/Geometries", "CylinderGeometry")
    @js.native
    val ^ : js.Any = js.native
    
    /** @internal */
    inline def fromJSON(data: Any): typings.three.srcGeometriesCylinderGeometryMod.CylinderGeometry = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(data.asInstanceOf[js.Any]).asInstanceOf[typings.three.srcGeometriesCylinderGeometryMod.CylinderGeometry]
  }
  
  @JSImport("three/src/geometries/Geometries", "DodecahedronGeometry")
  @js.native
  /**
    * Create a new instance of {@link DodecahedronGeometry}
    * @param radius Radius of the dodecahedron. Expects a `Float`. Default `1`
    * @param detail Setting this to a value greater than 0 adds vertices making it no longer a dodecahedron. Expects a `Integer`. Default `0`
    */
  open class DodecahedronGeometry ()
    extends typings.three.srcGeometriesDodecahedronGeometryMod.DodecahedronGeometry {
    def this(radius: Double) = this()
    def this(radius: Double, detail: Double) = this()
    def this(radius: Unit, detail: Double) = this()
  }
  /* static members */
  object DodecahedronGeometry {
    
    @JSImport("three/src/geometries/Geometries", "DodecahedronGeometry")
    @js.native
    val ^ : js.Any = js.native
    
    /** @internal */
    inline def fromJSON(data: js.Object): typings.three.srcGeometriesDodecahedronGeometryMod.DodecahedronGeometry = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(data.asInstanceOf[js.Any]).asInstanceOf[typings.three.srcGeometriesDodecahedronGeometryMod.DodecahedronGeometry]
  }
  
  @JSImport("three/src/geometries/Geometries", "EdgesGeometry")
  @js.native
  /**
    * Create a new instance of {@link EdgesGeometry}
    * @param geometry Any geometry object. Default `null`.
    * @param thresholdAngle An edge is only rendered if the angle (in degrees) between the face normals of the adjoining faces exceeds this value. Expects a `Integer`. Default `1` _degree_.
    */
  open class EdgesGeometry[TBufferGeometry /* <: BufferGeometry[NormalBufferAttributes] */] ()
    extends typings.three.srcGeometriesEdgesGeometryMod.EdgesGeometry[TBufferGeometry] {
    def this(geometry: TBufferGeometry) = this()
    def this(geometry: TBufferGeometry, thresholdAngle: Double) = this()
    def this(geometry: Null, thresholdAngle: Double) = this()
    def this(geometry: Unit, thresholdAngle: Double) = this()
  }
  
  @JSImport("three/src/geometries/Geometries", "ExtrudeGeometry")
  @js.native
  /**
    * Create a new instance of {@link ExtrudeGeometry}
    * @param shapes Shape or an array of shapes. Default `new Shape([new Vector2(0.5, 0.5), new Vector2(-0.5, 0.5), new Vector2(-0.5, -0.5), new Vector2(0.5, -0.5)])`.
    * @param options Object that can contain the following parameters. @see {@link ExtrudeGeometryOptions} for defaults.
    */
  open class ExtrudeGeometry ()
    extends typings.three.srcGeometriesExtrudeGeometryMod.ExtrudeGeometry {
    def this(shapes: js.Array[Shape]) = this()
    def this(shapes: Shape) = this()
    def this(shapes: js.Array[Shape], options: ExtrudeGeometryOptions) = this()
    def this(shapes: Unit, options: ExtrudeGeometryOptions) = this()
    def this(shapes: Shape, options: ExtrudeGeometryOptions) = this()
  }
  /* static members */
  object ExtrudeGeometry {
    
    @JSImport("three/src/geometries/Geometries", "ExtrudeGeometry")
    @js.native
    val ^ : js.Any = js.native
    
    /** @internal */
    inline def fromJSON(data: js.Object, shapes: Any): typings.three.srcGeometriesExtrudeGeometryMod.ExtrudeGeometry = (^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(data.asInstanceOf[js.Any], shapes.asInstanceOf[js.Any])).asInstanceOf[typings.three.srcGeometriesExtrudeGeometryMod.ExtrudeGeometry]
  }
  
  @JSImport("three/src/geometries/Geometries", "IcosahedronGeometry")
  @js.native
  /**
    * Create a new instance of {@link IcosahedronGeometry}
    * @param radius Expects a `Float`. Default `1`
    * @param detail Setting this to a value greater than 0 adds more vertices making it no longer an icosahedron.
    *               When detail is greater than 1, it's effectively a sphere. Expects a `Integer`. Default `0`
    */
  open class IcosahedronGeometry ()
    extends typings.three.srcGeometriesIcosahedronGeometryMod.IcosahedronGeometry {
    def this(radius: Double) = this()
    def this(radius: Double, detail: Double) = this()
    def this(radius: Unit, detail: Double) = this()
  }
  /* static members */
  object IcosahedronGeometry {
    
    @JSImport("three/src/geometries/Geometries", "IcosahedronGeometry")
    @js.native
    val ^ : js.Any = js.native
    
    /** @internal */
    inline def fromJSON(data: js.Object): typings.three.srcGeometriesIcosahedronGeometryMod.IcosahedronGeometry = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(data.asInstanceOf[js.Any]).asInstanceOf[typings.three.srcGeometriesIcosahedronGeometryMod.IcosahedronGeometry]
  }
  
  @JSImport("three/src/geometries/Geometries", "LatheGeometry")
  @js.native
  /**
    * This creates a {@link LatheGeometry} based on the parameters.
    * @param points Array of Vector2s. The x-coordinate of each point must be greater than zero.
    *               Default `[new Vector2(0, -0.5), new Vector2(0.5, 0), new Vector2(0, 0.5)]` _which creates a simple diamond shape_.
    * @param segments The number of circumference segments to generate. Expects a `Integer`. Default `12`.
    * @param phiStart The starting angle in radians. Expects a `Float`. Default `0`.
    * @param phiLength The radian (0 to 2*PI) range of the lathed section 2*PI is a closed lathe, less than 2PI is a portion. Expects a `Float`. Default `Math.PI * 2`.
    */
  open class LatheGeometry ()
    extends typings.three.srcGeometriesLatheGeometryMod.LatheGeometry {
    def this(points: js.Array[Vector2]) = this()
    def this(points: js.Array[Vector2], segments: Double) = this()
    def this(points: Unit, segments: Double) = this()
    def this(points: js.Array[Vector2], segments: Double, phiStart: Double) = this()
    def this(points: js.Array[Vector2], segments: Unit, phiStart: Double) = this()
    def this(points: Unit, segments: Double, phiStart: Double) = this()
    def this(points: Unit, segments: Unit, phiStart: Double) = this()
    def this(points: js.Array[Vector2], segments: Double, phiStart: Double, phiLength: Double) = this()
    def this(points: js.Array[Vector2], segments: Double, phiStart: Unit, phiLength: Double) = this()
    def this(points: js.Array[Vector2], segments: Unit, phiStart: Double, phiLength: Double) = this()
    def this(points: js.Array[Vector2], segments: Unit, phiStart: Unit, phiLength: Double) = this()
    def this(points: Unit, segments: Double, phiStart: Double, phiLength: Double) = this()
    def this(points: Unit, segments: Double, phiStart: Unit, phiLength: Double) = this()
    def this(points: Unit, segments: Unit, phiStart: Double, phiLength: Double) = this()
    def this(points: Unit, segments: Unit, phiStart: Unit, phiLength: Double) = this()
  }
  /* static members */
  object LatheGeometry {
    
    @JSImport("three/src/geometries/Geometries", "LatheGeometry")
    @js.native
    val ^ : js.Any = js.native
    
    /** @internal */
    inline def fromJSON(data: js.Object): typings.three.srcGeometriesLatheGeometryMod.LatheGeometry = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(data.asInstanceOf[js.Any]).asInstanceOf[typings.three.srcGeometriesLatheGeometryMod.LatheGeometry]
  }
  
  @JSImport("three/src/geometries/Geometries", "OctahedronGeometry")
  @js.native
  /**
    * Create a new instance of {@link OctahedronGeometry}
    * @param radius Radius of the octahedron. Expects a `Float`. Default `1`
    * @param detail Setting this to a value greater than zero add vertices making it no longer an octahedron. Expects a `Integer`. Default `0`
    */
  open class OctahedronGeometry ()
    extends typings.three.srcGeometriesOctahedronGeometryMod.OctahedronGeometry {
    def this(radius: Double) = this()
    def this(radius: Double, detail: Double) = this()
    def this(radius: Unit, detail: Double) = this()
  }
  /* static members */
  object OctahedronGeometry {
    
    @JSImport("three/src/geometries/Geometries", "OctahedronGeometry")
    @js.native
    val ^ : js.Any = js.native
    
    /** @internal */
    inline def fromJSON(data: js.Object): typings.three.srcGeometriesOctahedronGeometryMod.OctahedronGeometry = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(data.asInstanceOf[js.Any]).asInstanceOf[typings.three.srcGeometriesOctahedronGeometryMod.OctahedronGeometry]
  }
  
  @JSImport("three/src/geometries/Geometries", "PlaneGeometry")
  @js.native
  /**
    * Create a new instance of {@link PlaneGeometry}
    * @param width Width along the X axis. Expects a `Float`. Default `1`
    * @param height Height along the Y axis. Expects a `Float`. Default `1`
    * @param widthSegments Number of segmented faces along the width of the sides. Expects a `Integer`. Default `1`
    * @param heightSegments Number of segmented faces along the height of the sides. Expects a `Integer`. Default `1`
    */
  open class PlaneGeometry ()
    extends typings.three.srcGeometriesPlaneGeometryMod.PlaneGeometry {
    def this(width: Double) = this()
    def this(width: Double, height: Double) = this()
    def this(width: Unit, height: Double) = this()
    def this(width: Double, height: Double, widthSegments: Double) = this()
    def this(width: Double, height: Unit, widthSegments: Double) = this()
    def this(width: Unit, height: Double, widthSegments: Double) = this()
    def this(width: Unit, height: Unit, widthSegments: Double) = this()
    def this(width: Double, height: Double, widthSegments: Double, heightSegments: Double) = this()
    def this(width: Double, height: Double, widthSegments: Unit, heightSegments: Double) = this()
    def this(width: Double, height: Unit, widthSegments: Double, heightSegments: Double) = this()
    def this(width: Double, height: Unit, widthSegments: Unit, heightSegments: Double) = this()
    def this(width: Unit, height: Double, widthSegments: Double, heightSegments: Double) = this()
    def this(width: Unit, height: Double, widthSegments: Unit, heightSegments: Double) = this()
    def this(width: Unit, height: Unit, widthSegments: Double, heightSegments: Double) = this()
    def this(width: Unit, height: Unit, widthSegments: Unit, heightSegments: Double) = this()
  }
  /* static members */
  object PlaneGeometry {
    
    @JSImport("three/src/geometries/Geometries", "PlaneGeometry")
    @js.native
    val ^ : js.Any = js.native
    
    /** @internal */
    inline def fromJSON(data: js.Object): typings.three.srcGeometriesPlaneGeometryMod.PlaneGeometry = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(data.asInstanceOf[js.Any]).asInstanceOf[typings.three.srcGeometriesPlaneGeometryMod.PlaneGeometry]
  }
  
  @JSImport("three/src/geometries/Geometries", "PolyhedronGeometry")
  @js.native
  /**
    * Create a new instance of {@link PolyhedronGeometry}
    * @param vertices Array of points of the form [1,1,1, -1,-1,-1, ... ]. Default `[]`.
    * @param indices Array of indices that make up the faces of the form [0,1,2, 2,3,0, ... ]. Default `[]`.
    * @param radius [page:The radius of the final shape Expects a `Float`. Default `1`
    * @param detail [page:How many levels to subdivide the geometry. The more detail, the smoother the shape. Expects a `Integer`. Default `0`
    */
  open class PolyhedronGeometry ()
    extends typings.three.srcGeometriesPolyhedronGeometryMod.PolyhedronGeometry {
    def this(vertices: js.Array[Double]) = this()
    def this(vertices: js.Array[Double], indices: js.Array[Double]) = this()
    def this(vertices: Unit, indices: js.Array[Double]) = this()
    def this(vertices: js.Array[Double], indices: js.Array[Double], radius: Double) = this()
    def this(vertices: js.Array[Double], indices: Unit, radius: Double) = this()
    def this(vertices: Unit, indices: js.Array[Double], radius: Double) = this()
    def this(vertices: Unit, indices: Unit, radius: Double) = this()
    def this(vertices: js.Array[Double], indices: js.Array[Double], radius: Double, detail: Double) = this()
    def this(vertices: js.Array[Double], indices: js.Array[Double], radius: Unit, detail: Double) = this()
    def this(vertices: js.Array[Double], indices: Unit, radius: Double, detail: Double) = this()
    def this(vertices: js.Array[Double], indices: Unit, radius: Unit, detail: Double) = this()
    def this(vertices: Unit, indices: js.Array[Double], radius: Double, detail: Double) = this()
    def this(vertices: Unit, indices: js.Array[Double], radius: Unit, detail: Double) = this()
    def this(vertices: Unit, indices: Unit, radius: Double, detail: Double) = this()
    def this(vertices: Unit, indices: Unit, radius: Unit, detail: Double) = this()
  }
  /* static members */
  object PolyhedronGeometry {
    
    @JSImport("three/src/geometries/Geometries", "PolyhedronGeometry")
    @js.native
    val ^ : js.Any = js.native
    
    /** @internal */
    inline def fromJSON(data: js.Object): typings.three.srcGeometriesPolyhedronGeometryMod.PolyhedronGeometry = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(data.asInstanceOf[js.Any]).asInstanceOf[typings.three.srcGeometriesPolyhedronGeometryMod.PolyhedronGeometry]
  }
  
  @JSImport("three/src/geometries/Geometries", "RingGeometry")
  @js.native
  open class RingGeometry protected ()
    extends typings.three.srcGeometriesRingGeometryMod.RingGeometry {
    /**
      * Create a new instance of {@link RingGeometry}
      * @param innerRadius Expects a `Float`. Default `0.5`.
      * @param outerRadius Expects a `Float`. Default `1`.
      * @param thetaSegments Number of segments. A higher number means the ring will be more round. Minimum is 3. Expects a `Integer`. Default `32`.
      * @param phiSegments Minimum is 1. Expects a `Integer`. Default `1`.
      * @param thetaStart Starting angle. Expects a `Float`. Default `0`.
      * @param thetaLength Central angle. Expects a `Float`. Default `Math.PI * 2`.
      */
    def this(
      innerRadius: js.UndefOr[Double],
      outerRadius: js.UndefOr[Double],
      thetaSegments: js.UndefOr[Double],
      phiSegments: js.UndefOr[Double],
      thetaStart: js.UndefOr[Double],
      thetaLength: js.UndefOr[Double]
    ) = this()
  }
  /* static members */
  object RingGeometry {
    
    @JSImport("three/src/geometries/Geometries", "RingGeometry")
    @js.native
    val ^ : js.Any = js.native
    
    /** @internal */
    inline def fromJSON(data: js.Object): typings.three.srcGeometriesRingGeometryMod.RingGeometry = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(data.asInstanceOf[js.Any]).asInstanceOf[typings.three.srcGeometriesRingGeometryMod.RingGeometry]
  }
  
  @JSImport("three/src/geometries/Geometries", "ShapeGeometry")
  @js.native
  /**
    * Create a new instance of {@link ShapeGeometry}
    * @param shapes Array of shapes or a single {@link THREE.Shape | Shape}. Default `new Shape([new Vector2(0, 0.5), new Vector2(-0.5, -0.5), new Vector2(0.5, -0.5)])`, _a single triangle shape_.
    * @param curveSegments Number of segments per shape. Expects a `Integer`. Default `12`
    */
  open class ShapeGeometry ()
    extends typings.three.srcGeometriesShapeGeometryMod.ShapeGeometry {
    def this(shapes: js.Array[Shape]) = this()
    def this(shapes: Shape) = this()
    def this(shapes: js.Array[Shape], curveSegments: Double) = this()
    def this(shapes: Unit, curveSegments: Double) = this()
    def this(shapes: Shape, curveSegments: Double) = this()
  }
  /* static members */
  object ShapeGeometry {
    
    @JSImport("three/src/geometries/Geometries", "ShapeGeometry")
    @js.native
    val ^ : js.Any = js.native
    
    /** @internal */
    inline def fromJSON(data: js.Object): typings.three.srcGeometriesShapeGeometryMod.ShapeGeometry = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(data.asInstanceOf[js.Any]).asInstanceOf[typings.three.srcGeometriesShapeGeometryMod.ShapeGeometry]
  }
  
  @JSImport("three/src/geometries/Geometries", "SphereGeometry")
  @js.native
  open class SphereGeometry protected ()
    extends typings.three.srcGeometriesSphereGeometryMod.SphereGeometry {
    /**
      * Create a new instance of {@link SphereGeometry}
      * @remarks
      * The geometry is created by sweeping and calculating vertexes
      * around the **Y** axis (horizontal sweep) and the **Z** axis (vertical sweep)
      * Thus, incomplete spheres (akin to `'sphere slices'`) can be created
      * through the use of different values of {@link phiStart}, {@link phiLength}, {@link thetaStart} and {@link thetaLength},
      * in order to define the points in which we start (or end) calculating those vertices.
      * @param radius Sphere radius. Expects a `Float`. Default `1`
      * @param widthSegments Number of horizontal segments. Minimum value is 3, and the Expects a `Integer`. Default `32`
      * @param heightSegments Number of vertical segments. Minimum value is 2, and the Expects a `Integer`. Default `16`
      * @param phiStart Specify horizontal starting angle. Expects a `Float`. Default `0`
      * @param phiLength Specify horizontal sweep angle size. Expects a `Float`. Default `Math.PI * 2`
      * @param thetaStart Specify vertical starting angle. Expects a `Float`. Default `0`
      * @param thetaLength Specify vertical sweep angle size. Expects a `Float`. Default `Math.PI`
      */
    def this(
      radius: js.UndefOr[Double],
      widthSegments: js.UndefOr[Double],
      heightSegments: js.UndefOr[Double],
      phiStart: js.UndefOr[Double],
      phiLength: js.UndefOr[Double],
      thetaStart: js.UndefOr[Double],
      thetaLength: js.UndefOr[Double]
    ) = this()
  }
  /* static members */
  object SphereGeometry {
    
    @JSImport("three/src/geometries/Geometries", "SphereGeometry")
    @js.native
    val ^ : js.Any = js.native
    
    /** @internal */
    inline def fromJSON(data: js.Object): typings.three.srcGeometriesSphereGeometryMod.SphereGeometry = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(data.asInstanceOf[js.Any]).asInstanceOf[typings.three.srcGeometriesSphereGeometryMod.SphereGeometry]
  }
  
  @JSImport("three/src/geometries/Geometries", "TetrahedronGeometry")
  @js.native
  /**
    * Create a new instance of {@link TetrahedronGeometry}
    * @param radius Radius of the tetrahedron. Expects a `Float`. Default `1`
    * @param detail Setting this to a value greater than 0 adds vertices making it no longer a tetrahedron. Expects a `Integer`. Default `0`
    */
  open class TetrahedronGeometry ()
    extends typings.three.srcGeometriesTetrahedronGeometryMod.TetrahedronGeometry {
    def this(radius: Double) = this()
    def this(radius: Double, detail: Double) = this()
    def this(radius: Unit, detail: Double) = this()
  }
  /* static members */
  object TetrahedronGeometry {
    
    @JSImport("three/src/geometries/Geometries", "TetrahedronGeometry")
    @js.native
    val ^ : js.Any = js.native
    
    /** @internal */
    inline def fromJSON(data: js.Object): typings.three.srcGeometriesTetrahedronGeometryMod.TetrahedronGeometry = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(data.asInstanceOf[js.Any]).asInstanceOf[typings.three.srcGeometriesTetrahedronGeometryMod.TetrahedronGeometry]
  }
  
  @JSImport("three/src/geometries/Geometries", "TorusGeometry")
  @js.native
  /**
    * Create a new instance of {@link TorusGeometry}
    * @param radius Radius of the torus, from the center of the torus to the center of the tube. Expects a `Float`. Default `1`.
    * @param tube Radius of the tube. Expects a `Float`. Default `0.4`.
    * @param radialSegments Expects a `Integer`.Default is `12`.
    * @param tubularSegments Expects a `Integer`. Default `48`.
    * @param arc Central angle. Expects a `Float`. Default `Math.PI * 2`
    */
  open class TorusGeometry ()
    extends typings.three.srcGeometriesTorusGeometryMod.TorusGeometry {
    def this(radius: Double) = this()
    def this(radius: Double, tube: Double) = this()
    def this(radius: Unit, tube: Double) = this()
    def this(radius: Double, tube: Double, radialSegments: Double) = this()
    def this(radius: Double, tube: Unit, radialSegments: Double) = this()
    def this(radius: Unit, tube: Double, radialSegments: Double) = this()
    def this(radius: Unit, tube: Unit, radialSegments: Double) = this()
    def this(radius: Double, tube: Double, radialSegments: Double, tubularSegments: Double) = this()
    def this(radius: Double, tube: Double, radialSegments: Unit, tubularSegments: Double) = this()
    def this(radius: Double, tube: Unit, radialSegments: Double, tubularSegments: Double) = this()
    def this(radius: Double, tube: Unit, radialSegments: Unit, tubularSegments: Double) = this()
    def this(radius: Unit, tube: Double, radialSegments: Double, tubularSegments: Double) = this()
    def this(radius: Unit, tube: Double, radialSegments: Unit, tubularSegments: Double) = this()
    def this(radius: Unit, tube: Unit, radialSegments: Double, tubularSegments: Double) = this()
    def this(radius: Unit, tube: Unit, radialSegments: Unit, tubularSegments: Double) = this()
    def this(radius: Double, tube: Double, radialSegments: Double, tubularSegments: Double, arc: Double) = this()
    def this(radius: Double, tube: Double, radialSegments: Double, tubularSegments: Unit, arc: Double) = this()
    def this(radius: Double, tube: Double, radialSegments: Unit, tubularSegments: Double, arc: Double) = this()
    def this(radius: Double, tube: Double, radialSegments: Unit, tubularSegments: Unit, arc: Double) = this()
    def this(radius: Double, tube: Unit, radialSegments: Double, tubularSegments: Double, arc: Double) = this()
    def this(radius: Double, tube: Unit, radialSegments: Double, tubularSegments: Unit, arc: Double) = this()
    def this(radius: Double, tube: Unit, radialSegments: Unit, tubularSegments: Double, arc: Double) = this()
    def this(radius: Double, tube: Unit, radialSegments: Unit, tubularSegments: Unit, arc: Double) = this()
    def this(radius: Unit, tube: Double, radialSegments: Double, tubularSegments: Double, arc: Double) = this()
    def this(radius: Unit, tube: Double, radialSegments: Double, tubularSegments: Unit, arc: Double) = this()
    def this(radius: Unit, tube: Double, radialSegments: Unit, tubularSegments: Double, arc: Double) = this()
    def this(radius: Unit, tube: Double, radialSegments: Unit, tubularSegments: Unit, arc: Double) = this()
    def this(radius: Unit, tube: Unit, radialSegments: Double, tubularSegments: Double, arc: Double) = this()
    def this(radius: Unit, tube: Unit, radialSegments: Double, tubularSegments: Unit, arc: Double) = this()
    def this(radius: Unit, tube: Unit, radialSegments: Unit, tubularSegments: Double, arc: Double) = this()
    def this(radius: Unit, tube: Unit, radialSegments: Unit, tubularSegments: Unit, arc: Double) = this()
  }
  /* static members */
  object TorusGeometry {
    
    @JSImport("three/src/geometries/Geometries", "TorusGeometry")
    @js.native
    val ^ : js.Any = js.native
    
    /** @internal */
    inline def fromJSON(data: Any): typings.three.srcGeometriesTorusGeometryMod.TorusGeometry = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(data.asInstanceOf[js.Any]).asInstanceOf[typings.three.srcGeometriesTorusGeometryMod.TorusGeometry]
  }
  
  @JSImport("three/src/geometries/Geometries", "TorusKnotGeometry")
  @js.native
  open class TorusKnotGeometry protected ()
    extends typings.three.srcGeometriesTorusKnotGeometryMod.TorusKnotGeometry {
    /**
      * Create a new instance of {@link TorusKnotGeometry}
      * @param radius Radius of the torus.. Default `1`.
      * @param tube Expects a `Float`. Default `0.4`.
      * @param tubularSegments Expects a `Integer`. Default `64`.
      * @param radialSegments Expects a `Integer`. Default `8`.
      * @param p This value determines, how many times the geometry winds around its axis of rotational symmetry. Expects a `Integer`. Default `2`.
      * @param q This value determines, how many times the geometry winds around a circle in the interior of the torus. Expects a `Integer`. Default `3`.
      */
    def this(
      radius: js.UndefOr[Double],
      tube: js.UndefOr[Double],
      tubularSegments: js.UndefOr[Double],
      radialSegments: js.UndefOr[Double],
      p: js.UndefOr[Double],
      q: js.UndefOr[Double]
    ) = this()
  }
  /* static members */
  object TorusKnotGeometry {
    
    @JSImport("three/src/geometries/Geometries", "TorusKnotGeometry")
    @js.native
    val ^ : js.Any = js.native
    
    /** @internal */
    inline def fromJSON(data: js.Object): typings.three.srcGeometriesTorusKnotGeometryMod.TorusKnotGeometry = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(data.asInstanceOf[js.Any]).asInstanceOf[typings.three.srcGeometriesTorusKnotGeometryMod.TorusKnotGeometry]
  }
  
  @JSImport("three/src/geometries/Geometries", "TubeGeometry")
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
  open class TubeGeometry ()
    extends typings.three.srcGeometriesTubeGeometryMod.TubeGeometry {
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
  }
  /* static members */
  object TubeGeometry {
    
    @JSImport("three/src/geometries/Geometries", "TubeGeometry")
    @js.native
    val ^ : js.Any = js.native
    
    /** @internal */
    inline def fromJSON(data: js.Object): typings.three.srcGeometriesTubeGeometryMod.TubeGeometry = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(data.asInstanceOf[js.Any]).asInstanceOf[typings.three.srcGeometriesTubeGeometryMod.TubeGeometry]
  }
  
  @JSImport("three/src/geometries/Geometries", "WireframeGeometry")
  @js.native
  /**
    * Create a new instance of {@link WireframeGeometry}
    * @param geometry Any geometry object. Default `null`.
    */
  open class WireframeGeometry[TBufferGeometry /* <: BufferGeometry[NormalBufferAttributes] */] ()
    extends typings.three.srcGeometriesWireframeGeometryMod.WireframeGeometry[TBufferGeometry] {
    def this(geometry: TBufferGeometry) = this()
  }
}
