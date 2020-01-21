package typings.twoJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("two.js", "Polygon")
@js.native
class Polygon protected () extends Path {
  def this(x: Double, y: Double, radius: Double) = this()
  def this(x: Double, y: Double, radius: Double, sides: Double) = this()
}

