package typings.three

import typings.three.examplesJsmGeometriesParametricGeometryMod.ParametricGeometry
import typings.three.srcThreeMod.Curve
import typings.three.srcThreeMod.Vector3
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object examplesJsmGeometriesParametricGeometriesMod {
  
  object ParametricGeometries {
    
    @JSImport("three/examples/jsm/geometries/ParametricGeometries", "ParametricGeometries")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("three/examples/jsm/geometries/ParametricGeometries", "ParametricGeometries.PlaneGeometry")
    @js.native
    open class PlaneGeometry protected () extends ParametricGeometry {
      def this(width: Double, depth: Double, segmentsWidth: Double, segmentsDepth: Double) = this()
    }
    
    @JSImport("three/examples/jsm/geometries/ParametricGeometries", "ParametricGeometries.SphereGeometry")
    @js.native
    open class SphereGeometry protected () extends ParametricGeometry {
      def this(size: Double, u: Double, v: Double) = this()
    }
    
    @JSImport("three/examples/jsm/geometries/ParametricGeometries", "ParametricGeometries.TorusKnotGeometry")
    @js.native
    open class TorusKnotGeometry protected () extends TubeGeometry {
      def this(
        radius: js.UndefOr[Double],
        tube: js.UndefOr[Double],
        segmentsT: js.UndefOr[Double],
        segmentsR: js.UndefOr[Double],
        p: js.UndefOr[Double],
        q: js.UndefOr[Double]
      ) = this()
    }
    
    @JSImport("three/examples/jsm/geometries/ParametricGeometries", "ParametricGeometries.TubeGeometry")
    @js.native
    open class TubeGeometry protected () extends ParametricGeometry {
      def this(path: Curve[Vector3]) = this()
      def this(path: Curve[Vector3], segments: Double) = this()
      def this(path: Curve[Vector3], segments: Double, radius: Double) = this()
      def this(path: Curve[Vector3], segments: Unit, radius: Double) = this()
      def this(path: Curve[Vector3], segments: Double, radius: Double, segmentsRadius: Double) = this()
      def this(path: Curve[Vector3], segments: Double, radius: Unit, segmentsRadius: Double) = this()
      def this(path: Curve[Vector3], segments: Unit, radius: Double, segmentsRadius: Double) = this()
      def this(path: Curve[Vector3], segments: Unit, radius: Unit, segmentsRadius: Double) = this()
      def this(path: Curve[Vector3], segments: Double, radius: Double, segmentsRadius: Double, closed: Boolean) = this()
      def this(path: Curve[Vector3], segments: Double, radius: Double, segmentsRadius: Unit, closed: Boolean) = this()
      def this(path: Curve[Vector3], segments: Double, radius: Unit, segmentsRadius: Double, closed: Boolean) = this()
      def this(path: Curve[Vector3], segments: Double, radius: Unit, segmentsRadius: Unit, closed: Boolean) = this()
      def this(path: Curve[Vector3], segments: Unit, radius: Double, segmentsRadius: Double, closed: Boolean) = this()
      def this(path: Curve[Vector3], segments: Unit, radius: Double, segmentsRadius: Unit, closed: Boolean) = this()
      def this(path: Curve[Vector3], segments: Unit, radius: Unit, segmentsRadius: Double, closed: Boolean) = this()
      def this(path: Curve[Vector3], segments: Unit, radius: Unit, segmentsRadius: Unit, closed: Boolean) = this()
    }
    
    inline def klein(v: Double, u: Double, target: Vector3): Vector3 = (^.asInstanceOf[js.Dynamic].applyDynamic("klein")(v.asInstanceOf[js.Any], u.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[Vector3]
    
    inline def mobius(u: Double, t: Double, target: Vector3): Vector3 = (^.asInstanceOf[js.Dynamic].applyDynamic("mobius")(u.asInstanceOf[js.Any], t.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[Vector3]
    
    inline def mobius3d(u: Double, t: Double, target: Vector3): Vector3 = (^.asInstanceOf[js.Dynamic].applyDynamic("mobius3d")(u.asInstanceOf[js.Any], t.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[Vector3]
    
    inline def plane(width: Double, height: Double): js.Function3[/* u */ Double, /* v */ Double, /* target */ Vector3, Vector3] = (^.asInstanceOf[js.Dynamic].applyDynamic("plane")(width.asInstanceOf[js.Any], height.asInstanceOf[js.Any])).asInstanceOf[js.Function3[/* u */ Double, /* v */ Double, /* target */ Vector3, Vector3]]
  }
}
