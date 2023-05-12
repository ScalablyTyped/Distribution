package typings.three.buildThreeDotmoduleMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("three/build/three.module", "TorusGeometry")
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
  extends typings.three.srcThreeMod.TorusGeometry {
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
  
  @JSImport("three/build/three.module", "TorusGeometry")
  @js.native
  val ^ : js.Any = js.native
  
  /** @internal */
  inline def fromJSON(data: Any): typings.three.srcGeometriesTorusGeometryMod.TorusGeometry = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(data.asInstanceOf[js.Any]).asInstanceOf[typings.three.srcGeometriesTorusGeometryMod.TorusGeometry]
}
