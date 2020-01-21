package typings.twoJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("two.js", "RoundedRectangle")
@js.native
class RoundedRectangle protected () extends Path {
  def this(x: Double, y: Double, width: Double, height: Double) = this()
  def this(x: Double, y: Double, width: Double, height: Double, radius: Double) = this()
}

