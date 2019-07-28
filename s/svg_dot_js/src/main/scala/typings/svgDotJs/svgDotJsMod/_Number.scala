package typings.svgDotJs.svgDotJsMod

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// number.js
@js.native
trait _Number
  extends Instantiable0[_Number]
     with Instantiable2[/* value */ Double, /* unit */ js.Any, _Number]
     with Instantiable1[(/* value */ Double) | (/* value */ String) | (/* value */ _Number), _Number] {
  def at(pos: Double): _Number = js.native
  def divide(number: Double): _Number = js.native
  def minus(number: Double): _Number = js.native
  def morph(number: js.Any): this.type = js.native
  def plus(number: Double): _Number = js.native
  def times(number: Double): _Number = js.native
  def to(unit: String): _Number = js.native
  def toJSON(): js.Object = js.native
}

