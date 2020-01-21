package typings.svgJs.mod

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// number.js
@js.native
trait Number
  extends Instantiable0[Number]
     with Instantiable1[(/* value */ Double) | (/* value */ Number) | (/* value */ String), Number]
     with Instantiable2[/* value */ Double, /* unit */ js.Any, Number] {
  def at(pos: Double): Number = js.native
  def divide(number: Double): Number = js.native
  def minus(number: Double): Number = js.native
  def morph(number: js.Any): this.type = js.native
  def plus(number: Double): Number = js.native
  def times(number: Double): Number = js.native
  def to(unit: String): Number = js.native
  def toJSON(): js.Object = js.native
}

