package typings
package threeLib.threeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three", "Plane")
@js.native
class Plane ()
  extends threeLib.srcMathPlaneMod.Plane {
  def this(normal: threeLib.srcMathVector3Mod.Vector3) = this()
  def this(normal: threeLib.srcMathVector3Mod.Vector3, constant: scala.Double) = this()
}

