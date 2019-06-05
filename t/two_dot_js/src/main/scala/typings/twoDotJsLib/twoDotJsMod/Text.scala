package typings
package twoDotJsLib.twoDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("two.js", "Text")
@js.native
class Text protected () extends Object {
  def this(message: java.lang.String, x: scala.Double, y: scala.Double) = this()
  def this(message: java.lang.String, x: scala.Double, y: scala.Double, styles: js.Any) = this()
  var alignment: java.lang.String = js.native
  var baseline: java.lang.String = js.native
  var decoration: java.lang.String = js.native
  var family: java.lang.String = js.native
  var fill: Color = js.native
  var leading: scala.Double = js.native
  var linewidth: scala.Double = js.native
  var opacity: scala.Double = js.native
  var rotation: scala.Double = js.native
  var scale: scala.Double = js.native
  var size: scala.Double = js.native
  var stroke: Color = js.native
  var style: java.lang.String = js.native
  var translation: Vector = js.native
  var value: java.lang.String = js.native
  var visible: scala.Boolean = js.native
  var weight: scala.Double | java.lang.String = js.native
  def getBoundingClientRect(): js.Object = js.native
  def getBoundingClientRect(shallow: scala.Boolean): js.Object = js.native
  def noFill(): this.type = js.native
  def noStroke(): this.type = js.native
}

/* static members */
@JSImport("two.js", "Text")
@js.native
object Text extends js.Object {
  def MakeObservable(obj: js.Any): js.Any = js.native
}

