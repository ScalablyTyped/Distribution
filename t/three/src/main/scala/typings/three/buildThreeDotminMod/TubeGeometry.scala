package typings.three.buildThreeDotminMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("three/build/three.min", "TubeGeometry")
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
  extends typings.three.srcThreeMod.TubeGeometry {
  def this(path: typings.three.srcExtrasCoreCurveMod.Curve[typings.three.srcMathVector3Mod.Vector3]) = this()
  def this(path: Unit, tubularSegments: Double) = this()
  def this(
    path: typings.three.srcExtrasCoreCurveMod.Curve[typings.three.srcMathVector3Mod.Vector3],
    tubularSegments: Double
  ) = this()
  def this(path: Unit, tubularSegments: Double, radius: Double) = this()
  def this(path: Unit, tubularSegments: Unit, radius: Double) = this()
  def this(
    path: typings.three.srcExtrasCoreCurveMod.Curve[typings.three.srcMathVector3Mod.Vector3],
    tubularSegments: Double,
    radius: Double
  ) = this()
  def this(
    path: typings.three.srcExtrasCoreCurveMod.Curve[typings.three.srcMathVector3Mod.Vector3],
    tubularSegments: Unit,
    radius: Double
  ) = this()
  def this(path: Unit, tubularSegments: Double, radius: Double, radialSegments: Double) = this()
  def this(path: Unit, tubularSegments: Double, radius: Unit, radialSegments: Double) = this()
  def this(path: Unit, tubularSegments: Unit, radius: Double, radialSegments: Double) = this()
  def this(path: Unit, tubularSegments: Unit, radius: Unit, radialSegments: Double) = this()
  def this(
    path: typings.three.srcExtrasCoreCurveMod.Curve[typings.three.srcMathVector3Mod.Vector3],
    tubularSegments: Double,
    radius: Double,
    radialSegments: Double
  ) = this()
  def this(
    path: typings.three.srcExtrasCoreCurveMod.Curve[typings.three.srcMathVector3Mod.Vector3],
    tubularSegments: Double,
    radius: Unit,
    radialSegments: Double
  ) = this()
  def this(
    path: typings.three.srcExtrasCoreCurveMod.Curve[typings.three.srcMathVector3Mod.Vector3],
    tubularSegments: Unit,
    radius: Double,
    radialSegments: Double
  ) = this()
  def this(
    path: typings.three.srcExtrasCoreCurveMod.Curve[typings.three.srcMathVector3Mod.Vector3],
    tubularSegments: Unit,
    radius: Unit,
    radialSegments: Double
  ) = this()
  def this(path: Unit, tubularSegments: Double, radius: Double, radialSegments: Double, closed: Boolean) = this()
  def this(path: Unit, tubularSegments: Double, radius: Double, radialSegments: Unit, closed: Boolean) = this()
  def this(path: Unit, tubularSegments: Double, radius: Unit, radialSegments: Double, closed: Boolean) = this()
  def this(path: Unit, tubularSegments: Double, radius: Unit, radialSegments: Unit, closed: Boolean) = this()
  def this(path: Unit, tubularSegments: Unit, radius: Double, radialSegments: Double, closed: Boolean) = this()
  def this(path: Unit, tubularSegments: Unit, radius: Double, radialSegments: Unit, closed: Boolean) = this()
  def this(path: Unit, tubularSegments: Unit, radius: Unit, radialSegments: Double, closed: Boolean) = this()
  def this(path: Unit, tubularSegments: Unit, radius: Unit, radialSegments: Unit, closed: Boolean) = this()
  def this(
    path: typings.three.srcExtrasCoreCurveMod.Curve[typings.three.srcMathVector3Mod.Vector3],
    tubularSegments: Double,
    radius: Double,
    radialSegments: Double,
    closed: Boolean
  ) = this()
  def this(
    path: typings.three.srcExtrasCoreCurveMod.Curve[typings.three.srcMathVector3Mod.Vector3],
    tubularSegments: Double,
    radius: Double,
    radialSegments: Unit,
    closed: Boolean
  ) = this()
  def this(
    path: typings.three.srcExtrasCoreCurveMod.Curve[typings.three.srcMathVector3Mod.Vector3],
    tubularSegments: Double,
    radius: Unit,
    radialSegments: Double,
    closed: Boolean
  ) = this()
  def this(
    path: typings.three.srcExtrasCoreCurveMod.Curve[typings.three.srcMathVector3Mod.Vector3],
    tubularSegments: Double,
    radius: Unit,
    radialSegments: Unit,
    closed: Boolean
  ) = this()
  def this(
    path: typings.three.srcExtrasCoreCurveMod.Curve[typings.three.srcMathVector3Mod.Vector3],
    tubularSegments: Unit,
    radius: Double,
    radialSegments: Double,
    closed: Boolean
  ) = this()
  def this(
    path: typings.three.srcExtrasCoreCurveMod.Curve[typings.three.srcMathVector3Mod.Vector3],
    tubularSegments: Unit,
    radius: Double,
    radialSegments: Unit,
    closed: Boolean
  ) = this()
  def this(
    path: typings.three.srcExtrasCoreCurveMod.Curve[typings.three.srcMathVector3Mod.Vector3],
    tubularSegments: Unit,
    radius: Unit,
    radialSegments: Double,
    closed: Boolean
  ) = this()
  def this(
    path: typings.three.srcExtrasCoreCurveMod.Curve[typings.three.srcMathVector3Mod.Vector3],
    tubularSegments: Unit,
    radius: Unit,
    radialSegments: Unit,
    closed: Boolean
  ) = this()
}
/* static members */
object TubeGeometry {
  
  @JSImport("three/build/three.min", "TubeGeometry")
  @js.native
  val ^ : js.Any = js.native
  
  /** @internal */
  inline def fromJSON(data: js.Object): typings.three.srcGeometriesTubeGeometryMod.TubeGeometry = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(data.asInstanceOf[js.Any]).asInstanceOf[typings.three.srcGeometriesTubeGeometryMod.TubeGeometry]
}
