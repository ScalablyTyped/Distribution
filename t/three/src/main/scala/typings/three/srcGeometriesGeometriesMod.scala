package typings.three

import typings.three.srcCoreBufferGeometryMod.BufferGeometry
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
      * @param [width=1] — Width of the sides on the X axis.
      * @param [height=1] — Height of the sides on the Y axis.
      * @param [depth=1] — Depth of the sides on the Z axis.
      * @param [widthSegments=1] — Number of segmented faces along the width of the sides.
      * @param [heightSegments=1] — Number of segmented faces along the height of the sides.
      * @param [depthSegments=1] — Number of segmented faces along the depth of the sides.
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
    
    inline def fromJSON(data: Any): typings.three.srcGeometriesBoxGeometryMod.BoxGeometry = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(data.asInstanceOf[js.Any]).asInstanceOf[typings.three.srcGeometriesBoxGeometryMod.BoxGeometry]
  }
  
  @JSImport("three/src/geometries/Geometries", "CapsuleGeometry")
  @js.native
  /**
    * @param [radius=1] — Radius of the capsule.
    * @param [length=1] — Length of the middle section.
    * @param [capSegments=4] — Number of curve segments used to build the caps.
    * @param [radialSegments=8] — Number of segmented faces around the circumference of the capsule.
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
    
    inline def fromJSON(data: Any): typings.three.srcGeometriesCapsuleGeometryMod.CapsuleGeometry = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(data.asInstanceOf[js.Any]).asInstanceOf[typings.three.srcGeometriesCapsuleGeometryMod.CapsuleGeometry]
  }
  
  @JSImport("three/src/geometries/Geometries", "CircleGeometry")
  @js.native
  /**
    * @param [radius=1]
    * @param [segments=8]
    * @param [thetaStart=0]
    * @param [thetaLength=Math.PI * 2]
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
    
    inline def fromJSON(data: Any): typings.three.srcGeometriesCircleGeometryMod.CircleGeometry = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(data.asInstanceOf[js.Any]).asInstanceOf[typings.three.srcGeometriesCircleGeometryMod.CircleGeometry]
  }
  
  @JSImport("three/src/geometries/Geometries", "ConeGeometry")
  @js.native
  open class ConeGeometry protected ()
    extends typings.three.srcGeometriesConeGeometryMod.ConeGeometry {
    /**
      * @param [radius=1] — Radius of the cone base.
      * @param [height=1] — Height of the cone.
      * @param [radialSegments=8] — Number of segmented faces around the circumference of the cone.
      * @param [heightSegments=1] — Number of rows of faces along the height of the cone.
      * @param [openEnded=false] — A Boolean indicating whether the base of the cone is open or capped.
      * @param [thetaStart=0]
      * @param [thetaLength=Math.PI * 2]
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
    
    inline def fromJSON(data: Any): typings.three.srcGeometriesConeGeometryMod.ConeGeometry = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(data.asInstanceOf[js.Any]).asInstanceOf[typings.three.srcGeometriesConeGeometryMod.ConeGeometry]
  }
  
  @JSImport("three/src/geometries/Geometries", "CylinderGeometry")
  @js.native
  open class CylinderGeometry protected ()
    extends typings.three.srcGeometriesCylinderGeometryMod.CylinderGeometry {
    /**
      * @param [radiusTop=1] — Radius of the cylinder at the top.
      * @param [radiusBottom=1] — Radius of the cylinder at the bottom.
      * @param [height=1] — Height of the cylinder.
      * @param [radialSegments=8] — Number of segmented faces around the circumference of the cylinder.
      * @param [heightSegments=1] — Number of rows of faces along the height of the cylinder.
      * @param [openEnded=false] - A Boolean indicating whether or not to cap the ends of the cylinder.
      * @param [thetaStart=0]
      * @param [thetaLength=Math.PI * 2]
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
    
    inline def fromJSON(data: Any): typings.three.srcGeometriesCylinderGeometryMod.CylinderGeometry = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(data.asInstanceOf[js.Any]).asInstanceOf[typings.three.srcGeometriesCylinderGeometryMod.CylinderGeometry]
  }
  
  @JSImport("three/src/geometries/Geometries", "DodecahedronGeometry")
  @js.native
  /**
    * @param [radius=1]
    * @param [detail=0]
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
    
    inline def fromJSON(data: Any): typings.three.srcGeometriesDodecahedronGeometryMod.DodecahedronGeometry = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(data.asInstanceOf[js.Any]).asInstanceOf[typings.three.srcGeometriesDodecahedronGeometryMod.DodecahedronGeometry]
  }
  
  @JSImport("three/src/geometries/Geometries", "EdgesGeometry")
  @js.native
  /**
    * @param geometry
    * @param [thresholdAngle=1]
    */
  open class EdgesGeometry[TBufferGeometry /* <: BufferGeometry */] ()
    extends typings.three.srcGeometriesEdgesGeometryMod.EdgesGeometry[TBufferGeometry] {
    def this(geometry: TBufferGeometry) = this()
    def this(geometry: TBufferGeometry, thresholdAngle: Double) = this()
    def this(geometry: Unit, thresholdAngle: Double) = this()
  }
  
  @JSImport("three/src/geometries/Geometries", "ExtrudeGeometry")
  @js.native
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
    
    inline def fromJSON(data: Any): typings.three.srcGeometriesExtrudeGeometryMod.ExtrudeGeometry = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(data.asInstanceOf[js.Any]).asInstanceOf[typings.three.srcGeometriesExtrudeGeometryMod.ExtrudeGeometry]
  }
  
  @JSImport("three/src/geometries/Geometries", "IcosahedronGeometry")
  @js.native
  /**
    * @param [radius=1]
    * @param [detail=0]
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
    
    inline def fromJSON(data: Any): typings.three.srcGeometriesIcosahedronGeometryMod.IcosahedronGeometry = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(data.asInstanceOf[js.Any]).asInstanceOf[typings.three.srcGeometriesIcosahedronGeometryMod.IcosahedronGeometry]
  }
  
  @JSImport("three/src/geometries/Geometries", "LatheGeometry")
  @js.native
  /**
    * @param points
    * @param [segments=12]
    * @param [phiStart=0]
    * @param [phiLength=Math.PI * 2]
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
    
    inline def fromJSON(data: Any): typings.three.srcGeometriesLatheGeometryMod.LatheGeometry = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(data.asInstanceOf[js.Any]).asInstanceOf[typings.three.srcGeometriesLatheGeometryMod.LatheGeometry]
  }
  
  @JSImport("three/src/geometries/Geometries", "OctahedronGeometry")
  @js.native
  /**
    * @param [radius=1]
    * @param [detail=0]
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
    
    inline def fromJSON(data: Any): typings.three.srcGeometriesOctahedronGeometryMod.OctahedronGeometry = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(data.asInstanceOf[js.Any]).asInstanceOf[typings.three.srcGeometriesOctahedronGeometryMod.OctahedronGeometry]
  }
  
  @JSImport("three/src/geometries/Geometries", "PlaneGeometry")
  @js.native
  /**
    * @param [width=1] — Width of the sides on the X axis.
    * @param [height=1] — Height of the sides on the Y axis.
    * @param [widthSegments=1] — Number of segmented faces along the width of the sides.
    * @param [heightSegments=1] — Number of segmented faces along the height of the sides.
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
    
    inline def fromJSON(data: Any): typings.three.srcGeometriesPlaneGeometryMod.PlaneGeometry = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(data.asInstanceOf[js.Any]).asInstanceOf[typings.three.srcGeometriesPlaneGeometryMod.PlaneGeometry]
  }
  
  @JSImport("three/src/geometries/Geometries", "PolyhedronGeometry")
  @js.native
  /**
    * @param vertices
    * @param indices
    * @param [radius=1]
    * @param [detail=0]
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
    
    inline def fromJSON(data: Any): typings.three.srcGeometriesPolyhedronGeometryMod.PolyhedronGeometry = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(data.asInstanceOf[js.Any]).asInstanceOf[typings.three.srcGeometriesPolyhedronGeometryMod.PolyhedronGeometry]
  }
  
  @JSImport("three/src/geometries/Geometries", "RingGeometry")
  @js.native
  open class RingGeometry protected ()
    extends typings.three.srcGeometriesRingGeometryMod.RingGeometry {
    /**
      * @param [innerRadius=0.5]
      * @param [outerRadius=1]
      * @param [thetaSegments=8]
      * @param [phiSegments=1]
      * @param [thetaStart=0]
      * @param [thetaLength=Math.PI * 2]
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
    
    inline def fromJSON(data: Any): typings.three.srcGeometriesRingGeometryMod.RingGeometry = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(data.asInstanceOf[js.Any]).asInstanceOf[typings.three.srcGeometriesRingGeometryMod.RingGeometry]
  }
  
  @JSImport("three/src/geometries/Geometries", "ShapeGeometry")
  @js.native
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
    
    inline def fromJSON(data: Any): typings.three.srcGeometriesShapeGeometryMod.ShapeGeometry = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(data.asInstanceOf[js.Any]).asInstanceOf[typings.three.srcGeometriesShapeGeometryMod.ShapeGeometry]
  }
  
  @JSImport("three/src/geometries/Geometries", "SphereGeometry")
  @js.native
  open class SphereGeometry protected ()
    extends typings.three.srcGeometriesSphereGeometryMod.SphereGeometry {
    /**
      * @param [radius=50] — sphere radius. Default is 50.
      * @param [widthSegments=8] — number of horizontal segments. Minimum value is 3, and the default is 8.
      * @param [heightSegments=6] — number of vertical segments. Minimum value is 2, and the default is 6.
      * @param [phiStart=0] — specify horizontal starting angle. Default is 0.
      * @param [phiLength=Math.PI * 2] — specify horizontal sweep angle size. Default is Math.PI * 2.
      * @param [thetaStart=0] — specify vertical starting angle. Default is 0.
      * @param [thetaLength=Math.PI * 2] — specify vertical sweep angle size. Default is Math.PI.
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
    
    inline def fromJSON(data: Any): typings.three.srcGeometriesSphereGeometryMod.SphereGeometry = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(data.asInstanceOf[js.Any]).asInstanceOf[typings.three.srcGeometriesSphereGeometryMod.SphereGeometry]
  }
  
  @JSImport("three/src/geometries/Geometries", "TetrahedronGeometry")
  @js.native
  /**
    * @param [radius=1]
    * @param [detail=0]
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
    
    inline def fromJSON(data: Any): typings.three.srcGeometriesTetrahedronGeometryMod.TetrahedronGeometry = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(data.asInstanceOf[js.Any]).asInstanceOf[typings.three.srcGeometriesTetrahedronGeometryMod.TetrahedronGeometry]
  }
  
  @JSImport("three/src/geometries/Geometries", "TorusGeometry")
  @js.native
  /**
    * @param [radius=1]
    * @param [tube=0.4]
    * @param [radialSegments=8]
    * @param [tubularSegments=6]
    * @param [arc=Math.PI * 2]
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
    
    inline def fromJSON(data: Any): typings.three.srcGeometriesTorusGeometryMod.TorusGeometry = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(data.asInstanceOf[js.Any]).asInstanceOf[typings.three.srcGeometriesTorusGeometryMod.TorusGeometry]
  }
  
  @JSImport("three/src/geometries/Geometries", "TorusKnotGeometry")
  @js.native
  open class TorusKnotGeometry protected ()
    extends typings.three.srcGeometriesTorusKnotGeometryMod.TorusKnotGeometry {
    /**
      * @param [radius=1]
      * @param [tube=0.4]
      * @param [radialSegments=64]
      * @param [tubularSegments=8]
      * @param [p=2]
      * @param [q=3]
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
    
    inline def fromJSON(data: Any): typings.three.srcGeometriesTorusKnotGeometryMod.TorusKnotGeometry = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(data.asInstanceOf[js.Any]).asInstanceOf[typings.three.srcGeometriesTorusKnotGeometryMod.TorusKnotGeometry]
  }
  
  @JSImport("three/src/geometries/Geometries", "TubeGeometry")
  @js.native
  /**
    * @param path
    * @param [tubularSegments=64]
    * @param [radius=1]
    * @param [radiusSegments=8]
    * @param [closed=false]
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
    def this(path: Unit, tubularSegments: Double, radius: Double, radiusSegments: Double) = this()
    def this(path: Unit, tubularSegments: Double, radius: Unit, radiusSegments: Double) = this()
    def this(path: Unit, tubularSegments: Unit, radius: Double, radiusSegments: Double) = this()
    def this(path: Unit, tubularSegments: Unit, radius: Unit, radiusSegments: Double) = this()
    def this(path: Curve[Vector3], tubularSegments: Double, radius: Double, radiusSegments: Double) = this()
    def this(path: Curve[Vector3], tubularSegments: Double, radius: Unit, radiusSegments: Double) = this()
    def this(path: Curve[Vector3], tubularSegments: Unit, radius: Double, radiusSegments: Double) = this()
    def this(path: Curve[Vector3], tubularSegments: Unit, radius: Unit, radiusSegments: Double) = this()
    def this(path: Unit, tubularSegments: Double, radius: Double, radiusSegments: Double, closed: Boolean) = this()
    def this(path: Unit, tubularSegments: Double, radius: Double, radiusSegments: Unit, closed: Boolean) = this()
    def this(path: Unit, tubularSegments: Double, radius: Unit, radiusSegments: Double, closed: Boolean) = this()
    def this(path: Unit, tubularSegments: Double, radius: Unit, radiusSegments: Unit, closed: Boolean) = this()
    def this(path: Unit, tubularSegments: Unit, radius: Double, radiusSegments: Double, closed: Boolean) = this()
    def this(path: Unit, tubularSegments: Unit, radius: Double, radiusSegments: Unit, closed: Boolean) = this()
    def this(path: Unit, tubularSegments: Unit, radius: Unit, radiusSegments: Double, closed: Boolean) = this()
    def this(path: Unit, tubularSegments: Unit, radius: Unit, radiusSegments: Unit, closed: Boolean) = this()
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
  }
  /* static members */
  object TubeGeometry {
    
    @JSImport("three/src/geometries/Geometries", "TubeGeometry")
    @js.native
    val ^ : js.Any = js.native
    
    inline def fromJSON(data: Any): typings.three.srcGeometriesTubeGeometryMod.TubeGeometry = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(data.asInstanceOf[js.Any]).asInstanceOf[typings.three.srcGeometriesTubeGeometryMod.TubeGeometry]
  }
  
  @JSImport("three/src/geometries/Geometries", "WireframeGeometry")
  @js.native
  open class WireframeGeometry[TBufferGeometry /* <: BufferGeometry */] ()
    extends typings.three.srcGeometriesWireframeGeometryMod.WireframeGeometry[TBufferGeometry] {
    def this(geometry: TBufferGeometry) = this()
  }
}
