package typings.three.buildThreeDotmoduleDotminMod

import typings.three.srcExtrasCurvesCatmullRomCurve3Mod.CurveType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("three/build/three.module.min", "CatmullRomCurve3")
@js.native
/**
  * This constructor creates a new {@link CatmullRomCurve3}.
  * @param points An array of {@link THREE.Vector3 | Vector3} points
  * @param closed Whether the curve is closed. Default `false`
  * @param curveType Type of the curve. Default `centripetal`
  * @param tension Tension of the curve. Expects a `Float`. Default `0.5`
  */
open class CatmullRomCurve3 ()
  extends typings.three.srcThreeMod.CatmullRomCurve3 {
  def this(points: js.Array[typings.three.srcMathVector3Mod.Vector3]) = this()
  def this(points: js.Array[typings.three.srcMathVector3Mod.Vector3], closed: Boolean) = this()
  def this(points: Unit, closed: Boolean) = this()
  def this(points: js.Array[typings.three.srcMathVector3Mod.Vector3], closed: Boolean, curveType: CurveType) = this()
  def this(points: js.Array[typings.three.srcMathVector3Mod.Vector3], closed: Unit, curveType: CurveType) = this()
  def this(points: Unit, closed: Boolean, curveType: CurveType) = this()
  def this(points: Unit, closed: Unit, curveType: CurveType) = this()
  def this(
    points: js.Array[typings.three.srcMathVector3Mod.Vector3],
    closed: Boolean,
    curveType: Unit,
    tension: Double
  ) = this()
  def this(
    points: js.Array[typings.three.srcMathVector3Mod.Vector3],
    closed: Boolean,
    curveType: CurveType,
    tension: Double
  ) = this()
  def this(
    points: js.Array[typings.three.srcMathVector3Mod.Vector3],
    closed: Unit,
    curveType: Unit,
    tension: Double
  ) = this()
  def this(
    points: js.Array[typings.three.srcMathVector3Mod.Vector3],
    closed: Unit,
    curveType: CurveType,
    tension: Double
  ) = this()
  def this(points: Unit, closed: Boolean, curveType: Unit, tension: Double) = this()
  def this(points: Unit, closed: Boolean, curveType: CurveType, tension: Double) = this()
  def this(points: Unit, closed: Unit, curveType: Unit, tension: Double) = this()
  def this(points: Unit, closed: Unit, curveType: CurveType, tension: Double) = this()
}
