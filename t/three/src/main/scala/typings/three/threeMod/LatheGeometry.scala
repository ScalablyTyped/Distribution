package typings.three.threeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("three/src/Three", "LatheGeometry")
@js.native
/**
  * @param points
  * @param [segments=12]
  * @param [phiStart=0]
  * @param [phiLength=Math.PI * 2]
  */
open class LatheGeometry ()
  extends typings.three.geometriesMod.LatheGeometry {
  def this(points: js.Array[typings.three.vector2Mod.Vector2]) = this()
  def this(points: js.Array[typings.three.vector2Mod.Vector2], segments: Double) = this()
  def this(points: Unit, segments: Double) = this()
  def this(points: js.Array[typings.three.vector2Mod.Vector2], segments: Double, phiStart: Double) = this()
  def this(points: js.Array[typings.three.vector2Mod.Vector2], segments: Unit, phiStart: Double) = this()
  def this(points: Unit, segments: Double, phiStart: Double) = this()
  def this(points: Unit, segments: Unit, phiStart: Double) = this()
  def this(
    points: js.Array[typings.three.vector2Mod.Vector2],
    segments: Double,
    phiStart: Double,
    phiLength: Double
  ) = this()
  def this(
    points: js.Array[typings.three.vector2Mod.Vector2],
    segments: Double,
    phiStart: Unit,
    phiLength: Double
  ) = this()
  def this(
    points: js.Array[typings.three.vector2Mod.Vector2],
    segments: Unit,
    phiStart: Double,
    phiLength: Double
  ) = this()
  def this(
    points: js.Array[typings.three.vector2Mod.Vector2],
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
  
  inline def fromJSON(data: Any): typings.three.latheGeometryMod.LatheGeometry = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(data.asInstanceOf[js.Any]).asInstanceOf[typings.three.latheGeometryMod.LatheGeometry]
}
