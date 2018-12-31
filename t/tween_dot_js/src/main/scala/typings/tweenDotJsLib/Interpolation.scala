package typings
package tweenDotJsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Interpolation extends js.Object {
  var Utils: Anon_Bernstein
  def Bezier(v: js.Array[scala.Double], k: scala.Double): scala.Double
  def CatmullRom(v: js.Array[scala.Double], k: scala.Double): scala.Double
  def Linear(v: js.Array[scala.Double], k: scala.Double): scala.Double
}

