package typings.three.srcExtrasCurvesCatmullRomCurve3Mod

import typings.three.srcExtrasCoreCurveMod.Curve
import typings.three.srcMathVector3Mod.Vector3
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/src/extras/curves/CatmullRomCurve3", "CatmullRomCurve3")
@js.native
class CatmullRomCurve3 () extends Curve[Vector3] {
  def this(points: js.Array[Vector3]) = this()
  def this(points: js.Array[Vector3], closed: Boolean) = this()
  def this(points: js.Array[Vector3], closed: Boolean, curveType: String) = this()
  def this(points: js.Array[Vector3], closed: Boolean, curveType: String, tension: Double) = this()
  var points: js.Array[Vector3] = js.native
}

