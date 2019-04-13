package typings
package svgDotJsLib.svgDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// number.js
@js.native
trait _Number
  extends org.scalablytyped.runtime.Instantiable0[_Number]
     with org.scalablytyped.runtime.Instantiable2[/* value */ scala.Double, /* unit */ js.Any, _Number]
     with org.scalablytyped.runtime.Instantiable1[
      (/* value */ scala.Double) | (/* value */ java.lang.String) | (/* value */ _Number), 
      _Number
    ] {
  def at(pos: scala.Double): _Number = js.native
  def divide(number: scala.Double): _Number = js.native
  def minus(number: scala.Double): _Number = js.native
  def morph(number: js.Any): this.type = js.native
  def plus(number: scala.Double): _Number = js.native
  def times(number: scala.Double): _Number = js.native
  def to(unit: java.lang.String): _Number = js.native
  def toJSON(): js.Object = js.native
}

