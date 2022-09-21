package typings.three.threeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("three/src/Three", "CapsuleGeometry")
@js.native
/**
  * @param [radius=1] — Radius of the capsule.
  * @param [length=1] — Length of the middle section.
  * @param [capSegments=4] — Number of curve segments used to build the caps.
  * @param [radialSegments=8] — Number of segmented faces around the circumference of the capsule.
  */
open class CapsuleGeometry ()
  extends typings.three.geometriesMod.CapsuleGeometry {
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
  
  @JSImport("three/src/Three", "CapsuleGeometry")
  @js.native
  val ^ : js.Any = js.native
  
  inline def fromJSON(data: Any): typings.three.capsuleGeometryMod.CapsuleGeometry = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(data.asInstanceOf[js.Any]).asInstanceOf[typings.three.capsuleGeometryMod.CapsuleGeometry]
}
