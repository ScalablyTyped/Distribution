package typings.three.buildThreeDotminMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("three/build/three.min", "CapsuleGeometry")
@js.native
/**
  * Create a new instance of {@link CapsuleGeometry}
  * @param radius Radius of the capsule. Expects a `Float`. Default `1`
  * @param length Length of the middle section. Expects a `Float`. Default `1`
  * @param capSubdivisions Number of curve segments used to build the caps. Expects a `Integer`. Default `4`
  * @param radialSegments Number of segmented faces around the circumference of the capsule. Expects a `Integer`. Default `8`
  */
open class CapsuleGeometry ()
  extends typings.three.srcThreeMod.CapsuleGeometry {
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
  
  @JSImport("three/build/three.min", "CapsuleGeometry")
  @js.native
  val ^ : js.Any = js.native
  
  /** @internal */
  inline def fromJSON(data: js.Object): typings.three.srcGeometriesCapsuleGeometryMod.CapsuleGeometry = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(data.asInstanceOf[js.Any]).asInstanceOf[typings.three.srcGeometriesCapsuleGeometryMod.CapsuleGeometry]
}
