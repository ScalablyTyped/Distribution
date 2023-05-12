package typings.three.srcThreeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("three/src/Three", "LatheGeometry")
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
  extends typings.three.srcGeometriesGeometriesMod.LatheGeometry {
  def this(points: js.Array[typings.three.srcMathVector2Mod.Vector2]) = this()
  def this(points: js.Array[typings.three.srcMathVector2Mod.Vector2], segments: Double) = this()
  def this(points: Unit, segments: Double) = this()
  def this(points: js.Array[typings.three.srcMathVector2Mod.Vector2], segments: Double, phiStart: Double) = this()
  def this(points: js.Array[typings.three.srcMathVector2Mod.Vector2], segments: Unit, phiStart: Double) = this()
  def this(points: Unit, segments: Double, phiStart: Double) = this()
  def this(points: Unit, segments: Unit, phiStart: Double) = this()
  def this(
    points: js.Array[typings.three.srcMathVector2Mod.Vector2],
    segments: Double,
    phiStart: Double,
    phiLength: Double
  ) = this()
  def this(
    points: js.Array[typings.three.srcMathVector2Mod.Vector2],
    segments: Double,
    phiStart: Unit,
    phiLength: Double
  ) = this()
  def this(
    points: js.Array[typings.three.srcMathVector2Mod.Vector2],
    segments: Unit,
    phiStart: Double,
    phiLength: Double
  ) = this()
  def this(
    points: js.Array[typings.three.srcMathVector2Mod.Vector2],
    segments: Unit,
    phiStart: Unit,
    phiLength: Double
  ) = this()
  def this(points: Unit, segments: Double, phiStart: Double, phiLength: Double) = this()
  def this(points: Unit, segments: Double, phiStart: Unit, phiLength: Double) = this()
  def this(points: Unit, segments: Unit, phiStart: Double, phiLength: Double) = this()
  def this(points: Unit, segments: Unit, phiStart: Unit, phiLength: Double) = this()
}
/* static members */
object LatheGeometry {
  
  @JSImport("three/src/Three", "LatheGeometry")
  @js.native
  val ^ : js.Any = js.native
  
  /** @internal */
  inline def fromJSON(data: js.Object): typings.three.srcGeometriesLatheGeometryMod.LatheGeometry = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(data.asInstanceOf[js.Any]).asInstanceOf[typings.three.srcGeometriesLatheGeometryMod.LatheGeometry]
}
