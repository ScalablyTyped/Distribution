package typings.wonderJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder.js/dist/es2015", "Point")
@js.native
class Point ()
  extends typings.wonderJs.pointMod.Point {
  def this(x: Double) = this()
  def this(x: Double, y: Double) = this()
}

/* static members */
@JSImport("wonder.js/dist/es2015", "Point")
@js.native
object Point extends js.Object {
  def create(): typings.wonderJs.pointMod.Point = js.native
  def create(x: Double): typings.wonderJs.pointMod.Point = js.native
  def create(x: Double, y: Double): typings.wonderJs.pointMod.Point = js.native
}

