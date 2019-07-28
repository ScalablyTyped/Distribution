package typings.three.threeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three", "Color")
@js.native
class Color ()
  extends typings.three.srcMathColorMod.Color {
  def this(color: String) = this()
  def this(color: Double) = this()
  def this(color: typings.three.srcMathColorMod.Color) = this()
  def this(r: Double, g: Double, b: Double) = this()
}

